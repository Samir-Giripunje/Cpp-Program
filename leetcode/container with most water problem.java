package leetcode;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maxArea(int[] height) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int minh=0;
                if(height[i]>=height[j]){
                    minh=height[j];
                }
                else{
                    minh=height[i];
                }
                
                l1.add((j-i)*minh);
                
                
            }
        }
        
        return Collections.max(l1);
    }
}
