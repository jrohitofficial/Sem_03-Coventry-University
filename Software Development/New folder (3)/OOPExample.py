
# Example/Section 1

print("\n") 

class Student:

    def __init__(self, name, age=16):  # Parameterized Constructor.

        # self : indiacates the object. Same as this. in Java.

        self.__name = name # Initialized as a private variable.
        self.age = age     # Initialized as a public variable.
        self._smth = "smth"  # Initialized as a protected variable. It is local variable.
    
    def getName(self): # Parameter is the object. Getter function.
        return self.__name

    """
    def __del__(self):        # Deconstructor being oveloaded.
        print("I am dying!")  # Every class has it and is automatically executed.
    """

s1 = Student("Manoj")

print(Student.getName(s1))  # Object being passed as an argument(parameter).
print(s1.age) # Public variable.

print("\n") 

class Course:
    def __init__(self, name):
        self.__name = name
        self.enrollmentAgr = []
        self.enrollmentCom = []

    def getName(self):
        return self.__name

    # Aggregation Example.
    def enrolAggregation(self, student): # student is the object of the class Student.
        self.enrollmentAgr.append(student)
    
    # Composition Example.
    def enrolComposition(self, name):
        self.enrollmentCom.append(Student(name))

    
    def getEnrollmentArg(self):
        return self.enrollmentAgr


s1 = Student("Hari")
s2 = Student("Ram")
s3 = Student("Sam")
s4 = Student("Bahadur")

c1 = Course("Computing")

c1.enrolAggregation(s1)
c1.enrolAggregation(s2)

c1.enrolComposition("Sita")
c1.enrolComposition("Gita")

print("\nAggregation and Composition")

#
for i in c1.enrollmentAgr:
    print(Student.getName(i))

for i in c1.enrollmentCom:
    print(Student.getName(i))





# Example/Section 2


class Person:
    def __init__(self, name):
        self.name = name
    
    def isEmployee(self): # Method/Function od Person class.
        return False


class Employee(Person): # Employee class is child class of Person class.
    
    def isEmployee(self): # Overriding inherited method.
        return True


p1 = Person("Sam")      # Creating Object of the class Person.
e1 = Employee("Hari")   # Creating Object of the class Employee.

print("\n") 
for p in (p1, e1):      # Looping through 2 objects.
    print(p.name, p.isEmployee())

print("\n") 



"""
Notes:

1) Object class is the parent class of every class in Python.

2) Types of relationship between class:
     a) Inheritance: Parent-Child or Gradparent-Parent-Child relationship.
     b) Association: Aggregration Composition realtionship. 

3) Destructor: Function/Method that clears the object from the RAM(memory).
         Aggregation: If one aggregated class is removed/destroyed from memory, another class will still exist.
         Composition: If one composite class is removed from memory, another class will also be destroyed.

    removed/destroyed: When reference of the object is not needed.

    Preferably: Aggregation (First Choice).
                Composition (Second Choice).
                Inheritance (Last Choice). 

"""