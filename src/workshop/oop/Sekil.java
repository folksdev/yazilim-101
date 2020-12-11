package workshop.oop;

import workshop.oop.inheratance.EnglishTeacher;
import workshop.oop.inheratance.MathTeacher;
import workshop.oop.inheratance.Teacher;

public class Sekil {
    public static void main(String[] args) {

        /*Ucgen ucgen1 = new Ucgen(4,5,6);

        Ucgen ucgen3 = new Ucgen(4,5,6);

        System.out.println(ucgen1.equals(ucgen3));
        System.out.println(ucgen1);
        System.out.println(UcgenService.alanHesapla(ucgen1, 5));

        Ucgen ucgen2 = new Ucgen(4);
        System.out.println(ucgen2);

        String a = ucgen1.toString();*/

        MathTeacher mathTeacher = new MathTeacher("Mahmut Hoca", 60, "calculus");
        System.out.println(mathTeacher);

        EnglishTeacher eng = new EnglishTeacher("John", 35, true, false);

        System.out.println(eng);

        Ucgen ucgen3 = new Ucgen(4,5,6);
        PramitService pramitService = new PramitService();
        pramitService.alanHesapla(ucgen3, 5);

        pramitService.alanHesapla(4, 5, 6,5);


        /*
                Teacher
            MathTeacher LanguageTeacher
                            EnglishTeacher
         */

    }

}
