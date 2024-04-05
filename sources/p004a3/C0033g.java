package p004a3;

import android.content.Context;
import p090e3.C6712a;

/* renamed from: a3.g */
public final class C0033g {

    /* renamed from: e */
    public static C0033g f72e;

    /* renamed from: a */
    public C0024a f73a;

    /* renamed from: b */
    public C0025b f74b;

    /* renamed from: c */
    public C0030e f75c;

    /* renamed from: d */
    public C0032f f76d;

    public C0033g(Context context, C6712a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f73a = new C0024a(applicationContext, aVar);
        this.f74b = new C0025b(applicationContext, aVar);
        this.f75c = new C0030e(applicationContext, aVar);
        this.f76d = new C0032f(applicationContext, aVar);
    }

    /* renamed from: a */
    public static synchronized C0033g m139a(Context context, C6712a aVar) {
        C0033g gVar;
        synchronized (C0033g.class) {
            if (f72e == null) {
                f72e = new C0033g(context, aVar);
            }
            gVar = f72e;
        }
        return gVar;
    }
}
