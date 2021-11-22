import pandas
 
dataframe= pandas.read_excel("./Employee.xlsx")

#the number of rows and columns
print("**********the number of rows and columns**********")
print(dataframe.shape)

#data in the emails column only
print("**********data in the emails column only**********")
print(dataframe["Email"])

#Sorted the data based on FirstName in ascending order
print("**********Sorted the data based on FirstName in ascending order**********")
print(dataframe.sort_values("FirstName"))