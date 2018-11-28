program TestingBool
main {
    int a = 2
    bool b = false
    bool c = a <= 2

    if a == 2 printf("c is %b\n", c)
    printf("b is %b\n", b)
    printf("b AND c = %b\n", b && c)
    printf("b OR c = %b\n", b || c)
}