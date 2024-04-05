package p277w8;

import android.content.Context;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8728d0;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p072ad.impressions.AdImpressionLog;
import com.etsy.android.p327ui.cart.C9241a;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.conversation.list.ccm.C9578b;
import com.etsy.android.p327ui.core.C9621i;
import com.etsy.android.p327ui.favorites.C9851f;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p388lb.C13006a;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: w8.l */
public final class C8274l implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18136a;

    /* renamed from: b */
    public final C19011a f18137b;

    /* renamed from: c */
    public final Object f18138c;

    public C8274l(C19011a aVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f18136a = 3;
        this.f18137b = aVar;
        this.f18138c = gVar;
    }

    public final Object get() {
        switch (this.f18136a) {
            case 0:
                C17414y yVar = (C17414y) this.f18137b.get();
                ((C13006a) this.f18138c).getClass();
                C19383o.m32797g(yVar, "moshi");
                return yVar.mo68556a(AdImpressionLog.class);
            case 1:
                Context context = (Context) this.f18137b.get();
                ((C15588c1) this.f18138c).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                return new C8728d0(context);
            case 2:
                C8731g gVar = (C8731g) this.f18137b.get();
                ((C15562d) this.f18138c).getClass();
                C19383o.m32797g(gVar, "configuredRetrofit");
                Object b = gVar.f19177a.mo74387b(C9621i.class);
                C19383o.m32796f(b, "configuredRetrofit.v3mos…tingEndpoint::class.java)");
                return (C9621i) b;
            case 3:
                return new CartBadgeCountRepo((C9241a) this.f18137b.get(), (C13461f) ((C19011a) this.f18138c).get());
            case 4:
                C8731g gVar2 = (C8731g) this.f18137b.get();
                ((C19388s) this.f18138c).getClass();
                C19383o.m32797g(gVar2, "configuredRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C9578b.class);
                C19383o.m32796f(b2, "configuredRetrofit.v3mos…ListEndpoint::class.java)");
                return (C9578b) b2;
            default:
                C8731g gVar3 = (C8731g) this.f18137b.get();
                ((C1993m) this.f18138c).getClass();
                C19383o.m32797g(gVar3, "moshiRetrofit");
                Object b3 = gVar3.f19177a.mo74387b(C9851f.class);
                C19383o.m32796f(b3, "moshiRetrofit.v3moshiRet…tionEndpoint::class.java)");
                return (C9851f) b3;
        }
    }

    public /* synthetic */ C8274l(Object obj, C19011a aVar, int i) {
        this.f18136a = i;
        this.f18138c = obj;
        this.f18137b = aVar;
    }
}
