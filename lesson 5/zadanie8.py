array = [6,7,1,1,1,1,1,1,8,2,6,1,2,5,2,0,7,6,6,4,3]

def func():
    a = 0
    b = 0
    c = 0
    h = 0

    for i in range(1,len(array)):
        if array[i] == 0:
            if a < c:
                a = c
                b = h

            print(f"Больше всего элементов: {b} [{a + 1}]")
            break

        if array[i] == array[i-1]:
            c+=1
            h = array[i]
        else:
            if a < c:
                a = c
                b = h

            c = 0
            h  = 0


func()