class solution125 {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int l=0,r=s.length()-1;
        while(l<=r){
            char cf=s.charAt(l);
            char lf=s.charAt(r);
            if(!Character.isLetterOrDigit(cf))
            {
                l++;
            }
            else if(!Character.isLetterOrDigit(lf))
            {
                r--;
            }
            else
            {
                if(Character.toLowerCase(cf) != Character.toLowerCase(lf))
                {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
        }

    public static void main(String[] args) {
        solution125 sol = new solution125();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(sol.isPalindrome(s));
    }
}

