.class public TestingArithmetic
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        TestingArithmetic/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        TestingArithmetic/_standardIn LPascalTextIn;
	ldc	2
istore 0
;load local value from stack
iload 0
	ldc	2
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "This should print"
ldc 0
anewarray java/lang/Object
dup
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "This should not print"
ldc 0
anewarray java/lang/Object
dup
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;load boolean from stack
iload 0
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "This should not print"
ldc 0
anewarray java/lang/Object
dup
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "This should print"
ldc 0
anewarray java/lang/Object
dup
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;load boolean from stack
iload 0
;load boolean from stack
iload 1
ior
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "This should print"
ldc 0
anewarray java/lang/Object
dup
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop

	getstatic     TestingArithmetic/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
