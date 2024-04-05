package p346fa;

import com.etsy.android.lib.util.C8890e0;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;

/* renamed from: fa.b */
public final class C12704b {

    /* renamed from: a */
    public final C8890e0 f27996a;

    /* renamed from: b */
    public final String f27997b = "autosuggest.v3_endpoint";

    /* renamed from: c */
    public final double f27998c = 0.01d;

    /* renamed from: d */
    public final C12703a f27999d;

    /* renamed from: e */
    public final long f28000e;

    public C12704b(C8890e0 e0Var, C12703a aVar) {
        C19383o.m32797g(e0Var, "time");
        this.f27996a = e0Var;
        this.f27999d = aVar;
        this.f28000e = System.nanoTime();
    }

    /* renamed from: a */
    public static void m20387a(C12704b bVar) {
        String str = bVar.f27997b;
        bVar.getClass();
        C19383o.m32797g(str, "metricNameOverride");
        C12703a aVar = bVar.f27999d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f27996a.getClass();
        double convert = (double) timeUnit.convert(System.nanoTime() - bVar.f28000e, TimeUnit.NANOSECONDS);
        double d = bVar.f27998c;
        boolean z = false;
        if (d > ShadowDrawableWrapper.COS_45 && aVar.f27995e.nextDouble() <= d) {
            z = true;
        }
        if (z) {
            aVar.mo45477d(str, convert);
        } else {
            aVar.getClass();
        }
    }
}
