array: int = []

def func():
    length = int(input("Введите длину массива: "))

    if length <= 0:
        print("Неправильная длина")
        return

    minValue = 0

    for i in range(length):
        value = int(input("Введите новый элемент массива: "))
        array.append(value)

    minValue = array[0]

    for i in range(length):
        if minValue > array[i]:
            minValue = array[i]
    
    print(minValue, array.index(minValue))
func()