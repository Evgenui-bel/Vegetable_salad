public class Garlic extends Ingredients{
    {
        System.out.println("You chose a garlic, a great choise!");
    }
    public Garlic () {
        super.name = "Garlic";
        super.calories = 65;
        super.weight = 50;
    }
    public Garlic(String name, int calories, int weight) {
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
