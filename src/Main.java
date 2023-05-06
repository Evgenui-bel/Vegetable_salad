public class Main {
    static {
        System.out.println("Welcome to our restaurant!");
    }
    static int size = 3;

    public static void main(String[] args) {
        //MenuSalads m = new MenuSalads();
        Ingredients salad[] = new Ingredients[size];
        boolean a = true;
        while (a) {
        switch (MenuSalads.show_menu()) {
            case 1:
                //Ingredients salad[] = new Ingredients[]{new Carrots(), new Cabbage(), new Champignon()};
                salad[0] = new Carrots();
                salad[1] = new Cabbage();
                salad[2] = new Champignon();
                System.out.print("Your choise - ");
                for (int i = 0; i <= salad.length - 1; i++) {
                    salad[i].print_salad();
                }
                a = false;
                break;
            case 2:
                //Ingredients salad_two[] = new Ingredients[]{new Tomato(), new Garlic(), new Greenery()};
                salad[0] = new Tomato();
                salad[1] = new Garlic();
                salad[2] = new Greenery();
                System.out.print("Your choise - ");
                for (int i = 0; i <= salad.length - 1; i++) {
                    salad[i].print_salad();
                }
                a = false;
                break;
            case 3:
                //Ingredients salad_three[] = new Ingredients[]{new Tomato(), new Cucumber(), new Cabbage()};
                salad[0] = new Tomato();
                salad[1] = new Cucumber();
                salad[2] = new Cabbage();
                System.out.print("Your choise - ");
                for (int i = 0; i <= salad.length - 1; i++) {
                    salad[i].print_salad();
                }
                a = false;
                break;
            default:
                System.out.println("Wrong order number selected!");
            }
        }
        /*SaltOrNot s = new SaltOrNot();
        s.Salt(salad);*/
        SaltOrNot.Salt(salad);
        while (true) {
            switch (MenuSalads.show_menu_operations()) {
                case 1:
                    int maxV = 0;
                    System.out.print("Total weight is: ");
                    for (int i = 0; i <= salad.length - 1; i ++) {
                        maxV += salad[i].weight;
                    }
                    System.out.print(maxV + "\n");
                    break;
                case 2:
                    int maxCal = 0;
                    System.out.print("Total calories is: ");
                    for (int i = 0; i <= salad.length - 1; i ++) {
                        maxCal += salad[i].calories;
                    }
                    System.out.print(maxCal + "\n");
                    break;
                case 3:
                    int HighestCalories = salad[0].calories;
                    System.out.print("Total weight is: ");
                    for (int i = 0; i <= salad.length - 1; i ++) {
                        if(HighestCalories < salad[i].calories) {
                            HighestCalories = salad[i].calories;
                        }
                    }
                    for (int j = 0; j <= salad.length - 1; j++) {
                        if (HighestCalories == salad[j].calories) {
                            System.out.print("Most caloric ingredient: " + salad[j].name + "\n");
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
        /*Tomato tomato = new Tomato();
        function(tomato);
        public static Tomato function (Tomato tomato2) {
            try {
                Tomato tomat = (Tomato) tomato2.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }*/
    }
}