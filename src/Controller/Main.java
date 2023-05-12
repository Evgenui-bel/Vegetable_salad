package Controller;

import Model.*;
import View.*;

public class Main {
    static {
        System.out.println("Welcome to our restaurant!");
    }
    public static void main(String[] args) {
        boolean a = true;
        int choise = 0;
        while (a) {
            switch (MenuSalads.show_menu()) {
                case 1:
                    choise = 1;
                    a = false;
                    break;
                case 2:
                    choise = 2;
                    a = false;
                    break;
                case 3:
                    choise = 3;
                    a = false;
                    break;
                default:
                    System.out.println("Wrong order number selected!");
            }
        }
        Salad salad = new Salad(choise);
        SaltOrNot.Salt(salad.salad);
        while (true) {
            switch (MenuSalads.show_menu_operations()) {
                case 1:
                    int maxV = 0;
                    System.out.print("Total weight is: ");
                    for (int i = 0; i <= salad.salad.length - 1; i++) {
                        maxV += salad.salad[i].GetWeight();
                    }
                    System.out.print(maxV + "\n");
                    break;
                case 2:
                    int maxCal = 0;
                    System.out.print("Total calories is: ");
                    for (int i = 0; i <= salad.salad.length - 1; i++) {
                        maxCal += salad.salad[i].GetCalories();
                    }
                    System.out.print(maxCal + "\n");
                    break;
                case 3:
                    int HighestCalories = salad.salad[0].GetCalories();
                    for (int i = 0; i <= salad.salad.length - 1; i++) {
                        if (HighestCalories < salad.salad[i].GetCalories()) {
                            HighestCalories = salad.salad[i].GetCalories();
                        }
                    }
                    for (int j = 0; j <= salad.salad.length - 1; j++) {
                        if (HighestCalories == salad.salad[j].GetCalories()) {
                            System.out.print("Most caloric ingredient: " + salad.salad[j].GetName() + "\n");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong order number selected!");
            }
        }
        //Пример копирования объекта
        /*Model.Tomato tomato = new Tomato();
        function(tomato);
        public static Model.Tomato function (Tomato tomato2) {
            try {
                Model.Tomato tomat = (Tomato) tomato2.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }*/
    }
}