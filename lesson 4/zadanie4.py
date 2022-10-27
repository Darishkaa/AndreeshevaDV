def number(n):
    
    x=0
    while n>0:
      x+=int(input('Введите число'))
      n-=1
    print(x)
number(4)