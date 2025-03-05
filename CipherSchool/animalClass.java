class Animal {
    private int legs;
    public Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void makeNoise() {
        
    }
}
class Cat extends Animal {
    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mew");
    }
}
class Dog extends Animal {
    public Dog(int legs) {
        super(legs);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}