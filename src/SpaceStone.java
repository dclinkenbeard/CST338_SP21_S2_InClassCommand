public class SpaceStone implements IStone{

    private String location;

    private SpaceStone(){

    }

    private static SpaceStone spaceStone = null;

    public static SpaceStone getSpaceStone(){
        if(spaceStone == null){
            spaceStone = new SpaceStone();
            spaceStone.setLocation("Earth");
        }

        return spaceStone;
    }

    @Override
    public void activate(Person person) {
        System.out.println("Person is moving from " + person.getLocation() + " to " + location);
        person.setLocation(location);
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
