//要求40个学生对学生餐厅打分（1~10），把反馈结果放进一个整数数组，并总结调查结果
package Chap7;

import javax.swing.*;

public class StudentPoll {

	public static void main(String[] args) {
		int response[] = {1,2,6,4,8,5,9,7,8,10,
						1,6,3,8,6,10,3,8,2,7,
						6,5,7,6,8,6,7,5,6,6,
						5,6,7,5,6,4,8,6,8,10};
		int frequency[] = new int[11];//包含11个元素
		
		for(int answer = 0; answer < response.length; answer++)
			++frequency[response[answer]];
		
		String output = "Rating\tFrequency\n";
		
		//忽略了第一个元素frequency[0]
		for(int rating = 1; rating < frequency.length; rating++)
			output += rating + "\t" + frequency[rating] + "\n";
		
		JTextArea outputArea = new JTextArea();
		outputArea.setText(output);
		
		JOptionPane.showMessageDialog(null, outputArea,
				"Student Poll Program", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
