class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;
        
        // step1: remove leading white spaces
        s=s.trim();
        System.out.println(s);

        if(s.length()==0) return 0;
        
        // step2: search for sign if -ve the store -1 if +ve the store +1
        int sign = +1;
        long ans = 0; // for storing the answer
        if(s.charAt(0)=='-')
        {
            sign = -1;
        }

        //step3: chck if the number lies in the range 
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

        //step4: extract the element to integer 
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0; //initializing i for the loop.
        int n = s.length();
        while(i<n){
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + (s.charAt(i) - '0');

            if(sign == -1 && -1*ans<MIN) return MIN;
            if(sign == 1 && 1*ans>MAX) return MAX;
        
            i++;
        }
        return (int)(sign*ans);
    }
}