program TestingLoops
main {
	int i = 1
	
	if i < 2 {
		printf("IF")
	} else {
		printf("ELSE")
	}
	while (i < 5) {
		int z = 3
		printf("While loop. i has value of %d\n",i)
		printf("Declare var z in while loop. z has value of %d\n",z)
		i += 1
	}
    
    for a from 0 to 2 {
    	int z = 1
    	printf("For loop declarations work. a has value of %d\n",a)
    }
}