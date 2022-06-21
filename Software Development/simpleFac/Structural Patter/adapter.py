import math


class RoundPeg():

    def __init__(self, radius):
        self._radius = radius

    def getRadius(self):
        return self._radius


class RoundHole():
    def __init__(self, radius):
        self._radius = radius

    def getRadius(self):
        return self._radius

    def fits(self, peg: RoundPeg):
        return peg.getRadius() <= self._radius


class SquarePeg():

    def __init__(self, width):
        self._width = width

    def getWidth(self):
        return self._width


class SquarePegAdapter(RoundPeg):

    def __init__(self, peg: SquarePeg):
        self._peg = peg

    def getRadius(self):
        return self._peg.getWidth() * math.sqrt(2) / 2


# Round peg has radius
rpeg = RoundPeg(5)
rhole = RoundHole(5)
print(f"Round peg {rhole.fits(rpeg)}")


# but square peg doesnot have radius

speg = SquarePeg(5)

# adapter is used to give equivalent radius to the Square peg
adapted_speg = SquarePegAdapter(speg)
print(f"Adapted Square peg {rhole.fits(adapted_speg)}")
