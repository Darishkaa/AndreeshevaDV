age = int(input('Введите ваш возраст'))


if  0<age<75:
    print('Возраст верный!')
    if age > 16 :
        print  ('Поздраавляем вы поступили в ВГУИТ')
        first_name = input('Введите ваше имя: ')
        if first_name == "Иван":
            print ('Вы Иван!')
        else:
             print ('Ваше имя не Иван') 
    else:
        print ('Сначала нужно окончить школу!')
        b = 16 - age
        print ('Поступайте через', b)
else: 
    print('Недопустимый возраст!')
