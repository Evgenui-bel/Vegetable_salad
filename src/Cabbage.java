public class Cabbage extends Ingredients {
    {
        System.out.println("You chose a cabbage, a great choise!");
    }
    public Cabbage () {
        super.name = "Cabbage";
        super.calories = 28;
        super.weight = 100;
    }
    public Cabbage(String name, int calories, int weight) {
        super.name = name;
        super.calories = calories;
        super.weight = weight;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public void print_salad() {
        System.out.print(name + " ");
    }
    @Override
    public void SetName() {
        super.name = name;
    }
    @Override
    public void SetWeight() {
        super.weight = weight;
    }
    @Override
    public void SetCalories() {
        super.calories = calories;
    }
}
