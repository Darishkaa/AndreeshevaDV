from turtle import pos
from unittest import result


x = [int(input("Номер столбца первой ячейки")), int(input("Номер строки первой ячейки"))]
y = [int(input("Номер столбца второй ячейки")), int(input("Номер строки второй ячейки"))]

length = 8

def ColorApprove(el1, el2):

    if (el1[0] > length or el1[1] > length or el2[0] > length or el2[1] > length):
        return "Неверные входные данные"

    result = ""

    pos1 = el1[0] * el1[1] - 1
    pos2 = el2[0] * el2[1] - 1

    if pos1 % 2 == 0 and pos2 % 2 == 0:
        result = "Да"
    else:
        result = "Нет"

    return result



print(ColorApprove(x, y))