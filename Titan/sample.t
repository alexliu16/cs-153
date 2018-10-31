main {

    function bool isEven(int a) {
        return a % 2 == 0
    }
    int a = 3
    int b = a-3
    int sum = 0
    for i from b to a {
        if isEven(i) {
            sum += i
        }
    }
}