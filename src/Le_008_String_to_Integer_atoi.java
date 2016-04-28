/****************************************************
 * 遇到非数字的字符串，只返回但前有效的数字
 * 
 ****************************************************/


public class Le_008_String_to_Integer_atoi {
	// test case: [9223372036854775809], [Integer.MAX_VALUE], [Integer.MIN_VALUE]
	public int myAtoi(String str) {
        str = str.trim();
        if(str == null || str.length() == 0){
            return 0;
        }
        
        int n = str.length();
        int flag = 1;
        char[] nums = str.toCharArray();
        long sum = 0;
        long bound = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(nums[i] >= '0' && nums[i] <= '9'){
                sum = sum * 10 + nums[i] - '0';
                if(sum > bound + 1){
                    break;
                }
            } else {
            	if(i == 0){
                    if(nums[0] == '+'){
                        flag = 1;
                    } else if(nums[0] == '-'){
                        flag = -1;
                    } else {
                    	break;
                    }
                } else {
                    break;
                }
            }
        }
        
        sum = sum * flag;
        
        if(sum > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else if(sum < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        } else {
            return (int) sum;
        }
    }
	
	
	public static void main(String[] args){
		Le_008_String_to_Integer_atoi t = new Le_008_String_to_Integer_atoi();
		String num = "  b23232";
		System.out.println(t.myAtoi(num));
	}
}
