package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

/* renamed from: androidx.lifecycle.d0 */
public final class C2851d0 implements C2887s {

    /* renamed from: j */
    public static final C2851d0 f6469j = new C2851d0();

    /* renamed from: b */
    public int f6470b = 0;

    /* renamed from: c */
    public int f6471c = 0;

    /* renamed from: d */
    public boolean f6472d = true;

    /* renamed from: e */
    public boolean f6473e = true;

    /* renamed from: f */
    public Handler f6474f;

    /* renamed from: g */
    public final C2888t f6475g = new C2888t(this, true);

    /* renamed from: h */
    public C2852a f6476h = new C2852a();

    /* renamed from: i */
    public C2853b f6477i = new C2853b();

    /* renamed from: androidx.lifecycle.d0$a */
    public class C2852a implements Runnable {
        public C2852a() {
        }

        public final void run() {
            C2851d0 d0Var = C2851d0.this;
            if (d0Var.f6471c == 0) {
                d0Var.f6472d = true;
                d0Var.f6475g.mo10837f(Lifecycle.Event.ON_PAUSE);
            }
            C2851d0 d0Var2 = C2851d0.this;
            if (d0Var2.f6470b == 0 && d0Var2.f6472d) {
                d0Var2.f6475g.mo10837f(Lifecycle.Event.ON_STOP);
                d0Var2.f6473e = true;
            }
        }
    }

    /* renamed from: androidx.lifecycle.d0$b */
    public class C2853b implements ReportFragment.C2836a {
        public C2853b() {
        }
    }

    /* renamed from: a */
    public final void mo10807a() {
        int i = this.f6471c + 1;
        this.f6471c = i;
        if (i != 1) {
            return;
        }
        if (this.f6472d) {
            this.f6475g.mo10837f(Lifecycle.Event.ON_RESUME);
            this.f6472d = false;
            return;
        }
        this.f6474f.removeCallbacks(this.f6476h);
    }

    public final Lifecycle getLifecycle() {
        return this.f6475g;
    }
}
