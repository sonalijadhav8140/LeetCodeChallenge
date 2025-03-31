public class Day5 {
    
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;   int maxArea = 0;
            while (left < right) {
                int width = right - left;
                int temparea=width*(Math.min(height[left], height[right]));
               if(temparea>=maxArea){
                maxArea=temparea;
               }
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            
            return maxArea;
        }
    }
    

