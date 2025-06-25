class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int Sum=0;
            int n=i;
            while(n>0){
            int digit=n%10;
            Sum+= digit;
            n/=10;
        }
        
        if(Sum%2==0){
            count++;
        
        }
        }
        return count;
        
    }
}