public class leetcode16781678 {
    public String interpret(String command) {
       StringBuilder s=new StringBuilder();
       for(int i=0;i<command.length();i++){
        if(command.charAt(i)=='G'){
            s.append('G');
        }
        else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
            s.append('o');
            i++;
        }
        else{
            s.append("al");
            i+=3;
        }
       }
       return s.toString();
    }

    public static void main(String[] args) {
        leetcode16781678 sol = new leetcode16781678();
        System.out.println(sol.interpret("G()(al)")); // Goal
        System.out.println(sol.interpret("G()()()()(al)")); // Gooooal
    }
}
