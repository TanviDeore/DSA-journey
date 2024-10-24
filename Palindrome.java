class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str = Integer.toString(x);
        int length = str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-i-1))
                return false;
        }
        return true;       
    }
}
