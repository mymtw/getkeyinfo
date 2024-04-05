package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11463z;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$editAddress$1$2 */
final class AddressDetailViewModel$editAddress$1$2 extends Lambda implements C19857l<C11463z.C11468e, C19394m> {
    public final /* synthetic */ AddressDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailViewModel$editAddress$1$2(AddressDetailViewModel addressDetailViewModel) {
        super(1);
        this.this$0 = addressDetailViewModel;
    }

    public final void invoke(C11463z.C11468e eVar) {
        C19383o.m32797g(eVar, "it");
        this.this$0.f25054f.postValue(new AddressDetailViewModel.C11361a.C11365d(eVar.f25315a));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11463z.C11468e) obj);
        return C19394m.f43287a;
    }
}
