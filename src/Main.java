import java.io.*;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(5,"Table",250);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("product.bin"))) {
            objectOutputStream.writeObject(product);

        } catch (IOException e) {
            e.printStackTrace();
        }

//        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("product.bin"))) {
//            Product product = (Product) objectInputStream.readObject();
//            System.out.println(product);
//        } catch (FileNotFoundException e) {
//
//            e.printStackTrace();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }


    }
}
