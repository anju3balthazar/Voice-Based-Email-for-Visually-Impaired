package thegenuinegourav.voicemail;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PasswordformatTest {
    @Test
    public void whenpasswordisvalid(){

        assertTrue(Passwordformat.isValid("Aa1234#rrrrrr"));
    }
    @Test
    public void whenpasswordisnotvalid(){
        assertFalse(Passwordformat.isValid("TQTFXTAYGAY   JHHSWHS"));
    }
    @Test
    public void whenpawordisvalid(){
        assertTrue(Passwordformat.isValid("Da1234#hyhyhy"));
    }
    @Test
    public void whenasswordisnotvalid(){
        assertFalse(Passwordformat.isValid("  JHH  WHS"));
    }
    @Test
    public void whenpassisvalid(){
        assertTrue(Passwordformat.isValid("Sa4589#tutitu"));
    }
    @Test
    public void whenpassisnotvalid(){
        assertFalse(Passwordformat.isValid("T i 2 "));
    }
    @Test
    public void whnpasswordisvalid(){
        assertTrue(Passwordformat.isValid("Ba1234#yyyyy"));
    }
    @Test
    public void whnpasswordisnotvalid(){
        assertFalse(Passwordformat.isValid("TQ S"));
    }
    @Test
    public void testcase1111(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void testcase1112(){
        assertFalse(Passwordformat.isValid("wrong  2 "));
    }
    @Test
    public void tc1111(){
        assertFalse(Passwordformat.isValid("1 0 0 "));
    }
    @Test
    public void tc1112(){
        assertFalse(Passwordformat.isValid("0  0"));
    }
    @Test
    public void tc1113(){
        assertFalse(Passwordformat.isValid("#2333d gmailom12345"));
    }
    @Test
    public void tc1114(){
        assertFalse(Passwordformat.isValid("5 /"));
    }
    @Test
    public void tc1115(){
        assertFalse(Passwordformat.isValid("wrongemail jde"));
    }
    @Test
    public void tc1116(){
        assertFalse(Passwordformat.isValid("wron gemsil"));
    }
    @Test
    public void tc1117(){
        assertFalse(Passwordformat.isValid("datab ase "));
    }
    @Test
    public void tc1118(){
        assertFalse(Passwordformat.isValid("da qq "));
    }
    @Test
    public void tc1119(){
        assertFalse(Passwordformat.isValid("@email@ email"));
    }
    @Test
    public void tc11110(){
        assertFalse(Passwordformat.isValid("email111 .com"));
    }
    @Test
    public void tc11111(){
        assertFalse(Passwordformat.isValid("hel lo"));
    }
    @Test
    public void tc11112(){
        assertFalse(Passwordformat.isValid("@ab c.gmail"));
    }

    @Test
    public void tc11113(){
        assertFalse(Passwordformat.isValid("@abc.g mail"));
    }
    @Test
    public void tc11114(){
        assertFalse(Passwordformat.isValid("@abc.g mail"));
    }
    @Test
    public void tc11115(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11116(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11117(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11118(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11119(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111120(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111e1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11ee11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111vv1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc1111vv(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11vvv11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11q11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11w11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111r1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111t1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc1y111(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11411(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc81111(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc881111(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc18888111(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc118911(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11160511(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111hi1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11bye11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111del1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11ctr11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc111for1(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11if11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }
    @Test
    public void tc11no11(){
        assertFalse(Passwordformat.isValid("wrong password"));
    }




}