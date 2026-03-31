class test{
    public static int[] sub(int[] a){
        int max=-1,im=0,jm=0;
        for (int i=0;i<a.length;i++){
            int c=0,count=0;
            for(int j=i;j<a.length;j++){
                if(a[j]==1) c++;
                else c--;
                if(j>i+1 && c==1){
                    if(max<count){
                        max=count;
                        im=i;
                        jm=j;
                    }
                }
            }
        }
        int k=0;
        int[] arr= new int[max];
        for(int i=im;i<jm;i++){
            arr[k++]=a[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] a = new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        int[] a= {1,0,0,1,1};
        int[] b=sub(a);
        System.out.print("["+b[0]);
        for(int i=1;i<b.length;i++){
            System.out.print(","+b[i]);
        }
    }
}