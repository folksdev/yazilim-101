package workshop.step6.lists;

import java.util.ArrayList;

public class Lists2 {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Volvo");
        strList.add("BMW");
        strList.add("Mercedes");
        strList.add("Ford");
        strList.add("Audi");

        System.out.println(strList.size());

        for (String car :
                strList) {
            String a = car.toLowerCase();
            System.out.println(a);
        }



        ArrayList<String> sList = new ArrayList<>();
        sList.add("asd");
        sList.add("mert");
        sList.add("zeynep");

        System.out.println("silmeden once " + sList);
        sList.remove(1);
        System.out.println("sildikten sonra " + sList);
        sList.clear();
        System.out.println(sList);

    }
}
