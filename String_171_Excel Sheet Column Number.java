class Solution {
    public int titleToNumber(String columnTitle) {
        int length=columnTitle.length();
    if(length==0){
    	return 0;
    }
    int sum=0;
    for(int i=0;i<length;i++){
    	char now=columnTitle.charAt(i);
    	int nowInt=now-'A'+1;
    	sum=sum*26+nowInt;
    }
	return sum;
    }
    }
