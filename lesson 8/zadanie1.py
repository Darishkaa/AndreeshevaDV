a = int(input('Введите значение'))
def sq_tringle(a):
    return pow(a, 2) * pow(3, 0.5) / 4
def sq_hexagon(a):
    return sq_tringle(a) * 6

print(sq_hexagon(a))