package p605kk;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;

/* renamed from: kk.u */
public final class C18137u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18123g f39599b;

    /* renamed from: c */
    public final /* synthetic */ C18138v f39600c;

    public C18137u(C18138v vVar, C18123g gVar) {
        this.f39600c = vVar;
        this.f39599b = gVar;
    }

    public final void run() {
        try {
            C18123g<TContinuationResult> then = this.f39600c.f39602c.then(this.f39599b.mo69664k());
            if (then == null) {
                this.f39600c.mo414a(new NullPointerException("Continuation returned null"));
                return;
            }
            C18141y yVar = C18125i.f39568b;
            then.mo69658e(yVar, this.f39600c);
            then.mo69657d(yVar, this.f39600c);
            then.mo69654a(yVar, this.f39600c);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f39600c.mo414a((Exception) e.getCause());
            } else {
                this.f39600c.mo414a(e);
            }
        } catch (CancellationException unused) {
            this.f39600c.mo69676b();
        } catch (Exception e2) {
            this.f39600c.mo414a(e2);
        }
    }
}
