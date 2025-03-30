package Day4;

import java.util.ArrayList;
import java.util.List;

public class Longest_substring {
    
    public int lengthOfLongestSubstring(String s) {
        int start=0;  int end=0;  int max_length=0;
        List<Character> list=new ArrayList<Character>();
        while (end < s.length()) {
            char ch = s.charAt(end);
           
            while (list.contains(ch)) {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
            list.add(ch);
            max_length = Math.max(max_length, end - start + 1);
            end++;
        }return max_length;
    }

        
    }



