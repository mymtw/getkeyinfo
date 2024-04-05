package com.etsy.android.extensions;

import android.view.View;
import android.widget.CompoundButton;
import com.etsy.android.uikit.util.TrackingOnCheckedChangeListener;
import kotlin.C19394m;
import p753kq.C19861p;

public final class ViewExtensions$trackingCheckedChange$1 extends TrackingOnCheckedChangeListener {
    public final /* synthetic */ C19861p<View, Boolean, C19394m> $listener;

    public ViewExtensions$trackingCheckedChange$1(C19861p<? super View, ? super Boolean, C19394m> pVar) {
        this.$listener = pVar;
    }

    public void onViewCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.$listener.invoke(compoundButton, Boolean.valueOf(z));
    }
}
