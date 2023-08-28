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

jshell> int myFirstNumber = 5;
myFirstNumber ==> 5

jshell> System.out.print("myFirstNumber");
myFirstNumber
jshell> System.out.print(myFirstNumber);
5
jshell> myFirstNumber = 10;
myFirstNumber ==> 10

jshell> System.out.print(myFirstNumber);
10
jshell> myFirstNumber = 1000;
myFirstNumber ==> 1000

jshell> System.out.print(myFirstNumber);
1000
jshell> /list

   1 : int myFirstNumber = 5;
   2 : System.out.print("myFirstNumber");
   3 : System.out.print(myFirstNumber);
   4 : myFirstNumber = 10;
   5 : System.out.print(myFirstNumber);
   6 : myFirstNumber = 1000;
   7 : System.out.print(myFirstNumber);

jshell> myFirstNumber = 10 + 5;
myFirstNumber ==> 15

jshell> myFirstNumber = (10 + 5) + (2 * 10);
myFirstNumber ==> 35

jshell> int myFirstNumber = (10 + 5) + (2 * 10);
myFirstNumber ==> 35

jshell> int mySecondNumber = 12;
mySecondNumber ==> 12

jshell> int myThirdNumber = 6;
myThirdNumber ==> 6

jshell> /var
|    int myFirstNumber = 35
|    int mySecondNumber = 12
|    int myThirdNumber = 6

jshell> int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
myTotal ==> 53

jshell> myThirdNumber = myFirstNumber * 2;
myThirdNumber ==> 70

jshell> myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
myTotal ==> 117

jshell> int myLastOne = 1000 - myTotal;
myLastOne ==> 883

jshell> System.out.print(myLastOne);
883
jshell> System.out.print(MyLastOne);
|  Error:
|  cannot find symbol
|    symbol:   variable MyLastOne
|  System.out.print(MyLastOne);
|                   ^-------^

jshell> int myValue = 1000;
myValue ==> 1000

jshell> int myMinIntValue = Integer.MIN_VALUE;
myMinIntValue ==> -2147483648

jshell> int myMaxIntValue = Integer.MAX_VALUE;
myMaxIntValue ==> 2147483647

jshell> System.out.print("Integer Minimum Value = " + myMinIntValue);
Integer Minimum Value = -2147483648
jshell> System.out.print("Integer Minimum Value = " + Integer.MIN_VALUE);
Integer Minimum Value = -2147483648
jshell> System.out.print("Integer Minimum Value = " + Integer.MIN_VALUE);
Integer Minimum Value = -2147483648
jshell> System.out.print("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
Integer Value Range (-2147483648 to 2147483647)
jshell> System.out.print(
   ...> "Integer Value Range (" 
   ...> +
   ...> Integer.MIN_VALUE
   ...> +
   ...> " to " 
   ...> +
   ...> Integer.MAX_VALUE 
   ...> +
   ...> ")" 
   ...> );
Integer Value Range (-2147483648 to 2147483647)

jshell> System.out.print("Busted Max Value = " + (myMaxIntValue + 1));
Busted Max Value = -2147483648
jshell> System.out.print("Busted Min Value = " + (myMinIntValue + 1));
Busted Min Value = -2147483647
jshell> System.out.print("Integer Maximum Value = " + Integer.MAX_VALUE);
Integer Maximum Value = 2147483647
jshell> int myMaxIntTest = 2147483647;
myMaxIntTest ==> 2147483647

jshell> int myMaxIntTest = 2_147_483_647;
myMaxIntTest ==> 2147483647

jshell> System.out.print("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
Integer Value Range (-2147483648 to 2147483647)
jshell> System.out.print("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
Byte Value Range (-128 to 127)
jshell> System.out.print("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
Short Value Range (-32768 to 32767)
jshell> long myLongValue = 100L;
myLongValue ==> 100

jshell> System.out.print("A long has width of " + Long.SIZE);
A long has width of 64
jshell> System.out.print("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")" );
Long Value Range (-9223372036854775808 to 9223372036854775807)
jshell> myLongValue = 100;
myLongValue ==> 100

jshell> long bigLongLiteralValue = 2_147_483_647;
bigLongLiteralValue ==> 2147483647

jshell> long bigLongLiteralValue = 2_147_483_647_234;
|  Error:
|  integer number too large
|  long bigLongLiteralValue = 2_147_483_647_234;

jshell> long bigLongLiteralValue = 2_147_483_647_234L;
bigLongLiteralValue ==> 2147483647234

jshell> short bigShortLiteralValue = 32768;
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short bigShortLiteralValue = 32768;

jshell> short bigShortLiteralValue = 32767;
bigShortLiteralValue ==> 32767

jshell> short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
myMinShortValue ==> -32768
myMinIntValue ==> -2147483648

jshell> byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
myMinByteValue ==> -128
myMaxByteValue ==> 127

jshell> short firstShort = 1, int firstInteger = 2;
|  Error:
|  <identifier> expected
|  short firstShort = 1, int firstInteger = 2;

jshell> short firstShort = 1; int firstInteger = 2; 
firstShort ==> 1
firstInteger ==> 2

jshell> byte firstByte = 1, byte secondByte = 2;
|  Error:
|  <identifier> expected
|  byte firstByte = 1, byte secondByte = 2;

jshell> byte myNewByteValue = (byte) (myMinByteValue / 2);
myNewByteValue ==> -64

jshell> short myNewShortValue = (myMinByteValue / 2);
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short myNewShortValue = (myMinByteValue / 2);

jshell> short myNewShortValue = (short) (myMinShortValue / 2);
myNewShortValue ==> -16384

jshell>