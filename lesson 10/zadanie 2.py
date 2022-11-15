from random import randint
import json

def func(): 
    a = json.load(open("андреещева_ДД_Н-У222_vvod-2.txt", "r"))

    for i in range(len(a)):
        x = a[i][0]
        a[i][0] = a[i][len(a[i]) - 1]
        a[i][len(a[i]) - 1] = x
    
    writeToFile(a, "андреещева_ДД_Н-У222_vivod-2.txt")

def generator(row, column, maxValue, minValue):
    rowA = []
    for i in range(row):
        columnA = []
        for f in range(column):
            columnA.append(randint(maxValue,minValue))
            
        rowA.append(columnA)

    return rowA

def writeToFile(x, path):
    file = open(path, "w")
    file.writelines(json.dumps(x))

writeToFile(generator(int(input("Введите кол-вл строк")),int(input("Введите кол-вo столбцов")),int(input("Введите минимальное значение")),int(input("Введите максимальное значение"))), "андреещева_ДД_Н-У222_vvod-2.txt")
func()