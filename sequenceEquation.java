// Given a sequence of  integers,  where each element is distinct and satisfies . 
// For each  where , that is  increments from  to , find any integer  such that  
// and keep a history of the values of  in a return array.




public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
    List<Integer> yval = new ArrayList<>();
    for(int i=1;i<=p.size();i++){
        // int ele = p.get(i);
        int x = p.indexOf(i);
        int y = p.indexOf(x+1);
        yval.add(y+1);
    }
        return yval;
}