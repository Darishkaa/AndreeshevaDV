import math
x=-4.5
y=0.75*10**-4
z=-0.845*10**2
s=0
e=2.7182818

numerator=(9+(x-y)**2)**(1./3.)
print (numerator)
denominator = x**2 + y**2 + 2
print(denominator)
multiplier = e**abs(x-y) * (math.tan(z))**3
print(multiplier)
s= numerator/denominator-multiplier
print(s)