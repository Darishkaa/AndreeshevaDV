def fib(n,k):

   s,e,p=0,0,1
   for i in range(n):
      e,p=e+p,e
      if i>=k-1:
        s+=e
   return s 
 
n=int(input("n="))
k=int(input("k="))
print(fib(n,k))