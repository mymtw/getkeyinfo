package p428qc;

import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p428qc.C13286d;

/* renamed from: qc.g */
public final class C13297g implements C12729e {

    /* renamed from: a */
    public final C12741o f29202a;

    /* renamed from: b */
    public final C13294e f29203b;

    public C13297g(C12741o oVar, C13294e eVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(eVar, "homeEventManager");
        this.f29202a = oVar;
        this.f29203b = eVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        if (this.f29202a.mo45509b(fVar.f28049b, "reengage_sweeps_v1")) {
            this.f29203b.f29197a.onNext(C13286d.C13291e.f29194a);
            return new C12731g.C12733b(new HomePagerKey(fVar.f28050c, fVar.f28051d, false, 4, (DefaultConstructorMarker) null));
        }
        return new C12731g.C12732a("Unknown sweepstakes " + fVar + ".uri");
    }
}
