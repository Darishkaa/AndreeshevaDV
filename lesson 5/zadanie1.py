n=50
def func():
    if n<=0:
        return

    for i in range(1,n):
        y=i**2
        if y<=n:
            print(y)

func()
