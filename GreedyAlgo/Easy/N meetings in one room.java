class Meeting{
    int start;
    int end;
    int pos;
    
    Meeting(int start , int end , int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
    
}
class MeetingComparator implements Comparator<Meeting>{
    public int compare(Meeting o1 , Meeting o2){
        if(o1.end < o2.end)
            return -1;
        else if(o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1;
    }   
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int count=1;
        ArrayList<Meeting> meetings=new ArrayList<>();
        
        for(int i=0 ; i<n ;i++){
            meetings.add(new Meeting(start[i], end[i], i+1));
        }
        
        MeetingComparator mc=new MeetingComparator();
        Collections.sort(meetings,mc);
        int endLimit=meetings.get(0).end;
        
        for(int i=1; i<n ; i++){
            if(meetings.get(i).start > endLimit){
                count++;
                endLimit=meetings.get(i).end;
            }
        }
        return count;
        
    }
}
