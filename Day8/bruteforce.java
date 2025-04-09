public class bruteforce {
    
        public int divide(int dividend, int divisor) {
         boolean isNegative=(dividend<0) ^ (divisor<0);//XOR to handle negative inputs
         
         if (dividend == Integer.MIN_VALUE && divisor == -1)
        return Integer.MAX_VALUE;
    
         long dividend1=Math.abs((long) dividend);
         long divisor1=Math.abs((long) divisor);   
       
        long sum=0;
        int quetient=0; 
        while(sum+divisor1<=dividend1){
        sum=sum+divisor1;
         quetient++;
        } 
        if(isNegative) quetient=-quetient;
        if (quetient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quetient < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
    
    
        return quetient;
    }
    }

