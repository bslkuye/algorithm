
public class ConditionalExam{
    public int conditionTest(int value){
        // ���� value�� ����Ǿ� �ִٰ� �����ϰ� �Ʒ��� �ڵ带 �ۼ��ϼ���.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }// �� �Ʒ� �ٿ� else ������ �߰��ؼ� �ڵ带 �ϼ��ϼ���.
        else if (value % 4 == 0){
            ret = 4;
        }
        // ��� üũ�� ���� �ڵ��Դϴ�.
        return ret;
    }
    
    //�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
    public static void main(String[]args){
        ConditionalExam exam = new ConditionalExam();
        exam.conditionTest(6);
        exam.conditionTest(8);
    }
}