import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14,r,daire_alani,daire_dilim_alani,daire_cevresi;
        int aci;

        Scanner girdi =new Scanner(System.in);
        System.out.println("lutfen olusturulacak daire diliminin yarıçapını giriniz: ");
        r = girdi.nextDouble();
        System.out.println("lutfen alanını hesaplamak ıstedıgonız daire diliminin aci degerini giriniz: ");
        aci = girdi.nextInt();
        daire_alani = pi * r * r;
        daire_cevresi = 2 * pi * r;
        daire_dilim_alani = (pi*r*r*aci)/360;
        System.out.println("Degerlerini gşrmiş oldugunuz dairenin tum alanı: "+String.format("%.2f", daire_alani));
        System.out.println("Degerlerini girmis oldugunuz dairenin acısal dılımının alanı: "+ daire_dilim_alani);
        System.out.println("degerlerini girmiş oldugunuz dairenin cevresi  : "+ daire_cevresi);


    }
}