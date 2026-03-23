public class solution13 {
    public int romanToInt(String s) {
        int sum=0,I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)=='I' && s.charAt(i+1)=='V')
            {
                sum+=4;
                i++;
            } 
            else if(i<s.length()-1 && s.charAt(i)=='I' && s.charAt(i+1)=='X')
            {
                sum+=9;
                i++;
            }
             else if(i<s.length()-1 && s.charAt(i)=='X' && s.charAt(i+1)=='L')
            {
                sum+=40;
                i++;
            }
             else if(i<s.length()-1 && s.charAt(i)=='X' && s.charAt(i+1)=='C')
            {
                sum+=90;
                i++;
            }
             else if(i<s.length()-1 && s.charAt(i)=='C' && s.charAt(i+1)=='D')
            {
                sum+=400;
                i++;
            }
             else if(i<s.length()-1 && s.charAt(i)=='C' && s.charAt(i+1)=='M')
            {
                sum+=900;
                i++;
            }
            else if(s.charAt(i)=='I') sum+=I;
            else if(s.charAt(i)=='V') sum+=V;
            else if(s.charAt(i)=='X') sum+=X;
            else if(s.charAt(i)=='L') sum+=L;
            else if(s.charAt(i)=='C') sum+=C;
            else if(s.charAt(i)=='D') sum+=D;
            else if(s.charAt(i)=='M') sum+=M;
        }
        return sum;
    }

    public static void main(String[] args) {
        solution13 sol = new solution13();
        String s = "III";
        System.out.println(sol.romanToInt(s));
    }
} 
