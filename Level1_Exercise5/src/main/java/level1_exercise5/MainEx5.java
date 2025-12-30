package level1_exercise5;


import java.io.IOException;

public class MainEx5 {

    public static void main( String[] args ) {
        SerializingObject javaObjet1 = new SerializingObject("Carlos");
        try {
            javaObjet1.serializeObject();
            javaObjet1.deserializeObject();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
