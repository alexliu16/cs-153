.class public TestingArithmetic
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
isub
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
ldc 1
isub
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2.0
ldc 4
i2f
fdiv
invokevirtual java/io/PrintStream/println(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
ldc 3
imul
iadd
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
iadd
ldc 3
imul
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
ldc 3
isub
ldc 1
imul
isub
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 21.0
invokevirtual java/io/PrintStream/println(F)V
return
.limit locals 32
.limit stack 32
.end method
