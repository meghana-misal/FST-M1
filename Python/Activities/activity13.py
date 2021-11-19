
def sum():
    numbers = list(input("Enter the numbers:").split(","))
    addition = 0
    for i in numbers:
        addition = addition + int(i)
    print("Sum of the entered number",addition)

sum()
