package com.tekgs.astro.view.memberlanding;

import com.tekgs.astro.memberlanding.MemberLandingView;
import com.tekgs.astro.memberlanding.MemberLandingViewCalibrator;
import com.tekgs.astro.memberlanding.MemberLandingViewExpected;
import org.softwareonpurpose.softwaregauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.ASTRO_TEK, GauntletTest.View.MEMBERLANDING})
public class MemberLandingViewTests extends GauntletTest {

    @Test (groups = {TestSuite.SMOKE, TestSuite.DEBUG})
    public void Smoke() {
        MemberLandingViewExpected expected = MemberLandingViewExpected.getInstance();
        MemberLandingView actual = MemberLandingView.directNav();
        then(MemberLandingViewCalibrator.getInstance(expected, actual));
    }
}
