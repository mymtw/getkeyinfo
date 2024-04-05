package com.paypal.pyplcheckout.home.view;

import com.paypal.pyplcheckout.viewmodels.CancelViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BaseFragment$onOutsidePaysheetClick$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ BaseFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseFragment$onOutsidePaysheetClick$1(BaseFragment baseFragment) {
        super(0);
        this.this$0 = baseFragment;
    }

    public final void invoke() {
        CancelViewModel access$getCancelViewModel$p = this.this$0.cancelViewModel;
        if (access$getCancelViewModel$p != null) {
            String access$getTAG$cp = BaseFragment.TAG;
            C19383o.m32796f(access$getTAG$cp, "TAG");
            access$getCancelViewModel$p.cancelAction(access$getTAG$cp, "PaySheetActivity Pressed onScrim");
            return;
        }
        C19383o.m32805o("cancelViewModel");
        throw null;
    }
}
