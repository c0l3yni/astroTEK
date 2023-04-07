package com.tekgs.astro.view.sign;

import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.SIGN})
public class SignViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.DEBUG})
    public void smoke() {
        SignViewExpected expected = SignViewExpected.getInstance();
        SignView actual = SignView.directNav();
        then(SignViewCalibrator.getInstance(expected, actual));
    }
}
