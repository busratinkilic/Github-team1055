package ders08_ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "Ali";
        //verilen iki metin birbiri ile ayni ise "metinler ayni" farkli ise "metinler farkli" yazdir.
        if (str1.equals(str2)) {
            System.out.println("metinler ayni");
        }else{
            System.out.println("metinler farkli");
        }
        System.out.println(str1.equals(str2) ? "metinler ayni" : "metinler farkli");
    }
}
