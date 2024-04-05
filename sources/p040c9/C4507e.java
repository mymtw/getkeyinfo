package p040c9;

import android.content.Context;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import com.etsy.android.lib.network.C8733i;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.C17555d;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p359ha.C12799a;
import p409o9.C13138q;
import p486y9.C13891g;
import p740eq.C19011a;
import p765pr.C20068g;
import p769rr.C20164a;
import retrofit2.C20146w;

/* renamed from: c9.e */
public final class C4507e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f9938a;

    /* renamed from: b */
    public final C19011a f9939b;

    /* renamed from: c */
    public final C19011a f9940c;

    /* renamed from: d */
    public final C19011a f9941d;

    /* renamed from: e */
    public final Object f9942e;

    public /* synthetic */ C4507e(Object obj, C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f9938a = i;
        this.f9942e = obj;
        this.f9939b = aVar;
        this.f9940c = aVar2;
        this.f9941d = aVar3;
    }

    public final Object get() {
        switch (this.f9938a) {
            case 0:
                ((C4479c) this.f9942e).getClass();
                return new C12799a(FirebaseAnalytics.getInstance((Context) this.f9939b.get()), ((C13138q) this.f9940c.get()).f28895a, (C13891g) this.f9941d.get());
            default:
                OkHttpClientHolder okHttpClientHolder = (OkHttpClientHolder) this.f9939b.get();
                C20164a aVar = (C20164a) this.f9940c.get();
                C8618c cVar = (C8618c) this.f9941d.get();
                ((C15588c1) this.f9942e).getClass();
                C19383o.m32797g(okHttpClientHolder, "okHttpClientHolder");
                C19383o.m32797g(aVar, "moshiConverterFactory");
                C19383o.m32797g(cVar, "config");
                String f = cVar.mo21136f(C8592b.f18819p0);
                C19383o.m32794d(f);
                C20146w.C20148b bVar = new C20146w.C20148b();
                C20009t tVar = okHttpClientHolder.f18996a;
                Objects.requireNonNull(tVar, "client == null");
                bVar.f44628b = tVar;
                bVar.mo74393a(new C20068g());
                bVar.f44630d.add(aVar);
                bVar.mo74394b(f);
                return new C8733i(bVar.mo74395c());
        }
    }
}
