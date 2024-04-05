package p459ud;

import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.sdl.C10716b;
import com.etsy.android.p327ui.util.C11780h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;
import p466vc.C13573c;

/* renamed from: ud.f */
public final class C13483f {

    /* renamed from: a */
    public final C10716b.C10718b f29505a;

    /* renamed from: b */
    public final C13573c f29506b;

    /* renamed from: c */
    public final C11780h f29507c;

    /* renamed from: d */
    public final C13461f f29508d;

    /* renamed from: e */
    public final WeakReference<ListingFragment> f29509e;

    public C13483f(C10716b.C10718b bVar, C13573c cVar, ListingFragment listingFragment, C8703p pVar, C11780h hVar, C13461f fVar) {
        C19383o.m32797g(bVar, "sdlViewDelegateFactory");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(listingFragment, "listingFragment");
        C19383o.m32797g(pVar, "viewAnalyticsTracker");
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f29505a = bVar;
        this.f29506b = cVar;
        this.f29507c = hVar;
        this.f29508d = fVar;
        this.f29509e = new WeakReference<>(listingFragment);
    }
}
