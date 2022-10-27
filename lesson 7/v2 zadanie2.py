newArray: int = [-1,1,-2,-3,5,6,8]

def func():
    lessZeroArray: int = []
    aboveZeroArray: int = []
    for i in range(len(newArray)):
        if newArray[i] >= 0:
            aboveZeroArray.append(newArray[i])
        else:
            lessZeroArray.append(newArray[i])

    print(newArray)
    print(aboveZeroArray)
    print(lessZeroArray)

func()