public class Tomato extends Ingredients{
    {
        System.out.println("You chose a tomato, a great choise!");
    }
    public Tomato () {
        super.name = "Tomato";
        super.calories = 20;
        super.weight = 100;
    }
    public Tomato(String name, int calories, int weight) {
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
