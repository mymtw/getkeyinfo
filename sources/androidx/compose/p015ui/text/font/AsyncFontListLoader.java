package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.font.C1974z;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader */
public final class AsyncFontListLoader implements C1342k1<Object> {

    /* renamed from: b */
    public final List<C1950f> f4378b;

    /* renamed from: c */
    public final C1972x f4379c;

    /* renamed from: d */
    public final AsyncTypefaceCache f4380d;

    /* renamed from: e */
    public final C19857l<C1974z.C1976b, C19394m> f4381e;

    /* renamed from: f */
    public final C1963q f4382f;

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f4383g;

    /* renamed from: h */
    public boolean f4384h = true;

    public AsyncFontListLoader(List<? extends C1950f> list, Object obj, C1972x xVar, AsyncTypefaceCache asyncTypefaceCache, C19857l<? super C1974z.C1976b, C19394m> lVar, C1963q qVar) {
        C19383o.m32797g(obj, "initialType");
        C19383o.m32797g(xVar, "typefaceRequest");
        C19383o.m32797g(asyncTypefaceCache, "asyncTypefaceCache");
        C19383o.m32797g(lVar, "onCompletion");
        C19383o.m32797g(qVar, "platformFontLoader");
        this.f4378b = list;
        this.f4379c = xVar;
        this.f4380d = asyncTypefaceCache;
        this.f4381e = lVar;
        this.f4382f = qVar;
        this.f4383g = C0761x.m1751w0(obj, C1351n1.f2948a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[SYNTHETIC, Splitter:B:26:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[SYNTHETIC, Splitter:B:44:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7501d(kotlin.coroutines.C19340c<? super kotlin.C19394m> r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            boolean r2 = r0 instanceof androidx.compose.p015ui.text.font.AsyncFontListLoader$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = (androidx.compose.p015ui.text.font.AsyncFontListLoader$load$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 0
            r6 = 1
            r7 = 2
            r8 = 0
            if (r4 == 0) goto L_0x0064
            if (r4 == r6) goto L_0x0048
            if (r4 != r7) goto L_0x0040
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r11 = (androidx.compose.p015ui.text.font.AsyncFontListLoader) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x003d }
            goto L_0x00f3
        L_0x003d:
            r0 = move-exception
            goto L_0x0126
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0048:
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$2
            androidx.compose.ui.text.font.f r10 = (androidx.compose.p015ui.text.font.C1950f) r10
            java.lang.Object r11 = r2.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r12 = (androidx.compose.p015ui.text.font.AsyncFontListLoader) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ all -> 0x00f7 }
            r19 = r11
            r11 = r10
            r10 = r19
            goto L_0x00b1
        L_0x0061:
            r11 = r12
            goto L_0x0126
        L_0x0064:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            java.util.List<androidx.compose.ui.text.font.f> r0 = r1.f4378b     // Catch:{ all -> 0x0124 }
            int r4 = r0.size()     // Catch:{ all -> 0x0124 }
            r14 = r1
            r15 = r8
        L_0x006f:
            if (r15 >= r4) goto L_0x0107
            java.lang.Object r9 = r0.get(r15)     // Catch:{ all -> 0x0101 }
            r13 = r9
            androidx.compose.ui.text.font.f r13 = (androidx.compose.p015ui.text.font.C1950f) r13     // Catch:{ all -> 0x0101 }
            int r9 = r13.mo7526c()     // Catch:{ all -> 0x0101 }
            if (r9 != r7) goto L_0x0080
            r9 = r6
            goto L_0x0081
        L_0x0080:
            r9 = r8
        L_0x0081:
            if (r9 == 0) goto L_0x00fc
            androidx.compose.ui.text.font.AsyncTypefaceCache r9 = r14.f4380d     // Catch:{ all -> 0x0101 }
            androidx.compose.ui.text.font.q r11 = r14.f4382f     // Catch:{ all -> 0x0101 }
            r12 = 0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 r10 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1     // Catch:{ all -> 0x0101 }
            r10.<init>(r14, r13, r5)     // Catch:{ all -> 0x0101 }
            r2.L$0 = r14     // Catch:{ all -> 0x0101 }
            r2.L$1 = r0     // Catch:{ all -> 0x0101 }
            r2.L$2 = r13     // Catch:{ all -> 0x0101 }
            r2.I$0 = r15     // Catch:{ all -> 0x0101 }
            r2.I$1 = r4     // Catch:{ all -> 0x0101 }
            r2.label = r6     // Catch:{ all -> 0x0101 }
            r16 = r10
            r10 = r13
            r17 = r13
            r13 = r16
            r18 = r14
            r14 = r2
            java.lang.Object r9 = r9.mo7505b(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00fa }
            if (r9 != r3) goto L_0x00aa
            return r3
        L_0x00aa:
            r10 = r0
            r0 = r9
            r9 = r15
            r11 = r17
            r12 = r18
        L_0x00b1:
            if (r0 == 0) goto L_0x00df
            androidx.compose.ui.text.font.x r3 = r12.f4379c     // Catch:{ all -> 0x00f7 }
            int r4 = r3.f4432d     // Catch:{ all -> 0x00f7 }
            androidx.compose.ui.text.font.m r5 = r3.f4430b     // Catch:{ all -> 0x00f7 }
            int r3 = r3.f4431c     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = kotlinx.coroutines.C19543e0.m33327p0(r4, r0, r11, r5, r3)     // Catch:{ all -> 0x00f7 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r12.f4383g     // Catch:{ all -> 0x00f7 }
            r3.setValue(r0)     // Catch:{ all -> 0x00f7 }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00f7 }
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = androidx.compose.p015ui.text.input.C1993m.m4355P(r2)
            r12.f4384h = r8
            kq.l<androidx.compose.ui.text.font.z$b, kotlin.m> r3 = r12.f4381e
            androidx.compose.ui.text.font.z$b r4 = new androidx.compose.ui.text.font.z$b
            java.lang.Object r5 = r12.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00df:
            r2.L$0 = r12     // Catch:{ all -> 0x00f7 }
            r2.L$1 = r10     // Catch:{ all -> 0x00f7 }
            r2.L$2 = r5     // Catch:{ all -> 0x00f7 }
            r2.I$0 = r9     // Catch:{ all -> 0x00f7 }
            r2.I$1 = r4     // Catch:{ all -> 0x00f7 }
            r2.label = r7     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = kotlinx.coroutines.C19543e0.m33337u0(r2)     // Catch:{ all -> 0x00f7 }
            if (r0 != r3) goto L_0x00f2
            return r3
        L_0x00f2:
            r11 = r12
        L_0x00f3:
            r15 = r9
            r0 = r10
            r14 = r11
            goto L_0x00fe
        L_0x00f7:
            r0 = move-exception
            goto L_0x0061
        L_0x00fa:
            r0 = move-exception
            goto L_0x0104
        L_0x00fc:
            r18 = r14
        L_0x00fe:
            int r15 = r15 + r6
            goto L_0x006f
        L_0x0101:
            r0 = move-exception
            r18 = r14
        L_0x0104:
            r11 = r18
            goto L_0x0126
        L_0x0107:
            r18 = r14
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            boolean r0 = androidx.compose.p015ui.text.input.C1993m.m4355P(r0)
            r14.f4384h = r8
            kq.l<androidx.compose.ui.text.font.z$b, kotlin.m> r2 = r14.f4381e
            androidx.compose.ui.text.font.z$b r3 = new androidx.compose.ui.text.font.z$b
            java.lang.Object r4 = r14.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        L_0x0124:
            r0 = move-exception
            r11 = r1
        L_0x0126:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = androidx.compose.p015ui.text.input.C1993m.m4355P(r2)
            r11.f4384h = r8
            kq.l<androidx.compose.ui.text.font.z$b, kotlin.m> r3 = r11.f4381e
            androidx.compose.ui.text.font.z$b r4 = new androidx.compose.ui.text.font.z$b
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.AsyncFontListLoader.mo7501d(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7502e(androidx.compose.p015ui.text.font.C1950f r8, kotlin.coroutines.C19340c<java.lang.Object> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.p015ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.p015ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.text.font.f r8 = (androidx.compose.p015ui.text.font.C1950f) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004b }
            goto L_0x0049
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            r5 = 15000(0x3a98, double:7.411E-320)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r9 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004b }
            r9.<init>(r7, r8, r4)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004b }
            r0.L$0 = r8     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004b }
            r0.label = r3     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004b }
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.m33071b(r5, r9, r0)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004b }
            if (r9 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r4 = r9
            goto L_0x0085
        L_0x004b:
            r9 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            int r2 = kotlinx.coroutines.C19842z.f43849c1
            kotlinx.coroutines.z$a r2 = kotlinx.coroutines.C19842z.C19843a.f43850b
            kotlin.coroutines.CoroutineContext$a r1 = r1.get(r2)
            kotlinx.coroutines.z r1 = (kotlinx.coroutines.C19842z) r1
            if (r1 == 0) goto L_0x0085
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r2.<init>(r8, r9)
            r1.handleException(r0, r2)
            goto L_0x0085
        L_0x007a:
            r8 = move-exception
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            boolean r9 = androidx.compose.p015ui.text.input.C1993m.m4355P(r9)
            if (r9 == 0) goto L_0x0086
        L_0x0085:
            return r4
        L_0x0086:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.AsyncFontListLoader.mo7502e(androidx.compose.ui.text.font.f, kotlin.coroutines.c):java.lang.Object");
    }

    public final Object getValue() {
        return this.f4383g.getValue();
    }
}
