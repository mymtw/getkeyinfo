package com.etsy.android.p327ui.user.addresses;

import androidx.compose.animation.C0472h;
import com.etsy.android.p327ui.user.addresses.C11445t;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressListViewModel$loadAddresses$2 */
final class AddressListViewModel$loadAddresses$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C11460w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressListViewModel$loadAddresses$2(C11460w wVar) {
        super(1);
        this.this$0 = wVar;
    }

    public final void invoke(Throwable th) {
        C0472h.m1248k(th, "it", th);
        this.this$0.f25293e.mo45474a("addresses.load_addresses.failure");
        this.this$0.f25295g.onNext(C11445t.C11449d.f25268a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
