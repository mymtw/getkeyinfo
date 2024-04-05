package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.network.oauth2.C8758h;
import com.etsy.android.p327ui.home.tabs.C10060j;
import com.etsy.android.p327ui.homescreen.C10074a;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p287xp.C8339g;
import p428qc.C13294e;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.tabs.n */
public final /* synthetic */ class C10068n implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f22186b;

    /* renamed from: c */
    public final /* synthetic */ Object f22187c;

    public /* synthetic */ C10068n(Object obj, int i) {
        this.f22186b = i;
        this.f22187c = obj;
    }

    public final Object apply(Object obj) {
        C8071s<C20145v<C19928a0>> sVar;
        switch (this.f22186b) {
            case 0:
                HomePagerViewModel homePagerViewModel = (HomePagerViewModel) this.f22187c;
                byte[] bArr = (byte[]) obj;
                C19383o.m32797g(homePagerViewModel, "this$0");
                C19383o.m32797g(bArr, "it");
                C10060j jVar = homePagerViewModel.f22117c;
                boolean z = homePagerViewModel.f22138x;
                C13294e eVar = homePagerViewModel.f22120f;
                boolean z2 = eVar.f29198b;
                String str = eVar.f29199c;
                boolean e = homePagerViewModel.f22122h.mo45960e();
                boolean b = homePagerViewModel.f22126l.mo21132b(C8592b.C8595c.f18861e);
                C10074a aVar = homePagerViewModel.f22120f.f29200d;
                Long valueOf = aVar != null ? Long.valueOf(aVar.f22203a) : null;
                C10074a aVar2 = homePagerViewModel.f22120f.f29200d;
                C10051a aVar3 = new C10051a(z, z2, str, bArr, e, b, valueOf, aVar2 != null ? aVar2.f22204b : null);
                jVar.getClass();
                int i = C10060j.C10061a.f22178a[(aVar3.f22142b ? RequestType.ADMIN_TABS : aVar3.f22145e ? RequestType.SIGNED_IN : RequestType.SIGNED_OUT).ordinal()];
                if (i == 1) {
                    sVar = jVar.f22176a.mo33356c(aVar3.mo33350a());
                } else if (i == 2) {
                    C10054d dVar = jVar.f22176a;
                    LinkedHashMap a = aVar3.mo33350a();
                    C20016y.C20017a aVar4 = C20016y.f44360a;
                    byte[] bArr2 = aVar3.f22144d;
                    C20002r.f44260f.getClass();
                    C20002r b2 = C20002r.C20003a.m34244b("application/json; charset=UTF-8");
                    int length = aVar3.f22144d.length;
                    aVar4.getClass();
                    sVar = dVar.mo33354a(a, C20016y.C20017a.m34282c(bArr2, b2, 0, length));
                } else if (i == 3) {
                    sVar = jVar.f22176a.mo33355b(aVar3.mo33350a());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C8758h hVar = new C8758h(jVar, 4);
                sVar.getClass();
                return new C19208j(sVar, hVar);
            default:
                EtsyConfigKey etsyConfigKey = (EtsyConfigKey) this.f22187c;
                C8618c cVar = (C8618c) obj;
                C19383o.m32797g(etsyConfigKey, "$brazeKillSwitchFlag");
                C19383o.m32797g(cVar, "configMap");
                return Boolean.valueOf(!cVar.mo21132b(etsyConfigKey));
        }
    }
}
