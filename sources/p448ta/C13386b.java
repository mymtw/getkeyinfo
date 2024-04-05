package p448ta;

import android.content.Context;
import androidx.activity.C0114h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.selfuser.C8850a;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.ConversationDatabase;
import com.etsy.android.p327ui.favorites.add.C9770k;
import com.etsy.android.search.C8969a;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.appupdate.C15560b;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.appupdate.C15563e;
import com.google.android.play.core.appupdate.C15567i;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p422pe.C13227f;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: ta.b */
public final class C13386b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f29315a;

    /* renamed from: b */
    public final C19011a f29316b;

    /* renamed from: c */
    public final Object f29317c;

    public /* synthetic */ C13386b(Object obj, C19011a aVar, int i) {
        this.f29315a = i;
        this.f29317c = obj;
        this.f29316b = aVar;
    }

    /* renamed from: a */
    public static C15560b m21075a(C15588c1 c1Var, Context context) {
        C15563e eVar;
        c1Var.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        synchronized (C15562d.class) {
            if (C15562d.f35017b == null) {
                C15032m3 m3Var = new C15032m3();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                C15567i iVar = new C15567i(context, 0);
                m3Var.f33680b = iVar;
                C15562d.f35017b = new C15563e(iVar);
            }
            eVar = C15562d.f35017b;
        }
        C15560b bVar = (C15560b) eVar.f35028a.zza();
        C19383o.m32796f(bVar, "create(context)");
        return bVar;
    }

    public final Object get() {
        switch (this.f29315a) {
            case 0:
                C8731g gVar = (C8731g) this.f29316b.get();
                ((C7279a) this.f29317c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C13385a.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…nMapEndpoint::class.java)");
                return (C13385a) b;
            case 1:
                C8731g gVar2 = (C8731g) this.f29316b.get();
                ((C19388s) this.f29317c).getClass();
                C19383o.m32797g(gVar2, "retrofit");
                C8850a aVar = (C8850a) gVar2.f19177a.mo74387b(C8850a.class);
                C17782b.m29841G(aVar);
                return aVar;
            case 2:
                C8731g gVar3 = (C8731g) this.f29316b.get();
                ((C15588c1) this.f29317c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b2 = gVar3.f19177a.mo74387b(C8969a.class);
                C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…gestEndpoint::class.java)");
                return (C8969a) b2;
            case 3:
                ConversationDatabase conversationDatabase = (ConversationDatabase) this.f29316b.get();
                ((C19421p) this.f29317c).getClass();
                C19383o.m32797g(conversationDatabase, "database");
                C9477c o = conversationDatabase.mo31954o();
                C17782b.m29841G(o);
                return o;
            case 4:
                C8731g gVar4 = (C8731g) this.f29316b.get();
                ((C0114h) this.f29317c).getClass();
                C19383o.m32797g(gVar4, "configuredRetrofit");
                Object b3 = gVar4.f19177a.mo74387b(C9770k.class);
                C19383o.m32796f(b3, "configuredRetrofit.v3mos…ionsEndpoint::class.java)");
                return (C9770k) b3;
            case 5:
                C8731g gVar5 = (C8731g) this.f29316b.get();
                ((C19421p) this.f29317c).getClass();
                C19383o.m32797g(gVar5, "configuredRetrofit");
                Object b4 = gVar5.f19177a.mo74387b(C13227f.class);
                C19383o.m32796f(b4, "configuredRetrofit.v3mos…ionsEndpoint::class.java)");
                return (C13227f) b4;
            default:
                return m21075a((C15588c1) this.f29317c, (Context) this.f29316b.get());
        }
    }
}
