class test{
    public int word(String s){
        int c=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==' ' && s.charAt(i)!=' '){
                c++;
            }
        }
        if(s.charAt(0)!=' '){
            c++;
        }
        return c;
    }

    public static void main(String[] args){
        String s="Hello World";
        test t=new test();
        System.out.println(t.word(s));
    }
}
