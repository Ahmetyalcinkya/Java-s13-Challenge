package employeeApp;

import employeeApp.OOP.Company;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        Company comp = new Company("54785689","Workintech", 15000, new String[]{"Emre Şahiner", " Doğancan Kınık", "Gökhan Özdemir", "Erhan Fırat", null});
        System.out.println(comp);
        comp.addEmployee(4, "Ahmet Yalçınkaya");
        System.out.println(comp);
        comp.setName("Hola");
        System.out.println(comp.getDeveloperNames());
        System.out.println(comp);
        comp.setGiro(-500);
        System.out.println(comp.getGiro());
        System.out.println(comp.getDeveloperNames());

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
