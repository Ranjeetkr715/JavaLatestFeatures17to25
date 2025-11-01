package com.java18.defaultutf;


/*System.getProperty(String key) only returns system properties that the JVM knows about —
basically, predefined key–value pairs set by the Java runtime or the user at startup.
  "file.encoding" is a real system property — it tells Java what the default file encoding is (like UTF-8, Cp1252, etc.).*/

public class UTFDefault {
    public static void main(String [] args){
        System.getProperties().list(System.out); // fetch
        System.out.println("====================");
        System.out.println(System.getProperty("sun.jnu.encoding"));
        System.out.println(System.getProperty("file.encoding"));
    }
}
