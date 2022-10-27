a = "a:a::aaaa::aaaa" #5

def func():
    b = a.replace(":", "%")
    count = b.count("%")

    print(b, count)

func()
