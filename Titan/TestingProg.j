.class public TestingProg
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
	putstatic        TestingProg/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        TestingProg/_standardIn LPascalTextIn;
	ldc	2
	ldc	2
	iadd
istore 0
	ldc	2.0
fstore 1
;Pushing boolean value to stack
	iconst_0
istore 2
;load local value from stack
iload 0
	ldc	2
if_icmpgt	L000
iconst_0
goto 	L001
L000:
	iconst_1
L001:
istore 3
;load boolean from stack
iload 2
;load boolean from stack
iload 3
;load local value from stack
iload 0
	ldc	10
if_icmplt	L002
iconst_0
goto 	L003
L002:
	iconst_1
L003:
iand
ior
	ifeq L006
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "num is between 3 and 9\n"
aconst_null
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
L006:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Num = %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 0
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
ldc "Titan"
astore 4
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "The project name is %s\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
aload 4
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
iload 0
	ldc	3
imul
istore 0
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Num = %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 0
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
fload 1
	ldc	1.2
fmul
fstore 1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "f should be 2.4... -> %f"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
fload 1
invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop

	getstatic     TestingProg/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16

