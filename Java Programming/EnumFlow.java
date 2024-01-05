 
enum Level{
    HIGH,
    LOW,
    MEDIUM
}

public class EnumFlow {
    public static void main(String[] args) {
        
        Level myObjLevel = Level.MEDIUM;

        //Switch
        switch (myObjLevel) {
            case HIGH:
                System.out.println("Level HIGH");
                break;
            case LOW:
                System.out.println("Level LOW");
                break;
            case MEDIUM:
                System.out.println("Level MEDIUM");
                break;
        
        }

        for(Level myObLevel : Level.values()){
            System.out.println(myObLevel);
        }


    }
}
