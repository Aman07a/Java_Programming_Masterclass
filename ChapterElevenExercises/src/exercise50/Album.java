package exercise50;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            System.out.println("Added " + title + " to the playlist.");
            return true;
        } else {
            System.out.println("The song " + title + " is not in this album");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(trackNumber);
        if (song != null) {
            playlist.add(song);
            System.out.println("Added track " + trackNumber + " to the playlist.");
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}

