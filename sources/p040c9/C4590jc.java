package p040c9;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.network.C8721a;
import com.etsy.android.lib.network.C8723b;
import com.etsy.android.lib.network.C8724b0;
import com.etsy.android.lib.network.C8725c;
import com.etsy.android.lib.network.C8726c0;
import com.etsy.android.lib.network.C8732h;
import com.etsy.android.lib.network.C8736l;
import com.etsy.android.lib.network.C8737m;
import com.etsy.android.lib.network.C8738n;
import com.etsy.android.lib.network.C8739o;
import com.etsy.android.lib.network.C8805p;
import com.etsy.android.lib.network.C8810u;
import com.etsy.android.lib.network.C8812v;
import com.etsy.android.lib.network.C8815y;
import com.etsy.android.lib.network.C8816z;
import com.etsy.android.lib.network.oauth2.C8745a0;
import com.etsy.android.lib.network.oauth2.C8763m;
import com.etsy.android.lib.network.oauth2.C8804z;
import com.etsy.android.lib.network.oauth2.OAuth2Authenticator;
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

/* renamed from: c9.jc */
public final class C4590jc implements C17555d<C8732h> {

    /* renamed from: a */
    public final C15588c1 f10366a;

    /* renamed from: b */
    public final C19011a<C8726c0> f10367b;

    /* renamed from: c */
    public final C19011a<C8805p> f10368c;

    /* renamed from: d */
    public final C19011a<HttpLoggingInterceptor.Level> f10369d;

    /* renamed from: e */
    public final C19011a<C13138q> f10370e;

    /* renamed from: f */
    public final C19011a<C8721a> f10371f;

    /* renamed from: g */
    public final C19011a<OAuth2Authenticator> f10372g;

    /* renamed from: h */
    public final C19011a<C8804z> f10373h;

    /* renamed from: i */
    public final C19011a<C8737m> f10374i;

    /* renamed from: j */
    public final C19011a<C8810u> f10375j;

    public C4590jc(C15588c1 c1Var, C8274l lVar, C4672q qVar, C4618lc lcVar, C19011a aVar, C13129i iVar, C8763m mVar, C8745a0 a0Var, C8738n nVar, C8812v vVar) {
        this.f10366a = c1Var;
        this.f10367b = lVar;
        this.f10368c = qVar;
        this.f10369d = lcVar;
        this.f10370e = aVar;
        this.f10371f = iVar;
        this.f10372g = mVar;
        this.f10373h = a0Var;
        this.f10374i = nVar;
        this.f10375j = vVar;
    }

    public final Object get() {
        C15588c1 c1Var = this.f10366a;
        C8726c0 c0Var = this.f10367b.get();
        C8805p pVar = this.f10368c.get();
        HttpLoggingInterceptor.Level level = this.f10369d.get();
        C13138q qVar = this.f10370e.get();
        C8721a aVar = this.f10371f.get();
        OAuth2Authenticator oAuth2Authenticator = this.f10372g.get();
        C8804z zVar = this.f10373h.get();
        C8737m mVar = this.f10374i.get();
        C8810u uVar = this.f10375j.get();
        c1Var.getClass();
        C19383o.m32797g(c0Var, "xDebugSettings");
        C19383o.m32797g(pVar, "hostnameUrlProvider");
        C19383o.m32797g(level, "logLevel");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(aVar, "addDetectedLocaleInterceptor");
        C19383o.m32797g(oAuth2Authenticator, "oAuth2Authenticator");
        C19383o.m32797g(zVar, "signingInterceptor");
        C19383o.m32797g(mVar, "firebasePerformanceInterceptor");
        C19383o.m32797g(uVar, "requestSigningInterceptor");
        C20009t.C20010a aVar2 = new C20009t.C20010a();
        aVar2.f44319e = C1993m.f4500o;
        aVar2.f44321g = oAuth2Authenticator;
        aVar2.mo72993a(new C8725c());
        aVar2.mo72993a(new C8739o(pVar));
        aVar2.mo72993a(zVar);
        aVar2.mo72993a(new C8815y(987654));
        aVar2.mo72993a(aVar);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
        httpLoggingInterceptor.f44224c = level;
        aVar2.mo72993a(httpLoggingInterceptor);
        aVar2.mo72993a(new C8723b());
        aVar2.mo72993a(new C8816z(qVar));
        aVar2.mo72993a(mVar);
        aVar2.mo72993a(uVar);
        aVar2.f44320f = true;
        aVar2.mo72995c(15, TimeUnit.SECONDS);
        C0005b.m32Z(aVar2);
        if (C0326j.m869n(BuildTarget.Companion)) {
            aVar2.mo72993a(new C8724b0(c0Var));
            aVar2.mo72993a(new C8736l());
        }
        return new C8732h(new C20009t(aVar2));
    }
}
