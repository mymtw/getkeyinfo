package p489yc;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8692f;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p461uf.C13511h;
import p466vc.C13574d;

/* renamed from: yc.a */
public final class C13902a {

    /* renamed from: a */
    public final C13903b f30565a;

    public C13902a(C13903b bVar) {
        C19383o.m32797g(bVar, "facebookTrackingForListingScreen");
        this.f30565a = bVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo46721a(ListingViewState.C10092d dVar) {
        Long l = dVar.mo33484l();
        String l2 = l != null ? l.toString() : null;
        if (l2 == null) {
            l2 = "";
        }
        String valueOf = String.valueOf(dVar.mo33477f());
        this.f30565a.getClass();
        C19383o.m32797g(valueOf, "listingId");
        C8692f.f19096a.getClass();
        if (C8692f.m17099a()) {
            Bundle bundle = new Bundle();
            bundle.putString("fb_content_type", "product");
            bundle.putString("fb_content_id", l2 + ClassUtils.PACKAGE_SEPARATOR_CHAR + valueOf);
            EtsyApplication etsyApplication = EtsyApplication.get();
            C19383o.m32796f(etsyApplication, "get()");
            new C13511h((Context) etsyApplication, (String) null).mo46168d(bundle, "fb_mobile_content_view");
        }
        return C13574d.C13575a.f29662a;
    }
}
