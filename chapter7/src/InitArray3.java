//Fig7.4:InitArray.class
//Creating an array
import javax.swing.*;


public class InitArray3 {
	public static void main(String args[]){
		final int ARRAY_LENGTH=10;  //constant
        int array[];   //reference to an array
    
    array=new int[ARRAY_LENGTH];  //create array
     
    
   //calculate value for each array element
   for(int counter=0;counter<array.length;counter++)
	 array[counter]=2+2*counter;
   
     String output="Index\tValue\n";
    
     for(int counter=0;counter<array.length;counter++)
      output+=counter+"\t"+array[counter]+"\n";
   
   JTextArea outputArea=new JTextArea();
   outputArea.setText(output);
   
   JOptionPane.showMessageDialog(null,outputArea,
		   "Initializing to Even Numbers from2 to 20",
		   JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
   
   }  //end main
}  //end class InitArray

