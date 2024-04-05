package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$getLayoutForCountry$1 */
public final class AddressDetailViewModel$getLayoutForCountry$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ AddressDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailViewModel$getLayoutForCountry$1(AddressDetailViewModel addressDetailViewModel) {
        super(1);
        this.this$0 = addressDetailViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f25052d.mo45474a("addresses_data_failure.android");
        this.this$0.f25054f.postValue(new AddressDetailViewModel.C11361a.C11366e(th));
    }
}
