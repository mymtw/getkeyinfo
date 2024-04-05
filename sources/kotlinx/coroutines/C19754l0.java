package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p514bk.C14088a;
import p568fn.C17782b;
import p768rq.C20157f;

/* renamed from: kotlinx.coroutines.l0 */
public abstract class C19754l0<T> extends C20157f {

    /* renamed from: d */
    public int f43712d;

    public C19754l0(int i) {
        this.f43712d = i;
    }

    /* renamed from: a */
    public void mo72452a(Object obj, CancellationException cancellationException) {
    }

    /* renamed from: b */
    public abstract C19340c<T> mo72453b();

    /* renamed from: c */
    public Throwable mo72543c(Object obj) {
        C19830v vVar = obj instanceof C19830v ? (C19830v) obj : null;
        if (vVar == null) {
            return null;
        }
        return vVar.f43842a;
    }

    /* renamed from: d */
    public <T> T mo72544d(Object obj) {
        return obj;
    }

    /* renamed from: e */
    public final void mo72555e(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C17782b.m29886t(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C19383o.m32794d(th);
            C14088a.m21785m(new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo72453b().getContext());
        }
    }

    /* renamed from: g */
    public abstract Object mo72454g();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r4.mo72221E0() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (r4.mo72221E0() != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x005e, all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[Catch:{ all -> 0x005e, all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC, Splitter:B:29:0x007d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            rq.g r0 = r12.f44639c
            kotlin.coroutines.c r1 = r12.mo72453b()     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.g r1 = (kotlinx.coroutines.internal.C19722g) r1     // Catch:{ all -> 0x00ad }
            kotlin.coroutines.c<T> r2 = r1.f43664f     // Catch:{ all -> 0x00ad }
            java.lang.Object r1 = r1.f43666h     // Catch:{ all -> 0x00ad }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.m33530c(r3, r1)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.t r4 = kotlinx.coroutines.internal.ThreadContextKt.f43649a     // Catch:{ all -> 0x00ad }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            kotlinx.coroutines.d2 r4 = kotlinx.coroutines.CoroutineContextKt.m33063d(r2, r3, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x005e }
            java.lang.Object r7 = r12.mo72454g()     // Catch:{ all -> 0x005e }
            java.lang.Throwable r8 = r12.mo72543c(r7)     // Catch:{ all -> 0x005e }
            if (r8 != 0) goto L_0x0042
            int r9 = r12.f43712d     // Catch:{ all -> 0x005e }
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            kotlinx.coroutines.g1$b r9 = kotlinx.coroutines.C19699g1.C19701b.f43635b     // Catch:{ all -> 0x005e }
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r9)     // Catch:{ all -> 0x005e }
            kotlinx.coroutines.g1 r6 = (kotlinx.coroutines.C19699g1) r6     // Catch:{ all -> 0x005e }
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x0060
            boolean r9 = r6.isActive()     // Catch:{ all -> 0x005e }
            if (r9 != 0) goto L_0x0060
            java.util.concurrent.CancellationException r6 = r6.mo72398h()     // Catch:{ all -> 0x005e }
            r12.mo72452a(r7, r6)     // Catch:{ all -> 0x005e }
            kotlin.Result$Failure r6 = androidx.compose.foundation.layout.C0761x.m1673J(r6)     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = kotlin.Result.m35480constructorimpl(r6)     // Catch:{ all -> 0x005e }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0079
        L_0x005e:
            r2 = move-exception
            goto L_0x00a1
        L_0x0060:
            if (r8 == 0) goto L_0x006e
            kotlin.Result$Failure r6 = androidx.compose.foundation.layout.C0761x.m1673J(r8)     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = kotlin.Result.m35480constructorimpl(r6)     // Catch:{ all -> 0x005e }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0079
        L_0x006e:
            java.lang.Object r6 = r12.mo72544d(r7)     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = kotlin.Result.m35480constructorimpl(r6)     // Catch:{ all -> 0x005e }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005e }
        L_0x0079:
            kotlin.m r2 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x005e }
            if (r4 == 0) goto L_0x0083
            boolean r2 = r4.mo72221E0()     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x0086
        L_0x0083:
            kotlinx.coroutines.internal.ThreadContextKt.m33528a(r3, r1)     // Catch:{ all -> 0x00ad }
        L_0x0086:
            r0.mo74403a()     // Catch:{ all -> 0x0090 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0099
        L_0x0090:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
        L_0x0099:
            java.lang.Throwable r0 = kotlin.Result.m35483exceptionOrNullimpl(r0)
            r12.mo72555e(r5, r0)
            goto L_0x00c8
        L_0x00a1:
            if (r4 == 0) goto L_0x00a9
            boolean r4 = r4.mo72221E0()     // Catch:{ all -> 0x00ad }
            if (r4 == 0) goto L_0x00ac
        L_0x00a9:
            kotlinx.coroutines.internal.ThreadContextKt.m33528a(r3, r1)     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            throw r2     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            r0.mo74403a()     // Catch:{ all -> 0x00b8 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c1
        L_0x00b8:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
        L_0x00c1:
            java.lang.Throwable r0 = kotlin.Result.m35483exceptionOrNullimpl(r0)
            r12.mo72555e(r1, r0)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C19754l0.run():void");
    }
}
