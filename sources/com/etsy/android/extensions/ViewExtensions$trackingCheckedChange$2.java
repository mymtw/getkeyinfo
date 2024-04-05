package com.etsy.android.extensions;

import android.view.View;
import android.widget.CompoundButton;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.TrackingOnCheckedChangeListener;
import kotlin.C19394m;
import p753kq.C19861p;

public final class ViewExtensions$trackingCheckedChange$2 extends TrackingOnCheckedChangeListener {
    public final /* synthetic */ C19861p<View, Boolean, C19394m> $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensions$trackingCheckedChange$2(C19861p<? super View, ? super Boolean, C19394m> pVar, C8698l[] lVarArr) {
        super(lVarArr);
        this.$listener = pVar;
    }

    public void onViewCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.$listener.invoke(compoundButton, Boolean.valueOf(z));
    }
}
