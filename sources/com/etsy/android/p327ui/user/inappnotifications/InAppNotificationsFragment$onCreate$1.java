package com.etsy.android.p327ui.user.inappnotifications;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.InAppNotificationsFragment$onCreate$1 */
public final class InAppNotificationsFragment$onCreate$1 extends Lambda implements C19857l<C11564q, C19394m> {
    public final /* synthetic */ InAppNotificationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationsFragment$onCreate$1(InAppNotificationsFragment inAppNotificationsFragment) {
        super(1);
        this.this$0 = inAppNotificationsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11564q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11564q qVar) {
        C19383o.m32797g(qVar, "event");
        this.this$0.handleClick(qVar);
    }
}
