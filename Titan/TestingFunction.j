.class public TestingFunction
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
	putstatic        TestingFunction/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        TestingFunction/_standardIn LPascalTextIn;
	ldc	3.1
fstore 0
	ldc	2.4
fstore 1
;load local value from stack
fload 0
;load local value from stack
fload 1
	invokestatic TestingFunction/floatSum(FF)F
fstore 2
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "The value of floatSum is %f"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
fload 2
invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	0
istore 3
	ldc	2
istore 4
;load local value from stack
iload 3
;load local value from stack
iload 4
	invokestatic TestingFunction/intSum(II)I
istore 5
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nThe value of intSum is %d"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 5
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;load local value from stack
iload 3
;load local value from stack
iload 4
	invokestatic TestingFunction/min(II)I
istore 6
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nThe minimum of %d and %d is %d"
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 3
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
iload 4
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 2 ; load arrayIndex
;load local value from stack
iload 6
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;Pushing boolean value to stack
	iconst_1
istore 7
;Pushing boolean value to stack
	iconst_0
istore 8
;load local value from stack
iload 7
;load local value from stack
iload 8
	invokestatic TestingFunction/logicalAnd(ZZ)Z
istore 9
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n%b AND %b is %b"
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 7
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
iload 8
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
dup
ldc 2 ; load arrayIndex
;load local value from stack
iload 9
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	invokestatic TestingFunction/nestedMethod()V

	getstatic     TestingFunction/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

.method static floatSum(FF)F
	fload 0
	fstore 10
	fload 1
	fstore 11
	ldc	1.243
fstore 12
;load local value from stack
fload 10
;load local value from stack
fload 11
	fadd
fstore 13
;load local value from stack
fload 13
	freturn

.limit locals 32
.limit stack 32
.end method

.method static intSum(II)I
	iload 0
	istore 11
	iload 1
	istore 12
;load local value from stack
iload 11
;load local value from stack
iload 12
	iadd
	ireturn

.limit locals 32
.limit stack 32
.end method

.method static logicalAnd(ZZ)Z
	iload 0
	istore 12
	iload 1
	istore 13
;load boolean from stack
iload 12
;load boolean from stack
iload 13
iand
	ireturn

.limit locals 32
.limit stack 32
.end method

.method static min(II)I
	iload 0
	istore 13
	iload 1
	istore 14
;load local value from stack
iload 13
;load local value from stack
iload 14
if_icmplt	L000
iconst_0
goto 	L001
L000:
	iconst_1
L001:
	ifeq L004
;load local value from stack
iload 13
	goto L005
L004:
;load local value from stack
iload 14
L005:
	ireturn

.limit locals 32
.limit stack 32
.end method

.method static nestedMethod()V
	invokestatic TestingFunction/helloWorld()Ljava/lang/String;
astore 14
getstatic java/lang/System/out Ljava/io/PrintStream; 
;load local value from stack
aload 14
aconst_null
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	return

.limit locals 32
.limit stack 32
.end method

.method static helloWorld()Ljava/lang/String;
ldc "\n\nHello world!"
	areturn

.limit locals 32
.limit stack 32
.end method
