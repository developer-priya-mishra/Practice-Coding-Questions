class Program2 {
    public static void main(String[] args) {
        int n=7;
        int nn=n+2;

        int r=nn/2+1;
        int space=nn/2;
        int c=nn+space;
        int extra=r;

        for (int i = r; i>=1; i--) {
            for (int j = 1; j<=c; j++) {
                if(j>space+extra-1 && j<=c-extra+1){
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
            }
            extra--;
            System.out.println();
        }
        for (int i = 1; i <=n/2; i++) {
            for (int j = 1; j <=n+2+(n/2)+(n/2); j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }   
            System.out.println();
        }
    }    
}
