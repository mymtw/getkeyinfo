package androidx.work;

import android.os.Bundle;
import androidx.compose.foundation.layout.C0761x;
import com.google.android.gms.measurement.internal.C14947d;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import com.google.android.gms.measurement.internal.C15007j5;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.play.core.assetpacks.C15674y;
import com.google.common.util.concurrent.C16388l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlinx.coroutines.C19747k;
import p605kk.C18119c;
import p605kk.C18123g;
import p605kk.C18134r;

/* renamed from: androidx.work.k */
public final class C3421k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f8024b;

    /* renamed from: c */
    public final /* synthetic */ Object f8025c;

    /* renamed from: d */
    public final /* synthetic */ Object f8026d;

    public /* synthetic */ C3421k(int i, Object obj, Object obj2) {
        this.f8024b = i;
        this.f8025c = obj;
        this.f8026d = obj2;
    }

    public final void run() {
        String str;
        switch (this.f8024b) {
            case 0:
                try {
                    ((C19747k) this.f8025c).resumeWith(Result.m35480constructorimpl(((C16388l) this.f8026d).get()));
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        ((C19747k) this.f8025c).mo72495D(cause);
                        return;
                    } else {
                        ((C19747k) this.f8025c).resumeWith(Result.m35480constructorimpl(C0761x.m1673J(cause)));
                        return;
                    }
                }
            case 1:
                synchronized (((AtomicReference) this.f8025c)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.f8025c;
                        Object obj = this.f8026d;
                        C14947d dVar = ((C15103u3) ((C15007j5) obj).f33681b).f33878h;
                        String l = ((C15103u3) ((C15007j5) obj).f33681b).mo52327n().mo52046l();
                        C14950d2<String> d2Var = C14959e2.f33378L;
                        if (l == null) {
                            dVar.getClass();
                            str = d2Var.mo51978a(null);
                        } else {
                            str = d2Var.mo51978a(dVar.f33334d.mo51945e(l, d2Var.f33339a));
                        }
                        atomicReference.set(str);
                        ((AtomicReference) this.f8025c).notify();
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f8025c).notify();
                        throw th2;
                    }
                }
                return;
            case 2:
                synchronized (((C18134r) this.f8026d).f39591c) {
                    C18119c<TResult> cVar = ((C18134r) this.f8026d).f39592d;
                    if (cVar != null) {
                        cVar.onComplete((C18123g) this.f8025c);
                    }
                }
                return;
            default:
                ((C15674y) this.f8025c).mo55506f((Bundle) this.f8026d);
                return;
        }
    }

    public /* synthetic */ C3421k(Object obj, Object obj2, int i) {
        this.f8024b = i;
        this.f8026d = obj;
        this.f8025c = obj2;
    }
}
