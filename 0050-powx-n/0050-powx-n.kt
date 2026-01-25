class Solution {
    fun myPow(x: Double, n: Int): Double {
        if(n==0) return 1.0
        if(n==-1) return 1/x
        
        val half = myPow(x, n/2)
        return if(n%2==0) half*half
            else {
                if (n > 0) half * half * x 
                else half * half * (1 / x)   
            }
    }
}