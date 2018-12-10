.class public Hanoi
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

.method static towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
	iload 0
	istore 0
	aload 1
	astore 1
	aload 2
	astore 2
	aload 3
	astore 3
;load local value from stack
iload 0
	ldc	1
if_icmpeq	L000
iconst_0
goto 	L001
L000:
	iconst_1
L001:
	ifeq L004
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Move disk 1 from rod %s to rod %s\n"
ldc 2
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
aload 1
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
aload 2
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	goto L005
L004:
;load local value from stack
iload 0
	ldc	1
	isub
istore 4
;load local value from stack
iload 4
;load local value from stack
aload 1
;load local value from stack
aload 3
;load local value from stack
aload 2
	invokestatic Hanoi/towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Move disk %d from rod %s to rod %s\n"
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 0
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
aload 1
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
dup
ldc 2 ; load arrayIndex
;load local value from stack
aload 2
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;load local value from stack
iload 4
;load local value from stack
aload 3
;load local value from stack
aload 2
;load local value from stack
aload 1
	invokestatic Hanoi/towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
L005:
	return

.limit locals 32
.limit stack 32
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        Hanoi/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        Hanoi/_standardIn LPascalTextIn;
	ldc	5
ldc "A"
ldc "B"
ldc "C"
	invokestatic Hanoi/towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

	getstatic     Hanoi/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 32
.limit stack 32
.end method
