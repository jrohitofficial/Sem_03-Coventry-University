# Example of open close principle for multiple shapes.
# Abstract class is needed to deal wiht muktiple shapes without changing the original code of Board class.

from abc import ABC, abstractmethod

class Shape(ABC):  # ABC to make abstract class. ABC (Abstract Base Class)

    @abstractmethod
    def area(self):
        pass

class Rectangle(Shape):  # Child class of Shape.

    def __init__(self, width, height):
        self._height = height  # _height is a private variable.
        self._width = width

    def getHeight(self):
        return self._height

    def getWidth(self):
        return self._width

    def area(self):
        return self._height * self._width


class Circle(Shape):
    
    def __init__(self, radius):
        self._radius = radius

    def getRadius(self):
        return self._radius

    def area(self):
        return 3.14 * self._radius * self._radius 



class Board():

    def __init__(self, shapes):
        self._shapes = shapes;

    def getShapes(self):
        return self._shapes;

    def calcArea(self):
        area1 = 0

        for shp in self._shapes:
            area1 += shp.area()

        return area1



r1 = Rectangle(12, 34)
r2 = Rectangle(3, 34)

c7 = Circle(8)

b1 = Board([r1,r2,c7])

print(b1.calcArea())