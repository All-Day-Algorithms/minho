﻿import java.util.Arrays;
//level1 예산
class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;
	      Arrays.sort(d);
	      System.out.println(Arrays.toString(d));
	      for(int i = 0; i < d.length; i++) {
	    	  if(d[i]<=budget) {
	    		  budget -= d[i];
	    		  answer++;
	    	  }else {
	    		  break;
	    	  }
	      }
	      return answer;
  }
}