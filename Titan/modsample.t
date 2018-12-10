program ModSample

function bool isPrime(int num) {
  int count = 0
  for a from 1 to num {
    if num % a == 0 {
      count++
    }
  }
  return count == 2
}


main {
  int num = 10
  bool isNumPrime = isPrime(num)
  printf("%d is prime? %b\n", num, isNumPrime)
  for a from 2 to 20 {
    bool isItPrime = isPrime(a)
    if isItPrime 
    	printf("%d is prime\n", a)
  }
  
  int k = 20
  k %= 10
  printf("k should be 0, k is %d\n", k)
}