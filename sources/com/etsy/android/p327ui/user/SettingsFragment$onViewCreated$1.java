package com.etsy.android.p327ui.user;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.SettingsFragment$onViewCreated$1 */
public final class SettingsFragment$onViewCreated$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ SettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$onViewCreated$1(SettingsFragment settingsFragment) {
        super(1);
        this.this$0 = settingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getSettingsViewModel().f25407b.mo45956a();
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
