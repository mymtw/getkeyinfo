package p444se;

import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: se.b */
public final class C13376b implements C12729e {

    /* renamed from: a */
    public final C12741o f29301a;

    public C13376b(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f29301a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        C12730f fVar2 = fVar;
        String e = this.f29301a.mo45510e(fVar2.f28049b, DeepLinkEntity.SHOP.getEntityName());
        if (!(e == null || e.length() == 0)) {
            return new C12731g.C12733b(new ShopHomeKey(fVar2.f28050c, (EtsyId) null, (ShopHomeConfig) null, (Map) null, (String) null, e, (EtsyId) null, true, (String) null, fVar2.f28051d, 350, (DefaultConstructorMarker) null));
        }
        return new C12731g.C12732a("Invalid shop name " + fVar2 + ".uri");
    }
}
