.class public TestingConditional
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
	putstatic        TestingConditional/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        TestingConditional/_standardIn LPascalTextIn;
	ldc	5
istore 0
;load local value from stack
iload 0
	ldc	5
if_icmpeq	L000
iconst_0
goto 	L001
L000:
	iconst_1
L001:
	ifeq L002
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 2
ldc "if no brackets and no else: i has value of %d\n" ; load string constant
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
L002:
;load local value from stack
iload 0
	ldc	5
if_icmpeq	L003
iconst_0
goto 	L004
L003:
	iconst_1
L004:
	ifeq L005
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 2
ldc "if brackets and no else i has value of %d\n" ; load string constant
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
L005:
;load local value from stack
iload 0
	ldc	10
if_icmpeq	L006
iconst_0
goto 	L007
L006:
	iconst_1
L007:
	ifeq L008
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 2
ldc "if no brackets with else: i has value of %d\n" ; load string constant
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
	goto L009
L008:
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 2
ldc "else no brackets: i has value of %d\n" ; load string constant
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
L009:
;load local value from stack
iload 0
	ldc	10
if_icmpeq	L0010
iconst_0
goto 	L0011
L0010:
	iconst_1
L0011:
	ifeq L0012
	goto L0013
L0012:
getstatic java/lang/System/out Ljava/io/PrintStream; 
; count of printf is 2
ldc "else brackets! i has value of %d\n" ; load string constant
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
L0013:

	getstatic     TestingConditional/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
