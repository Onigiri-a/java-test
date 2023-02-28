package comparable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/28 15:24
 */


public class ComparableTest {

    @Test
    public void test1(){
        goods[] arr=new goods[4];
        arr[0]= new goods("xiaomi",12);
        arr[1]= new goods("leisheng",40);
        arr[2]= new goods("luoji",18);
        arr[3]= new goods("dall",190);
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof goods && o2 instanceof goods){
                    goods g1=(goods)o1;
                    goods g2=(goods)o2;
                    if(g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("传入数据异常");
            }


        });
        System.out.println(Arrays.toString(arr));
    }

}
class goods implements Comparable{
    private String name;
    private int price;



    public goods() {
    }

    public goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof goods){
            goods goods=(goods)o;
            if(this.price>goods.price){
                return 1;
            } else if (this.price<goods.price) {
                return -1;
            }else {
                return 0;
            }
        }
        throw new RuntimeException("传入数据异常");
    }

    @Override
    public String toString() {
        return "goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}