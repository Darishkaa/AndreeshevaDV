def func(m):
    result = ""

    if m % 4 == 0 and m % 100 != 0 or m % 400 == 0:
        result = "Да" 
    else:
        result = "Нет" 

    return result

print(func(int(input("Введите год"))))