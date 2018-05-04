//Fig7.3:InitArray.class
//Creating an array
import javax.swing.*;


public class InitArray2 {
	public static void main(String args[]){
		//initializer list specifies number of elements and value for each element
    int array[]={32,27,64,18,95,14,90,70,60,37};   
    
   String output="Index\tValue\n";
     
    
   //append each array elemet's value to String output
   for(int counter=0;counter<array.length;counter++)
     output+=counter+"\t"+array[counter]+"\n";
   
   JTextArea outputArea=new JTextArea();
   outputArea.setText(output);
   
   JOptionPane.showMessageDialog(null,outputArea,
		   "Initializing an Array with a Declaration",
		   JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
   
   }  //end main
}  //end class InitArray2
