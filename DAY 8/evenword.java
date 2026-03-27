public class evenword {
    public String even(String s){
        StringBuilder newword=new StringBuilder();  
        int count=0,start=0;
        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i)!=' '){
                if(count==0){
                    start=i;
                }
                count++;                               //words with even length
            }                                                            //17
            else{
                if(count%2==0 && count!=0){
                    for(int k=start;k<i;k++){
                        newword.append(s.charAt(k));
                    }
                    newword.append(" ");
                }
                count=0;
            }
        }
            if(count%2==0 && count!=0){
                    for(int k=start;k<s.length();k++){
                        newword.append(s.charAt(k));
                    }
                }
            return newword.toString().trim();
        }
    public static void main(String args[]){
        String s="words with even length";
        evenword e=new evenword();
        System.out.print(e.even(s));
    }
}
