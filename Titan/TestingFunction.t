program TestingFunction

function float floatSum(float a, float b){
	float g = 1.243 //dummy variable for testing
	float sum = a + b
	return sum
}

function int intSum(int a, int b){
	return a + b
}

function bool logicalAnd(bool b1, bool b2){
	return b1 && b2
}

function int min(int a, int b){
	if a < b return a
	return b
}

function void nestedMethod(){
	string s = helloWorld()
	printf(s)
}

function string helloWorld(){
	return "\n\nHello world!"
}

function void towerOfHanoi(int n, string from_rod, string to_rod, string aux_rod)
{
    if n == 1
    {
        printf("Move disk 1 from rod %s to rod %s\n", from_rod, to_rod)
    }
    else {
        int next = n-1
        towerOfHanoi(next, from_rod, aux_rod, to_rod)
        printf("Move disk %d from rod %s to rod %s\n", n, from_rod, to_rod)
        towerOfHanoi(next, aux_rod, to_rod, from_rod)
    }
}

main {

	float a = 3.1
	float b = 2.4
	printf("The value of floatSum is %f", floatSum(a,b))

	int a1 = 0
	int b1 = 2
	printf("\n\nThe value of intSum is %d", intSum(a1, b1))

	printf("\n\nThe minimum of %d and %d is %d", a1, b1, min(a1, b1))

	bool d = true
	bool e = false
	bool f = logicalAnd(d, e)
	printf("\n\n%b AND %b is %b", d, e, false)

	nestedMethod()


	//Code below is used to test ternary operators

	int at = 8 > 7 ? 1 : 0
	printf("The value of at is %d", at)


	float bt = 1.5
	bt = 10 > 11 ? 2.5 : 2.0
	printf("\n\nThe value of b is %f", bt)

	bool ct = true && false ? true : false
	printf("\n\nThe value of ct is %b", ct)

	string dd = 0 > 1 ? "\n\nhello" : "\n\nworld"
	printf(dd)

	string world = "world 2"
	string helloworld = "hello " + world
	printf("\nstring concat: %s", helloworld + " more")

    towerOfHanoi(5, "A", "B", "C")

}