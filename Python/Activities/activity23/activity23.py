import pytest

"""
@pytest.fixture
def input_list():
   list = [1,2,3,4,5,6,7,8,9,10]
   return list 
   
"""

def test_addListValues(input_list):
    sum = 0
    for i in input_list:
        sum = sum + i
        print(sum)
    assert sum == 55