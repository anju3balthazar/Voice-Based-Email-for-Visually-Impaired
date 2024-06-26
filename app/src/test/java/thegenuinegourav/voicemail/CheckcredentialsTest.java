package thegenuinegourav.voicemail;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)
public class CheckcredentialsTest {
    @Test
    public void whenvalid(){
        assertTrue(Checkcredentials.strcheck("voiceemail712@gmail.com","hello5236*"));
    }
    @Test
    public void whenemailisnotvalid(){
        assertFalse(Checkcredentials.strcheck("wrongemail5@gmail.com","hello5236*"));
    }
    @Test
    public void whenpasswordisnotvalid(){
        assertFalse(Checkcredentials.strcheck("voiceemail712@gmail.com","wrongpassword"));
    }
    @Test
    public void credentcheck(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void variables(){
        assertFalse(Checkcredentials.strcheck("false","0"));
    }
    @Test
    public void tc1111(){
        assertFalse(Checkcredentials.strcheck("abcde@gmail.com","text"));
    }
    @Test
    public void tc1112(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1113(){
        assertFalse(Checkcredentials.strcheck("#2333d@gmail.com","12345"));
    }
    @Test
    public void tc1114(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1115(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1116(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1117(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1118(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1119(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11110(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11111(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11112(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }

    @Test
    public void tc11113(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11114(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11115(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11116(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11117(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11118(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11119(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111120(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111e1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11ee11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111vv1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1111vv(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11vvv11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11q11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11w11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111r1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111t1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc1y111(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11411(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc81111(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc881111(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc18888111(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc118911(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11160511(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111hi1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11bye11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111del1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11ctr11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc111for1(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11if11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }
    @Test
    public void tc11no11(){
        assertFalse(Checkcredentials.strcheck("database","text"));
    }




}