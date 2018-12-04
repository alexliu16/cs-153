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
;Pushing boolean value to stack
	iconst_0
istore 1
;load local value from stack
iload 0
	ldc	2
if_icmple	L000
iconst_0
goto 	L001
L000:
	iconst_1
L001:
istore 2
;load local value from stack
iload 0
	ldc	2
if_icmpeq	L002
iconst_0
goto 	L003
L002:
	iconst_1
L003:
	ifeq L006
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "c is %b\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 2
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
L006:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "b is %b\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 1
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "b AND c = %b\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load boolean from stack
iload 1
;load boolean from stack
iload 2
iand
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "b OR c = %b\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load boolean from stack
iload 1
;load boolean from stack
iload 2
ior
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop

	getstatic     TestingArithmetic/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method