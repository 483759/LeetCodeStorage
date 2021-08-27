import math

class Solution:
    def reverse(self, x: int) -> int:
        if x==0: return x
        neg = False
        if x<0:
            neg = True
            x*=-1
        
        len=int(math.log10(x))
        num = 0
        
        while x != 0:
            # print(num, x)
            num += (10**(len))*(x%10)
            x=x//10
            len-=1
        
        if num<-2**31 or num>2**31-1: return 0
        if neg: return num*-1
        return num
        
        