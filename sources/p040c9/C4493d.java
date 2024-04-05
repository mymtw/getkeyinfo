package p040c9;

import android.app.Application;
import android.content.Context;
import com.etsy.android.p327ui.core.C9623k;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers.C10363g;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.button.C10449a;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.ProductWarningInfoAnalyticsHandler;
import com.etsy.android.p327ui.listing.screenshots.C10192c;
import com.etsy.android.p327ui.search.filters.refactor.C10812k;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersRepository;
import com.etsy.android.p327ui.user.addresses.C11391b0;
import com.etsy.android.p327ui.user.addresses.C11393c0;
import com.etsy.android.util.C12069z;
import dagger.internal.C17555d;
import p349fd.C12718b;
import p350fe.C12741o;
import p450tc.C13390a;
import p466vc.C13573c;
import p490yd.C13914b;
import p496za.C13943a;
import p514bk.C14088a;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.d */
public final class C4493d implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f9807a;

    /* renamed from: b */
    public final Object f9808b;

    public /* synthetic */ C4493d(Object obj, int i) {
        this.f9807a = i;
        this.f9808b = obj;
    }

    public final Object get() {
        switch (this.f9807a) {
            case 0:
                C12069z zVar = (C12069z) ((C19011a) this.f9808b).get();
                C17782b.m29841G(zVar);
                return zVar;
            case 1:
                return new C13943a((Context) ((C19011a) this.f9808b).get());
            case 2:
                return new C13390a((C12741o) ((C19011a) this.f9808b).get());
            case 3:
                return new C10192c((C13573c) ((C19011a) this.f9808b).get());
            case 4:
                return new C12718b((C13914b) ((C19011a) this.f9808b).get());
            case 5:
                return new C10363g((C13573c) ((C19011a) this.f9808b).get());
            case 6:
                return new C10449a((C13573c) ((C19011a) this.f9808b).get());
            case 7:
                return new ProductWarningInfoAnalyticsHandler((C13573c) ((C19011a) this.f9808b).get());
            case 8:
                return new C13914b((Application) ((C19011a) this.f9808b).get());
            case 9:
                return new SearchFiltersRepository((C10812k) ((C19011a) this.f9808b).get());
            case 10:
                return new C11393c0((C11391b0) ((C19011a) this.f9808b).get());
            default:
                ((C14088a) this.f9808b).getClass();
                return new C9623k();
        }
    }
}
