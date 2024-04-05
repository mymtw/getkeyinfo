package p097f;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C2330s0;
import androidx.core.view.C2332t0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19382n;

/* renamed from: f.b */
public final class C6761b {

    /* renamed from: a */
    public final ArrayList<C2330s0> f14894a = new ArrayList<>();

    /* renamed from: b */
    public long f14895b = -1;

    /* renamed from: c */
    public Interpolator f14896c;

    /* renamed from: d */
    public C2332t0 f14897d;

    /* renamed from: e */
    public boolean f14898e;

    /* renamed from: f */
    public final C6762a f14899f = new C6762a();

    /* renamed from: f.b$a */
    public class C6762a extends C19382n {

        /* renamed from: r */
        public boolean f14900r = false;

        /* renamed from: s */
        public int f14901s = 0;

        public C6762a() {
        }

        /* renamed from: b */
        public final void mo1391b() {
            if (!this.f14900r) {
                this.f14900r = true;
                C2332t0 t0Var = C6761b.this.f14897d;
                if (t0Var != null) {
                    t0Var.mo1391b();
                }
            }
        }

        public final void onAnimationEnd() {
            int i = this.f14901s + 1;
            this.f14901s = i;
            if (i == C6761b.this.f14894a.size()) {
                C2332t0 t0Var = C6761b.this.f14897d;
                if (t0Var != null) {
                    t0Var.onAnimationEnd();
                }
                this.f14901s = 0;
                this.f14900r = false;
                C6761b.this.f14898e = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo18910a() {
        if (this.f14898e) {
            Iterator<C2330s0> it = this.f14894a.iterator();
            while (it.hasNext()) {
                it.next().mo8919b();
            }
            this.f14898e = false;
        }
    }

    /* renamed from: b */
    public final void mo18911b() {
        View view;
        if (!this.f14898e) {
            Iterator<C2330s0> it = this.f14894a.iterator();
            while (it.hasNext()) {
                C2330s0 next = it.next();
                long j = this.f14895b;
                if (j >= 0) {
                    next.mo8920c(j);
                }
                Interpolator interpolator = this.f14896c;
                if (!(interpolator == null || (view = next.f5586a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f14897d != null) {
                    next.mo8921d(this.f14899f);
                }
                next.mo8922e();
            }
            this.f14898e = true;
        }
    }
}
