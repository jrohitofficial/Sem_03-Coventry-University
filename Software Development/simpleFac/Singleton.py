
class LeaderBoard():

    """
    # Normally instance variable is used

    def __init__(self):
        self._table = {  

    def printRe(self):
        return self._table
    """


    # Using class variable.
    
    _table = {}  # This can accessed by other classes.

    @classmethod    # Method to manipulate class variable.
    def printRe(cls):
        return cls._table

    @classmethod
    def addWinner(cls, position, name):
        cls._table[position] = name


class Game1():
    def __init__(self):
        self.lb = LeaderBoard()

    def addWinner(self, pos, name):
        self.lb.addWinner(pos, name)
    


class Game2():
    def __init__(self):
        self.lb1 = LeaderBoard()

    def addWinner(self, pos, name):
        self.lb1.addWinner(pos, name)
    

g1 = Game1()
g1.addWinner(1, "Someone's Name")

g2 = Game2()
g2.addWinner(2, "Someone else's name")

lb = LeaderBoard()
print(lb.printRe())