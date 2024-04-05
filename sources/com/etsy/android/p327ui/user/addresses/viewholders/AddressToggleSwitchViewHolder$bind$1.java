package com.etsy.android.p327ui.user.addresses.viewholders;

import android.view.View;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressToggleSwitchViewHolder$bind$1 */
public final class AddressToggleSwitchViewHolder$bind$1 extends Lambda implements C19861p<View, Boolean, C19394m> {
    public final /* synthetic */ C11396e $item;
    public final /* synthetic */ AddressToggleSwitchViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressToggleSwitchViewHolder$bind$1(AddressToggleSwitchViewHolder addressToggleSwitchViewHolder, C11396e eVar) {
        super(2);
        this.this$0 = addressToggleSwitchViewHolder;
        this.$item = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(View view, boolean z) {
        C19383o.m32797g(view, "<anonymous parameter 0>");
        this.this$0.f25278b.invoke(new C11430n.C11433c(this.$item, z));
    }
}
