package com.etsy.android.p327ui.user;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.SettingsFragment$menuAdapter$2 */
public final class SettingsFragment$menuAdapter$2 extends Lambda implements C19846a<C11491c0> {
    public final /* synthetic */ SettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$menuAdapter$2(SettingsFragment settingsFragment) {
        super(0);
        this.this$0 = settingsFragment;
    }

    public final C11491c0 invoke() {
        final SettingsFragment settingsFragment = this.this$0;
        return new C11491c0(new C19857l<C11489b0, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C11489b0) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C11489b0 b0Var) {
                C19383o.m32797g(b0Var, "settingsItem");
                settingsFragment.onClick(b0Var);
            }
        });
    }
}
