package p436rc;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ExploreKey;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;
import p628nj.C18263b;

/* renamed from: rc.a */
public final class C13353a implements C12729e {

    /* renamed from: a */
    public final C12741o f29276a;

    public C13353a(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f29276a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        String e = this.f29276a.mo45510e(fVar.f28049b, DeepLinkEntity.FEATURED_HUB.getEntityName());
        if (C18263b.m30839d0(e)) {
            return new C12731g.C12733b(new ExploreKey(fVar.f28050c, (String) null, C0048b.m163a("/etsyapps/v3/bespoke/member/contentful-page/", e, "/modules"), C0326j.m864i("featured_hub_", e), fVar.f28051d));
        }
        return new C12731g.C12732a("Missing slug " + fVar + ".uri");
    }
}
