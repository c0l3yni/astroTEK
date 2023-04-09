package com.tekgs.astro.view.chart;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiView;
import org.softwareonpurpose.softwaregauntlet.Environment;

public class ChartView extends UiView implements ChartViewCalibratable {
    private static final String DESCRIPTION = "'Chart' View";
    private static final String RELATIVE_URI = "chart";
    private static final String DOMAIN_URI = Environment.getInstance().getDomainURL();
    private static final String LOCATOR_TYPE = UiLocatorType.ID;
    private static final String LOCATOR_VALUE = "chart-view";
    
    public ChartView() {
        super(String.format("%s/%s", DOMAIN_URI, RELATIVE_URI), UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE));
    }
    
    public static ChartView directNav() {
        new ChartView().load();
        return UiView.expect(ChartView.class);
    }
    
    private UiElement getChartViewTitleElement() {
        return UiElement.getInstance("Chart View", UiLocatorType.ID, "chart", this.getElement());
    }
    
    @Override
    public String getChartViewTitle() {
        return getChartViewTitleElement().getText();
    }
    
    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
