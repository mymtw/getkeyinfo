package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.apiv3.addresses.AddressValidationError;
import com.etsy.android.lib.models.apiv3.addresses.UserAddress;
import com.etsy.android.lib.network.oauth2.C8751d0;
import com.etsy.android.lib.useraction.C8868c;
import com.etsy.android.p327ui.shop.C11307x0;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p402n9.C13086f;
import p425q9.C13260k;
import p425q9.C13262m;
import p470w9.C13793a;
import p591im.C17868b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.addresses.c0 */
public final class C11393c0 {

    /* renamed from: a */
    public final C11391b0 f25121a;

    public C11393c0(C11391b0 b0Var) {
        C19383o.m32797g(b0Var, "addressesEndpoint");
        this.f25121a = b0Var;
    }

    /* renamed from: a */
    public final C19208j mo37264a(C11381a0 a0Var) {
        C19383o.m32797g(a0Var, "specs");
        if (C19383o.m32792b(a0Var, C11381a0.C11385d.f25113a)) {
            C8071s<C20145v<C19928a0>> a = this.f25121a.mo37255a();
            C13260k kVar = new C13260k(7);
            a.getClass();
            return new C19208j(a, kVar);
        } else if (C19383o.m32792b(a0Var, C11381a0.C11384c.f25112a)) {
            C8071s<List<UserAddress>> g = this.f25121a.mo37261g();
            C13086f fVar = new C13086f(3);
            g.getClass();
            return new C19208j(g, fVar);
        } else if (a0Var instanceof C11381a0.C11386e) {
            C8071s<AddressDetailsLayoutResponse> h = this.f25121a.mo37262h(((C11381a0.C11386e) a0Var).f25114a);
            C8751d0 d0Var = new C8751d0(1);
            h.getClass();
            return new C19208j(h, d0Var);
        } else if (a0Var instanceof C11381a0.C11382a) {
            C8071s<C20145v<C19928a0>> e = this.f25121a.mo37259e(((C11381a0.C11382a) a0Var).f25109a);
            C13793a aVar = new C13793a(5);
            e.getClass();
            return new C19208j(e, aVar);
        } else if (a0Var instanceof C11381a0.C11387f) {
            C8071s<UserAddress> d = this.f25121a.mo37258d(C15588c1.m25351v(((C11381a0.C11387f) a0Var).f25115a));
            C8868c cVar = new C8868c(3);
            d.getClass();
            return new C19208j(d, cVar);
        } else if (a0Var instanceof C11381a0.C11389h) {
            C11462y yVar = ((C11381a0.C11389h) a0Var).f25118a;
            C8071s<List<AddressValidationError>> f = this.f25121a.mo37260f(C19294b0.m32563t0(new Pair("address[country_id]", String.valueOf(yVar.f25307g)), new Pair("address[first_line]", yVar.f25302b), new Pair("address[city]", yVar.f25304d), new Pair("address[state]", yVar.f25305e), new Pair("address[zip]", yVar.f25306f), new Pair("address[is_default_shipping]", String.valueOf(yVar.f25309i)), new Pair("address[name]", yVar.f25301a), new Pair("address[second_line]", yVar.f25303c), new Pair("address[verification_state]", String.valueOf(yVar.f25310j)), new Pair("address[phone]", String.valueOf(yVar.f25308h))));
            C13262m mVar = new C13262m(3);
            f.getClass();
            return new C19208j(f, mVar);
        } else if (a0Var instanceof C11381a0.C11388g) {
            C11381a0.C11388g gVar = (C11381a0.C11388g) a0Var;
            C8071s<List<PostalCodeSuggestion>> c = this.f25121a.mo37257c(gVar.f25117b, gVar.f25116a);
            C17868b bVar = new C17868b(3);
            c.getClass();
            return new C19208j(c, bVar);
        } else if (a0Var instanceof C11381a0.C11383b) {
            C11381a0.C11383b bVar2 = (C11381a0.C11383b) a0Var;
            long j = bVar2.f25110a;
            C8071s<UserAddress> b = this.f25121a.mo37256b(Long.valueOf(j), C15588c1.m25351v(bVar2.f25111b));
            C11307x0 x0Var = new C11307x0(2);
            b.getClass();
            return new C19208j(b, x0Var);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
