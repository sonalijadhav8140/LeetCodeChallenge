package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_Brute_Force {

    public List<List<Integer>> threeSum(int[] nums) {
    
    Set<List<Integer>> list1=new HashSet<>();
   for(int i=0;i<nums.length;i++){

    for(int j=i+1;j<nums.length;j++){
    
    for(int k=j+1;k<nums.length;k++){
    List<Integer> list2=new ArrayList<>();
      if(nums[i]+nums[j]+nums[k]==0){

      list2.add(nums[i]);
      list2.add(nums[j]);
      list2.add(nums[k]);
      Collections.sort(list2);
      list1.add(list2);
   }
   
   }
    } 
   }
 
   return new ArrayList<>(list1);

    }
    }

