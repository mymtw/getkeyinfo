package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.g */
public final class C10535g {

    /* renamed from: a */
    public final C13573c f23106a;

    public C10535g(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23106a = cVar;
    }

    /* renamed from: a */
    public final C13574d mo34119a(ListingViewState.C10092d dVar) {
        this.f23106a.mo38043a(new C13597g.C13637f3(true));
        Iterator it = dVar.mo33485m().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((C10423j) it.next()) instanceof C10521a) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return C13574d.C13575a.f29662a;
        }
        if (i > 0) {
            i--;
        }
        return new C13574d.C13576b.C13587k(i);
    }
}
