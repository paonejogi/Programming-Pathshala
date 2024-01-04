public class Secound {

    String userName = "Ravan"; //can be modified
    final int age = 26; //Cant be modified 
    public static void main(String[] args) {
        
        //creating object from main class
        Main objectOfMain = new Main();
        System.out.println(objectOfMain.text);

        //Creating object of Secound Class!
        Secound ObjectofSecound = new Secound();
        System.out.println("Before Modifying the userName Attribute or Field: " +ObjectofSecound.userName);

        ObjectofSecound.userName = "Modified Ravan";
        System.out.println("After Modifying the userName Attribute or Field: " +ObjectofSecound.userName);

        // ObjectofSecound.age = 25; error because final keyword!

        //creating secound object of secound class

        Secound anotherObjectOfSecound = new Secound();
        System.out.println("Another Obj of Secound Class "+ anotherObjectOfSecound.userName); //Remember userName still ravan even modified in previous ObjectOfSecound.username

    }
}
