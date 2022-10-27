n=18
def func():
    p=0
    while p<n:
        x=0
        x+=2*p 

        if x>n:
            print(p-1,x)
        p+=1
func()