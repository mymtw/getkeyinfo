package p605kk;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: kk.h */
public final class C18124h<TResult> {

    /* renamed from: a */
    public final C18117a0<TResult> f39566a = new C18117a0<>();

    /* renamed from: a */
    public final void mo69677a(Exception exc) {
        this.f39566a.mo69672s(exc);
    }

    /* renamed from: b */
    public final void mo69678b(TResult tresult) {
        this.f39566a.mo69673t(tresult);
    }

    /* renamed from: c */
    public final boolean mo69679c(Exception exc) {
        C18117a0<TResult> a0Var = this.f39566a;
        a0Var.getClass();
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (a0Var.f39560a) {
            if (a0Var.f39562c) {
                return false;
            }
            a0Var.f39562c = true;
            a0Var.f39565f = exc;
            a0Var.f39561b.mo69686b(a0Var);
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo69680d(TResult tresult) {
        C18117a0<TResult> a0Var = this.f39566a;
        synchronized (a0Var.f39560a) {
            if (a0Var.f39562c) {
                return false;
            }
            a0Var.f39562c = true;
            a0Var.f39564e = tresult;
            a0Var.f39561b.mo69686b(a0Var);
            return true;
        }
    }
}
