import java.util.HashSet;

public class HashSetClass {
public static void main(String[] args) {
    HashSet<Integer> myUniquSet= new HashSet<Integer>();

    myUniquSet.add(1);
    myUniquSet.add(2);
    myUniquSet.add(9);
    myUniquSet.add(1);

    for(int i: myUniquSet){
        System.out.println(i);
    }

    if(myUniquSet.contains(1)) System.out.println("Yes");
    else System.out.println("No");

}
    
}