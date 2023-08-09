//Given two arrays of integers, find which elements in the second array are missing from the first array.



public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr){}
    List<Integer> missingList = new ArrayList<>();
    Map<Integer,Integer> hmap = new HashMap<>();
    for(int i=0;i<brr.size();i++){
        hmap.put(brr.get(i),hmap.getOrDefault(brr.get(i),0)+1);
        
    }
    for(int j=0;j<arr.size();j++){
        if(hmap.containsKey(arr.get(j)) && hmap.get(arr.get(j))>0){
            hmap.put(arr.get(j),hmap.get(arr.get(j))-1);
        }
    }
    for(Integer key:hmap.keySet()){
        if(hmap.get(key)>0) missingList.add(key);
    }
    Collections.sort(missingList);
    return missingList;
}