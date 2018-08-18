package com.ehb.tobias.werkstuk;
import org.junit.Assert;
import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ATMTest {

    @Test
    public void ATM() {
        ATM testATM = new ATM();
        testATM.setDatasetid("1");
        Assert.assertTrue(testATM.getDatasetid() == "1");
    }

}
