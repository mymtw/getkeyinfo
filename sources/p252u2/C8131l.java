package p252u2;

import android.annotation.SuppressLint;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C3419a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: u2.l */
public final class C8131l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C3419a f17773b;

    /* renamed from: c */
    public final /* synthetic */ String f17774c;

    /* renamed from: d */
    public final /* synthetic */ C8132m f17775d;

    public C8131l(C8132m mVar, C3419a aVar, String str) {
        this.f17775d = mVar;
        this.f17773b = aVar;
        this.f17774c = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        try {
            ListenableWorker.C3367a aVar = (ListenableWorker.C3367a) this.f17773b.get();
            if (aVar == null) {
                C3422l.m8213c().mo12927b(C8132m.f17776t, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f17775d.f17780e.f9646c}), new Throwable[0]);
            } else {
                C3422l.m8213c().mo12926a(C8132m.f17776t, String.format("%s returned a %s result.", new Object[]{this.f17775d.f17780e.f9646c, aVar}), new Throwable[0]);
                this.f17775d.f17783h = aVar;
            }
        } catch (CancellationException e) {
            C3422l.m8213c().mo12928d(C8132m.f17776t, String.format("%s was cancelled", new Object[]{this.f17774c}), e);
        } catch (InterruptedException | ExecutionException e2) {
            C3422l.m8213c().mo12927b(C8132m.f17776t, String.format("%s failed because it threw an exception/error", new Object[]{this.f17774c}), e2);
        } catch (Throwable th) {
            this.f17775d.mo20734c();
            throw th;
        }
        this.f17775d.mo20734c();
    }
}
