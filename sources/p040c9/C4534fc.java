package p040c9;

import androidx.activity.C0114h;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import com.etsy.android.lib.network.C8735k;
import com.etsy.android.p327ui.favorites.createalist.C9815g;
import com.etsy.android.p327ui.util.C11780h;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p425q9.C13265p;
import p456ua.C13461f;
import p740eq.C19011a;
import p765pr.C20068g;
import p769rr.C20164a;
import retrofit2.C20146w;

/* renamed from: c9.fc */
public final class C4534fc implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f9988a;

    /* renamed from: b */
    public final C19011a f9989b;

    /* renamed from: c */
    public final C19011a f9990c;

    /* renamed from: d */
    public final C19011a f9991d;

    /* renamed from: e */
    public final Object f9992e;

    public /* synthetic */ C4534fc(Object obj, C19011a aVar, C19011a aVar2, C17555d dVar, int i) {
        this.f9988a = i;
        this.f9992e = obj;
        this.f9989b = aVar;
        this.f9990c = aVar2;
        this.f9991d = dVar;
    }

    public final Object get() {
        switch (this.f9988a) {
            case 0:
                OkHttpClientHolder okHttpClientHolder = (OkHttpClientHolder) this.f9989b.get();
                C20164a aVar = (C20164a) this.f9990c.get();
                C8618c cVar = (C8618c) this.f9991d.get();
                ((C15588c1) this.f9992e).getClass();
                C19383o.m32797g(okHttpClientHolder, "okHttpClientHolder");
                C19383o.m32797g(aVar, "moshiConverterFactory");
                C19383o.m32797g(cVar, "config");
                String f = cVar.mo21136f(C8592b.f18819p0);
                C19383o.m32794d(f);
                C20146w.C20148b bVar = new C20146w.C20148b();
                C20009t tVar = okHttpClientHolder.f18997b;
                Objects.requireNonNull(tVar, "client == null");
                bVar.f44628b = tVar;
                bVar.mo74393a(new C20068g());
                bVar.f44630d.add(aVar);
                bVar.mo74394b(f);
                return new C8735k(bVar.mo74395c());
            default:
                C11780h hVar = (C11780h) this.f9989b.get();
                C13461f fVar = (C13461f) this.f9990c.get();
                C13265p pVar = (C13265p) this.f9991d.get();
                ((C0114h) this.f9992e).getClass();
                C19383o.m32797g(hVar, "repo");
                C19383o.m32797g(fVar, "schedulers");
                C19383o.m32797g(pVar, "session");
                return new C9815g(pVar, fVar, hVar);
        }
    }
}
