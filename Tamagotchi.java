public class Tamagotchi {
    private String name;
    private int age;
    private int hungerLevel;
    private int happinessLevel;

    public Tamagotchi(String name) {
        this.name = name;
        this.age = 0;
        this.hungerLevel = 50; // Initial hunger level
        this.happinessLevel = 50; // Initial happiness level
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getHappinessLevel() {
        return happinessLevel;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
        
    }
    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

}
