package practiceFile.lv1;

public class ArrayWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		}
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) {
//			int sum = sum + 1; �ȿ��� �����ϸ� �ȵ�
			sum = sum + iarray[i];
		}
		
		System.out.println(sum);
		
	}

}
