import java.io.*;
        import java.util.regex.Pattern;

public class Regular{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (Pattern.matches("^[{(]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[)}]?$", line)) {
                out.println(line + " - YES");
            } else {
                out.println(line + " - NO");
            }
        }
        out.close();
    }
}
