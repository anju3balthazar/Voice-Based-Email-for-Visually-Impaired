package thegenuinegourav.voicemail;

public class Checkcredentials {
    static boolean strcheck(String email,String password)
    {

        String a = email;
        String b = "voiceemail712@gmail.com";
        String c = password;
        String d = "hello5236*";

        // If both the Strings are equal
        // then return true
        if (a.equals(b)) {
            if (c.equals(d))
                return true;
        }

        return false;
    }
}
