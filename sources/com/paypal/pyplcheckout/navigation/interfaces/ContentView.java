package com.paypal.pyplcheckout.navigation.interfaces;

import android.view.View;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;

public interface ContentView extends Identifiable {
    float getContentViewMinHeight();

    boolean getIsAnchoredToBottomSheet();

    View getView(GenericViewData genericViewData);

    EventType listenToEvent();

    void removeListeners();

    void setContentViewVisibility(int i) {
    }
}
