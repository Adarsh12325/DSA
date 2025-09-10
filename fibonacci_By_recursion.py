print(0,1,end=" ")
count = 2
def fibonacci(x,y):
    global count
    if(count<=19):
        new=x+y
        print(new,end=" ")
        x=y
        y=new
        count+=1
        fibonacci(x,y)
    else:
        return
fibonacci(0,1)