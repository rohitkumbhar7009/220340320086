class inserion{
	void insertionsort(int a1[]){
		
		int n=a1.length;
		for(int i=1;i<n;i++){
			int k=a1[i];
			int j= i-1;
			
			while( j>=0; && a1[j]>k){
				
				
				a1[j+1]=a1[i];
				j=j-1;
				
			}
			a1[j+1]=k;
			
		}
		
		
		
	}
	
	void display(int a1[]){
		
		int n=a1.length;
		for(int i=0;i<n;i++){
			
			System.out.println(a1.[i]+"  ");
			
		}
	}
	public static void main(String args[]){
		
		insertionsort n1=new insertionsort();
		int a1[]={1,2,4,5,3};
		n1.insertion(a1);
		n1.display(a1);
		
	}
}























