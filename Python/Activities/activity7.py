numbers = list(input("Enter a numbers = ").split(","))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)