class Program3 {
    public static void main(String[] args) {
        int n=2;
        int c=1+n+((n-1)*(n-1))+1;
        int r=1+n+(n-1);
        int e=0;
        for (int i = 1; i<=r; i++) {
            for (int j = 1; j <=c; j++) {
                if (j==1 && i<=n+1) {
                    System.out.print("@");
                } else if (j==c && i>n-1) {
                    System.out.print("@");
                }else if(i>=(n/2)+1 && j>e && j<=n+e){
                    System.out.print("*");
                }else{
                        System.out.print("_");
                }
            }
            e++;
            System.out.println();
        }
    }
    
}