package com.paypal.pyplcheckout.utils;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ExpandableViewHelper$updateViewExpansionState$3 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19846a<C19394m> $onComplete;
    public final /* synthetic */ View $view;
    public final /* synthetic */ ExpandableViewHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableViewHelper$updateViewExpansionState$3(ExpandableViewHelper expandableViewHelper, View view, C19846a<C19394m> aVar) {
        super(0);
        this.this$0 = expandableViewHelper;
        this.$view = view;
        this.$onComplete = aVar;
    }

    public final void invoke() {
        ExpandableViewHelper.updateViewExpansionState$finish(this.this$0, this.$view, this.$onComplete);
    }
}
