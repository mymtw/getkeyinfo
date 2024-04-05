package retrofit2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19388s;

public final class KotlinExtensions {

    /* renamed from: retrofit2.KotlinExtensions$a */
    public static final class C20074a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C19340c f44459b;

        /* renamed from: c */
        public final /* synthetic */ Exception f44460c;

        public C20074a(Exception exc, C19340c cVar) {
            this.f44459b = cVar;
            this.f44460c = exc;
        }

        public final void run() {
            C19388s.m32873m0(this.f44459b).resumeWith(Result.m35480constructorimpl(C0761x.m1673J(this.f44460c)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m34335a(java.lang.Exception r4, kotlin.coroutines.C19340c<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlin.m r4 = kotlin.C19394m.f43287a
            return r4
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            r0.L$0 = r4
            r0.label = r3
            rq.b r5 = kotlinx.coroutines.C19760n0.f43719a
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$a r3 = new retrofit2.KotlinExtensions$a
            r3.<init>(r4, r0)
            r5.mo7108A0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m34335a(java.lang.Exception, kotlin.coroutines.c):java.lang.Object");
    }
}
