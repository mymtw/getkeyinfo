package p277w8;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.dagger.C8652k;
import com.etsy.android.lib.logger.elk.ElkLogDatabase;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.user.help.C11531d;
import com.etsy.android.uikit.AppBarHelper;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.text.NumberFormat;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p040c9.C4479c;
import p340ea.C12658b;
import p388lb.C13006a;
import p405nc.C13110a;
import p464va.C13551d;
import p486y9.C13888d;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: w8.m */
public final class C8275m implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18139a;

    /* renamed from: b */
    public final C19011a f18140b;

    /* renamed from: c */
    public final Object f18141c;

    public /* synthetic */ C8275m(Object obj, C19011a aVar, int i) {
        this.f18139a = i;
        this.f18141c = obj;
        this.f18140b = aVar;
    }

    public final Object get() {
        switch (this.f18139a) {
            case 0:
                C8731g gVar = (C8731g) this.f18140b.get();
                ((C13006a) this.f18141c).getClass();
                C19383o.m32797g(gVar, "configuredRetrofit");
                Object b = gVar.f19177a.mo74387b(C8273k.class);
                C19383o.m32796f(b, "configuredRetrofit.v3mos…gingEndpoint::class.java)");
                return (C8273k) b;
            case 1:
                BOEApplication bOEApplication = (BOEApplication) this.f18140b.get();
                ((C4479c) this.f18141c).getClass();
                C17782b.m29841G(bOEApplication);
                return bOEApplication;
            case 2:
                C13888d dVar = (C13888d) this.f18140b.get();
                ((C19388s) this.f18141c).getClass();
                C19383o.m32797g(dVar, "currentLocale");
                NumberFormat numberInstance = NumberFormat.getNumberInstance(dVar.mo46718b());
                C19383o.m32796f(numberInstance, "getNumberInstance(currentLocale.getAppLocale())");
                return numberInstance;
            case 3:
                ((C0761x) this.f18141c).getClass();
                C19383o.m32797g((C8731g) this.f18140b.get(), "configuredV3MoshiRetrofit");
                return new C8652k();
            case 4:
                ElkLogDatabase elkLogDatabase = (ElkLogDatabase) this.f18140b.get();
                ((C0114h) this.f18141c).getClass();
                C19383o.m32797g(elkLogDatabase, "db");
                C12658b o = elkLogDatabase.mo21336o();
                C17782b.m29841G(o);
                return o;
            case 5:
                C8731g gVar2 = (C8731g) this.f18140b.get();
                ((C13110a) this.f18141c).getClass();
                C19383o.m32797g(gVar2, "v3MoshiRetrofit");
                Object b2 = gVar2.f19177a.mo74387b(C13551d.class);
                C19383o.m32796f(b2, "v3MoshiRetrofit.v3moshiR…(SdlEndpoint::class.java)");
                return (C13551d) b2;
            case 6:
                BOEActivity bOEActivity = (BOEActivity) this.f18140b.get();
                ((C19388s) this.f18141c).getClass();
                C19383o.m32797g(bOEActivity, "boeActivity");
                AppBarHelper appBarHelper = bOEActivity.getAppBarHelper();
                C19383o.m32796f(appBarHelper, "boeActivity.appBarHelper");
                return appBarHelper;
            default:
                C8731g gVar3 = (C8731g) this.f18140b.get();
                ((C15588c1) this.f18141c).getClass();
                C19383o.m32797g(gVar3, "retrofit");
                Object b3 = gVar3.f19177a.mo74387b(C11531d.class);
                C19383o.m32796f(b3, "retrofit.v3moshiRetrofit…HelpEndpoint::class.java)");
                return (C11531d) b3;
        }
    }
}
