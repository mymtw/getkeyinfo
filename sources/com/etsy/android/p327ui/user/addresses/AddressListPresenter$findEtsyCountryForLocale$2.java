package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.p327ui.user.addresses.C11410f0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListPresenter$findEtsyCountryForLocale$2 */
final class AddressListPresenter$findEtsyCountryForLocale$2 extends Lambda implements C19857l<C11410f0, C19394m> {
    public final /* synthetic */ AddressListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListPresenter$findEtsyCountryForLocale$2(AddressListPresenter addressListPresenter) {
        super(1);
        this.this$0 = addressListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11410f0) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11410f0 f0Var) {
        C11452u uVar;
        if (f0Var instanceof C11410f0.C11412b) {
            C11452u uVar2 = this.this$0.f25093b;
            if (uVar2 != null) {
                uVar2.showLoader();
            }
        } else if (f0Var instanceof C11410f0.C11413c) {
            AddressListPresenter addressListPresenter = this.this$0;
            C11452u uVar3 = addressListPresenter.f25093b;
            if (uVar3 != null) {
                uVar3.onAddNewAddress(((C11410f0.C11413c) f0Var).f25152a, addressListPresenter.f25096e);
            }
        } else if ((f0Var instanceof C11410f0.C11411a) && (uVar = this.this$0.f25093b) != null) {
            uVar.showErrorState();
        }
    }
}
