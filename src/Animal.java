public abstract class Animal {
    public int MaxDistanceRun;
    public int MaxHeightJump;
    public int MaxDistanceSwim;
    protected int distanseRun;
    protected int heightJump;
    protected int distanceSwim;

    static int animalCount = 0;

    public Animal() {
        animalCount++;
        System.out.println(animalCount);
    }
    
    public abstract void run(int distanseRun);

    public abstract void jump(int heightJump);

    public abstract void swim(int distanceSwim);

    public static void main(String[] args) {

        Dog dog1 = new Dog(500, 10, 10);
        dog1.swim(25);
        System.out.println(dog1.MaxDistanceRun);
        dog1.run(500);
        Cat cat1 = new Cat(200,1,1);
        cat1.swim(2);
        System.out.println(cat1.MaxDistanceRun);
    }

}
