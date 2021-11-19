fruits =	{
  "mango": "Rs.100",
  "oranges": "Rs.50",
  "banana": "Rs.20",
  "watermelon":"Rs 80"
}

fruit = input("Enter fruit name to check availability:").lower()

for k,v in fruits.items():
    if(k != fruit):
        print(fruit,"not available in fruit basket")
        break
    else:
        print(fruit,"is available in fruit basket")
        break
      