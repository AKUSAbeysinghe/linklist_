import java.util.LinkedList;
public class Batch10 {
    public static void main(String[] args) {

        LinkedList<String> names =new LinkedList<>();

        names.add("Punchi Malith");
        names.add("sasa");
        names.add("Umesha");
        names.add("Lahiru");
        names.add("Kalana");
        names.add("Chathurika");

        System.out.println("Names: "+names);

        names.add( 3,"Gawesh");

        System.out.println("Updated Names: "+names);

        String s=names.get(5);

        System.out.println("Names at Index 5: "+s);

        names.set(1,"Sasadara Gamhewa");

        System.out.println("Updated Names: "+names);

        String g=names.remove(3);

        System.out.println("Removed Name: "+g);

        System.out.println("Updated Names: "+names);

    }
}
