K = 3
T = 4

A = [
[1, 2, 3, 4],
[5, 6, 7, 8],
[9,10,11,12]]

def func()

    for i in range(K):
        A[i][0], A[i][T-1] = A[i][T-1], A[i][0]


    for i in range(K):
        for j in range(T):
            print("%2d " % A[i][j], end='')
        print()
func()
