import requests 
import json
from tkinter import *
import time 

def func(user):
    url = f"https://api.github.com/users/{user}"

    return requests.get(url).json()

def result(value):
    file = open("username.json", "w")
    file.writelines(json.dumps(value))
    
keys = [
    'company',
    'created_at',
    'email',
    'id',
    'name',
    'url'
]

def getData():
    data = func(txt.get())

    l: dict = {}

    for i in range(len(keys)):  
        l[keys[i]] = data[keys[i]]
        
    result(l)

window = Tk() 
window.title("Введите ваше имя")  
window.geometry('500x350')  
txt = Entry(window,width=40)  
txt.grid(column=0, row=0)  
btn = Button(window, text="Нажимайте!", command=getData)  
btn.grid(column=1, row=0)  
window.mainloop()
