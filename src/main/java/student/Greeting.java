package student;

/**
 * This class creates a greeting.
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */
public class Greeting {

    /** int value of the locality ID. */
    private int localityID;

    /** String value of the locality Name. */
    private String localityName;

    /** String value of the ascii greeting. */
    private String asciiGreeting;

    /** String value of the unicode greeting. */
    private String unicodeGreeting;

    /** String value of the formatted greeting and name. */
    private String formatStr;

    /** Int value of HAWAII greeting. */
    private static final int HAWAII = 1;

    /** Int value of China greeting. */
    private static final int CHINA = 3;

    /** Int value of Italy greeting. */
    private static final int ITALY = 4;

    /** Default value of greeting. */
    private static final int DEFAULT_LOCALITY = 2;

    /**
     * Constructs a default greeting that creates "Hello, {name}!".
     * @param localityID An int that stores the ID of the locality.
     * @param localityName A string that stores the name of the locality.
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * A Greeting that creates a greeting with ascii and unicode characters assuming the language is already using
     * ascii letters only.
     * @param localityID An int that stores the ID of the locality.
     * @param localityName A string that stores the name of the locality.
     * @param greeting A string that stores the greeting.
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * A Greeting that creates a greeting with ascii and unicode characters.
     * @param localityID An int that stores the ID of the locality.
     * @param localityName A string that stores the name of the locality.
     * @param asciiGreeting A string that stores the greeting using ascii characters.
     * @param unicodeGreeting A string that stores the greeting using unicode characters.
     * @param formatStr A formatted string that includes the greeting and the name.
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;

    }

    /**
     * Gets the Locality ID number.
     * @return the locality id number.
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Gets the Locality name.
     * @return the locality name.
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * Gets the Ascii greeting.
     * @return the ascii greeting.
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * Gets the Unicode greeting.
     * @return the locality id number.
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * Gets the format string.
     * @return Returns the unicode format string.
     */
    public String getFormatStr() {
        String greeting; // default greeting
        switch (localityID) {
            case HAWAII:
                greeting = "Aloha, %s!";
                break;
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

    /**
     * Gets the format string.
     * @param asciiOnly A Boolean that delares whether the format string is ascii only or not.
     * @return Returns the format string with the greeting inserted into the format.
     */
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

    /**
     * Creates a formatted string for testing
     * @return the full greeting details as a string.
     */
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", ", getLocalityID(), getLocalityName())
                + String.format("asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}", getAsciiGreeting(),
                                getUnicodeGreeting());
    }

    /**
     * A main to run the program.
     * @param args Input from the terminal.
     */
    public static void main(String[] args) {

    }

}
