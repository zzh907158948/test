//Fig7.2:InitArray.class
//Creating an array
import javax.swing.*;

public class InitArray {
	public static void main(String args[]){
    int array[];   //declare reference to an array
    
    array=new int[10];  //create array
    
    String output="Index\tValue\n";
     
    
   //append each array elemet's value to String output
   for(int counter=0;counter<array.length;counter++)
     output+=counter+"\t"+array[counter]+"\n";
   
   JTextArea outputArea=new JTextArea();
   outputArea.setText(output);
   
   JOptionPane.showMessageDialog(null,outputArea,
		   "Initializing an Array of int Values",
		   JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
   
   }  //end main
}  //end class InitArray
