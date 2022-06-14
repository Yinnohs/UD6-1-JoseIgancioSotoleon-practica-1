package utils;

import plane.Plane;

import java.io.*;
import java.nio.file.Path;

public class FileManager {

    private static final String FILE_PATH ="data/plane.dat";
    public static Plane getPlane(){
        try{
            FileInputStream file = new FileInputStream(FILE_PATH);
            BufferedInputStream fileBuffer = new BufferedInputStream(file);
            ObjectInputStream fileReader = new ObjectInputStream(fileBuffer);

            Plane planeToReturn = (Plane) fileReader.readObject();

            fileReader.close();
            fileBuffer.close();
            file.close();

            return  planeToReturn;

        }catch( IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("[GET PLANE FUNCTION]: ERROR READING FILE");
        return null;
    }

    public static void createPlane(Plane plane){
        try {
            FileOutputStream file =  new FileOutputStream(FILE_PATH);
            ObjectOutputStream fileWriter = new ObjectOutputStream(file);

            fileWriter.writeObject(plane);

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    public  static boolean isFile(){
       File file = new File(FILE_PATH);
       return file.isFile();
    }
}
