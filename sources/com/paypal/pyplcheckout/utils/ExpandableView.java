package com.paypal.pyplcheckout.utils;

import android.view.View;

public interface ExpandableView {
    ExpandableViewTransitionProperties getViewTransitionProperties(View view, ExpandableViewState expandableViewState);

    void onViewExpansionStateUpdateCompleted(View view);

    void onViewExpansionStateUpdateStarted(View view);
}
