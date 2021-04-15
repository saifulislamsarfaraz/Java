import java.io.*;

class BufferedWriterDemo {
    public static void main(String args[]) throws Exception {
        Reader fr = new FileReader("dir/sample.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("dir/sample1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        while (true) {
            String s = br.readLine();
            if (s == null) break;
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}