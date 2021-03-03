import java.util.HashMap;

public class Thanos extends Person{
    private String name;
    private HashMap<String,IStone> infinityGauntlet = new HashMap<>();

    public Thanos(String name) {
        this.name = name;
        this.setPower(5.0);
        this.setLocation("Titan");
    }

    public void useGauntlet(){
        for(String stone : infinityGauntlet.keySet()){
            infinityGauntlet.get(stone).activate(this);
        }
    }

    public HashMap<String, IStone> getInfinityGauntlet() {
        return infinityGauntlet;
    }

    public void setInfinityGauntlet(HashMap<String, IStone> infinityGauntlet) {
        this.infinityGauntlet = infinityGauntlet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thanos{" +
                "name='" + name + '\'' +
                super.toString() +
                '}';
    }
}
