package OOP;

public class OOP {
    public static void main(String[] args) {
        Diamond smallDiamond = new Diamond(10.0,15.0,15);
        Diamond bigDiamond = new Diamond(145.0,58.3,17);
        Diamond[] diamonds = new Diamond[10];
        for (int i = 0; i < diamonds.length; i++)
        {
         diamonds[i]=new Diamond(i*4.8,i*12.4,i/2);
        }
        for (int i = 0; i < diamonds.length; i++) {
            System.out.println(diamonds[i].countArea());

        }
        double p = smallDiamond.countArea();
        double p1 = bigDiamond.countArea();
        System.out.println(p +"------------------------"+p1);


    }
}
