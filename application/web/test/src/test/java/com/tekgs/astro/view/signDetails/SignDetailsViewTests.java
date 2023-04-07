package com.tekgs.astro.view.signDetails;

import com.tekgs.astro.data.sign.Sign;
import com.tekgs.astro.data.sign.SignProvider;
import com.tekgs.astro.view.landing.LandingView;
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
    
    @Test(groups = {TestSuite.ACCEPTANCE, TestSuite.DEBUG}, dependsOnMethods = "smoke")
    public void fromLandingView() {
        Sign sign = SignProvider.getInstance().get();
        SignViewExpected expected = SignViewExpected.getInstance(sign);
//        SignView actual = LandingView.directNav();
//        SignView actual = null;
        then(SignViewCalibrator.getInstance(expected, actual));
    }
}