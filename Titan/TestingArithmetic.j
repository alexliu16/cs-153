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
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 4
ldc "%d-%d equals %d\n" ; load string constant
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
	ldc	1
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1 ; load arrayIndex
	ldc	2
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 2 ; load arrayIndex
	ldc	1
	ldc	2
	isub
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 2
ldc "1=%d\n" ; load string constant
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
	ldc	1
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop

	getstatic     TestingArithmetic/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
