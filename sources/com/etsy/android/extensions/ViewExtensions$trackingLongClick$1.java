package com.etsy.android.extensions;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnLongClickListener;
import p753kq.C19857l;

public final class ViewExtensions$trackingLongClick$1 extends TrackingOnLongClickListener {
    public final /* synthetic */ C19857l<View, Boolean> $listener;

    public ViewExtensions$trackingLongClick$1(C19857l<? super View, Boolean> lVar) {
        this.$listener = lVar;
    }

    public boolean onViewLongClick(View view) {
        return this.$listener.invoke(view).booleanValue();
    }
}
