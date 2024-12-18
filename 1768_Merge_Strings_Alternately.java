class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        String newStr = "";

        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                newStr += word1.charAt(i);
                newStr += word2.charAt(i);
            }
        } else if (len1 > len2) {
            int pos = 0;
            for (int i = 0; i < len2; i++) {
                newStr += word1.charAt(i);
                newStr += word2.charAt(i);
                pos = i;
            }
            for (int i = pos + 1; i < len1; i++) {
                newStr += word1.charAt(i);
            }
        } else {
            int pos = 0;
            for (int i = 0; i < len1; i++) {
                newStr += word1.charAt(i);
                newStr += word2.charAt(i);
                pos = i;
            }
            for (int i = pos + 1; i < len2; i++) {
                newStr += word2.charAt(i);
            }
        }

        return newStr;

    }
}
