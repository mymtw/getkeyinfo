package p040c9;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.network.C8721a;
import com.etsy.android.lib.network.C8722a0;
import com.etsy.android.lib.network.C8723b;
import com.etsy.android.lib.network.C8724b0;
import com.etsy.android.lib.network.C8725c;
import com.etsy.android.lib.network.C8726c0;
import com.etsy.android.lib.network.C8729e;
import com.etsy.android.lib.network.C8737m;
import com.etsy.android.lib.network.C8739o;
import com.etsy.android.lib.network.C8805p;
import com.etsy.android.lib.network.C8815y;
import com.etsy.android.lib.network.C8816z;
import com.etsy.android.lib.network.oauth2.C8755f0;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.logging.HttpLoggingInterceptor;
import p001a0.C0005b;
import p409o9.C13138q;
import p740eq.C19011a;

/* renamed from: c9.ic */
public final class C4576ic implements C17555d<C8729e> {

    /* renamed from: a */
    public final C15588c1 f10062a;

    /* renamed from: b */
    public final C19011a<C8726c0> f10063b;

    /* renamed from: c */
    public final C19011a<C8805p> f10064c;

    /* renamed from: d */
    public final C19011a<HttpLoggingInterceptor.Level> f10065d;

    /* renamed from: e */
    public final C19011a<C13138q> f10066e;

    /* renamed from: f */
    public final C19011a<C8721a> f10067f;

    /* renamed from: g */
    public final C19011a<C8755f0> f10068g;

    /* renamed from: h */
    public final C19011a<C8737m> f10069h;

    public C4576ic(C15588c1 c1Var, C19011a<C8726c0> aVar, C19011a<C8805p> aVar2, C19011a<HttpLoggingInterceptor.Level> aVar3, C19011a<C13138q> aVar4, C19011a<C8721a> aVar5, C19011a<C8755f0> aVar6, C19011a<C8737m> aVar7) {
        this.f10062a = c1Var;
        this.f10063b = aVar;
        this.f10064c = aVar2;
        this.f10065d = aVar3;
        this.f10066e = aVar4;
        this.f10067f = aVar5;
        this.f10068g = aVar6;
        this.f10069h = aVar7;
    }

    public final Object get() {
        C15588c1 c1Var = this.f10062a;
        C8726c0 c0Var = this.f10063b.get();
        C8805p pVar = this.f10064c.get();
        HttpLoggingInterceptor.Level level = this.f10065d.get();
        C13138q qVar = this.f10066e.get();
        C8721a aVar = this.f10067f.get();
        C8755f0 f0Var = this.f10068g.get();
        C8737m mVar = this.f10069h.get();
        c1Var.getClass();
        C19383o.m32797g(c0Var, "xDebugSettings");
        C19383o.m32797g(pVar, "hostnameUrlProvider");
        C19383o.m32797g(level, "logLevel");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(aVar, "addDetectedLocaleInterceptor");
        C19383o.m32797g(f0Var, "tokenRevokedInterceptor");
        C19383o.m32797g(mVar, "firebasePerformanceInterceptor");
        C20009t.C20010a aVar2 = new C20009t.C20010a();
        aVar2.f44319e = C1993m.f4500o;
        aVar2.mo72993a(new C8739o(pVar));
        aVar2.mo72993a(new C8722a0());
        aVar2.mo72993a(new C8725c());
        aVar2.mo72993a(f0Var);
        aVar2.mo72993a(new C8815y(987654));
        aVar2.mo72993a(aVar);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
        httpLoggingInterceptor.f44224c = level;
        aVar2.mo72993a(httpLoggingInterceptor);
        aVar2.mo72993a(new C8723b());
        aVar2.mo72993a(new C8816z(qVar));
        aVar2.mo72993a(mVar);
        aVar2.f44320f = true;
        aVar2.mo72995c(15, TimeUnit.SECONDS);
        C0005b.m32Z(aVar2);
        if (C0326j.m869n(BuildTarget.Companion)) {
            aVar2.mo72993a(new C8724b0(c0Var));
        }
        return new C8729e(new C20009t(aVar2));
    }
}
