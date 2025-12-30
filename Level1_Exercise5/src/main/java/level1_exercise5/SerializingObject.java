package level1_exercise5;

import java.io.*;

public class SerializingObject implements Serializable {

    private String name;

    public SerializingObject(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void serializeObject() throws IOException {
        try (FileOutputStream fileOutput = new FileOutputStream ("javaObjet.ser")) {
            ObjectOutputStream serializedObjetOut = new ObjectOutputStream(fileOutput);
            serializedObjetOut.writeObject(this);
            System.out.println("Objet serialized into file javaObjet.ser");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void deserializeObject() throws IOException {
        try (FileInputStream fileInput = new FileInputStream("javaObjet.ser")) {
            SerializingObject deserializedObjet;
            ObjectInputStream deserializedObjetInput = new ObjectInputStream(fileInput);
            deserializedObjet = (SerializingObject) deserializedObjetInput.readObject();
            System.out.println("Objet deserialized: " + deserializedObjet.getName());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
