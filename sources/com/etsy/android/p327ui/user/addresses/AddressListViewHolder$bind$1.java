package com.etsy.android.p327ui.user.addresses;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListViewHolder$bind$1 */
final class AddressListViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ AddressItemUI $address;
    public final /* synthetic */ C19857l<AddressItemUI, C19394m> $onEditAddress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListViewHolder$bind$1(C19857l<? super AddressItemUI, C19394m> lVar, AddressItemUI addressItemUI) {
        super(1);
        this.$onEditAddress = lVar;
        this.$address = addressItemUI;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$onEditAddress.invoke(this.$address);
    }
}
