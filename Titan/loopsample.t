program TestingLoops
main {
	int i = 5
	
	for a from 0 to 3 {
    	printf("This is a for loop. a has value of %d\n",a)
    	printf("Test outside declarations. i has a value of %d\n",i)
    	
    	int q = 12
    	printf("For loop declarations work. q has value of %d\n",q)
    	
    	int w = 3
    	printf("For loop declarations work. w has value of %d\n",w)
    }
}