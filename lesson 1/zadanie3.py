age = int(input('Введите ваш возраст'))
first_name = input('Введите ваше имя')
if age > 16:
    print  ('Поздраавляем вы поступили в ВГУИТ')
else:
    print ('Сначала нужно окончить школу!')
    b = 16 - age
    print ('Поступайте через', b)
if  0<age<75:
    print('Возраст верный!')
else: 
    print('Недопустимый возраст!')
if first_name == "Иван":
    print ('Вы Иван!')
