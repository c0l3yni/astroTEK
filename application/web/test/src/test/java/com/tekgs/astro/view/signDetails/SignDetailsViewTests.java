package com.tekgs.astro.view.signDetails;

import com.tekgs.astro.data.sign.Sign;
import com.tekgs.astro.data.sign.SignProvider;
import com.tekgs.astro.view.landing.LandingView;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.SIGN})
public class SignDetailsViewTests extends GauntletTest {
    
    @Test(groups = {TestSuite.SMOKE})
    public void smoke() {
        SignDetailsViewExpected expected = SignDetailsViewExpected.getInstance();
        SignDetailsView actual = SignDetailsView.directNav("1");
        then(SignDetailsViewCalibrator.getInstance(expected, actual));
    }
    
    @Test(groups = {TestSuite.ACCEPTANCE}, dependsOnMethods = "smoke")
    public void fromLandingView() {
        Sign sign = SignProvider.getInstance().get();
        SignDetailsViewExpected expected = SignDetailsViewExpected.getInstance(sign);
        SignDetailsView actual = LandingView.directNav().getSignListRegion().getSignRegion(sign.getId()).toSignDetailsView();
        then(SignDetailsViewCalibrator.getInstance(expected, actual));
    }
}