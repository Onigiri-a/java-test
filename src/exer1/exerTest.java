package exer1;

import java.util.Arrays;

public class exerTest {
//    ����һ���������� nums ���ж��Ƿ������Ԫ�� [nums[i], nums[j], nums[k]] ���� i != j��i != k �� j != k ��ͬʱ������ nums[i] + nums[j] + nums[k] == 0 ����
//�㷵�����к�Ϊ 0 �Ҳ��ظ�����Ԫ�顣
//ע�⣺���в����԰����ظ�����Ԫ�顣

//���룺nums = [-1,0,1,2,-1,-4]
//�����[[-1,-1,2],[-1,0,1]]
//���ͣ�
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 ��
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 ��
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 ��
//��ͬ����Ԫ���� [-1,0,1] �� [-1,-1,2] ��
//ע�⣬�����˳�����Ԫ���˳�򲢲���Ҫ��

//���룺nums = [0,1,1]
//�����[]
//���ͣ�Ψһ���ܵ���Ԫ��Ͳ�Ϊ 0 ��

//    ���룺nums = [0,0,0]
//    �����[[0,0,0]]
//    ���ͣ�Ψһ���ܵ���Ԫ���Ϊ 0 ��

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
                System.out.println("����Ψһ��Ԫ���Ϊ0");
                return number;
            }else {
                System.out.println("������Ψһ��Ԫ���Ϊ0");
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

