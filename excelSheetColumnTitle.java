class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            int r = columnNumber %26;
            if(r==0){
                str = str.append("Z");
                columnNumber = (columnNumber-1)/26;
            }
            else{
                str = str.append((char)((r-1)+'A'));
                columnNumber = columnNumber /26;
            }
        }
        System.out.println(str);
        return str.reverse().toString();
    }
}
