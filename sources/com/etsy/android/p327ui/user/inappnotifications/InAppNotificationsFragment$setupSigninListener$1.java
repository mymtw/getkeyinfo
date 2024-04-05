package com.etsy.android.p327ui.user.inappnotifications;

import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.InAppNotificationsFragment$setupSigninListener$1 */
public final class InAppNotificationsFragment$setupSigninListener$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ InAppNotificationsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppNotificationsFragment$setupSigninListener$1(InAppNotificationsFragment inAppNotificationsFragment) {
        super(1);
        this.this$0 = inAppNotificationsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Boolean bool) {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            InAppNotificationsFragment inAppNotificationsFragment = this.this$0;
            C19383o.m32796f(bool, "signedIn");
            if (bool.booleanValue()) {
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                C19383o.m32796f(layoutInflater, "it.layoutInflater");
                inAppNotificationsFragment.setEmptyView(inAppNotificationsFragment.getEmptyView(layoutInflater));
                inAppNotificationsFragment.loadContent();
                return;
            }
            LayoutInflater layoutInflater2 = activity.getLayoutInflater();
            C19383o.m32796f(layoutInflater2, "it.layoutInflater");
            inAppNotificationsFragment.setEmptyView(inAppNotificationsFragment.getEmptyView(layoutInflater2));
            inAppNotificationsFragment.showEmptyView();
        }
    }
}
