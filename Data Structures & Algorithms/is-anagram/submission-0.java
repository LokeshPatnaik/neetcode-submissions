class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] cA = new int[26];
        for(int i=0;i<s.length();i++){
            cA[s.charAt(i)-'a']++;
            cA[t.charAt(i)-'a']--;
        }
        for(int num : cA){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
