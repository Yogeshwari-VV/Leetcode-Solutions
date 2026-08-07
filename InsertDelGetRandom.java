class RandomizedSet {
    private  HashMap<Integer, Integer> map;
    private ArrayList<Integer> arr;
    private Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<>();
        random = new Random();       
    }
    
    public boolean insert(int val) {
        boolean isExist = map.containsKey(val);
        if(!isExist){
            arr.add(val);
            map.put(val, arr.size()-1);
        }
        return !isExist; //false
    }
    
    public boolean remove(int val) {
        boolean isExist = map.containsKey(val);
        if(isExist){
            int index = map.get(val);
            int last = arr.get(arr.size()-1);
            arr.set(index, last); // arr[index] = last;
            map.put(last, index);

            arr.remove(arr.size()-1); // removing last element
            map.remove(val);
        }
        return isExist;
    }
    
    public int getRandom() {
        int ind = random.nextInt(arr.size());
        return arr.get(ind);      
    }
}

