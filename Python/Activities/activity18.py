import pandas as pd

data = pd.read_csv("./credentials.csv")
#whole Data
print("*****Whole Data*****")
print(data)
#values only in the Usernames column
print("*****Usernames only*****")
print(data["Usernames"])

#2nd Row Password and Username only
print("*****2nd Row Password and Username only*****")
print(data["Usernames"][1],data["Passwords"][1])

#Sort the Usernames column data in ascending order
print("*****Sorted the Usernames column data in ascending order*****")
print(data.sort_values("Usernames"))

#Sort the Passwords column data in descending  order
print("*****Sorted the Passwords column data in descending  order*****")
print(data.sort_values("Passwords",ascending=False))