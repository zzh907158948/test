// Fig. 5.1: WhileCounter.java
//ͼ5.1 WhileCouter.java�ļ�
// Counter-controlled repetition.
// ���������Ƶ�ѭ��
import java.awt.Graphics;

import javax.swing.JApplet;

public class WhileCounter extends JApplet { 
	
	//draw lines on applet's background
	//��appletҳ��������
	public void paint( Graphics g)
	{
		super.paint(g);  // call paint method inherited from JApplet
		// ���ü̳���JApplet��paint����
		int counter = 1;  // initialization ��ʼ��
		
		while ( counter <= 10 ) { // repetition condition ѭ������
			g.drawLine(10, 10, 250, counter *10 );
			++counter; // increment �ӷ�
			
		} // end while ����whileѭ��
		
	} // end method paint ��������paint
	
} // end class WhileCounter ������WhileCounter