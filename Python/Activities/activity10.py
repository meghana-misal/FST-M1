numberTuple= tuple(input("Enter the numbers=").split(","))
print(numberTuple)

for i in numberTuple:
    if(int(i) % 5 ==0):
        print(i, "is devisible by 5")