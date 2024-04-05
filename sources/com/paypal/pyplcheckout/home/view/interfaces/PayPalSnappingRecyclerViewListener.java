package com.paypal.pyplcheckout.home.view.interfaces;

import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import java.util.List;

public interface PayPalSnappingRecyclerViewListener {
    void initFundingOptionSelection(int i);

    void onFundingInstrumentSelected(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, List<? extends CardUiModel> list);

    void onUpdateAddCardViewState(int i, List<? extends CardUiModel> list);
}
