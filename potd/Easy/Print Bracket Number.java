class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> answer=new ArrayList<>();
        int brackets=0;
        
        for(char ch : str.toCharArray()){
            if(ch == '('){
                brackets++;
                answer.add(brackets);
                stack.push(brackets);
            }
            else if(ch == ')'){
                answer.add(stack.peek());
                stack.pop();
            }
        }
        return answer;
    }
};
