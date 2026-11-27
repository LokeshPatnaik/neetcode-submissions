class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String str : strs){
            char[] cFreq = new char[26];
            for(char ch : str.toCharArray()){
                cFreq[ch - 'a']++;
            }
            String fKey = Arrays.toString(cFreq);
            hm.putIfAbsent(fKey,new ArrayList<>());
            hm.get(fKey).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
