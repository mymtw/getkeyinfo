package p605kk;

import java.util.concurrent.ExecutionException;

/* renamed from: kk.m */
public final class C18129m implements C18121e, C18120d, C18118b {

    /* renamed from: b */
    public final Object f39571b = new Object();

    /* renamed from: c */
    public final int f39572c;

    /* renamed from: d */
    public final C18117a0<Void> f39573d;

    /* renamed from: e */
    public int f39574e;

    /* renamed from: f */
    public int f39575f;

    /* renamed from: g */
    public int f39576g;

    /* renamed from: h */
    public Exception f39577h;

    /* renamed from: i */
    public boolean f39578i;

    public C18129m(int i, C18117a0<Void> a0Var) {
        this.f39572c = i;
        this.f39573d = a0Var;
    }

    /* renamed from: a */
    public final void mo414a(Exception exc) {
        synchronized (this.f39571b) {
            this.f39575f++;
            this.f39577h = exc;
            mo69681c();
        }
    }

    /* renamed from: b */
    public final void mo69676b() {
        synchronized (this.f39571b) {
            this.f39576g++;
            this.f39578i = true;
            mo69681c();
        }
    }

    /* renamed from: c */
    public final void mo69681c() {
        if (this.f39574e + this.f39575f + this.f39576g != this.f39572c) {
            return;
        }
        if (this.f39577h != null) {
            C18117a0<Void> a0Var = this.f39573d;
            int i = this.f39575f;
            int i2 = this.f39572c;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            a0Var.mo69672s(new ExecutionException(sb.toString(), this.f39577h));
        } else if (this.f39578i) {
            this.f39573d.mo69674u();
        } else {
            this.f39573d.mo69673t(null);
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.f39571b) {
            this.f39574e++;
            mo69681c();
        }
    }
}
