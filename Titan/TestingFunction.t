program TestingFunction
main {
	int v = 0
	float a = 3.1
	float b = 2.4
	float c = floatSum(a, b)
	
	//printf("\n\nThe value of floatSum is %f", c)
	
	/*int a1 = 0	
	int b1 = 2
	int c1 = intSum(a1, b1)
	printf("%d", c1)*/
	
}

function float floatSum(float a, float b){
	float g = 1.243
	float sum = a + b
	printf("The value of sum is %f", sum)
	return sum
}

function int intSum(int a, int b){
	return a + b
}
