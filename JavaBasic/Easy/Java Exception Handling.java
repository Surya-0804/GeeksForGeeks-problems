class TestClass
{
    // Add your code here. Define private variables, Constructors to initialize 
    // variables with the given values and a method findMin() which prints the 
    // Minimum value of a$b.
    private int a;
    private int b;
    
    TestClass (int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void findMin() {
        int min = Integer.MAX_VALUE;
        try {
            min = Math.min(min, a+b);
            min = Math.min(min, a-b);
            min = Math.min(min, a*b);
            min = Math.min(min, a/b);
        } catch (Exception e) {

        }
        System.out.println(min);
    }
}
