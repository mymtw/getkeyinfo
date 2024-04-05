package p040c9;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.network.C8721a;
import com.etsy.android.lib.network.C8723b;
import com.etsy.android.lib.network.C8724b0;
import com.etsy.android.lib.network.C8725c;
import com.etsy.android.lib.network.C8726c0;
import com.etsy.android.lib.network.C8734j;
import com.etsy.android.lib.network.C8736l;
import com.etsy.android.lib.network.C8737m;
import com.etsy.android.lib.network.C8738n;
import com.etsy.android.lib.network.C8739o;
import com.etsy.android.lib.network.C8805p;
import com.etsy.android.lib.network.C8815y;
import com.etsy.android.lib.network.C8816z;
import com.etsy.android.p327ui.favorites.C9793c;
import com.etsy.android.uikit.webview.C12024d;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.logging.HttpLoggingInterceptor;
import p001a0.C0005b;
import p277w8.C8274l;
import p409o9.C13129i;
import p409o9.C13138q;
import p740eq.C19011a;

/* renamed from: c9.ec */
public final class C4520ec implements C17555d<C8734j> {

    /* renamed from: a */
    public final C15588c1 f9957a;

    /* renamed from: b */
    public final C19011a<C8726c0> f9958b;

    /* renamed from: c */
    public final C19011a<C8805p> f9959c;

    /* renamed from: d */
    public final C19011a<HttpLoggingInterceptor.Level> f9960d;

    /* renamed from: e */
    public final C19011a<C13138q> f9961e;

    /* renamed from: f */
    public final C19011a<C8721a> f9962f;

    /* renamed from: g */
    public final C19011a<C12024d> f9963g;

    /* renamed from: h */
    public final C19011a<C8737m> f9964h;

    public C4520ec(C15588c1 c1Var, C8274l lVar, C4672q qVar, C4618lc lcVar, C19011a aVar, C13129i iVar, C9793c cVar, C8738n nVar) {
        this.f9957a = c1Var;
        this.f9958b = lVar;
        this.f9959c = qVar;
        this.f9960d = lcVar;
        this.f9961e = aVar;
        this.f9962f = iVar;
        this.f9963g = cVar;
        this.f9964h = nVar;
    }

    public final Object get() {
        C15588c1 c1Var = this.f9957a;
        C8726c0 c0Var = this.f9958b.get();
        C8805p pVar = this.f9959c.get();
        HttpLoggingInterceptor.Level level = this.f9960d.get();
        C13138q qVar = this.f9961e.get();
        C8721a aVar = this.f9962f.get();
        C12024d dVar = this.f9963g.get();
        C8737m mVar = this.f9964h.get();
        c1Var.getClass();
        C19383o.m32797g(c0Var, "xDebugSettings");
        C19383o.m32797g(pVar, "hostnameUrlProvider");
        C19383o.m32797g(level, "logLevel");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(aVar, "addDetectedLocaleInterceptor");
        C19383o.m32797g(dVar, "harvestingCookieJar");
        C19383o.m32797g(mVar, "firebasePerformanceInterceptor");
        C20009t.C20010a aVar2 = new C20009t.C20010a();
        aVar2.f44319e = C1993m.f4500o;
        aVar2.mo72993a(new C8739o(pVar));
        aVar2.mo72993a(new C8725c());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
        httpLoggingInterceptor.f44224c = level;
        aVar2.mo72993a(httpLoggingInterceptor);
        aVar2.mo72993a(new C8815y(451254));
        aVar2.mo72993a(aVar);
        aVar2.mo72993a(new C8723b());
        aVar2.mo72993a(new C8816z(qVar));
        aVar2.mo72993a(mVar);
        aVar2.f44320f = true;
        aVar2.mo72995c(15, TimeUnit.SECONDS);
        aVar2.f44324j = dVar;
        C0005b.m32Z(aVar2);
        if (C0326j.m869n(BuildTarget.Companion)) {
            aVar2.mo72993a(new C8724b0(c0Var));
            aVar2.mo72993a(new C8736l());
        }
        return new C8734j(new C20009t(aVar2));
    }
}
