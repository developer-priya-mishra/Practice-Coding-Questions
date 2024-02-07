class Program1 {
    public static void main(String[] args) {
        int n=21;
        int extra=0;
        int space=n/2;
        for (int i = 1; i <=space+1; i++) {
            for (int j = 1; j <=n+space; j++) {
                if (j>space+extra && j<=n+space-extra) {
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
            }
            extra++;
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j==1 || i==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}