
package otherpractice;

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
		System.out.print(random.nextInt(4));
		int pixelSum = 0;
		for(;pixelSum < gl ; ) { //������ �ȼ� �� Ȯ��
			
			int x = random.nextInt(gl);
			int y = random.nextInt(gl);
			int check = (x - 50) * (x - 50) + (y - 50) * (y - 50);
			
			if(check > 2500 || grid[x][y] == false) {   //�������� �����Ÿ� �̻� ������ ������ ��ġ�� �ȼ� ����
				pixelSum++; //���� ����, �ȼ� ���� 1����
				
				//�ð�ȭ
				
//				System.out.println(check+x+y);
				grid[x][y] = true; //��ġ�� ����
				for(;contact == true ; ) {  //�ȼ��� ������ ���� ������ ������
					
					if(x == 0)
						x = 1;
					if(x == gl - 1)
						x = gl - 2;
					if(y == 0)
						y = 1;
					if(y == gl - 1)
						y = gl - 2;//�ȼ��� ��ġ�� �� �ܰ��� ��� ������ ��ĭ
					
					if(grid[x + 1][y] == true || grid[x - 1][y] == true || grid[x][y + 1] == true || grid[x][y - 1] == true) {
						System.out.println(x+y);
						break;   //�ȼ��� �����ȼ��� ���������� �ȼ� ����
					}
					int move = random.nextInt(4);
					switch(move) {
					case 0: //�� y++
						System.out.println(move);
						grid[x][y] = false;
						grid[x][y+1] = true;
						y++;
						break;
					case 1: //�� y--
						System.out.println(move);
						grid[x][y] = false;
						grid[x][y-1] = true;
						y--;
						break;
					case 2: //�� x--
						System.out.println(move);
						grid[x][y] = false;
						grid[x-1][y] = true;
						x--;
						break;
					case 3: //�� x++
						System.out.println(move);
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
					System.out.print(" �� ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
		//�ٳ����� �ð�ȭ
		
	}

}
