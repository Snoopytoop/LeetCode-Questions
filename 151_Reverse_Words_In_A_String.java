class Solution {
    public String reverseWords(String s) {
        ArrayList<Character> charList = new ArrayList<>();

        for (char c : s.toCharArray()) {
            charList.add(c);
        }


        removeSpaces(charList);
        removeInnerSpaces(charList);
        return addSpaces(reverseWordys(convertToArr(charList)));


    }

    public void removeSpaces(ArrayList<Character> charList) {
        if (charList.get(0) == ' ') {
            charList.remove(0); 
            removeSpaces(charList);
        }

        int end = charList.size() - 1;

        if (charList.get(end) == ' ') {
            charList.remove(end);
            removeSpaces(charList);
        }
    }

    public void removeInnerSpaces(ArrayList<Character> charList) {
        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i) == ' ') {
                int pos = i + 1;
                while (charList.get(pos) == ' ') {
                    charList.remove(pos);
                }
            }
        }
    }

    public ArrayList<String> convertToArr(ArrayList<Character> charList) {
        ArrayList<String> wordList = new ArrayList<>();

        String newStr = "";

        for (int i = 0; i < charList.size(); i++) {
            if (i == charList.size() - 1) {
                newStr = newStr + charList.get(i);
                wordList.add(newStr);
            }
            if (charList.get(i) != ' ') {
                newStr = newStr + charList.get(i);
            } else {
                wordList.add(newStr);
                newStr = "";
            }
        }

        return wordList;
    }

    public ArrayList<String> reverseWordys(ArrayList<String> wordList) {
        int end = wordList.size();
        for (int i = 0; i < wordList.size() / 2; i++) {
            end --;
            String temp = wordList.get(i);
            wordList.set(i, wordList.get(end));
            wordList.set(end, temp);
        }

        return wordList;
    }

    public String addSpaces(ArrayList<String> wordList) {
        String newStr = "";

        for (int i = 0; i < wordList.size(); i++) {
            if (i != wordList.size() - 1) {
                newStr = newStr + wordList.get(i) + " ";
            } else {
                newStr = newStr + wordList.get(i);
            }
        }

        return newStr;
    }
}
