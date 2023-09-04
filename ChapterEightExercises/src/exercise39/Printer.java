package exercise39;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            int tempAmount = tonerAmount + tonerLevel;
            if (tempAmount <= 100) {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        System.out.println(duplex ? "Printing in duplex mode" : "Printing in simplex mode");
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

