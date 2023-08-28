$ jshell
|  Welcome to JShell -- Version 17.0.8
|  For an introduction type: /help intro

jshell> System.out.print("Hello, World");
Hello, World
jshell> System.out.print("Hello, Aman");
Hello, Aman
jshell> System.out.print("Hello, Aman"
   ...> );
Hello, Aman
jshell> System.out.print("Hello", Aman);
|  Error:
|  cannot find symbol
|    symbol:   variable Aman
|  System.out.print("Hello", Aman);
|                            ^--^

jshell> System.out.print("Hello, Aman");
Hello, Aman
jshell> System.out.print('Hello, Aman');
|  Error:
|  unclosed character literal
|  System.out.print('Hello, Aman');
|                   ^

jshell> 