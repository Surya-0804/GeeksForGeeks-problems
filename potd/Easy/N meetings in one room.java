class Meeting{
    int start;
    int end;
    int pos;
        
    Meeting(int start, int end, int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
    
class MeetingComparator implements Comparator<Meeting>{
    public int compare(Meeting o1, Meeting o2){
        if(o2.end < o1.end){
            return 1;
        }else if(o1.end < o2.end){
            return -1;
        }else if(o1.pos < o2.pos){
            return -1;
        }
        return 1;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        int count=1;
        ArrayList<Meeting> meets=new ArrayList<>();
        
        for(int i=0; i<n; i++){
            meets.add(new Meeting(start[i],end[i],i));
        }
        
        MeetingComparator mc=new MeetingComparator();
        Collections.sort(meets,mc);
        
        int endLimit=meets.get(0).end;
        for(int i=1; i<n; i++){
            if(meets.get(i).start > endLimit){
                count++;
                endLimit=meets.get(i).end;
            }
        }
        return count;
    }
}
