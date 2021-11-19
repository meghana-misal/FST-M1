def sum(number):
    result = 0
    if number:
      result = number + sum(number-1)
      return result
    else: 
      return result

print(sum(10))