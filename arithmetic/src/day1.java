import org.junit.jupiter.api.Test;

/**
 * @description:
 *
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']'?���ַ��� s ���ж��ַ����Ƿ���Ч��
 * ��Ч�ַ��������㣺
 * �����ű�������ͬ���͵������űպϡ�
 * �����ű�������ȷ��˳��պϡ�
 * ÿ�������Ŷ���һ����Ӧ����ͬ���͵������š�
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
