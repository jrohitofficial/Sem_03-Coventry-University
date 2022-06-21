from abc import ABC, abstractmethod


class Pizza(ABC):

    def prepare(self):
        print(f"Preparing {self._name} pizza")

    def bake(self):
        print("Baking")

    def cut(self):
        print("Cutting")


class KTMCheesePizza(Pizza):

    def __init__(self):
        self._name = "KTM style Cheese"


class KTMVeggiePizza(Pizza):
    
    def __init__(self):
        self._name = " KTM style Veggie"



class PokharaCheesePizza(Pizza):

    def __init__(self):
        self._name = " POK style Cheese"

class PokharaVeggiePizza(Pizza):
    
    def __init__(self):
        self._name = "POK style Veggie"


class PizzaStore(ABC):

    def orderPizza(self, type):

        pizza = self.createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()

    @abstractmethod
    def createPizza(self, type):
        pass


class KTMPizzaStore(PizzaStore):

    def createPizza(self, type):
        if(type == "Cheese"):
            pizza = KTMCheesePizza()
                
        elif(type == "Veggie"):
            pizza = KTMVeggiePizza()
        
        return pizza


class POKPizzaStore(PizzaStore):

    def createPizza(self, type):
        if(type == "Cheese"):
            pizza = PokaharaCheesePizza()
                
        elif(type == "Veggie"):
            pizza = PokharaVeggiePizza()
        
        return pizza



ps = POKPizzaStore()
ps.orderPizza(type="Veggie")