package practiceFile.lv1;

//public class SwitchExam {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int value = 7;
//		
//		switch(value) {
//		case 1:
//			System.out.println("1");  // vlaue�� 1�̸� ���⼭���� 
//			break;
//		case 2:
//			System.out.println("2");  // vlaue�� 2�� ���⼭���� 
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		default:
//			System.out.println("�� �� �ٸ� ����");
//		}
//		
//		String str = "A";
//		switch(str) {
//		case "A":
//			System.out.println("A");
//			break;
//		case "B":
//			System.out.println("B");
//			break;
//		}
//		
//		
//		
//		
//	}
//
//}
import java.util.Calendar;
public class SwitchExam {
    public static void main(String[] args) {
        // month���� ������ �� ������ ��� �ֽ��ϴ�.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch���� �̿��ؼ� season�� ������ � �������� ��Ÿ���� ��������.
        switch(month){
            case 3:
            case 4:
            case 5:
                season = "��";
                break;
            case 6:
            case 7:
            case 8:
                season = "����";
                break;
            case 9:
            case 10:
            case 11:
                season = "����";
                break;
            default:
                season = "�ܿ�";
                
        }
        
        System.out.println("������ " + month + "���̰�, " + season + "�Դϴ�.");
    }
}