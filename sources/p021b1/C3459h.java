package p021b1;

import android.content.Context;
import java.util.concurrent.Callable;
import p021b1.C3461j;

/* renamed from: b1.h */
public final class C3459h implements Callable<C3461j.C3462a> {

    /* renamed from: b */
    public final /* synthetic */ String f8066b;

    /* renamed from: c */
    public final /* synthetic */ Context f8067c;

    /* renamed from: d */
    public final /* synthetic */ C3456e f8068d;

    /* renamed from: e */
    public final /* synthetic */ int f8069e;

    public C3459h(String str, Context context, C3456e eVar, int i) {
        this.f8066b = str;
        this.f8067c = context;
        this.f8068d = eVar;
        this.f8069e = i;
    }

    public final Object call() throws Exception {
        try {
            return C3461j.m8293a(this.f8066b, this.f8067c, this.f8068d, this.f8069e);
        } catch (Throwable unused) {
            return new C3461j.C3462a(-3);
        }
    }
}
