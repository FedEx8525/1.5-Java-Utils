package level1_exercise5;

import java.io.*;

public class SerializingAndDeserializingJavaObject implements Serializable {

    private String name;

    public SerializingAndDeserializingJavaObject(String name) {
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
            SerializingAndDeserializingJavaObject deserializedObjet;
            ObjectInputStream deserializedObjetInput = new ObjectInputStream(fileInput);
            deserializedObjet = (SerializingAndDeserializingJavaObject) deserializedObjetInput.readObject();
            System.out.println("Objet deserialized: " + deserializedObjet.getName());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
