package Recursion;

public class Code02 {
	public static void main(String[] args) {
		int n = 4;
		func(n);
	}

	public static void func(int k) { //���� ������ ������ �ʴ� recursion method
		if(k <= 0) return; //������ �ش� �޼ҵ带 �����Ų ��� �޼ҵ�� ���޾Ƽ� ���ư��� ������� �޼ҵ忡�� �������´�.
		//base case : ���� ������ ������ �ʰ� �Ϸ��� ��� �ϳ��� recursion �� ������ �ʴ� ��찡 �����ؾ� �Ѵ�.
		else {
			System.out.println("Hello");
			func(k-1); // recursion case : recursion �� �ݺ��ϴ� ���� �ᱹ base case �� �����ؾ� �Ѵ�.
			//�ش� �޼ҵ��� ��� -1 �� �ƴ϶� +1 �� �ȴٸ� ���� ������ ������ �Ǿ� ������ �߻��Ѵ�.
		}
		
	}
}
