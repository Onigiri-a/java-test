import org.junit.jupiter.api.Test;

/**
 * @description:
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'?的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/14 18:10
 */


public class day1 {

    @Test
    public void test(){
        String s = "({{[}}})";
        boolean status = true;
        char arr[] = s.toCharArray();
        if (arr.length == 0) {
            status = false;
        } else if (arr.length % 2 == 0) {
            for(int i=0;i<arr.length/2;i++){
                if(!s.isEmpty()){
                    String ts=s.replace("()","").replace("{}","").replace("[]","");
                    System.out.println(ts);
                }else{
                    status = false;
                }
            }
        } else {
            status = false;
        }
        System.out.println(status);
        return;
    }
}
