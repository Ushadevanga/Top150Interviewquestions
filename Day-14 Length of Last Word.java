class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        String[] words = s.split(" ");
        String str = words[words.length-1];
        return str.length();
    }
}
