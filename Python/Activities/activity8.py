numbers = list(input("Enter a numbers = ").split(","))
print("First number=",numbers[0])
print("Last number=",numbers[-1])

if (numbers[0]==numbers[-1]):
    print("First and last number in list is same")
else:
    print("First and last number in list is not same")