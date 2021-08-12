# Python Cheat-Sheet.md
### Range for-loop
```python
>>> for i in range(5):
>>>   print('Jimmy Five Times ({})'.format(str(i)))
>>> for i in range(0, 5, 1):
>>>   print('Jimmy Five Times ({})'.format(str(i)))
```
### Using for Loops with Lists
```python
>>> supplies = ['pens', 'staplers', 'flame-throwers', 'binders']
>>> for i, supply in enumerate(supplies):
>>>     print('Index {} in supplies is: {}'.format(str(i), supply))
Index 0 in supplies is: pens
Index 1 in supplies is: staplers
Index 2 in supplies is: flame-throwers
Index 3 in supplies is: binders
```
### Looping Through Multiple Lists with zip()
```python
>>> name = ['Pete', 'John', 'Elizabeth']
>>> age = [6, 23, 44]
>>> for n, a in zip(name, age):
>>>     print('{} is {} years old'.format(n, a))
Pete is 6 years old
John is 23 years old
Elizabeth is 44 years old
```
---

### Range for-loop
```python
>>> for i in range(5):
>>>   print('Jimmy Five Times ({})'.format(str(i)))
Jimmy Five Times (0)
Jimmy Five Times (1)
Jimmy Five Times (2)
Jimmy Five Times (3)
Jimmy Five Times (4)

>>> for i in range(0, 10, 2):
>>>   print(i)
0
2
4
6
8

>>> for i in range(5, -1, -1):
>>>     print(i)
5
4
3
2
1
0
```

### Lists
```python
>>> spam = ['cat', 'bat', 'rat', 'elephant']
>>> spam
['cat', 'bat', 'rat', 'elephant']
```
### Getting Individual Values in a List with Indexes
```python
>>> spam[0]
'cat'
>>> spam[1]
'bat'
>>> spam[-1]
'elephant'
>>> spam[-2]
'rat'
```
### Getting a List’s Length with len()
```python
>>> spam = ['cat', 'dog', 'moose']
>>> len(spam)
3
```
### Changing Values in a List with Indexes
```python
>>> spam = ['cat', 'bat', 'rat', 'elephant']
>>> spam[1] = 'aardvark'
>>> spam
['cat', 'aardvark', 'rat', 'elephant']
>>> spam[2] = spam[1]
>>> spam
['cat', 'aardvark', 'aardvark', 'elephant']
>>> spam[-1] = 12345
>>> spam
['cat', 'aardvark', 'aardvark', 12345]
```
### Getting Sublists with Slices
```python
>>> spam[0:4]
['cat', 'bat', 'rat', 'elephant']
>>> spam[1:3]
['bat', 'rat']
>>> spam[0:-1]
['cat', 'bat', 'rat']
>>> spam[:2]
['cat', 'bat']
>>> spam[1:]
['bat', 'rat', 'elephant']
```
### Slicing the complete list will perform a copy:
```python
>>> spam2 = spam[:]
['cat', 'bat', 'rat', 'elephant']
>>> spam.append('dog')
>>> spam
['cat', 'bat', 'rat', 'elephant', 'dog']
>>> spam2
['cat', 'bat', 'rat', 'elephant']
```

### List Concatenation and List Replication
```python
>>> [1, 2, 3] + ['A', 'B', 'C']
[1, 2, 3, 'A', 'B', 'C']
>>> ['X', 'Y', 'Z'] * 3
['X', 'Y', 'Z', 'X', 'Y', 'Z', 'X', 'Y', 'Z']
>>> spam = [1, 2, 3]
>>> spam = spam + ['A', 'B', 'C']
>>> spam
[1, 2, 3, 'A', 'B', 'C']
```
### Removing Values from Lists with del Statements
```python
>>> spam = ['cat', 'bat', 'rat', 'elephant']
>>> del spam[2]
>>> spam
['cat', 'bat', 'elephant']
>>> del spam[2]
>>> spam
['cat', 'bat']
```

### Using for Loops with Lists
```python
>>> supplies = ['pens', 'staplers', 'flame-throwers', 'binders']
>>> for i, supply in enumerate(supplies):
>>>     print('Index {} in supplies is: {}'.format(str(i), supply))
Index 0 in supplies is: pens
Index 1 in supplies is: staplers
Index 2 in supplies is: flame-throwers
Index 3 in supplies is: binders
```
### Looping Through Multiple Lists with zip()
```python
>>> name = ['Pete', 'John', 'Elizabeth']
>>> age = [6, 23, 44]
>>> for n, a in zip(name, age):
>>>     print('{} is {} years old'.format(n, a))
Pete is 6 years old
John is 23 years old
Elizabeth is 44 years old
```

### Keyword Arguments and print()
```python
>>> print('cats', 'dogs', 'mice')
cats dogs mice
>>> print('cats', 'dogs', 'mice', sep=',')
cats,dogs,mice
```

### The global Statement
If you need to modify a global variable from within a function, use the global statement:
```python
>>> def spam():
>>>     global eggs
>>>     eggs = 'spam'
>>>
>>> eggs = 'global'
>>> spam()
>>> print(eggs)
spam
```

### Final code in exception handling
Code inside the finally section is always executed.
```python
>>> def spam(divideBy):
>>>     try:
>>>         return 42 / divideBy
>>>     except ZeroDivisionError as e:
>>>         print('Error: Invalid argument: {}'.format(e))
>>>     finally:
>>>         print("-- division finished --")
>>> print(spam(2))
-- division finished --
21.0
>>> print(spam(12))
-- division finished --
3.5
>>> print(spam(0))
Error: Invalid Argument division by zero
-- division finished --
None
>>> print(spam(1))
-- division finished --
42.0
```


# OOP - Inheritance
### Simulation OOP
```python
class Toy:
    def talk(self):
        raise NotImplementedError('This method should have implemented.')

class Dog(Toy):
    # Write your code here
    def talk(self):
        print("Wow")

class Cat(Toy):
    # Write your code here
    def talk(self):
        print("Meow")

class ToyFactory:
    # @param {string} Type a string
    # @return {Toy} Get object of the type
    def getToy(self, type):
        # Write your code here
        if type == 'Dog':
            return Dog()
        elif type == 'Cat':
            return Cat()
        else:
            return None
```

### References:
- [Python Cheatsheet!](https://www.pythoncheatsheet.org/)
- [Python Official Doc](https://devguide.python.org/)




