import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class OperatorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b3);
		
		int score = 88;
		if(score <= 100 && score >=70) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println(b1 ^ b3);
	}

}
