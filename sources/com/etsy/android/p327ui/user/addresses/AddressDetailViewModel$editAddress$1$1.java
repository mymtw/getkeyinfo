package com.etsy.android.p327ui.user.addresses;

import androidx.compose.animation.C0472h;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$editAddress$1$1 */
final class AddressDetailViewModel$editAddress$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ AddressDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailViewModel$editAddress$1$1(AddressDetailViewModel addressDetailViewModel) {
        super(1);
        this.this$0 = addressDetailViewModel;
    }

    public final void invoke(Throwable th) {
        C0472h.m1248k(th, "it", th);
        this.this$0.f25052d.mo45474a("addresses.edit_address_failure");
        this.this$0.f25054f.postValue(AddressDetailViewModel.C11361a.C11364c.f25063a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
