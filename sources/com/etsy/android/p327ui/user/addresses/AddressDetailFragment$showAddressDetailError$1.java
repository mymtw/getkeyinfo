package com.etsy.android.p327ui.user.addresses;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailFragment$showAddressDetailError$1 */
public final class AddressDetailFragment$showAddressDetailError$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ AddressDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailFragment$showAddressDetailError$1(AddressDetailFragment addressDetailFragment) {
        super(1);
        this.this$0 = addressDetailFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getPresenter().mo37269a(this.this$0.getArguments());
    }
}
