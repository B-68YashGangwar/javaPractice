package PatternPrinting;

public class ButterflyPattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 4; k > i; k--) {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for (int k = i; k <=3; k++) {
                System.out.print("  ");
            }
            for(int l=i;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
