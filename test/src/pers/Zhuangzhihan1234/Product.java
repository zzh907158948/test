// Product.java 
// ���㲢��ӡ���������ĳ˻�

// Java packages
package pers.Zhuangzhihan1234;
import javax.swing.JOptionPane;

public class Product {
	
	// main������ʼִ��JavaӦ�ó���
	public static void main(String[] args) {
		String firstNumber;		// �û�����ĵ�һ���ַ���
		String secondNumber;	// �û�����ĵڶ����ַ���
		String thirdNumber;	// �û�����ĵ������ַ���
		
		int number1;		// ��һ������
		int number2;		// �ڶ�������
		int number3;		// ����������
		int product;			// ���������ĳ˻�
		
		// ��ȡ�û�����ĵ�һ���ַ���
		firstNumber = JOptionPane.showInputDialog("Enter first integer");
		
		// ��ȡ�û�����ĵڶ����ַ���
		secondNumber = 
			JOptionPane.showInputDialog("Enter second integer");
		
		// ��ȡ�û�����ĵ������ַ���
				thirdNumber = 
					JOptionPane.showInputDialog("Enter third integer");
		
		// ���ַ���ת��Ϊ����
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		number3 = Integer.parseInt(thirdNumber);
		
		// �������������
		product = number1 * number2 * number3;
		
		//չʾ���
		JOptionPane.showMessageDialog(null, "The result is " + product,
				"Results", JOptionPane.PLAIN_MESSAGE );
		
		System.exit(0);  //��ͼ�λ�������ֹӦ�ó���
	
	}// ����main����

}// ������Product


