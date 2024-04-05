package p040c9;

import androidx.activity.C0114h;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.network.C8806q;
import com.etsy.android.lib.requests.apiv3.SearchSuggestionsEndpoint;
import com.etsy.android.lib.useraction.C8869d;
import com.etsy.android.lib.useraction.UserActionRoomDatabase;
import com.etsy.android.p327ui.home.landingpage.C10022d;
import com.etsy.android.p327ui.user.purchases.C11652j;
import com.etsy.android.search.C8970b;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p373ja.C12969c;
import p405nc.C13110a;
import p409o9.C13121c;
import p514bk.C14088a;
import p568fn.C17782b;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: c9.q */
public final class C4672q implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10496a;

    /* renamed from: b */
    public final C19011a f10497b;

    /* renamed from: c */
    public final Object f10498c;

    public /* synthetic */ C4672q(Object obj, C19011a aVar, int i) {
        this.f10496a = i;
        this.f10498c = obj;
        this.f10497b = aVar;
    }

    public final Object get() {
        switch (this.f10496a) {
            case 0:
                ((C4479c) this.f10498c).getClass();
                return new C8806q((C8618c) this.f10497b.get());
            case 1:
                C8731g gVar = (C8731g) this.f10497b.get();
                ((C13110a) this.f10498c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C13121c.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…nfigEndpoint::class.java)");
                return (C13121c) b;
            case 2:
                C8731g gVar2 = (C8731g) this.f10497b.get();
                ((C18263b) this.f10498c).getClass();
                C19383o.m32797g(gVar2, "retrofit");
                Object b2 = gVar2.f19177a.mo74387b(C12969c.class);
                C19383o.m32796f(b2, "retrofit.v3moshiRetrofit…tampEndpoint::class.java)");
                return (C12969c) b2;
            case 3:
                UserActionRoomDatabase userActionRoomDatabase = (UserActionRoomDatabase) this.f10497b.get();
                ((C19543e0) this.f10498c).getClass();
                C19383o.m32797g(userActionRoomDatabase, "database");
                C8869d o = userActionRoomDatabase.mo30439o();
                C17782b.m29841G(o);
                return o;
            case 4:
                C8731g gVar3 = (C8731g) this.f10497b.get();
                ((C15588c1) this.f10498c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b3 = gVar3.f19177a.mo74387b(C8970b.class);
                C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…iantEndpoint::class.java)");
                return (C8970b) b3;
            case 5:
                C8731g gVar4 = (C8731g) this.f10497b.get();
                ((C0114h) this.f10498c).getClass();
                C19383o.m32797g(gVar4, "retrofit");
                Object b4 = gVar4.f19177a.mo74387b(C11652j.class);
                C19383o.m32796f(b4, "retrofit.v3moshiRetrofit…asesEndpoint::class.java)");
                return (C11652j) b4;
            case 6:
                C8731g gVar5 = (C8731g) this.f10497b.get();
                ((C14088a) this.f10498c).getClass();
                C19383o.m32797g(gVar5, "configuredV3MoshiRetrofit");
                Object b5 = gVar5.f19177a.mo74387b(C10022d.class);
                C19383o.m32796f(b5, "configuredV3MoshiRetrofi…uestEndpoint::class.java)");
                return (C10022d) b5;
            default:
                C8731g gVar6 = (C8731g) this.f10497b.get();
                ((C0005b) this.f10498c).getClass();
                C19383o.m32797g(gVar6, "retrofit");
                Object b6 = gVar6.f19177a.mo74387b(SearchSuggestionsEndpoint.class);
                C19383o.m32796f(b6, "retrofit.v3moshiRetrofit…ionsEndpoint::class.java)");
                return (SearchSuggestionsEndpoint) b6;
        }
    }
}
