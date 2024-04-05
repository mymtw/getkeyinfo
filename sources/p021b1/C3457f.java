package p021b1;

import android.content.Context;
import java.util.concurrent.Callable;
import p021b1.C3461j;

/* renamed from: b1.f */
public final class C3457f implements Callable<C3461j.C3462a> {

    /* renamed from: b */
    public final /* synthetic */ String f8061b;

    /* renamed from: c */
    public final /* synthetic */ Context f8062c;

    /* renamed from: d */
    public final /* synthetic */ C3456e f8063d;

    /* renamed from: e */
    public final /* synthetic */ int f8064e;

    public C3457f(String str, Context context, C3456e eVar, int i) {
        this.f8061b = str;
        this.f8062c = context;
        this.f8063d = eVar;
        this.f8064e = i;
    }

    public final Object call() throws Exception {
        return C3461j.m8293a(this.f8061b, this.f8062c, this.f8063d, this.f8064e);
    }
}
