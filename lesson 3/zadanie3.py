def GetTimeByMin(min):
    day = min // 1440
    hour = (min - day * 1440) // 60
    min = min - day * 1440 - hour * 60

    result = ""

    if day <= 0:
        result = str(hour) + " " + str(min)
    else:
        result = str(hour) + " " + str(min) + " (" + str(day) + ")"

    return result


print(GetTimeByMin(int(input("Введите количество минут"))))