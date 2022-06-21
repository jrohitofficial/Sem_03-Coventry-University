from abc import ABC, abstractmethod

class AbstractBuilder(ABC):
    @abstractmethod
    def build_part_a(self):
        pass
    
    @abstractmethod
    def build_part_b(self):
        pass
    
    @abstractmethod
    def get_result(self):
        pass

class Product():
    def __init__(self):
        self._parts = []

class Builder(AbstractBuilder):
    def __init__(self):
        self._product = Product()
    
    def build_part_a(self):
        self._product._parts.append('part a')
        return self
    
    def build_part_b(self):
        self._product._parts.append('part b')
        return self

    def get_result(self):
        return self._product

class Director:

    @staticmethod
    def construct():
        return Builder()\
            .build_part_b()\
            .build_part_a()\
            .get_result()


p = Director.construct()
print(p._parts)