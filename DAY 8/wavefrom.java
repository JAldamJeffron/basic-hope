
public class wavefrom {
	    public static void main(String[] args){
	        String s="viratkholi";
	        String res="";
	        int i=0;
	        while(i<s.length()){
	            if(i%2==0 || i==0){
	                res+=s.charAt(i);
	                i+=2;
	            }
	        }
	        int j=1;
	        while(j<s.length()){
	            if(j%2!=0){
	                res+=s.charAt(j);
	                j+=2;
	            }
	        }
	        System.out.println(res);
	    }
}
