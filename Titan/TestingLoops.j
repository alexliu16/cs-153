.class public TestingLoops
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
	putstatic        TestingLoops/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        TestingLoops/_standardIn LPascalTextIn;
	ldc	5
istore 0
	ldc	0
	istore_3	; a
L000:
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "This is a for loop. a has value of %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 3
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Test outside declarations. i has a value of %d\n"
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
	ldc	12
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "For loop declarations work. q has value of %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 1
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	ldc	3
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "For loop declarations work. w has value of %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 2
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
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
	ldc	0
	istore_3	; a
L004:
	ldc	1
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Second For loop declarations work. b has value of %d\n"
ldc 1
anewarray java/lang/Object
dup
ldc 0 ; load arrayIndex
;load local value from stack
iload 2
invokestatic java/lang/Integer.valueOf(I)Ljava/lang/Integer;
aastore
invokevirtual java/io/PrintStream.printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
pop
	iload 3 	; load a
	ldc	1
	iinc 3 1	; a++
	if_icmpeq L005
	iconst_0 	; false
	goto L006
L005:
	iconst_1 	; true
L006:
	ifne L007
	goto L004
L007:

	getstatic     TestingLoops/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
