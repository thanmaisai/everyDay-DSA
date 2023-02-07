class Solution {
    public String reverseWords(String s) {
    String parts [] = s.split("\\s+"); //"\\s" removes any extra spaces also using regex
    String res="";
    for(int i =parts.length-1;i>=0;i--){
        res = res + parts[i] + " ";
    }
    return  String.format("%s", res).trim(); //using trim as there will be a space at the last.
    }
}