.class public ModSample
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

.method static isPrime(I)Z
	iload 0
	istore 0
	ldc	0
istore 1
	ldc	1
	istore 3	; a
L000:
;load local value from stack
iload 0
;load local value from stack
iload 3
	irem
	ldc	0
if_icmpeq	L004
iconst_0
goto 	L005
L004:
	iconst_1
L005:
	ifeq L008
iinc 1 1
L008:
	iload 3 	; load a
;load local value from stack
iload 0
	iinc 3 1	; a++
	if_icmpeq L001
	iconst_0 	; false
	goto L002
L001:
	iconst_1 	; true
L002:
	ifne L003
	goto L000
L003:
;load local value from stack
iload 1
	ldc	2
if_icmpeq	L009
iconst_0
goto 	L0010
L009:
	iconst_1
L0010:
	ireturn

.limit locals 32
.limit stack 32
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        ModSample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        ModSample/_standardIn LPascalTextIn;
	ldc	10
istore 1
;load local value from stack
iload 1
	invokestatic ModSample/isPrime(I)Z
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "%d is prime? %b\n"
ldc 2
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 1
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
iload 2
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	2
	istore 5	; a
L0011:
;load local value from stack
iload 5
	invokestatic ModSample/isPrime(I)Z
istore 4
;load boolean from stack
iload 4
	ifeq L0017
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "%d is prime\n"
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
L0017:
	iload 5 	; load a
	ldc	20
	iinc 5 1	; a++
	if_icmpeq L0012
	iconst_0 	; false
	goto L0013
L0012:
	iconst_1 	; true
L0013:
	ifne L0014
	goto L0011
L0014:
iload 4
	ldc	10
irem
istore 4
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "k should be 0, k is %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 4
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop

	getstatic     ModSample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 32
.limit stack 32
.end method
