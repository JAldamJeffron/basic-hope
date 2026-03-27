public class nonrepeat {
    public char norepeat(String s){
        int f[]=new int[26];
        int min=9999;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(f[s.charAt(i)-'a']<min){
                min=f[s.charAt(i)-'a'];
                ch=s.charAt(i);
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String s="abcbad";
        nonrepeat word=new nonrepeat();
        System.out.println(word.norepeat(s));
    }
}
