class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int c =1;
        int sum =0;
        for(int i=len-1;i>=0;i--){
            sum = digits[i]+c;
            if(sum<10){
                digits[i]=sum;
                c=0;
                break;
            }else{
                digits[i]=0;
                c=1;
            }
        }
        if(c==1&&digits[0]==0){
            int[] newdig = new int[len+1];
            newdig[0]=1;
            for(int i=0;i<newdig.length-1;i++){
                newdig[i+1]=digits[i];
            }
            return newdig;           
                    }
    return digits;
}

}
