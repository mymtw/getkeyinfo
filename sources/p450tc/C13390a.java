package p450tc;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ExploreKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p350fe.C12729e;
import p350fe.C12730f;
import p350fe.C12731g;
import p350fe.C12741o;

/* renamed from: tc.a */
public final class C13390a implements C12729e {

    /* renamed from: a */
    public final C12741o f29322a;

    public C13390a(C12741o oVar) {
        C19383o.m32797g(oVar, "routeInspector");
        this.f29322a = oVar;
    }

    /* renamed from: a */
    public final C12731g mo30554a(C12730f fVar) {
        Uri uri = fVar.f28049b;
        String str = fVar.f28050c;
        Bundle bundle = fVar.f28051d;
        this.f29322a.getClass();
        String d = C12741o.m20404d(uri, ResponseConstants.PAGE_TYPE);
        boolean b = this.f29322a.mo45509b(uri, DeepLinkEntity.CYBER_WEEK_SALES.getEntityName());
        if (b) {
            this.f29322a.getClass();
            String queryParameter = uri.getQueryParameter("title");
            this.f29322a.getClass();
            return new C12731g.C12733b(new ExploreKey(str, queryParameter, "/etsyapps/v3/bespoke/public/boe/seasonal-sale/cyber-week", uri.getQueryParameter(ResponseConstants.EVENT_NAME), bundle));
        } else if (!C19383o.m32792b(d, "explore") && !C19383o.m32792b(d, "discover") && !b) {
            return new C12731g.C12733b(new HomePagerKey(str, bundle, false, 4, (DefaultConstructorMarker) null));
        } else {
            this.f29322a.getClass();
            String queryParameter2 = uri.getQueryParameter("title");
            this.f29322a.getClass();
            String queryParameter3 = uri.getQueryParameter(ResponseConstants.API_PATH);
            if (queryParameter3 == null || queryParameter3.length() == 0) {
                return new C12731g.C12732a(C0073e.m206f("Invalid api path ", uri));
            }
            try {
                String decode = URLDecoder.decode(queryParameter3, "UTF-8");
                this.f29322a.getClass();
                return new C12731g.C12733b(new ExploreKey(str, queryParameter2, decode, uri.getQueryParameter(ResponseConstants.EVENT_NAME), bundle));
            } catch (UnsupportedEncodingException unused) {
                return new C12731g.C12732a(C0073e.m206f("Couldn't decode api path ", uri));
            }
        }
    }
}
