package com.etsy.android.uikit.view;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DoubleTapEventHandler$gestureDetector$2 extends Lambda implements C19846a<GestureDetector> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DoubleTapEventHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoubleTapEventHandler$gestureDetector$2(Context context, DoubleTapEventHandler doubleTapEventHandler) {
        super(0);
        this.$context = context;
        this.this$0 = doubleTapEventHandler;
    }

    public final GestureDetector invoke() {
        return new GestureDetector(this.$context, this.this$0);
    }
}
