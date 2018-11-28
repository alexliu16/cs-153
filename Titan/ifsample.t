program TestingConditional
main {
	int i = 5
	if i == 5 printf("if no brackets and no else: i has value of %d\n",i)
	if i == 5 {
	  printf("if brackets and no else i has value of %d\n",i)
	}
	
	if i == 10 printf("if no brackets with else: i has value of %d\n",i)
	else printf("else no brackets: i has value of %d\n",i)
	
	if i == 10 {
	} else {
	  printf("else brackets! i has value of %d\n",i)
	}
}