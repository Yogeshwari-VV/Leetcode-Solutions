class Solution {
    public boolean checkDivisibility(int n) {
        int m = n;
        int sum = 0;
        int prod = 1;
        while(n>0){
            int digit = n%10;
            sum +=digit;
            prod *= digit;
            n /= 10;
        }
        int totalSum = sum+prod;
        return (m%totalSum==0);
        
    }
}