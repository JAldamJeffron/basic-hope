public class solution2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        int a,b,c;
        long volume=(long)length*width*height;
        if(((length>=10000 || width>=10000 || height>=10000 || mass>=10000) || (volume>=1000000000)) && (mass>=100))
        return "Both";
        else if (!(((length>=10000 || width>=10000 || height>=10000 || mass>=10000) || (volume>=1000000000))) &&!(mass>=100)) return "Neither";
        else if(((length>=10000 || width>=10000 || height>=10000 || mass>=10000) || (volume>=1000000000)) &&(mass<=100))
        return "Bulky";
        else if(((length<=10000 || width<=10000 || height<=10000 || mass<=10000) || (volume<=1000000000)) || (mass>=100))
        return "Heavy";
        else if((length>=10000 || width>=10000 || height>=10000 || mass>=10000) || (volume>=1000000000))
        {
            return "Bulky";
        }
        else {
            return "Heavy";
        }
    }

    public static void main(String[] args) {
        solution2525 sol = new solution2525();
        System.out.println(sol.categorizeBox(1000, 35, 700, 48));
    }
}
