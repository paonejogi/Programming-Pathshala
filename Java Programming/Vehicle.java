public class Vehicle {

    public int speedOfVehicle(int speed){
        return speed;
    }

    public String fullThrotle(String sound){
        return sound;
    }

    public static void main(String[] args) {
        
        Vehicle myCar = new Vehicle();
       int val =  myCar.speedOfVehicle(100);
       System.out.println("my car speed " + val);
       String sou =  myCar.fullThrotle("suueeeeee papapapa!! sueeeee papapaaaa");
       System.out.println("my car sounds like " + sou + " @ kmph" + val );
    }
    
}
