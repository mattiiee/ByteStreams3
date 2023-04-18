
package bytestreams3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB5 {

    
    public static void main(String[] args) {
        Student s = new Student("11111","Henry");
        try{
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student o = (Student) input.readObject();
            System.out.println(o.id);
            System.out.println(o.name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
