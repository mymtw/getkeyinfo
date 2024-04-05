package p040c9;

import android.content.Context;
import androidx.activity.C0114h;
import androidx.room.C3259y;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.push.settings.C8844a;
import com.etsy.android.p327ui.home.tabs.C10054d;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsDatabase;
import com.etsy.android.p327ui.user.circles.C11507b;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p173m.C7279a;
import p418pa.C13195a;
import p475we.C13825a;
import p475we.C13826b;
import p568fn.C17782b;
import p610kp.C18161c;
import p740eq.C19011a;

/* renamed from: c9.w */
public final class C4750w implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10724a;

    /* renamed from: b */
    public final C19011a f10725b;

    /* renamed from: c */
    public final Object f10726c;

    public /* synthetic */ C4750w(Object obj, C19011a aVar, int i) {
        this.f10724a = i;
        this.f10726c = obj;
        this.f10725b = aVar;
    }

    public final Object get() {
        switch (this.f10724a) {
            case 0:
                ((C4479c) this.f10726c).getClass();
                C13195a aVar = (C13195a) ((C8731g) this.f10725b.get()).f19177a.mo74387b(C13195a.class);
                C17782b.m29841G(aVar);
                return aVar;
            case 1:
                C8731g gVar = (C8731g) this.f10725b.get();
                ((C18161c) this.f10726c).getClass();
                C19383o.m32797g(gVar, "configuredRetrofit");
                Object b = gVar.f19177a.mo74387b(C8844a.class);
                C19383o.m32796f(b, "configuredRetrofit.v3mos…ingsEndpoint::class.java)");
                return (C8844a) b;
            case 2:
                C8731g gVar2 = (C8731g) this.f10725b.get();
                ((C0114h) this.f10726c).getClass();
                C19383o.m32797g(gVar2, "v3MoshiRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C10054d.class);
                C19383o.m32796f(b2, "v3MoshiRetrofit.v3moshiR…agerEndpoint::class.java)");
                return (C10054d) b2;
            case 3:
                Context context = (Context) this.f10725b.get();
                ((C7279a) this.f10726c).getClass();
                C19383o.m32797g(context, ResponseConstants.CONTEXT);
                return C3259y.m7913a(context.getApplicationContext(), SearchImpressionsDatabase.class, "SearchImpressionsDB").mo11987b();
            case 4:
                C13826b bVar = (C13826b) this.f10725b.get();
                ((C15588c1) this.f10726c).getClass();
                C19383o.m32797g(bVar, "upgradePromptEligibility");
                return new C13825a(bVar);
            default:
                C8731g gVar3 = (C8731g) this.f10725b.get();
                ((C19543e0) this.f10726c).getClass();
                C19383o.m32797g(gVar3, "v3MoshiRetrofit");
                C11507b bVar2 = (C11507b) gVar3.f19177a.mo74387b(C11507b.class);
                C17782b.m29841G(bVar2);
                return bVar2;
        }
    }
}
