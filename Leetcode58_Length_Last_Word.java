class Solution {
    public int lengthOfLastWord(String s) {
    int i = s.length() - 1;        

    //skip the whitespaces 
    while(i >= 0 && s.charAt(i) == ' ') {
        i--;
    }

    int counter = 0;

    //now increment counter because the word has to be there
    while(i >= 0 && s.charAt(i) != ' ') {
        counter++;
        i--;
    }

    return counter;
    }
}