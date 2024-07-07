class Solution {

    public boolean isValid(String s) {
        // Write your code here
        if(s.startsWith(".")||s.endsWith("."))
            return false;
        String[] list=s.split("\\.");
        if(list.length !=4)
            return false;
        for (String part : list) {
            if (part.isEmpty()) {
                return false;
            }

            if (part.length()>3||(part.length() > 1 && part.startsWith("0"))) {
                return false;
            }
            try {
                int num = Integer.parseInt(part);

                if (num < 0 || num > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
