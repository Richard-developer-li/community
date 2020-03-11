package life.richard.community;

public class Test {
    /**
     * nums = [2,7,11,15]
     * target = 9
     */

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 13;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    flag = true;
                    System.out.println(i+","+j);
                    break;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
