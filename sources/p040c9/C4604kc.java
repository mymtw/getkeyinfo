package p040c9;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import com.etsy.android.lib.network.C8731g;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p001a0.C0005b;
import p350fe.C12741o;
import p350fe.C12742p;
import p478x9.C13852b;
import p478x9.C13855d;
import p740eq.C19011a;
import p765pr.C20068g;
import p769rr.C20164a;
import retrofit2.C20146w;

/* renamed from: c9.kc */
public final class C4604kc implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10392a;

    /* renamed from: b */
    public final C19011a f10393b;

    /* renamed from: c */
    public final C19011a f10394c;

    /* renamed from: d */
    public final C19011a f10395d;

    /* renamed from: e */
    public final Object f10396e;

    public /* synthetic */ C4604kc(Object obj, C17555d dVar, C19011a aVar, C19011a aVar2, int i) {
        this.f10392a = i;
        this.f10396e = obj;
        this.f10393b = dVar;
        this.f10394c = aVar;
        this.f10395d = aVar2;
    }

    public final Object get() {
        switch (this.f10392a) {
            case 0:
                C8618c cVar = (C8618c) this.f10393b.get();
                OkHttpClientHolder okHttpClientHolder = (OkHttpClientHolder) this.f10394c.get();
                C20164a aVar = (C20164a) this.f10395d.get();
                ((C15588c1) this.f10396e).getClass();
                C19383o.m32797g(cVar, "config");
                C19383o.m32797g(okHttpClientHolder, "okHttpClientHolder");
                C19383o.m32797g(aVar, "moshiConverterFactory");
                String f = cVar.mo21136f(C8592b.f18822q0);
                C19383o.m32794d(f);
                C20146w.C20148b bVar = new C20146w.C20148b();
                C20009t tVar = okHttpClientHolder.f18996a;
                Objects.requireNonNull(tVar, "client == null");
                bVar.f44628b = tVar;
                bVar.mo74393a(new C20068g());
                bVar.f44630d.add(aVar);
                bVar.mo74394b(f);
                return new C8731g(bVar.mo74395c());
            default:
                C13855d dVar = (C13855d) this.f10393b.get();
                C13852b bVar2 = (C13852b) this.f10394c.get();
                C12742p pVar = (C12742p) this.f10395d.get();
                ((C0005b) this.f10396e).getClass();
                C19383o.m32797g(dVar, "schemeChecker");
                C19383o.m32797g(bVar2, "hostChecker");
                C19383o.m32797g(pVar, "uriResolver");
                return new C12741o(dVar, bVar2, pVar);
        }
    }
}
