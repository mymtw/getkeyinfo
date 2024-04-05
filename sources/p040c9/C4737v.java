package p040c9;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.search.redirect.C10926b;
import com.etsy.android.util.C12066w;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.v */
public final class C4737v implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10701a;

    /* renamed from: b */
    public final C19011a f10702b;

    /* renamed from: c */
    public final Object f10703c;

    public /* synthetic */ C4737v(Object obj, C17555d dVar, int i) {
        this.f10701a = i;
        this.f10703c = obj;
        this.f10702b = dVar;
    }

    public final Object get() {
        switch (this.f10701a) {
            case 0:
                ((C4479c) this.f10703c).getClass();
                C8672b analyticsTracker = ((BOEApplication) this.f10702b.get()).getAnalyticsTracker();
                C17782b.m29841G(analyticsTracker);
                return analyticsTracker;
            case 1:
                C8731g gVar = (C8731g) this.f10702b.get();
                ((C19421p) this.f10703c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C10926b.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…PageEndpoint::class.java)");
                return (C10926b) b;
            default:
                C8731g gVar2 = (C8731g) this.f10702b.get();
                ((C0761x) this.f10703c).getClass();
                C19383o.m32797g(gVar2, "retrofit");
                Object b2 = gVar2.f19177a.mo74387b(C12066w.class);
                C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…rUidEndpoint::class.java)");
                return (C12066w) b2;
        }
    }
}
