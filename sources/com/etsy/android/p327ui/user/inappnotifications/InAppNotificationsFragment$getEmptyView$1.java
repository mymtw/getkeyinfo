package com.etsy.android.p327ui.user.inappnotifications;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.deeplinks.EtsyAction;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p356ge.C12790b;
import p370ie.C12948h;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.InAppNotificationsFragment$getEmptyView$1 */
public final class InAppNotificationsFragment$getEmptyView$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationsFragment$getEmptyView$1(InAppNotificationsFragment inAppNotificationsFragment) {
        super(1);
        this.this$0 = inAppNotificationsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        InAppNotificationsFragment inAppNotificationsFragment = this.this$0;
        C12790b.m20430b(inAppNotificationsFragment, new C12948h(C12790b.m20432d(inAppNotificationsFragment), (EtsyAction) null, (Bundle) null, (String) null, (String) null, (String) null, 62));
    }
}
