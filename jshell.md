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

jshell> byte byteValue = 10;
byteValue ==> 10

jshell> short shortValue = 20;
shortValue ==> 20

jshell> int intValue = 50;
intValue ==> 50

jshell> long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
longTotal ==> 50800

jshell> int sumOfThree = byteValue + shortValue + intValue;
sumOfThree ==> 80

jshell> longTotal = 50000L + (10 * sumOfThree); 
longTotal ==> 50800

jshell> short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue)); 
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short shortTotal = (1000 + 10 * (byteValue + shortValue + intValue));
|                      ^---------------------------------------------^

jshell> short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue)); 
shortTotal ==> 1800

jshell> System.out.print("Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")" ); 
Float Value Range (1.4E-45 to 3.4028235E38)
jshell> System.out.print("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")" ); 
Double Value Range (4.9E-324 to 1.7976931348623157E308)
jshell> int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5; 
myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

jshell> myFloatValue = 5f;
myFloatValue ==> 5.0

jshell> myFloatValue = 5d;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  myFloatValue = 5d;
|                 ^^

jshell> float myOtherFloatValue = 5.25;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float myOtherFloatValue = 5.25;

jshell> float myOtherFloatValue = (float) 5.25;
myOtherFloatValue ==> 5.25

jshell> float myOtherFloatValue = 5.25f;
myOtherFloatValue ==> 5.25

jshell> int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5; 
myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

jshell> myIntValue = 5 / 2;
myIntValue ==> 2

jshell> myFloatValue = 5f / 2f;
myFloatValue ==> 2.5

jshell> myDoubleValue = 5d / 2d;
myDoubleValue ==> 2.5

jshell> myIntValue = 5 / 3;
myIntValue ==> 1

jshell> myFloatValue = 5f / 3f;
myFloatValue ==> 1.6666666

jshell> myDoubleValue = 5d / 3d;
myDoubleValue ==> 1.6666666666666667

jshell> myDoubleValue = 5.00 / 3.00;
myDoubleValue ==> 1.6666666666666667

jshell> myDoubleValue = 5.00 / 3;
myDoubleValue ==> 1.6666666666666667

jshell> myFloatValue = 5.00 / 3f;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  myFloatValue = 5.00 / 3f;
|                 ^-------^

jshell> double numberOfPounds = 200d;
numberOfPounds ==> 200.0

jshell> double convertedKilograms = numberOfPounds * 0.45359237d;
convertedKilograms ==> 90.718474

jshell> System.out.print("Converted Kilograms = " + convertedKilograms);
Converted Kilograms = 90.718474
jshell> double pi = 3.1415927d;
pi ==> 3.1415927

jshell> double anotherNumber = 3_000_000.4_567_890d;
anotherNumber ==> 3000000.456789

jshell> char myChar = 'D';
myChar ==> 'D'

jshell> char myChar = 'DD';
|  Error:
|  unclosed character literal
|  char myChar = 'DD';
|                ^

jshell> char myChar = 'D';
myChar ==> 'D'

jshell> char myUnicode = '\u0044';
myUnicode ==> 'D'

jshell> char myDecimalCode = 68;
myDecimalCode ==> 'D'

jshell> char mySimpleChar = '?';
mySimpleChar ==> '?'

jshell> char myUnicode = '\u003F';
myUnicode ==> '?'

jshell> char myDecimalCode = 63;
myDecimalCode ==> '?'

jshell> System.out.print("My values are " + mySimpleChar + myUnicode + myDecimalCode);
My values are ???
jshell> boolean myTrueBooleanValue = true;
myTrueBooleanValue ==> true

jshell> boolean myFalseBooleanValue = false;
myFalseBooleanValue ==> false

jshell> boolean isCustomerOverTwentyOne = true;
isCustomerOverTwentyOne ==> true

jshell> String myString = "This is a string";
myString ==> "This is a string"

jshell> System.out.print("myString is equal to " + myString);
myString is equal to This is a string
jshell> myString = myString + ", and this is more.";
myString ==> "This is a string, and this is more."

jshell> System.out.print("myString is equal to " + myString);
myString is equal to This is a string, and this is more.
jshell> myString = "I wish I had \u00241,000,000.00";
myString ==> "I wish I had $1,000,000.00"

jshell> {
   ...>     String numberString = "250.55";
   ...>     numberString = numberString + "49.45";
   ...>     System.out.print(numberString);
   ...> }
250.5549.45
jshell> String numberString = "250.55"; numberString = numberString + "49.45"; System.out.print(numberString); 
numberString ==> "250.55"
numberString ==> "250.5549.45"
250.5549.45

jshell> int myInt = "10";
|  Error:
|  incompatible types: java.lang.String cannot be converted to int
|  int myInt = "10";
|              ^--^

jshell> String lastString = "10"; int myInt = 50; 
lastString ==> "10"
myInt ==> 50

jshell> lastString = lastString + myInt; 
lastString ==> "1050"

jshell> double doubleNumber = 120.47; lastString = lastString + doubleNumber; 
doubleNumber ==> 120.47
lastString ==> "1050120.47"

jshell> int result = 1 + 2; // 1 + 2 = 3
result ==> 3

jshell> int peviousResult = result;
peviousResult ==> 3

jshell> result = result - 1; // 3 - 1 = 2
result ==> 2

jshell> System.out.print("peviousResult = " + peviousResult);
peviousResult = 3
jshell> char firstChar = 'A'; char secondChar = 'B'; 
firstChar ==> 'A'
secondChar ==> 'B'

jshell> System.out.print(firstChar + secondChar); 
131
jshell> result = 2;
result ==> 2

jshell> result = result * 10; // 2 * 10 = 20
result ==> 20

jshell> result = result / 4; // 20 / 4 = 5
result ==> 5

jshell> result = result % 3; // the remainder of (5 % 3) = 2
result ==> 2

jshell>