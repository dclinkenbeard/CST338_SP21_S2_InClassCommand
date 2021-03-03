import java.util.HashMap;

public class InfinityWar {
    public static void main(String[] args) {
        Thanos thanos = new Thanos("Thanos");

        HashMap<String, IStone> gauntlet = new HashMap<>();

//        PowerStone powerStone = PowerStone.getPowerStone();
//        SpaceStone spaceStone = SpaceStone.getSpaceStone();

        gauntlet.put("PowerStone", PowerStone.getPowerStone());
        gauntlet.put("SpaceStone", SpaceStone.getSpaceStone());

        System.out.println(gauntlet.get("SpaceStone"));

        System.out.println(thanos);
        thanos.setInfinityGauntlet(gauntlet);
        thanos.useGauntlet();
        System.out.println(thanos.getInfinityGauntlet().get("SpaceStone"));
        SpaceStone spaceStone = SpaceStone.getSpaceStone();
        spaceStone.setLocation("Knowwhere");
        thanos.useGauntlet();
        System.out.println(spaceStone);

//        powerStone.activate(thanos);
//        spaceStone.activate(thanos);
        System.out.println(thanos);
    }
}
