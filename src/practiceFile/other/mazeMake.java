package practiceFile.other;

import java.util.Random;

public class mazeMake {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gridLength = 100;
		int[][] grid = new int[gridLength][gridLength];
		
		for(int i = 0; i < gridLength; i++) {
			for(int l = 0; l < gridLength; l++) {
				grid[i][l] = 0; // 0 �� 1 ���̻����� ���� 2 ��
			}
		} // ���ڻ���, �ʱ�ȭ
		
		for(int i = 0; i < gridLength; i++) {
			for(int l = 0; l < gridLength; l++) {
				grid[i][0] = 2;
				grid[i][gridLength-1] = 2;
				grid[0][l] = 2;
				grid[gridLength-1][l] = 2;
			}
		}
		
		grid[1][1] = -1; //�� ������
		int x = 1;
		int y = 1;
		grid[x+1][y] = 1;
		grid[x][y+1] = 1;
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
//		boolean finish = false;
		
		
		for(int i = 0; i < 10000 ; i++) {
			int move = random.nextInt(4);
			switch(move) {
			case 0: //�� y++
				if(grid[x][y+1]==1) {
					y++;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
				break;
			case 1: //�� y--
				if(grid[x][y-1]==1) {
					y--;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
				break;
			case 2: //�� 
				if(grid[x-1][y]==1) {
					x--;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
				break;
			case 3: //�� 
				if(grid[x+1][y]==1) {
					x++;
					grid[x][y] = -1;
					grid[x+1][y]++;
					grid[x-1][y]++;
					grid[x][y-1]++;
					grid[x][y+1]++;
				}
			}
		}
		grid[x][y] = 0;
		
		for(int i = 0; i < gridLength; i++) {
			for(int j = 0; j < gridLength; j++) {
				if(grid[i][j] == 1 ) {//�����ѱ�
					System.out.print("�� ");
				}
				if(grid[i][j] >= 2){//��
					System.out.print("�� ");
				}
				if(grid[i][j] == 0){//��
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}