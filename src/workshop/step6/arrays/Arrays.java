package workshop.step6.arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] mark = {10, 30, 40, 70, 90, 10, 10, 10, 10};

        String[] cars = new String[5];

        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Mercedes";

        System.out.println(cars);
        System.out.println(cars[0]);
        System.out.println(cars.length); //5


        for (String car: cars) {
            System.out.print(car + " | ");
        }

        System.out.println();
        for (int i = 0; i < cars.length; i++){
            System.out.println("cars[" + i + "] : " + cars[i]);
        }

        int[][] numbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println("numbers[0][0]: " + numbers[0][0]);
        System.out.println("numbers.length: " + numbers.length);
        System.out.println("numbers[0].length: " + numbers[0].length);

        for (int i = 0; i < numbers.length; i++){
            System.out.print("| ");
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " | ");
            }
            System.out.println();
        }

        for (int[] i : numbers){
            System.out.print("| ");
            for (int j : i){
                System.out.print(j + " | ");
            }
            System.out.println();
        }

    }
}
