import java.util.Scanner;

public class div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ѱ�����������Լ��
		Scanner in = new Scanner(System.in);
		System.out.println("��������������");
		int numb1 = in.nextInt();
		int numb2 = in.nextInt();
		int varb = numb1;
		if(numb1 > numb2){
			varb = numb2;
		}
		int div =0;
		for (int i = 1; i <= varb; i++) {
			if((numb1%i==0)&&(numb2%i==0)){
				div = i;
			}
		}
		System.out.println("�������������Լ��Ϊ"+div);
	}

}
