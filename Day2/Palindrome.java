package Day2;

public class Palindrome {
    class Solution {
        public boolean isPalindrome(int x) {
          int rev=0;
          int temp=x;
          while(x>0){
          int res=x%10;//to get last digit
           rev=rev*10+res;
           x=x/10;
          } System.out.println(rev);
          if(rev==temp){
           return true;
          }
          else
          {
            return false;
          }
        }
    }
}
