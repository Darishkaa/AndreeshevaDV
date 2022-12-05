def func():

 
    s = [int(i) for i in input('Введите числа:').split() if int(i)]
    print(*s[::2])
 
    
func()