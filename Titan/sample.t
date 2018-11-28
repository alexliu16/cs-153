program TestingProg
main {
    int num = 2+2
    float f = 2.0
    bool b = false
    bool c = num > 2

    if b || c && num < 10 printf("num is between 3 and 9\n")
    printf("Num = %d\n", num)

    string name = "Titan"
    printf("The project name is %s\n", name)
    num *=3
    printf("Num = %d\n", num)

    f*=1.2
    printf("f should be 2.4... -> %f", f)

}