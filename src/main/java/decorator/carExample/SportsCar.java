package decorator.carExample;

// 4. concrete decorator 1 - may be more
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features to sport car.");
    }
}
