def task(n):
   s,c,p=0,0,1
   for i in range(n):
      c,p=c+p,c
      s+=c
   return s 
 
n=int(input("n="))
print(task(n))