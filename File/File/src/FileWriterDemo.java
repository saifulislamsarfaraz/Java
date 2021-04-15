import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

class FileWriterDemo {
    public static void main(String args[]) throws Exception {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";

        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        Writer f1 = new FileWriter("f1.txt");
        for (int i = 0; i < buffer.length; i += 2) {
            f1.write(buffer[i]);
        }
        f1.close();

        FileWriter f2 = new FileWriter("f2.txt");
        f2.write(buffer);
        f2.close();

        FileWriter f3 = new FileWriter("f3.txt");
        f3.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        f3.close();
    }
}
