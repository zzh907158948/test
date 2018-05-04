// Fig. 8.8: TimeTest4.java
// Demonstrating the Time3 class set and get methods.

package pers.Zhuangzhihan8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeTest4 extends JApplet implements ActionListener {
	private Time3 time;
	
	private JLabel hourLabel, minuteLabel, secondLabel;
	private JTextField hourField, minuteField, secondField, displayField;
	private JButton tickButton;
	
	// create Time3 object and set up GUI
	public void init() {
		time = new Time3();// create Time3 object
		
		// get applet's content pane and change its layout to FlowLayout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		// set up hourLabel and hourField
		hourLabel = new JLabel("Set Hour");
		hourField = new JTextField(10);
		container.add(hourLabel);
		container.add(hourField);
		
		// set up minuteLabel and minuteField
		minuteLabel = new JLabel("Set minute");
		minuteField = new JTextField(10);
		container.add(minuteLabel);
		container.add(minuteField);
		
		// set up secondLabel and secondField
		secondLabel = new JLabel("Set second");
		secondField = new JTextField(10);
		container.add(secondLabel);
		container.add(secondField);
		
		// set up displayField
		displayField = new JTextField(30);
		displayField.setEditable(false);
		container.add(displayField);
		
		// set up tickButton
		tickButton = new JButton("Add 1 to Second");
		container.add(tickButton);
		
		// register event handlers; this applet is the ActionListener,
		// which contains method actionPerformed that will be called to
		// handle action events generated by hourField, minuteField,
		// secondField and tickButton
		hourField.addActionListener(this);
		minuteField.addActionListener(this);
		secondField.addActionListener(this);
		tickButton.addActionListener(this);
		
		displayTime();// update text in displayField and status bar
		
	}// end method init
	
	// event handler for button and textfield events
	public void actionPerformed(ActionEvent event) {
		// process ticlButton event
		if (event.getSource() == tickButton) 
			tick();
		
		// process hourField event
		else if(event.getSource() == hourField){
			time.setHour(Integer.parseInt(event.getActionCommand()));
			hourField.setText("");
		}
		
		// process minuteField event
		else if(event.getSource() == minuteField){
			time.setMinute(Integer.parseInt(event.getActionCommand()));
			minuteField.setText("");
		}
		
		// process secondField event
		else if(event.getSource() == secondField){
			time.setSecond(Integer.parseInt(event.getActionCommand()));
			secondField.setText("");
		}
		
		displayTime();// update text in displayField and status bar
	
	}// end method actionPerformed
	
	// update displayField in displayField and status bar
	public void displayTime() {
		displayField.setText("Hour: " + time.getHour() + " ; Minute: "+
				time.getMinute() + "; Second: " + time.getSecond());
		
		showStatus("Standard time is: " + time.toStandardString() +
				"; Universal time is : " + time.toUniversalString());  
	
	}// end method updateDisplay
	
	// add one to second and update hour/minute if necessary
	public void tick() {
		time.setSecond((time.getSecond() + 1) % 60);
		
		if (time.getSecond() == 0){ 
			time.setMinute((time.getMinute() + 1) % 60);
		
			if (time.getMinute() == 0) 
				time.setHour((time.getHour() + 1) % 24);
		}
		
	}// end method tick
	
}// end class TimeTest4
























