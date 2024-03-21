import java.io.*;


class Test
{
    public static void main(String[] args)
    {
       
//        School bachKhoa = new School("Bach Khoa", "So 1 Tran Dai Nghia");
//        School ngoaiThuong = new School("Ngoai Thuong", "So 2 Pham Van Dong");
//        Student student1 = new Student("Lam", 21, bachKhoa);
//        Student student2 = new Student("Binh", 21, ngoaiThuong);
//        String filename = "file.ser";
//
//        // Serialization
//        try
//        {
//            //Saving of object in a file
//            FileOutputStream file = new FileOutputStream(filename);
//            ObjectOutputStream out = new ObjectOutputStream(file);
//
//            // Method for serialization of object
//            out.writeObject(student1);
//            out.writeObject(student2);
//
//            out.close();
//            file.close();
//
//            System.out.println("Object has been serialized");
//
//        }
//
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }


        Student stu1 = null;
        Student stu2 = null;
        String filename = "file.ser";
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            stu1 = (Student)in.readObject();
            stu2 = (Student) in.readObject();


            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            stu1.display();
            stu2.display();
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
            ex.printStackTrace();
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}