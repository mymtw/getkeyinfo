package p605kk;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: kk.o */
public final class C18131o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18123g f39582b;

    /* renamed from: c */
    public final /* synthetic */ C18132p f39583c;

    public C18131o(C18132p pVar, C18123g gVar) {
        this.f39583c = pVar;
        this.f39582b = gVar;
    }

    public final void run() {
        try {
            C18123g then = this.f39583c.f39585c.then(this.f39582b);
            if (then == null) {
                this.f39583c.mo414a(new NullPointerException("Continuation returned null"));
                return;
            }
            C18141y yVar = C18125i.f39568b;
            then.mo69658e(yVar, this.f39583c);
            then.mo69657d(yVar, this.f39583c);
            then.mo69654a(yVar, this.f39583c);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f39583c.f39586d.mo69672s((Exception) e.getCause());
            } else {
                this.f39583c.f39586d.mo69672s(e);
            }
        } catch (Exception e2) {
            this.f39583c.f39586d.mo69672s(e2);
        }
    }
}
