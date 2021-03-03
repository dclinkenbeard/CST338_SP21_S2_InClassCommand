/**
 * @author DAC
 *
 * This is a concrete implementation of IStone it
 * will be used to raise the power of a Person.
 */
public class PowerStone implements IStone{

    private final Double RAISE_POWER = 1.5;
    private static PowerStone powerStone = null;

    private PowerStone(){

    }

    public static PowerStone getPowerStone(){
        if(powerStone == null){
            powerStone = new PowerStone();
        }

        return powerStone;
    }

    @Override
    public void activate(Person person) {
        System.out.println("Activating the powerstone");
        Double power = person.getPower();
        System.out.println("Power == " + power);
        power = power * RAISE_POWER;
        person.setPower(power);
        System.out.println("persons power is " + person.getPower());
    }
}
