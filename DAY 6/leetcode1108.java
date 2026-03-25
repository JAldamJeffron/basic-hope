class leetcode1108 {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        leetcode1108 solution = new leetcode1108();
        String ip = "1.1.1.1";
        String result = solution.defangIPaddr(ip);
        System.out.println("Original: " + ip);
        System.out.println("Defanged: " + result);
    }
}

