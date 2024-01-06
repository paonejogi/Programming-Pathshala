public class WrapperClass {

    public static void main(String[] args) {
        
        Integer myInteger = 55659;
        Byte myByte = 59;
        Character myCharacter = 'F';

        System.out.println(myInteger.intValue());
        System.out.println(myInteger.toString());

        String hello = myInteger.toString();
        System.out.println(hello.length());


    }
    
}
