from random import randint
import json

def magic(): 
    matrix = json.load(open("андреещева_ДД_Н-У222_vvod-1.txt", "r"))
    summ = sum(matrix[0]) 
  
    for i in range(len(matrix)): 
        temp = 0 
        for j in range(len(matrix)): 
            temp += matrix[j][i] 
        if temp != summ or sum(matrix[i]) != summ: 
            return False 
    return True 

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

writeToFile(generator(int(input("Введите кол-вл строк")),int(input("Введите кол-вo столбцов")),int(input("Введите минимальное значение")),int(input("Введите максимальное значение"))), "андреещева_ДД_Н-У222_vvod-1.txt")
writeToFile(magic(), "андреещева_ДД_Н-У222_vivod-1.txt")