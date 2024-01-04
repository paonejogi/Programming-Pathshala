public class Oops{

    String userName = "Pavankumar";
    public static void main(String[] args) {
        System.out.println("Hello there! welcome to Object Oriented Programming :) ");

        //Creating first obj from class Oops
        Oops myFirstObject = new Oops();
        System.out.println("User Name: "+myFirstObject.userName);

        //Creating secound obj from class Oops
        Oops mySecoundObject = new Oops();
        System.out.println("User Name: "+ mySecoundObject.userName);

    }
}