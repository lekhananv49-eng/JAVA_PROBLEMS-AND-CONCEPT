package DAY1;

public class JdkVersion {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.err.println(version);
    }
}
