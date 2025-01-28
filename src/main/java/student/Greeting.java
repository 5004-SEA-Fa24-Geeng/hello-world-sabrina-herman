package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {

    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    private static final int HAWAII = 1;
    private static final int CHINA = 3;
    private static final int ITALY = 4;
    private static final int DEFAULT_LOCALITY = 2;

    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;

    }

    public int getLocalityID() {
        return this.localityID;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    public String getFormatStr() {
        String greeting; // default greeting
        switch (localityID) {
            case HAWAII:
                greeting = "Aloha, %s!";
                break;
            // skip case 2, it is the default greeting
            case CHINA:
                greeting = "%s, 你好!";
                break;
            case ITALY:
                greeting = "Ciao, %s !";
                break;
            default:
                greeting = "Hello, %s!"; // default greeting
        }
        return greeting;
    }

    public String getFormatStr(boolean asciiOnly) {
        String greeting; // default greeting
        switch (localityID) {
            case HAWAII:
                greeting = "Aloha, %s!";
                break;
            // skip case 2, it is the default greeting
            case CHINA:
                if (asciiOnly) {
                    greeting = "%s, Ni Hao!";
                } else {
                    greeting = "%s, 你好!";
                    // note "你好!" while is allowed in java sa unicode,
                    // most terminals don't allow non-ascii characters unless enabled
                }
                break;
            case ITALY:
                greeting = "Ciao, %s !";
                break;
            default:
                greeting = "Hello, %s!"; // default greeting
        }
        return greeting;
    }

    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", ", getLocalityID(), getLocalityName()) +
                String.format("asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}", getAsciiGreeting(), getUnicodeGreeting());
    }

    public static void main(String[] args) {

    }

}
