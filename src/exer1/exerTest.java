package exer1;

import java.util.Arrays;

public class exerTest {
//    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
//你返回所有和为 0 且不重复的三元组。
//注意：答案中不可以包含重复的三元组。

//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。

//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。

//    输入：nums = [0,0,0]
//    输出：[[0,0,0]]
//    解释：唯一可能的三元组和为 0 。

    public static void main(String[] args) {
//        int[] number = new int[]{-1, 0, 1, 2, -1, -4};
        int[] number = new int[]{-1, 0, 2};

//        System.out.println(new exerTest().sum(number).toString() );
        System.out.println(Arrays.toString(new exerTest().sum(number)) );
    }

    public int [] sum(int[] number) {
        int res;

        int[] array=new int[]{};
        if(number.length==3){
            if(number[0]+number[1]+number[2]==0){
                System.out.println("满足唯一三元组和为0");
                return number;
            }else {
                System.out.println("不满足唯一三元组和为0");
                return array;
            }

        }




//        for (int i = 0; i < number.length; i++) {
//            for (int j = 0; j < number.length-1; j++) {
//                System.out.println(number[j]);
//            }
//        }

        return array;

    }




}

