public class Dog extends Animal {
    int MaxDistanseSwim = 10;
    double MaxHeightJump = 0.5;
    int MaxDistanceRun = (int)(Math.random() * 500) + 100;
    int distanseRun;
    double heightJump;
    int distanceSwim;

    static int dogCount = 0;

    public Dog() {
        dogCount++;
        System.out.println(dogCount);
    }

    //конструктор собаки
    public Dog(int distanseRun, double heightJump, int distanceSwim) {
        this.distanseRun = distanseRun;
        this.distanceSwim = distanceSwim;
        this.heightJump = heightJump;
    }

    public void run(int distanseRun) {
        boolean result = false;
        if (distanseRun > MaxDistanceRun) {
            System.out.println(result);
        } else {
            result = true;
            System.out.println(result);
        }
    }

    public void jump(int heightJump) {
        boolean resalt = false;
        if (heightJump > MaxHeightJump) {
            System.out.println(resalt);
        } else {
            resalt = true;
            System.out.println(resalt);
        }
    }

    public void swim(int distanceSwim) {
        boolean resalt = false;
        if (distanceSwim > MaxDistanseSwim) {
            System.out.println(resalt);
        } else {
            resalt = true;
            System.out.println(resalt);
        }
    }
}
