values = [3,3, 3]

def func(val):
    result = ""
    length = len(val)

    if val[0] == val[1] == val[2]:
        return 3
    elif val[0] != val[1] != val[2]:
        return 1
    else: return 2
                    


print(func(values))