def func():
    global x,y,p
    while x < y:
        k = x*0.1
        x = x + k
        p = p + 1
    else: print('Дней: ', p)
x=int(input('Пробежал км:'))
y=int(input('Нужно пробежать:'))
p=0

func()