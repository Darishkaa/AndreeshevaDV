n=int(input('Введите число'))
def number(n):
    factorial=1    
    while n>1:
        factorial*=n
        n-=1
    print(factorial)
number(n)