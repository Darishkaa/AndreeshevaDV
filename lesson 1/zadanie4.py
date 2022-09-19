sec=5645632
day= sec//86400
hour=(sec-day*86400)//3600
min=(sec-day*86400-hour*3600)//60
sec=sec-day*86400-hour*3600-min*60
print(day,hour,min,sec)


