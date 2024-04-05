package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.C2325q;
import androidx.core.view.C2336v0;
import androidx.core.view.C2348w0;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.p */
public final class C0753p extends C2336v0.C2338b implements Runnable, C2325q, View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final C0740i0 f1542d;

    /* renamed from: e */
    public boolean f1543e;

    /* renamed from: f */
    public C2348w0 f1544f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0753p(C0740i0 i0Var) {
        super(i0Var.f1524s ^ true ? 1 : 0);
        C19383o.m32797g(i0Var, "composeInsets");
        this.f1542d = i0Var;
    }

    /* renamed from: a */
    public final void mo4137a(C2336v0 v0Var) {
        C19383o.m32797g(v0Var, ResponseConstants.ANIMATION);
        this.f1543e = false;
        C2348w0 w0Var = this.f1544f;
        if (!(v0Var.f5587a.mo8932a() == 0 || w0Var == null)) {
            this.f1542d.mo4126a(w0Var, v0Var.f5587a.mo8934c());
        }
        this.f1544f = null;
    }

    /* renamed from: b */
    public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
        C19383o.m32797g(view, "view");
        if (this.f1543e) {
            this.f1544f = w0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return w0Var;
        }
        this.f1542d.mo4126a(w0Var, 0);
        if (!this.f1542d.f1524s) {
            return w0Var;
        }
        C2348w0 w0Var2 = C2348w0.f5614b;
        C19383o.m32796f(w0Var2, "CONSUMED");
        return w0Var2;
    }

    /* renamed from: c */
    public final void mo4138c(C2336v0 v0Var) {
        this.f1543e = true;
    }

    /* renamed from: d */
    public final C2348w0 mo4139d(C2348w0 w0Var, List<C2336v0> list) {
        C19383o.m32797g(w0Var, "insets");
        C19383o.m32797g(list, "runningAnimations");
        this.f1542d.mo4126a(w0Var, 0);
        if (!this.f1542d.f1524s) {
            return w0Var;
        }
        C2348w0 w0Var2 = C2348w0.f5614b;
        C19383o.m32796f(w0Var2, "CONSUMED");
        return w0Var2;
    }

    /* renamed from: e */
    public final C2336v0.C2337a mo4140e(C2336v0 v0Var, C2336v0.C2337a aVar) {
        C19383o.m32797g(v0Var, ResponseConstants.ANIMATION);
        C19383o.m32797g(aVar, "bounds");
        this.f1543e = false;
        return aVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "view");
        view.requestApplyInsets();
    }

    public final void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public final void run() {
        if (this.f1543e) {
            this.f1543e = false;
            C2348w0 w0Var = this.f1544f;
            if (w0Var != null) {
                this.f1542d.mo4126a(w0Var, 0);
                this.f1544f = null;
            }
        }
    }
}
