class Geeks{
    
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        boolean c=a&&b;
        boolean d=a||b;
        boolean e=((!a)&&(!b));
        System.out.print(c+" "+d+" "+e);
    }
}
