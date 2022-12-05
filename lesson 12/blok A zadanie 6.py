def func(k):
    if k<=1:
        print ("неверное число")
        return
    for i in range(2, int(k ** 0.5) + 1):
        if k % i == 0:
            print("NO")
            return
    print("YES")
k = int(input('Введите ваше число'))
func(k) 