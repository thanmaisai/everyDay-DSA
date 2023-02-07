class Solution {
    public static String removeOuterParentheses(String s) {
            String res="";
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' && count==0) //first parenthesis is ignored
                    count++;
                else if(s.charAt(i)=='(' && count>=1){ //other parenthesis is entered into string res
                    res+=s.charAt(i);
                    count++; //increment
                }   
                else if(s.charAt(i)==')' && count>1){ //other parenthesis is entered into string res
                    res+=s.charAt(i);
                    count--; //decrement
                }
                else if(s.charAt(i)==')' && count==1) //last parenthesis is ignored
                    count--;
            }
            return res;
        }
    };

/*
 * Logic;
 * use a variable count to 
 * increment if bracket is open and 
 * decrement if bracket is closed. 
 * this when we reach the 0 for closing bracket that will be the decomposition point
 * 
—> if count=0 and  and ( then just do count++ //so the first parenthesis is not included
—> if count≥ 1 and ( then add that char to new string and count++(increment)
—> if count >1 and ) then add that char to new string and count--(decrement)
—> if count ==1 and ) then just do c-- //so that count becomes 0 and last paraenthesis is not included
 */