package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.p327ui.user.addresses.C11445t;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListViewModel$deleteAddress$1 */
final class AddressListViewModel$deleteAddress$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C11460w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListViewModel$deleteAddress$1(C11460w wVar) {
        super(1);
        this.this$0 = wVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f25293e.mo45474a("addresses.delete_address.failure");
        this.this$0.f25295g.onNext(new C11445t.C11446a(th));
        this.this$0.mo37317b();
    }
}
