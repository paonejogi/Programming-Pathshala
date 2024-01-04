// abstract class abstarctMain {
//     //abstarct method
//     public String fname = "Pavankumar";
//     public int age = 24;
//     public abstract void study(); //abstract method

//     //subclass
//     class Student extends abstarctMain{

//         public int graduationYear = 2023;

//         public void study(){
//             System.out.println("Study study study!");
//         }

//     }

// }

abstract class abstarctMain {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends abstarctMain {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
