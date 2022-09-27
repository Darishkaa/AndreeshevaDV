n = int(input("Длина"))
m = int(input("Ширина"))
k = int(input("Искомое кол-во клеток"))

def fucn(w, h, x):
    size = w * h

    if x % w != 0 or x > w:
        return "Нет"

    if x % h != 0 or x > h:
        return "Нет"

    if size // 2 > x:
        return "Да"

print(fucn(n, m, k))