package Chapter05;

public class ArrayEx08 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0;i<ball.length;i++)
			ball[i] = i+1;
		
		int temp = 0;	//	�� ���� �ٲٴµ� ����� �ӽú���
		int j = 0;		//	������ ���� �� ������ ����
		
		//	�迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		//	0���� ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for(int i=0;i<6;i++) {
			j = (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for(int i=0;i<6;i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}
