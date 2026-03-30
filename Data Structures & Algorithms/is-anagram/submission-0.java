class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ascii = new int[26];
        int l1 = s.length();
        int l2 = t.length();
        for(int i=0;i<l1;i++){
            ascii[(int)s.charAt(i)-97]++;
        }
        for(int i=0;i<l2;i++){
            ascii[(int)t.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(ascii[i]!=0) return false;
        }
        return true;
        
    }
}
