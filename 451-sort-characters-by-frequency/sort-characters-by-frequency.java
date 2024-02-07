class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        PriorityQueue<Character>  pq = new PriorityQueue<>((x,y)->mp.get(y)-mp.get(x));

        for(char ch: s.toCharArray()){
            mp.put(ch,(mp.getOrDefault(ch,0))+1);
        }

        for(char ch: mp.keySet()){
            pq.offer(ch);
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<mp.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}