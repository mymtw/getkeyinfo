package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.requests.apiv3.SearchHistoryEndpoint;
import com.etsy.android.lib.session.C8857c;
import com.etsy.android.p327ui.shop.C11305w0;
import com.etsy.android.search.AutoSuggestRepository;
import com.etsy.android.search.C8969a;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.x */
public final class C4763x implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10742a;

    /* renamed from: b */
    public final C19011a f10743b;

    /* renamed from: c */
    public final Object f10744c;

    public /* synthetic */ C4763x(Object obj, C19011a aVar, int i) {
        this.f10742a = i;
        this.f10744c = obj;
        this.f10743b = aVar;
    }

    public final Object get() {
        switch (this.f10742a) {
            case 0:
                ((C4479c) this.f10744c).getClass();
                C8857c cVar = (C8857c) ((C8731g) this.f10743b.get()).f19177a.mo74387b(C8857c.class);
                C17782b.m29841G(cVar);
                return cVar;
            case 1:
                C8969a aVar = (C8969a) this.f10743b.get();
                ((C15588c1) this.f10744c).getClass();
                C19383o.m32797g(aVar, "endpoint");
                return new AutoSuggestRepository(aVar);
            case 2:
                C8731g gVar = (C8731g) this.f10743b.get();
                ((C0005b) this.f10744c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(SearchHistoryEndpoint.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…toryEndpoint::class.java)");
                return (SearchHistoryEndpoint) b;
            default:
                C8731g gVar2 = (C8731g) this.f10743b.get();
                ((C19421p) this.f10744c).getClass();
                C19383o.m32797g(gVar2, "retrofit");
                Object b2 = gVar2.f19177a.mo74387b(C11305w0.class);
                C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…InfoEndpoint::class.java)");
                return (C11305w0) b2;
        }
    }
}
