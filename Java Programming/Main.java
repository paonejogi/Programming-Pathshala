public class Main {
    String text = "This text is from Main Class";
    
    static void staticMethod(){
        System.out.println("Static methods can be called without creating obj of class");
    }
    public void publicMethod(){
        System.out.println("Public methods only accessed by obj");
    }

    

    public static void main(String[] args) {
        
        staticMethod();
        // publicMethod(); error need object!
        Main publicMethodObj =new Main();
        publicMethodObj.publicMethod();
    }
}
