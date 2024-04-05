package p040c9;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.push.registration.C8828a;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsDatabase;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.util.C12043f;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p173m.C7279a;
import p422pe.C13219a;
import p425q9.C13265p;
import p514bk.C14088a;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.m */
public final class C4619m implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10412a;

    /* renamed from: b */
    public final C19011a f10413b;

    /* renamed from: c */
    public final Object f10414c;

    public /* synthetic */ C4619m(Object obj, C19011a aVar, int i) {
        this.f10412a = i;
        this.f10414c = obj;
        this.f10413b = aVar;
    }

    public final Object get() {
        switch (this.f10412a) {
            case 0:
                ((C4479c) this.f10414c).getClass();
                String id = ((C13265p) this.f10413b.get()).mo45958c().getId();
                C17782b.m29841G(id);
                return id;
            case 1:
                C8731g gVar = (C8731g) this.f10413b.get();
                ((C19388s) this.f10414c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C8828a.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…tionEndpoint::class.java)");
                return (C8828a) b;
            case 2:
                BOEActivity bOEActivity = (BOEActivity) this.f10413b.get();
                ((C14088a) this.f10414c).getClass();
                C19383o.m32797g(bOEActivity, "boeActivity");
                AppBarHelper appBarHelper = bOEActivity.getAppBarHelper();
                C19383o.m32796f(appBarHelper, "boeActivity.appBarHelper");
                return appBarHelper;
            case 3:
                SearchImpressionsDatabase searchImpressionsDatabase = (SearchImpressionsDatabase) this.f10413b.get();
                ((C7279a) this.f10414c).getClass();
                C19383o.m32797g(searchImpressionsDatabase, "db");
                C13219a o = searchImpressionsDatabase.mo36600o();
                C17782b.m29841G(o);
                return o;
            default:
                C12043f fVar = (C12043f) this.f10413b.get();
                ((C0761x) this.f10414c).getClass();
                C19383o.m32797g(fVar, "appsFlyer");
                return fVar;
        }
    }
}
