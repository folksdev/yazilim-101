package workshop.step1.myfirstprogram;


/*
1- Javada herşey sınıflar ve objeler olarak temsil edilir. Bu demektir ki, basit bir program bile
bir sınıf olarak temsil edilmelidir

2- Sınıfın ismi ile .java uzantılı olan dosyanın ismi aynı olmalıdır.

3- Sınıf tanımı `class` anahtar kelimesi ile başlar, bunu sınıfın adı takip eder. Sınıfın kodu süslü parantezler içinde yer alır
    Sınıfın adının ilk harfi büyük harf olmalıdır
 */

class Program {

    /*
    Java programlama dilinde, her uygulama, imzası aşağıdaki gibi olan en az bir tane main method bulundurmalıdır

    public static void main(String[] args)

    Main method bir uygulamanın giriş noktasıdır. Uygulama çalıştığında, main method çağrılacaktır. Main method, programın çalışması için gerekli olan diğer talimatları çalıştıracak.
    Main method tamamlandığında uygulama da kapanacaktır.
     */

    public static void main(String[] args) {
        System.out.println("Hello FolksDev!"); // Ekrana Hello World! yazdır.
    }

    /*
    Exercise - Programı Hello World! yerine Merhaba Dünya! yazacak şekilde değiştir
     */
}
