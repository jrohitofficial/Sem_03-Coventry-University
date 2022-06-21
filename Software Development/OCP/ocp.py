# Example of open close principle.

class Rectangle():

    def __init__(self, width, height):
        self._height = height  # _height is a private variable.
        self._width = width

    def getHeight(self):
        return self._height

    def getWidth(self):
        return self._width



class Board():

    def __init__(self, rectangles):
        self._rectangles = rectangles;

    def getRectangle(self):
        return self._rectangles;

    def calcArea(self):
        area = 0

        for rect in self._rectangles:
            area += rect.getWidth() * rect.getHeight()

        return area



r1 = Rectangle(12, 34)
r2 = Rectangle(3, 34)

b1 = Board([r1,r2])


print(b1.calcArea())