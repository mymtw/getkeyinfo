package p464va;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.network.oauth2.C8765o;
import com.etsy.android.lib.push.registration.C8840m;
import com.squareup.moshi.C17414y;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import retrofit2.C20145v;

/* renamed from: va.e */
public final class C13552e {

    /* renamed from: a */
    public final C13551d f29634a;

    /* renamed from: b */
    public final C8618c f29635b;

    /* renamed from: c */
    public final C17414y f29636c;

    /* renamed from: va.e$a */
    public /* synthetic */ class C13553a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29637a;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            iArr[HttpMethod.GET.ordinal()] = 1;
            iArr[HttpMethod.POST.ordinal()] = 2;
            iArr[HttpMethod.PUT.ordinal()] = 3;
            f29637a = iArr;
        }
    }

    public C13552e(C13551d dVar, C8618c cVar, C17414y yVar) {
        C19383o.m32797g(dVar, "endpoint");
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(yVar, "moshi");
        this.f29634a = dVar;
        this.f29635b = cVar;
        this.f29636c = yVar;
    }

    /* renamed from: a */
    public final C19208j mo46214a(C13546a aVar) {
        C8071s<C20145v<C19928a0>> sVar;
        C19383o.m32797g(aVar, "spec");
        String str = aVar.f29624a;
        String f = this.f29635b.mo21136f(C8592b.f18825r0);
        C19383o.m32796f(f, "configMap.getStringValue…nfigKeys.API_V3_ENDPOINT)");
        String D = C19388s.m32815D(str, f);
        int i = C13553a.f29637a[aVar.f29626c.ordinal()];
        if (i == 1) {
            sVar = this.f29634a.mo46213c(D, aVar.f29625b);
        } else if (i == 2) {
            sVar = this.f29634a.mo46212b(D, aVar.f29625b);
        } else if (i == 3) {
            sVar = this.f29634a.mo46211a(D, aVar.f29625b);
        } else {
            throw new IllegalArgumentException("Valid methods for SDL are GET, POST, and PUT");
        }
        C8765o oVar = new C8765o(this, 1);
        sVar.getClass();
        return new C19208j(sVar, oVar);
    }

    /* renamed from: b */
    public final C19208j mo46215b(C13547b bVar) {
        C8071s<C20145v<C19928a0>> sVar;
        C19383o.m32797g(bVar, "spec");
        String str = bVar.f29627a;
        String f = this.f29635b.mo21136f(C8592b.f18825r0);
        C19383o.m32796f(f, "configMap.getStringValue…nfigKeys.API_V3_ENDPOINT)");
        String D = C19388s.m32815D(str, f);
        int i = C13553a.f29637a[bVar.f29629c.ordinal()];
        if (i == 1) {
            sVar = this.f29634a.mo46213c(D, bVar.f29628b);
        } else if (i == 2) {
            sVar = this.f29634a.mo46212b(D, bVar.f29628b);
        } else if (i == 3) {
            sVar = this.f29634a.mo46211a(D, bVar.f29628b);
        } else {
            throw new IllegalArgumentException("Valid methods for SDL are GET, POST, and PUT");
        }
        C8840m mVar = new C8840m(this, 1);
        sVar.getClass();
        return new C19208j(sVar, mVar);
    }
}
