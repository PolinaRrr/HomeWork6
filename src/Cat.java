public class Cat extends Animal {
    int MaxDistanseSwim = 0;
    int MaxHeightJump = 2;
    int MaxDistanceRun = 200;
    static int catCount = 0;

    public Cat() {
        catCount++;
        System.out.println(catCount);
    }

    Cat(int distanseRun, int heightJump, int distanceSwim) {
        this.distanseRun = distanseRun;
        this.heightJump = heightJump;
        this.distanceSwim = distanceSwim;
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
        if (distanceSwim > MaxDistanseSwim || distanceSwim < 0) {
            System.out.println(resalt);
        } else {
            resalt = true;
            System.out.println(resalt);
        }
    }

}
