class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] cA = strs[i].toCharArray();
            Arrays.sort(cA);
            String sorted = new String(cA);
            if(hm.containsKey(sorted)){
                hm.get(sorted).add(strs[i]);
            }else{
                ArrayList<String> inner = new ArrayList<>();
                inner.add(strs[i]);
                hm.put(sorted,inner);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
