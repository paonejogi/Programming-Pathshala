 

class OuterClass{
    int x = 10;
    class InnerClass{
        int y =x;
    }

    static class StaticInnerClass{
        public void printf(){
        System.out.println("Helo there!");
        }
    }

    /**
     * InnerInnerClass
     */
    public class InnerInnerClass {
       public int num(){
        return x;
       }
        
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass OuterObj = new OuterClass();
        OuterClass.InnerClass InnerObj = OuterObj.new InnerClass();

    //    OuterClass.StaticInnerClass StaticMeth = new OuterClass.StaticInnerClass();
    //    StaticMeth.printf();

    OuterClass.InnerInnerClass numer = OuterObj.new InnerInnerClass();
    int yo = numer.num();
    System.out.println(yo);


        System.out.println(InnerObj.y + OuterObj.x);
    }
}
