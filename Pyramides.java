public class Pyramides{
    public static void main (String[] arg){
        int n = Integer.parseInt(arg[1]);
        int m = Integer.parseInt(arg[2]);
        switch(arg[0]){
        case "1": seule(n);
                break;
        case "2": etoiletiret(n);
                break;
        case "3": Endroit(n);
                break;
        case "4": Triforce(n);
                break;
        case "5": OverPowered(n,m);
                break;
        default: etoiletiret(n);
                break;
        }
    }
    public static void seule(int n){
        int compt = n;
        for (int i = 1; i <= n; i++){
            for(int j = 0; j < n - compt;j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*(compt - 1))+1 ;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            compt = compt - 1;
        }
    }
    public static void etoiletiret(int n){
        int compt = n;
        for(int i=1;i<=n;i++){
            for(int j=0; j<n-compt;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*(compt-1))+1;k++){
                if (i%2==0){System.out.print("-");}
                else{System.out.print("*");}
            }
            System.out.print("\n");
            compt = compt - 1;
        }
    }
    public static void Endroit(int n){
        int compt = n;
        for(int i = 1; i<=n ; i++){
            for(int j=0;j<compt;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*((n-compt)))+1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            compt=compt - 1;
        }
    }
    public static void Triforce(int n) {
        TriangleMaker(2, 1, n-1);
        TriangleMaker(2, 2, n-1);
    }
    public static void TriangleMaker(int s, int t, int n) {
        for (int i = 0; i <= n; i++) {
        int b=0;
            for (int k = 0; k < t; k++) {
                for (int j = 0; j < ((n * 2 + 1) / 2 + 1) * (s - t) && b==0; j++) {
                    System.out.print(" ");
                }
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("*");
                }
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.print(" ");
                b = 1;
            }
            System.out.println();
        }
    }
    public static void OverPowered(int n, int m){
        for(int p=1;p<=m;p++){
            TriangleMaker(m,p,n-1);
        }
    }
}
