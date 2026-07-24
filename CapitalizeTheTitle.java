class Solution {
    public String capitalizeTitle(String title) {
        char[] arr = title.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
           int firstIndex = i;
           while(i<n && arr[i]!=' '){
            arr[i] = Character.toLowerCase(arr[i]);
            i++;
           }
        if(i-firstIndex > 2){
            arr[firstIndex] = Character.toUpperCase(arr[firstIndex]);
        } 
     }
        return new String(arr);
    }
}