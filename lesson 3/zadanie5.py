from unittest import result


values = [13,6,45]

def GetMin(array):
    result = array[0]

    for i in range(len(array)):
        if (array[i] < result):
            result = array[i]
    
    return result


print(GetMin(values))