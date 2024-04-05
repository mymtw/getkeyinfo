package p428qc;

import android.net.Uri;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p428qc.C13286d;
import p628nj.C18263b;

/* renamed from: qc.a */
public final class C13282a implements C12729e {

    /* renamed from: a */
    public final C12741o f29189a;

    /* renamed from: b */
    public final C13294e f29190b;

    public C13282a(C12741o oVar, C13294e eVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(eVar, "homeScreenEventManager");
        this.f29189a = oVar;
        this.f29190b = eVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12741o oVar = this.f29189a;
        Uri uri = fVar.f28049b;
        oVar.getClass();
        String d = C12741o.m20404d(uri, "coupon-name");
        if (C18263b.m30839d0(d)) {
            C13294e eVar = this.f29190b;
            eVar.getClass();
            C19383o.m32797g(d, "couponCode");
            eVar.f29199c = d;
            eVar.f29197a.onNext(new C13286d.C13288b(d));
            return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, false, 4, (DefaultConstructorMarker) null));
        }
        return new C12731g.C12732a("Invalid Etsy coupon code " + fVar + ".uri");
    }
}
