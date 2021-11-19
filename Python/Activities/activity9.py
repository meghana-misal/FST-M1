list1 = list(input("Enter a list 1 numbers = ").split(","))
list2 = list(input("Enter a list 2 numbers = ").split(","))

list3= []

for i in list1:
    if(int(i) %2 != 0):
        list3.append(i)

for i in list2:
    if(int(i) % 2 == 0):
        list3.append(i)

print(list3)