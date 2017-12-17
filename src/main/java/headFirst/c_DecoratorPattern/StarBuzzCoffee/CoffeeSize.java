package headFirst.c_DecoratorPattern.StarBuzzCoffee;

public enum CoffeeSize {
    TALL, GRANDE, VENTI;

    public String getName() {
        switch(this) {
            case TALL:
                return "Tall";
            case GRANDE:
                return "Grande";
            case VENTI:
                return "Venti";
            default:
                return "Venti";
        }
    }

    public double cost() {
        switch(this) {
            case TALL:
                return .10;
            case GRANDE:
                return .15;
            case VENTI:
                return .20;
            default:
                return .20;
        }
    }
}
