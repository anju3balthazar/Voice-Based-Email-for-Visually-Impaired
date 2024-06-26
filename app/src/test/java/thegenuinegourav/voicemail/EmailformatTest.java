package thegenuinegourav.voicemail;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class EmailformatTest {
    @Test
    public void whenemailisvalid() {
        assertTrue(Emailformat.isValid("softwaretesting@gmail.com"));
    }

    @Test
    public void whenemailisnotvalid() {
        assertFalse(Emailformat.isValid("softwaretestinggmail.com"));

    }

    @Test
    public void whenemailisotvalid() {
        assertFalse(Emailformat.isValid("testinggmil.com"));

    }

    @Test
    public void testcase1111() {
        assertFalse(Emailformat.isValid("wrongemail"));
    }

    @Test
    public void testcase1112() {
        assertFalse(Emailformat.isValid("wrongemail@wrong"));
    }

    @Test
    public void tc1111() {
        assertFalse(Emailformat.isValid("abcde@gmailcom "));
    }

    @Test
    public void tc1112() {
        assertFalse(Emailformat.isValid("database "));
    }

    @Test
    public void tc1113() {
        assertFalse(Emailformat.isValid("#2333d@gmailom12345"));
    }

    @Test
    public void tc1114() {
        assertFalse(Emailformat.isValid("5"));
    }

    @Test
    public void tc1115() {
        assertFalse(Emailformat.isValid("wrongemail@jde"));
    }

    @Test
    public void tc1116() {
        assertFalse(Emailformat.isValid("wrongemsil"));
    }

    @Test
    public void tc1117() {
        assertFalse(Emailformat.isValid("database "));
    }

    @Test
    public void tc1118() {
        assertFalse(Emailformat.isValid("daqq "));
    }

    @Test
    public void tc1119() {
        assertFalse(Emailformat.isValid("@email@email"));
    }

    @Test
    public void tc11110() {
        assertFalse(Emailformat.isValid("email111.com"));
    }

    @Test
    public void tc11111() {
        assertFalse(Emailformat.isValid("hello"));
    }

    @Test
    public void tc11112() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11113() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11114() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11115() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11116() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11117() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11118() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11119() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111120() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111e1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11ee11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111vv1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc1111vv() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11vvv11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11q11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11w11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111r1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111t1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc1y111() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11411() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc81111() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc881111() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc18888111() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc118911() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11160511() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111hi1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11bye11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111del1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11ctr11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc111for1() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11if11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }

    @Test
    public void tc11no11() {
        assertFalse(Emailformat.isValid("@abc.gmail"));
    }
}


