def fibonacci(no):
    if no <= 1:
        return no
    else:
        return(fibonacci(no-1) + fibonacci(no-2))

fbNum = int(input("Enter a number: "))

print("Fibonacci Sequence: ")
for i in range(fbNum):
    print(fibonacci(i))