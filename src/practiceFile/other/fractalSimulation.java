
package practiceFile.other;

import java.util.Random;

public class fractalSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gridLength = 100;
		int gl = gridLength;
		boolean[][] grid = new boolean[gl][gl];
		
		for(int i = 0; i < gl; i++) {
			for(int l = 0; l < gl; l++) {
				grid[i][l] = false;
			}
		} // ���ڻ���, �ʱ�ȭ
		
		grid[gl / 2][gl / 2] = true; //������ ����, �߽���
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		boolean contact = false;  //�ȼ� �����ӿ� ���� ���� ���� Ȯ�ο�
		
//		System.out.print(random.nextInt(4));
		int pixelSum = 0;
		for(;pixelSum < 3000 ; ) { //������ �ȼ� �� Ȯ��
			
			int x = random.nextInt(gl);
			int y = random.nextInt(gl);
			int check = (x - 50) * (x - 50) + (y - 50) * (y - 50);
			
			if(check > 0 && grid[x][y] == false) {   //�������� �����Ÿ� �̻� ������ ������ ��ġ�� �ȼ� ����
				pixelSum++; //���� ����, �ȼ� ���� 1����
				
				//�ð�ȭ
				
//				System.out.println(check+"c "+x+"x "+y+"y "+pixelSum+"ps ");
					
				while(contact == false) {  //�ȼ��� ������ ���� ������ ������
//					System.out.println("move");
					grid[x][y] = true; //��ġ�� ����

					if(x == 0) {
						grid[x][y] = false;
						grid[x+1][y] = true;
						x++;
//						System.out.println("move"+x+" "+y);
					}
					if(x == gl - 1) {
						grid[x][y] = false;
						grid[x-1][y] = true;
						x--;
//						System.out.println("move"+x+" "+y);
					}
					if(y == 0) {
						grid[x][y] = false;
						grid[x][y+1] = true;
						y++;
//						System.out.println("move"+x+" "+y);
					}
					if(y == gl - 1) {
						grid[x][y] = false;
						grid[x][y-1] = true;
						y--;//�ȼ��� ��ġ�� �� �ܰ��� ��� ������ ��ĭ
//						System.out.println("move"+x+" "+y);
					}
					
					
					if(grid[x + 1][y] == true || grid[x - 1][y] == true || grid[x][y + 1] == true || grid[x][y - 1] == true) {
//						System.out.println(x+" "+y);
						break;   //�ȼ��� �����ȼ��� ���������� �ȼ� ����
					}
					int move = random.nextInt(4);
					
					switch(move) {
					case 0: //�� y++
//						System.out.println(move);
						grid[x][y] = false;
						grid[x][y+1] = true;
						y++;
						break;
					case 1: //�� y--
//						System.out.println(move);
						grid[x][y] = false;
						grid[x][y-1] = true;
						y--;
						break;
					case 2: //�� x--
//						System.out.println(move);
						grid[x][y] = false;
						grid[x-1][y] = true;
						x--;
						break;
					case 3: //�� x++
//						System.out.println(move);
						grid[x][y] = false;
						grid[x+1][y] = true;
						x++;
					}
					
					
				}
			}
		}
		for(int i = 0; i < gl; i++) {
			for(int j = 0; j < gl; j++) {
				if(grid[i][j] == true) {
					System.out.print("�� ");
				}else {
					System.out.print("�� ");
				}
			}
			System.out.println("");
		}
		//�ٳ����� �ð�ȭ
		
	}

}
