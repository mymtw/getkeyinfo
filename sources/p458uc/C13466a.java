package p458uc;

import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12741o;
import p428qc.C13294e;

/* renamed from: uc.a */
public final class C13466a implements C12729e {

    /* renamed from: a */
    public final C12741o f29488a;

    /* renamed from: b */
    public final C13294e f29489b;

    public C13466a(C12741o oVar, C13294e eVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(eVar, "homeScreenEventManager");
        this.f29488a = oVar;
        this.f29489b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r2 = r2.f19029a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p350fe.C12731g mo30554a(p350fe.C12730f r11) {
        /*
            r10 = this;
            fe.o r0 = r10.f29488a
            android.net.Uri r1 = r11.f28049b
            r0.getClass()
            java.lang.String r0 = "token"
            java.lang.String r0 = p350fe.C12741o.m20404d(r1, r0)
            fe.o r1 = r10.f29488a
            android.net.Uri r2 = r11.f28049b
            r1.getClass()
            java.lang.String r1 = "signature"
            java.lang.String r1 = p350fe.C12741o.m20404d(r2, r1)
            com.etsy.android.lib.deeplinks.BranchParams r2 = r11.f28052e
            if (r2 == 0) goto L_0x0027
            java.lang.Boolean r2 = r2.f19029a
            if (r2 == 0) goto L_0x0027
            boolean r2 = r2.booleanValue()
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x005d
            boolean r2 = p628nj.C18263b.m30839d0(r0)
            if (r2 == 0) goto L_0x005d
            boolean r2 = p628nj.C18263b.m30839d0(r1)
            if (r2 == 0) goto L_0x005d
            qc.e r2 = r10.f29489b
            com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimSpec r3 = new com.etsy.android.ui.homescreen.purchaseclaim.PurchaseClaimSpec
            r3.<init>(r0, r1)
            r2.getClass()
            io.reactivex.subjects.a<qc.d> r0 = r2.f29197a
            qc.d$d r1 = new qc.d$d
            r1.<init>(r3)
            r0.onNext(r1)
            com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.HomePagerKey
            java.lang.String r5 = r11.f28050c
            android.os.Bundle r6 = r11.f28051d
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            fe.g$b r11 = new fe.g$b
            r11.<init>(r0)
            goto L_0x0079
        L_0x005d:
            fe.g$a r0 = new fe.g$a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Missing required claim info "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = ".uri"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            r11 = r0
        L_0x0079:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p458uc.C13466a.mo30554a(fe.f):fe.g");
    }
}
