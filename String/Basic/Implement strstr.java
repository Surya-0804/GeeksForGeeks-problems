class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       if(s.contains(x)){
           return s.indexOf(x);
       }
       return -1;
    }
}
