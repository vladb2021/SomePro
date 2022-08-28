package files;
import java.io.*;
import java.util.*;

public class FileIO {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Влад\\IdeaProjects\\SomePro\\src\\main\\java\\files";
        File file = new File(path);
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
        for (String text : fileList) {
            if (text.toLowerCase().endsWith(".txt")) {
                System.out.println("This is text file");
            }
        }
        File file1 = new File(path + "\\file1.txt");
        File file2 = new File(path + "\\file2.txt");
        File file3 = new File(path + "\\file3.txt");
        System.out.println(file1.exists() + " " + file2.exists() + " " + file3.exists());

        System.out.println(file1.canRead() && file1.canWrite());
        System.out.println(file2.canRead() && file2.canWrite());

        System.out.println(file1.isFile() + " " + file1.isDirectory());
        System.out.println(file2.isFile() + " " + file2.isDirectory());

        System.out.println(new Date(file1.lastModified()));
        System.out.println(new Date(file2.lastModified()));

        File file4 = new File(path + "\\writefile.txt");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println("Test write 1");
        printWriter.println("Test write 2");
        printWriter.println("Test write 3");
        printWriter.close();

        System.out.println((double) file1.length());
        System.out.println((double) file2.length());
        System.out.println((double) file1.length()/1024);
        System.out.println((double) file2.length()/1024);
        System.out.println((double) file1.length()/1048576);
        System.out.println((double) file2.length()/1048576);

        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader2 = new BufferedReader(new FileReader(file1));
            String str2;
            while ((str2 = bufferedReader2.readLine()) != null) {
                System.out.println(str2);
            }
            bufferedReader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(file1));
        String str3 = "";
        String data = "";
        while (str3 != null) {
            if (str3 == null)
                break;
            data += str3;
            str3 = bufferedReader3.readLine();
        }
        System.out.println(data);
        bufferedReader3.close();

        BufferedReader bufferedReader4 = new BufferedReader((new FileReader(file1)));
        String str4 = "";
        List<String> list = new ArrayList<>();
        while (str4 != null) {
            str4 = bufferedReader4.readLine();
            if (str4 == null)
                break;
            list.add(str4);
        }
        System.out.println(Arrays.toString(list.toArray()));
        bufferedReader4.close();

        String filename = (path + "\\writefile2.txt");
        FileWriter fileWriter1 = new FileWriter(filename,false);
        fileWriter1.write("Line=1");
        fileWriter1.close();
        BufferedReader bufferedReader5 = new BufferedReader((new FileReader(filename)));
        String str5 = "";
        while (str5 != null) {
            str5 = bufferedReader5.readLine();
            System.out.println(str5);
        }
        bufferedReader5.close();

        FileWriter fileWriter2 = new FileWriter(filename,true);
        fileWriter2.write("Line=2");
        fileWriter2.close();
        BufferedReader bufferedReader6 = new BufferedReader((new FileReader(filename)));
        String str6 = "";
        while (str6 != null) {
            str6 = bufferedReader6.readLine();
            System.out.println(str6);
        }
        bufferedReader6.close();

        String str7;
        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(file2)));
        while (((str7 = reader.readLine()) != null) && reader.getLineNumber() <= 3){
            System.out.println(str7);
        }
        reader.close();

        String longword = "";
        String current;
        Scanner scanner = new Scanner(file2);
        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longword.length())
                longword = current;
        }
        System.out.println(longword);
    }
}
