package practiceFile.lv1;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		int total = 0;
		i = 1;
		while(i<100) {
			total = total + i;
			i++;
		}
		System.out.println(total);
		
		i = 1;
        while(i < 11){
            // if ���� �߰���, i�� ¦���϶��� i�� ����ϴ� �ڵ带 ¥������.
            if(i%2 == 0)
            System.out.println(i);
            i++; 
        }
		
	}

}
