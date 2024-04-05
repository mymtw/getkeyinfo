package p394m9;

import android.content.Context;
import com.etsy.android.lib.network.C8727d;
import com.etsy.android.lib.network.oauth2.C8798x;
import com.etsy.android.lib.network.oauth2.signin.C8781i;
import com.etsy.android.lib.user.C8864c;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.C10506a;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10538j;
import com.etsy.android.p327ui.user.review.C11754w;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p342ed.C12682a;
import p342ed.C12683b;
import p350fe.C12741o;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: m9.b */
public final class C13027b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f28682a;

    /* renamed from: b */
    public final C19011a f28683b;

    public /* synthetic */ C13027b(C19011a aVar, int i) {
        this.f28682a = i;
        this.f28683b = aVar;
    }

    public final Object get() {
        switch (this.f28682a) {
            case 0:
                return new C13026a((C8781i) this.f28683b.get());
            case 1:
                C8727d dVar = (C8727d) this.f28683b.get();
                C19383o.m32797g(dVar, "retrofit");
                Object b = dVar.f19172a.mo74387b(C8798x.class);
                C19383o.m32796f(b, "retrofit.moshiOAuth2Retr…okenEndpoint::class.java)");
                return (C8798x) b;
            case 2:
                return new C8864c((Context) this.f28683b.get());
            case 3:
                return new C12683b((C12682a) this.f28683b.get());
            case 4:
                return new C10506a((C13573c) this.f28683b.get());
            case 5:
                return new C10538j((C13573c) this.f28683b.get());
            default:
                return new C11754w((C12741o) this.f28683b.get());
        }
    }
}
