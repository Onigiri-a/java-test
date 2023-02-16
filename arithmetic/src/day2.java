/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/15 18:15
 */


public class day2 {


    public static void main(String[] args) {


//
        int[] nums=new int[]{4,5,8,4,5};
        int[] nums1=new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int b=0;
            for (int j = 0; j <nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if(b==2){
                        break;
                    }else {
                        b++;
                    }

                }
            }
            nums1[i]=b;
        }
        for (int k = 0; k <nums1.length ; k++) {
            if(nums1[k]==1){
//                return nums[k];
                System.out.println(nums[k]);
            }
        }

    }


}





