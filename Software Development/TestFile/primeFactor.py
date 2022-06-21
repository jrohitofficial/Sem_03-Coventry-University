
lst = []

class PrimeFactor:

    

    def of(num):

        
        if num > 1:
            return[num]

        for i in range(2,num):
            if  isinstance(num / i, int):
                for j in range(2,i):
                    if isinstance(i / j, float):
                        pass
                    else:
                        lst.append(i)
                
        print(lst)

        return lst



