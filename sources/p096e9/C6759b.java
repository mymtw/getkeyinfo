package p096e9;

import android.app.Application;
import com.etsy.android.BOEApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.network.Connectivity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p340ea.C12673n;
import p350fe.C12724a;
import p350fe.C12726c;
import p350fe.C12741o;

/* renamed from: e9.b */
public final class C6759b {

    /* renamed from: a */
    public final Application f14886a;

    /* renamed from: b */
    public final Connectivity f14887b;

    /* renamed from: c */
    public final C8694h f14888c;

    /* renamed from: d */
    public final C12673n f14889d;

    /* renamed from: e */
    public final C12741o f14890e;

    /* renamed from: f */
    public final C12724a f14891f;

    /* renamed from: g */
    public final String f14892g = "Ah6cjtTBAgK";

    /* renamed from: h */
    public final AtomicBoolean f14893h = new AtomicBoolean(false);

    public C6759b(Application application, Connectivity connectivity, C8694h hVar, C12673n nVar, C12741o oVar, C12724a aVar, C12726c cVar) {
        C19383o.m32797g(application, "application");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(nVar, "elkLog");
        C19383o.m32797g(aVar, "deepLinkEligibility");
        this.f14886a = application;
        this.f14887b = connectivity;
        this.f14888c = hVar;
        this.f14889d = nVar;
        this.f14890e = oVar;
        this.f14891f = aVar;
    }

    /* renamed from: a */
    public static final void m13154a(C6759b bVar, int i, String str, String str2) {
        if (str2 == null) {
            bVar.f14888c.mo21308c();
            return;
        }
        Application application = bVar.f14886a;
        C19383o.m32795e(application, "null cannot be cast to non-null type com.etsy.android.BOEApplication");
        ((BOEApplication) application).getAnalyticsTracker().mo21333d("bitlink_error", C19294b0.m32562s0(new Pair(PredefinedAnalyticsProperty.CODE, Integer.valueOf(i)), new Pair(PredefinedAnalyticsProperty.ERROR_MESSAGE, str), new Pair(PredefinedAnalyticsProperty.ORIGINAL_BITLINK, str2)));
    }
}
