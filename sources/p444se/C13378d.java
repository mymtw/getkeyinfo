package p444se;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
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

/* renamed from: se.d */
public final class C13378d implements C12729e {

    /* renamed from: a */
    public final C12741o f29304a;

    public C13378d(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f29304a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        String str = fVar.f28050c;
        Bundle bundle = fVar.f28051d;
        String e = this.f29304a.mo45510e(uri, DeepLinkEntity.SHOP.getEntityName());
        return e == null || e.length() == 0 ? new C12731g.C12732a(C0073e.m206f("Invalid Shop ID: ", uri)) : new C12731g.C12733b(new ShopHomeKey(str, new EtsyId(e), ShopHomeConfig.REVIEWS, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, bundle, 504, (DefaultConstructorMarker) null));
    }
}
