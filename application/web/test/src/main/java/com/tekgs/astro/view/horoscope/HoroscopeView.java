package com.tekgs.astro.view.horoscope;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class HoroscopeView extends UiView implements HoroscopeViewCalibratable {
    private static final String DESCRIPTION = "'Horoscope' View";
    private static final String RELATIVE_URI = "horoscope";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "horoscope-view";
    
    public HoroscopeView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI),
                UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }
    
    public static HoroscopeView directNav() {
        new HoroscopeView().load();
        return UiView.expect(HoroscopeView.class);
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
    
    @Override
    public String getHoroscopeViewTitle() {
        return getHoroscopeViewTitleElement().getText();
    }
    
    private UiElement getHoroscopeViewTitleElement() {
        return UiElement.getInstance("Horoscope Title", UiLocatorType.ID, "horoscope", this.getElement());
    }
}
