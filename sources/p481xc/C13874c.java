package p481xc;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.EtsyAction;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: xc.c */
public final class C13874c {

    /* renamed from: a */
    public final C13573c f30535a;

    public C13874c(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f30535a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo46706a(C13597g.C13652h4 h4Var) {
        C19383o.m32797g(h4Var, "event");
        Bundle bundle = new Bundle();
        bundle.putString("listing_id", h4Var.f30141a);
        bundle.putString("url", h4Var.f30142b);
        this.f30535a.mo38043a(new C13597g.C13631e4(EtsyAction.REPORT_LISTING, (String) null, bundle, 2));
        return C13574d.C13575a.f29662a;
    }
}
