package com.etsy.android.p327ui.user.addresses;

import androidx.compose.animation.C0472h;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListPresenter$findEtsyCountryForLocale$1 */
final class AddressListPresenter$findEtsyCountryForLocale$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ AddressListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListPresenter$findEtsyCountryForLocale$1(AddressListPresenter addressListPresenter) {
        super(1);
        this.this$0 = addressListPresenter;
    }

    public final void invoke(Throwable th) {
        C0472h.m1248k(th, "it", th);
        C11452u uVar = this.this$0.f25093b;
        if (uVar != null) {
            uVar.showErrorState();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
