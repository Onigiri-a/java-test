package sinleton.exer;



public class Singleton {

    //1˽�л�������
    //������ǰ�����û�г�ʼ��
    //����public static���������ķ���
    //�Դ˶����������Ϊstatic


    //1˽�л�������

    private Singleton() {

    }

    //������ǰ�����û�г�ʼ��
    private static Singleton order = null;

    //����public static���������ķ���
    public static Singleton getInstance() {
        if (order == null) {
            return order = new Singleton();
        }
        return order;
    }


}
