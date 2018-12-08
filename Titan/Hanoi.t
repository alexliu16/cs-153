program Hanoi

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
    towerOfHanoi(5, "A", "B", "C")
}