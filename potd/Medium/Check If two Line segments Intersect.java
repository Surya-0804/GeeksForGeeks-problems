class Solution {
    
    private static int orientation(int[] p, int[] q, int[] r){
        long val=(long)(q[1]-p[1])*(r[0]-q[0]) - (long)(q[0]-p[0])*(r[1]-q[1]);
        
        if(val ==0) return 0;
        return (val > 0)? 1:2;
    }
    
    private static boolean onSegment(int[] p, int[] q, int[] r){
         return (q[0] <= Math.max(p[0], r[0]) && q[0] >= Math.min(p[0], r[0]) &&
            q[1] <= Math.max(p[1], r[1]) && q[1] >= Math.min(p[1], r[1]));
    }
    
    String doIntersect(int p1[], int q1[], int p2[], int q2[]) {
        // code here
        int o1=orientation(p1,q1,p2);
        int o2=orientation(p1,q1,q2);
        int o3=orientation(p2,q2,p1);
        int o4=orientation(p2,q2,q1);
        
        if(o1 != o2 && o3 != o4)
            return "true";
        
        if (o1 == 0 && onSegment(p1, p2, q1)) return "true";

        if (o2 == 0 && onSegment(p1, q2, q1)) return "true";

        if (o3 == 0 && onSegment(p2, p1, q2)) return "true";

        if (o4 == 0 && onSegment(p2, q1, q2)) return "true";

        return "false";
    }
}
