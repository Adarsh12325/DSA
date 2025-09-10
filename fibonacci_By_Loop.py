n = int(input())
x=0
y=1
print(x,y,end = " ")
for i in range(n-2):
    new = x+y
    print(new,end = " ")
    x=y
    y=new