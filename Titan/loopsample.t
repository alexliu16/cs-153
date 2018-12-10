program TestingLoops
main {
	int i = 5
	
	for a from 0 to i {
    	printf("This is a for loop. a has value of %d\n",a)
    	printf("Test outside declarations. i has a value of %d\n",i)
    	
    }
    
    while (i > 0) {
    	int w = 4
    	printf("Inside var declaration. While loop. \tw has value of %d\n",w)
        printf("While loop. \ti has value of %d\n",i)
    	i -= 1
    }
}