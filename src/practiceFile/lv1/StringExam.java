package practiceFile.lv1;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";   //hello ��� ������ �ʴ� ������� �����Ƿ� 1,2�� ���� �ּҰ��� ����
		
		String str3 = new String("hello");  
		String str4 = new String("hello");  //str3�� str4�� �ٸ� �ּҰ��� ������
		
		if(str1 == str2) {
			System.out.println("1,2���� ���۷���");
		}
		
		if(str1 == str3) {
			System.out.println("1,3���� ���۷���");
		}		
		
		if(str3 == str4) {
			System.out.println("3,4���� ���۷���");
		}
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
		
	}

}
