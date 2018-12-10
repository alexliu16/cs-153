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

.method static floatSum(FF)F
	fload 0
	fstore 0
	fload 1
	fstore 1
	ldc	1.243
fstore 2
;load local value from stack
fload 0
;load local value from stack
fload 1
	fadd
fstore 3
;load local value from stack
fload 3
	freturn

.limit locals 32
.limit stack 32
.end method

.method static intSum(II)I
	iload 0
	istore 1
	iload 1
	istore 2
;load local value from stack
iload 1
;load local value from stack
iload 2
	iadd
	ireturn

.limit locals 32
.limit stack 32
.end method

.method static logicalAnd(ZZ)Z
	iload 0
	istore 2
	iload 1
	istore 3
;load boolean from stack
iload 2
;load boolean from stack
iload 3
iand
	ireturn

.limit locals 32
.limit stack 32
.end method

.method static min(II)I
	iload 0
	istore 3
	iload 1
	istore 4
;load local value from stack
iload 3
;load local value from stack
iload 4
if_icmplt	L000
iconst_0
goto 	L001
L000:
	iconst_1
L001:
	ifeq L004
;load local value from stack
iload 3
	ireturn

L004:
;load local value from stack
iload 4
	ireturn

.limit locals 32
.limit stack 32
.end method

.method static nestedMethod()V
	invokestatic TestingFunction/helloWorld()Ljava/lang/String;
astore 4
getstatic java/lang/System/out Ljava/io/PrintStream; 
;load local value from stack
aload 4
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

.method static towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
	iload 0
	istore 6
	aload 1
	astore 7
	aload 2
	astore 8
	aload 3
	astore 9
;load local value from stack
iload 6
	ldc	1
if_icmpeq	L005
iconst_0
goto 	L006
L005:
	iconst_1
L006:
	ifeq L009
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Move disk 1 from rod %s to rod %s\n"
ldc 2
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
aload 7
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
aload 8
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	goto L0010
L009:
;load local value from stack
iload 6
	ldc	1
	isub
istore 10
;load local value from stack
iload 10
;load local value from stack
aload 7
;load local value from stack
aload 9
;load local value from stack
aload 8
	invokestatic TestingFunction/towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Move disk %d from rod %s to rod %s\n"
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 6
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
aload 7
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
dup
ldc 2 ; load arrayIndex
;load local value from stack
aload 8
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;load local value from stack
iload 10
;load local value from stack
aload 9
;load local value from stack
aload 8
;load local value from stack
aload 7
	invokestatic TestingFunction/towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
L0010:
	return

.limit locals 32
.limit stack 32
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
fstore 7
	ldc	2.4
fstore 8
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "The value of floatSum is %f"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
fload 7
;load local value from stack
fload 8
	invokestatic TestingFunction/floatSum(FF)F
invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	0
istore 9
	ldc	2
istore 10
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nThe value of intSum is %d"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 9
;load local value from stack
iload 10
	invokestatic TestingFunction/intSum(II)I
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nThe minimum of %d and %d is %d"
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 9
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
iload 10
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
dup
ldc 2 ; load arrayIndex
;load local value from stack
iload 9
;load local value from stack
iload 10
	invokestatic TestingFunction/min(II)I
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;Pushing boolean value to stack
	iconst_1
istore 11
;Pushing boolean value to stack
	iconst_0
istore 12
;load local value from stack
iload 11
;load local value from stack
iload 12
	invokestatic TestingFunction/logicalAnd(ZZ)Z
istore 13
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\n%b AND %b is %b"
ldc 3
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 11
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
dup
ldc 1 ; load arrayIndex
;load local value from stack
iload 12
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
dup
ldc 2 ; load arrayIndex
;Pushing boolean value to stack
	iconst_0
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	invokestatic TestingFunction/nestedMethod()V
	ldc	8
	ldc	7
if_icmpgt	L0011
iconst_0
goto 	L0012
L0011:
	iconst_1
L0012:


	ifeq L0014
	ldc	1
	 goto L0015
L0014:
	ldc	0
L0015:
istore 14
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "The value of at is %d"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 14
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	1.5
fstore 15
	ldc	10
	ldc	11
if_icmpgt	L0016
iconst_0
goto 	L0017
L0016:
	iconst_1
L0017:


	ifeq L0019
	ldc	2.5
	 goto L0020
L0019:
	ldc	2.0
L0020:
fstore 15
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nThe value of b is %f"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
fload 15
invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
;Pushing boolean value to stack
	iconst_1
;Pushing boolean value to stack
	iconst_0
iand


	ifeq L0022
;Pushing boolean value to stack
	iconst_1
	 goto L0023
L0022:
;Pushing boolean value to stack
	iconst_0
L0023:
istore 16
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\n\nThe value of ct is %b"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 16
invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	0
	ldc	1
if_icmpgt	L0024
iconst_0
goto 	L0025
L0024:
	iconst_1
L0025:


	ifeq L0027
ldc "\n\nhello"
	 goto L0028
L0027:
ldc "\n\nworld"
L0028:
astore 17
getstatic java/lang/System/out Ljava/io/PrintStream; 
;load local value from stack
aload 17
aconst_null
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
ldc "world 2"
astore 18
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
ldc "hello "
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
;load local value from stack
aload 18
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
astore 19
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "\nstring concat: %s"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
;load local value from stack
aload 19
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
ldc " more"
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
; do we need this? invokestatic java/lang/Float.valueOf(F)Ljava/lang/Float;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	5
ldc "A"
ldc "B"
ldc "C"
	invokestatic TestingFunction/towerOfHanoi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

	getstatic     TestingFunction/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 32
.limit stack 32
.end method
