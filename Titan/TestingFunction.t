program TestingFunction
main {
	float a = 3.1
	float b = 2.4
	float c = floatSum(a, b)
	printf("The value of floatSum is %f", c)
	
	int a1 = 0	
	int b1 = 2
	int c1 = intSum(a1, b1)
	printf("\n\nThe value of intSum is %d", c1)
	
	int d1 = min(a1, b1)
	printf("\n\nThe minimum of %d and %d is %d", a1, b1, d1)
	
	bool d = true
	bool e = false
	bool f = logicalAnd(d, e)
	printf("\n\n%b AND %b is %b", d, e, f)
	
	nestedMethod()
}

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
	else return b
}

function void nestedMethod(){
	string s = helloWorld()
	printf(s)
}

function string helloWorld(){
	return "\n\nHello world!"
}
