a=15
b=10
def number():
    if a>b:
        for i in range (a,b,-1):
            if i%2!=0:
                print(i)
number()