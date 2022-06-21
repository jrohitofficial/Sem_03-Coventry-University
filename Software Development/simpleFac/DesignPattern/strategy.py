from abc import ABC, abstractmethod


# Here the Calculator class needs to be edited to add or remove functionality which is not good.


# class Calculator():

#     def add(num1, num2):
#         return num1 + num2;

#     def sub(num1, num2):
#         return num1 - num2;


class Strategy(ABC):

    @abstractmethod
    def execute(num1: int, num2: int) -> int:
        pass


class Add(Strategy):
    def execute(self, num1, num2):
        return num1 + num2


class Subtract(Strategy):
    def execute(self, num1, num2):
        return num1 - num2


class Claculator():

    def __init__(self):
        self._strategy = None

    def setStrategy(self, strategy: Strategy):
        self._strategy = strategy

    def calculate(self, num1: int, num2: int):
        return self._strategy.execute(num1, num2)


a1 = Add()
s1 = Subtract()

c1 = Claculator()

c1.setStrategy(a1)
print(c1.calculate(2, 3))

c1.setStrategy(s1)
print(c1.calculate(2, 3))


# Now to add new functionality, we implement it in a new class
# instead of modifing preexiting classes.


class Mul(Strategy):
    def execute(self, num1, num2):
        return num1 * num2

m1 = Mul()

c1.setStrategy(m1)
print(c1.calculate(2, 3))
