package kotlinx.coroutines.rx2;

import androidx.core.widget.C2399d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.internal.C19721f;
import p145io.reactivex.disposables.C7092b;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p628nj.C18263b;
import p736cq.C18981a;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.rx2.c */
public final class C19790c {
    /* renamed from: a */
    public static final Disposable m33751a(C19721f fVar, Runnable runnable, long j, C19857l lVar) {
        CoroutineContext coroutineContext = fVar.f43661b;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Disposable b = C7092b.m13751b(new C2399d(ref$ObjectRef, 10));
        C18981a.m32124c(runnable);
        Runnable runnable2 = (Runnable) lVar.invoke(new RxSchedulerKt$scheduleTask$toSchedule$1(b, coroutineContext, runnable));
        if (!C19697g.m33467e(fVar)) {
            return EmptyDisposable.INSTANCE;
        }
        if (j <= 0) {
            runnable2.run();
            return b;
        }
        ref$ObjectRef.element = C18263b.m30821P(coroutineContext).mo72115i(j, runnable2, coroutineContext);
        return b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlin.coroutines.CoroutineContext} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33752b(p145io.reactivex.disposables.Disposable r4, kotlin.coroutines.CoroutineContext r5, java.lang.Runnable r6, kotlin.coroutines.C19340c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r0 = (kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r0 = new kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r4 = r0.L$0
            r5 = r4
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            boolean r4 = r4.isDisposed()
            if (r4 == 0) goto L_0x0040
            kotlin.m r1 = kotlin.C19394m.f43287a
            goto L_0x0056
        L_0x0040:
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$2 r4 = new kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$2     // Catch:{ all -> 0x0050 }
            r4.<init>(r6)     // Catch:{ all -> 0x0050 }
            r0.L$0 = r5     // Catch:{ all -> 0x0050 }
            r0.label = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = kotlinx.coroutines.C19481c1.m33096a(r4, r0)     // Catch:{ all -> 0x0050 }
            if (r4 != r1) goto L_0x0054
            goto L_0x0056
        L_0x0050:
            r4 = move-exception
            kotlinx.coroutines.rx2.C19789b.m33749b(r4, r5)
        L_0x0054:
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.C19790c.m33752b(io.reactivex.disposables.Disposable, kotlin.coroutines.CoroutineContext, java.lang.Runnable, kotlin.coroutines.c):java.lang.Object");
    }
}
