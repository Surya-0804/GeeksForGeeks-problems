class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    // Your code here
		    int a=sc.nextInt();
		    float b=sc.nextFloat();
		    long c=sc.nextLong();
		    byte d=sc.nextByte();
		    sc.nextLine();
		    String s=sc.nextLine();
		    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+s);
		}
		
		
    }
    
}
