import java.util.*;
class Twostacks{

  int [] arr;
  int size;
  int top1, top2;
  
  Twostacks(int n){ 
	  
	  size = n;
	  arr = new int[n];
	  top1 = n/2+1;
	  top2 = n/2;
	  
	  
  }
  void push1(int x){
	  
	  
	  if (top1>0){
		  
		  top1 --;
		  arr[top1]=x;
          }
        else
		{
			System.out.println("Stack overflow"        +"By element:"+ x+" ");
			return;
			
		}
       }
	   
	   void push2(int x){
		
        if (top2 < size -1){
			
			
			top2++;
			arr[top2] = x;
			
		}else{
			
			System.out.println("Stack overflow"    +"By element:  " +"   ");
			return;
		}		

		   
		   
		   
	   }
        int pop1(){
			
			if (top1 <= size /2){
			int x=arr[top1];
             top1++;
              return x;
			  
				
			}
			else{
				
				System.out.println("Stack Underflow");
				System.exit(1);
				
			}
		 return 0;
		}
	
        int pop2(){
			
			if(top2 >= size /   2+1){
				
			int x = arr[top2];
            top2 --;
			return x;
			
				
				
			}else{
				
				System.out.println("Stack Underflow");
				System.exit(1);
				
				
			}
	         return 1;
			 
			
			
		}
      
	
}
  class stackCombi{
	  
	  
	  
	  public static void main(String args[]){
		  
		  Twostacks ts = new Twostacks(5);
		  ts.push1(5);
		  ts.push2(10);
		  ts.push2(40);
		  ts.push1(11);
		  ts.push2(7);
		  ts.push2(15);
		  
		  
		  System.out.println("Popped element from Stack 1 is "      +" :"+ ts.pop1()+"  " );
		 
		  System.out.println("Popped element from Stack 2 is "    +":"+ ts.pop2()+" ");
		  
		  
	  }
	  
	  	  
  }