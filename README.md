# WordWrap kata #

You write a class called Wrapper that has a single static function named wrap that takes two arguments, a string, and a column number.
The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number.
You try to break lines at word boundaries.

Note from the training :

We try to do a DDD approach. Indeed, we do not use the Optional which can be use with isPressent.

Instead, we use a value object that will make it more readable.
Another thing is that we discussed about removing primitive in order to give more logic into the code.

For example, for Currency, we don't want to make it as a string. The perimeter is too large and doesn't reflect
the logic of the currency. Instead, create an immutable object Currency which will store the name of the currency.

This kind of method will remove the code smell primitive obsession.