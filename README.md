# FooBarQix kata #

Write a program that displays numbers from 1 to 100
A number per line. Follow these rules:
•	If the number is divisible by 3 or 3 contains, write "Foo" instead of 3
•	If the number is divisible by 5 or contains 5, write "Bar" instead of 5
•	If the number is divisible by 7 or 7 contains, write "Qix" instead of 7

An example
1
2
FooFoo
4
BarBar
Foo
QixQix
8
Foo
Bar
...

More explanations
•	We consider the dividers before the content (eg 51 -> FooBar)
•	We look at the content in the order in which it appears (eg 53 -> BarFoo)
•	We look at the multi in the order Foo, Bar and Qix (eg 21 -> FooQix)
•	13 contains 3 therefore written, "Foo"
•	15 is divisible by 3 and 5 and contains a 5 therefore written “FooBarBar"
•	33 contains twice 3 and is divisible by 3 therefore written "FooFooFoo“

