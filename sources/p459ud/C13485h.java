package p459ud;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.sdl.ListSection;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.sdl.C10716b;
import java.lang.ref.WeakReference;
import java.util.Queue;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: ud.h */
public final class C13485h extends C10424k {

    /* renamed from: b */
    public final C10716b f29516b;

    /* renamed from: c */
    public ListSection f29517c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13485h(ViewGroup viewGroup, C13483f fVar, WeakReference<Queue<View>> weakReference) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_recommendations_sdl, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(fVar, "dependencies");
        View findViewById = this.itemView.findViewById(R.id.list_recommendations);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.list_recommendations)");
        ListingFragment listingFragment = fVar.f29509e.get();
        C19383o.m32794d(listingFragment);
        ListingFragment listingFragment2 = listingFragment;
        C10716b.C10718b bVar = fVar.f29505a;
        C8703p analyticsContext = listingFragment2.getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "fragInstance.analyticsContext");
        this.f29516b = bVar.mo35631a(listingFragment2, analyticsContext, (RecyclerView) findViewById, fVar.f29507c, fVar.f29508d, new C13482e(fVar), weakReference);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C13481d) {
            C13481d dVar = (C13481d) jVar;
            if (!C19383o.m32792b(dVar.f29503a, this.f29517c)) {
                ListSection listSection = dVar.f29503a;
                this.f29517c = listSection;
                this.f29516b.mo35630a(C17782b.m29864d0(listSection));
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }
}
