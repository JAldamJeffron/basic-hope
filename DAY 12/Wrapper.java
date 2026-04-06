class Wrapper{
    /*
     
     Autoboxing -> converts int to Integer
     Unboxing -> converts Integer to int
     */
    public static int test1(String s){
        return Integer.valueOf(s); // converts string to Integer , return type-> object (Integer)
    }
    public static void main(String[] args){
        Integer b = Integer.valueOf("1234"); // converts string to Integer , return type-> object (Integer)
        Integer c = Integer.parseInt("1234"); // converts string to int , return type-> primitive (int)
        int a = b.intValue(); // converts Integer to int , return type-> primitive (int), unboxing
        System.out.println(a);
        System.out.println(test1("1234"));
        System.out.println(b+" "+c+" ");

        /*
        in Intger range -127 to 127 doesnt create a new object, when it exceeds that value it create a new object reference
        */
       Integer x1= 128;
       Integer x2=128;
       System.out.println(x1==x2);
       System.out.println(x1.equals(x2));
    }
}