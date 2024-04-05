package p453tf;

import android.content.Context;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

/* renamed from: tf.k */
public final class C13421k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f29405b;

    /* renamed from: c */
    public final /* synthetic */ String f29406c;

    public C13421k(Context context, String str) {
        this.f29405b = context;
        this.f29406c = str;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                C13418j jVar = C13418j.f29403w;
                Context context = this.f29405b;
                C19383o.m32796f(context, "applicationContext");
                C13418j.m21105a(jVar, context, this.f29406c);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
