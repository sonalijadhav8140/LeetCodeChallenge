class plusOne{
    public int[] PlusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            //To handle normal cases where last digit i less than 9
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
           //if last digit is 9 make it 0 and continue loop
            digits[i]=0;
        }
        //if input is 9,9,9 just make alll of them 0 and add 1 to the start by expanding one position in array
        int[] result=new int[digits.length+1];
        result[0]=1;

        return result;
     
}
 
}