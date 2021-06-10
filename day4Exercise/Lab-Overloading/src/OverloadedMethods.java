
public class OverloadedMethods {

	 public static void main(String[] args) {  
	     //create instance here 
		 OverloadedMethods om = new OverloadedMethods();  
	     om.print(); 	     
	     om.print("second print method");
	     om.print("second", "third"); 
	    }  
	  
	 //overload methods here  
	 public void print(){  
	        System.out.println("original print method.");  
	 }  
	 
	 public void print(String str){  
	        System.out.println(str);  
	 } 
	 
	 public void print(String str, String str2){  
	        System.out.println(str + " " + str2);  
	 } 
	 
	 /*  This following method will cause a error due
	  *  to overloading using the same number and type
	  *  of parameters used in the previous method
	    
	    

	 public void print(String first, String second){  
	        System.out.println(first + " " + second);  
	 }
	 */
}
