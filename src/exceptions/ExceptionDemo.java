package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo{

//    public static void show(){
////        FileReader reader = null;
//        try(
//                //try-with-resource
//                var reader = new FileReader("abc.txt");
//                var writer = new FileWriter("abcd.txt")) {
////          reader = new FileReader("abc.txt");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//            System.out.println("File opened");
//        }
//        catch (FileNotFoundException ex) {
//            System.out.println("File not exist "+ex.getMessage());
////            ex.printStackTrace();
//        }
//        catch (IOException ex){
//            System.out.println("IOExceptio " + ex.getMessage());
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
////      Java will cole it automatically try-with-resource
////        finally {
////            if(reader !=null){
////            reader.close();
////            }
////        }
//        System.out.println("File demo Open not successful🐞 ");
//        System.out.println("--------------------------------");
//    }


    public void show() throws Exception {
        var acc = new Account();

        System.out.println("--------------------------------");
        try {
            acc.deposit(230.3F);
            acc.setBalance(10);
            acc.withdraw(1);
            acc.deposit(-230.3F);
        } catch (Throwable e){
            System.out.println("Logging");
            throw e;
        }
    }
}
