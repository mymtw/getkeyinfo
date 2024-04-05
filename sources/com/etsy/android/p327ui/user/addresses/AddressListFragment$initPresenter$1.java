package com.etsy.android.p327ui.user.addresses;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListFragment$initPresenter$1 */
public /* synthetic */ class AddressListFragment$initPresenter$1 extends FunctionReferenceImpl implements C19857l<AddressItemUI, C19394m> {
    public AddressListFragment$initPresenter$1(Object obj) {
        super(1, obj, AddressListFragment.class, "onEditAddress", "onEditAddress(Lcom/etsy/android/ui/user/addresses/AddressItemUI;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AddressItemUI) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AddressItemUI addressItemUI) {
        C19383o.m32797g(addressItemUI, "p0");
        ((AddressListFragment) this.receiver).onEditAddress(addressItemUI);
    }
}
