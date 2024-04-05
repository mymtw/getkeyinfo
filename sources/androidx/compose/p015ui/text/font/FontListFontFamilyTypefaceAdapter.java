package androidx.compose.p015ui.text.font;

import kotlin.coroutines.C19338a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.C19842z;
import kotlinx.coroutines.internal.C19721f;

/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter */
public final class FontListFontFamilyTypefaceAdapter {

    /* renamed from: c */
    public static final C1942a f4391c = new C1942a();

    /* renamed from: a */
    public final AsyncTypefaceCache f4392a;

    /* renamed from: b */
    public C19721f f4393b;

    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$a */
    public static final class C1942a extends C19338a implements C19842z {
        public C1942a() {
            super(C19842z.C19843a.f43850b);
        }

        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        C19383o.m32797g(asyncTypefaceCache, "asyncTypefaceCache");
        C19383o.m32797g(emptyCoroutineContext, "injectedContext");
        this.f4392a = asyncTypefaceCache;
        this.f4393b = C19697g.m33463a(f4391c.plus(emptyCoroutineContext).plus(new C19838x1((C19699g1) emptyCoroutineContext.get(C19699g1.C19701b.f43635b))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        if ((r15.mo7536d() == r4) != false) goto L_0x0067;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.text.font.C1974z mo7517a(androidx.compose.p015ui.text.font.C1972x r18, androidx.compose.p015ui.text.font.C1963q r19, p753kq.C19857l<? super androidx.compose.p015ui.text.font.C1974z.C1976b, kotlin.C19394m> r20, p753kq.C19857l<? super androidx.compose.p015ui.text.font.C1972x, ? extends java.lang.Object> r21) {
        /*
            r17 = this;
            r1 = r17
            r5 = r18
            r8 = r19
            r2 = r21
            java.lang.String r0 = "typefaceRequest"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            java.lang.String r0 = "platformFontLoader"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "onAsyncCompletion"
            r7 = r20
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "createDefaultTypeface"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            androidx.compose.ui.text.font.g r0 = r5.f4429a
            boolean r3 = r0 instanceof androidx.compose.p015ui.text.font.C1956j
            r9 = 0
            if (r3 != 0) goto L_0x0026
            return r9
        L_0x0026:
            androidx.compose.ui.text.font.j r0 = (androidx.compose.p015ui.text.font.C1956j) r0
            java.util.ArrayList r0 = r0.f4406d
            androidx.compose.ui.text.font.m r3 = r5.f4430b
            int r4 = r5.f4431c
            java.lang.String r6 = "fontList"
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            java.lang.String r6 = "fontWeight"
            kotlin.jvm.internal.C19383o.m32797g(r3, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r10 = r0.size()
            r6.<init>(r10)
            int r10 = r0.size()
            r12 = 0
        L_0x0046:
            r13 = 1
            if (r12 >= r10) goto L_0x006f
            java.lang.Object r14 = r0.get(r12)
            r15 = r14
            androidx.compose.ui.text.font.f r15 = (androidx.compose.p015ui.text.font.C1950f) r15
            androidx.compose.ui.text.font.m r11 = r15.mo7535b()
            boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r11, r3)
            if (r11 == 0) goto L_0x0066
            int r11 = r15.mo7536d()
            if (r11 != r4) goto L_0x0062
            r11 = r13
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            if (r11 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            if (r13 == 0) goto L_0x006c
            r6.add(r14)
        L_0x006c:
            int r12 = r12 + 1
            goto L_0x0046
        L_0x006f:
            boolean r10 = r6.isEmpty()
            r10 = r10 ^ r13
            if (r10 == 0) goto L_0x0078
            goto L_0x025d
        L_0x0078:
            kotlin.m r6 = kotlin.C19394m.f43287a
            java.util.ArrayList r6 = new java.util.ArrayList
            int r10 = r0.size()
            r6.<init>(r10)
            int r10 = r0.size()
            r11 = 0
        L_0x0088:
            if (r11 >= r10) goto L_0x00a2
            java.lang.Object r12 = r0.get(r11)
            r14 = r12
            androidx.compose.ui.text.font.f r14 = (androidx.compose.p015ui.text.font.C1950f) r14
            int r14 = r14.mo7536d()
            if (r14 != r4) goto L_0x0099
            r14 = r13
            goto L_0x009a
        L_0x0099:
            r14 = 0
        L_0x009a:
            if (r14 == 0) goto L_0x009f
            r6.add(r12)
        L_0x009f:
            int r11 = r11 + 1
            goto L_0x0088
        L_0x00a2:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r0 = r6
        L_0x00aa:
            androidx.compose.ui.text.font.m r4 = androidx.compose.p015ui.text.font.C1959m.f4409c
            int r4 = r3.compareTo(r4)
            if (r4 >= 0) goto L_0x0116
            int r4 = r0.size()
            r10 = r9
            r11 = r10
            r6 = 0
        L_0x00b9:
            if (r6 >= r4) goto L_0x00e9
            java.lang.Object r12 = r0.get(r6)
            androidx.compose.ui.text.font.f r12 = (androidx.compose.p015ui.text.font.C1950f) r12
            androidx.compose.ui.text.font.m r12 = r12.mo7535b()
            int r14 = r12.compareTo(r3)
            if (r14 >= 0) goto L_0x00d5
            if (r10 == 0) goto L_0x00d3
            int r14 = r12.compareTo(r10)
            if (r14 <= 0) goto L_0x00e4
        L_0x00d3:
            r10 = r12
            goto L_0x00e4
        L_0x00d5:
            int r14 = r12.compareTo(r3)
            if (r14 <= 0) goto L_0x00e7
            if (r11 == 0) goto L_0x00e3
            int r14 = r12.compareTo(r11)
            if (r14 >= 0) goto L_0x00e4
        L_0x00e3:
            r11 = r12
        L_0x00e4:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x00e7:
            r10 = r12
            r11 = r10
        L_0x00e9:
            if (r10 != 0) goto L_0x00ec
            r10 = r11
        L_0x00ec:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            int r4 = r0.size()
            r6 = 0
        L_0x00fa:
            if (r6 >= r4) goto L_0x0113
            java.lang.Object r11 = r0.get(r6)
            r12 = r11
            androidx.compose.ui.text.font.f r12 = (androidx.compose.p015ui.text.font.C1950f) r12
            androidx.compose.ui.text.font.m r12 = r12.mo7535b()
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r12, r10)
            if (r12 == 0) goto L_0x0110
            r3.add(r11)
        L_0x0110:
            int r6 = r6 + 1
            goto L_0x00fa
        L_0x0113:
            r6 = r3
            goto L_0x025d
        L_0x0116:
            androidx.compose.ui.text.font.m r4 = androidx.compose.p015ui.text.font.C1959m.f4410d
            int r6 = r3.compareTo(r4)
            if (r6 <= 0) goto L_0x0180
            int r4 = r0.size()
            r10 = r9
            r11 = r10
            r6 = 0
        L_0x0125:
            if (r6 >= r4) goto L_0x0155
            java.lang.Object r12 = r0.get(r6)
            androidx.compose.ui.text.font.f r12 = (androidx.compose.p015ui.text.font.C1950f) r12
            androidx.compose.ui.text.font.m r12 = r12.mo7535b()
            int r14 = r12.compareTo(r3)
            if (r14 >= 0) goto L_0x0141
            if (r10 == 0) goto L_0x013f
            int r14 = r12.compareTo(r10)
            if (r14 <= 0) goto L_0x0150
        L_0x013f:
            r10 = r12
            goto L_0x0150
        L_0x0141:
            int r14 = r12.compareTo(r3)
            if (r14 <= 0) goto L_0x0153
            if (r11 == 0) goto L_0x014f
            int r14 = r12.compareTo(r11)
            if (r14 >= 0) goto L_0x0150
        L_0x014f:
            r11 = r12
        L_0x0150:
            int r6 = r6 + 1
            goto L_0x0125
        L_0x0153:
            r10 = r12
            r11 = r10
        L_0x0155:
            if (r11 != 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r10 = r11
        L_0x0159:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            int r4 = r0.size()
            r6 = 0
        L_0x0167:
            if (r6 >= r4) goto L_0x0113
            java.lang.Object r11 = r0.get(r6)
            r12 = r11
            androidx.compose.ui.text.font.f r12 = (androidx.compose.p015ui.text.font.C1950f) r12
            androidx.compose.ui.text.font.m r12 = r12.mo7535b()
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r12, r10)
            if (r12 == 0) goto L_0x017d
            r3.add(r11)
        L_0x017d:
            int r6 = r6 + 1
            goto L_0x0167
        L_0x0180:
            int r6 = r0.size()
            r11 = r9
            r12 = r11
            r10 = 0
        L_0x0187:
            if (r10 >= r6) goto L_0x01bf
            java.lang.Object r14 = r0.get(r10)
            androidx.compose.ui.text.font.f r14 = (androidx.compose.p015ui.text.font.C1950f) r14
            androidx.compose.ui.text.font.m r14 = r14.mo7535b()
            int r15 = r14.compareTo(r4)
            if (r15 > 0) goto L_0x01bc
            int r15 = r14.compareTo(r3)
            if (r15 >= 0) goto L_0x01a9
            if (r11 == 0) goto L_0x01a7
            int r15 = r14.compareTo(r11)
            if (r15 <= 0) goto L_0x01bc
        L_0x01a7:
            r11 = r14
            goto L_0x01bc
        L_0x01a9:
            int r15 = r14.compareTo(r3)
            if (r15 <= 0) goto L_0x01b9
            if (r12 == 0) goto L_0x01b7
            int r15 = r14.compareTo(r12)
            if (r15 >= 0) goto L_0x01bc
        L_0x01b7:
            r12 = r14
            goto L_0x01bc
        L_0x01b9:
            r11 = r14
            r12 = r11
            goto L_0x01bf
        L_0x01bc:
            int r10 = r10 + 1
            goto L_0x0187
        L_0x01bf:
            if (r12 != 0) goto L_0x01c2
            goto L_0x01c3
        L_0x01c2:
            r11 = r12
        L_0x01c3:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r0.size()
            r4.<init>(r6)
            int r6 = r0.size()
            r10 = 0
        L_0x01d1:
            if (r10 >= r6) goto L_0x01ea
            java.lang.Object r12 = r0.get(r10)
            r14 = r12
            androidx.compose.ui.text.font.f r14 = (androidx.compose.p015ui.text.font.C1950f) r14
            androidx.compose.ui.text.font.m r14 = r14.mo7535b()
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r14, r11)
            if (r14 == 0) goto L_0x01e7
            r4.add(r12)
        L_0x01e7:
            int r10 = r10 + 1
            goto L_0x01d1
        L_0x01ea:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x025c
            androidx.compose.ui.text.font.m r4 = androidx.compose.p015ui.text.font.C1959m.f4410d
            int r6 = r0.size()
            r11 = r9
            r12 = r11
            r10 = 0
        L_0x01f9:
            if (r10 >= r6) goto L_0x0231
            java.lang.Object r14 = r0.get(r10)
            androidx.compose.ui.text.font.f r14 = (androidx.compose.p015ui.text.font.C1950f) r14
            androidx.compose.ui.text.font.m r14 = r14.mo7535b()
            if (r4 == 0) goto L_0x020d
            int r15 = r14.compareTo(r4)
            if (r15 < 0) goto L_0x022c
        L_0x020d:
            int r15 = r14.compareTo(r3)
            if (r15 >= 0) goto L_0x021d
            if (r11 == 0) goto L_0x021b
            int r15 = r14.compareTo(r11)
            if (r15 <= 0) goto L_0x022c
        L_0x021b:
            r11 = r14
            goto L_0x022c
        L_0x021d:
            int r15 = r14.compareTo(r3)
            if (r15 <= 0) goto L_0x022f
            if (r12 == 0) goto L_0x022b
            int r15 = r14.compareTo(r12)
            if (r15 >= 0) goto L_0x022c
        L_0x022b:
            r12 = r14
        L_0x022c:
            int r10 = r10 + 1
            goto L_0x01f9
        L_0x022f:
            r11 = r14
            r12 = r11
        L_0x0231:
            if (r12 != 0) goto L_0x0234
            goto L_0x0235
        L_0x0234:
            r11 = r12
        L_0x0235:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            int r4 = r0.size()
            r6 = 0
        L_0x0243:
            if (r6 >= r4) goto L_0x0113
            java.lang.Object r10 = r0.get(r6)
            r12 = r10
            androidx.compose.ui.text.font.f r12 = (androidx.compose.p015ui.text.font.C1950f) r12
            androidx.compose.ui.text.font.m r12 = r12.mo7535b()
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r12, r11)
            if (r12 == 0) goto L_0x0259
            r3.add(r10)
        L_0x0259:
            int r6 = r6 + 1
            goto L_0x0243
        L_0x025c:
            r6 = r4
        L_0x025d:
            androidx.compose.ui.text.font.AsyncTypefaceCache r3 = r1.f4392a
            int r4 = r6.size()
            r11 = r9
            r10 = 0
        L_0x0265:
            if (r10 >= r4) goto L_0x03cc
            java.lang.Object r0 = r6.get(r10)
            r12 = r0
            androidx.compose.ui.text.font.f r12 = (androidx.compose.p015ui.text.font.C1950f) r12
            int r0 = r12.mo7526c()
            if (r0 != 0) goto L_0x0276
            r14 = r13
            goto L_0x0277
        L_0x0276:
            r14 = 0
        L_0x0277:
            if (r14 == 0) goto L_0x02ed
            com.google.android.play.core.assetpacks.c1 r2 = r3.f4387c
            monitor-enter(r2)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x02ea }
            r19.mo7528b()     // Catch:{ all -> 0x02ea }
            r0.<init>(r12, r9)     // Catch:{ all -> 0x02ea }
            j0.a<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r4 = r3.f4385a     // Catch:{ all -> 0x02ea }
            java.lang.Object r4 = r4.mo19418a(r0)     // Catch:{ all -> 0x02ea }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r4 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r4     // Catch:{ all -> 0x02ea }
            if (r4 != 0) goto L_0x0297
            j0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r4 = r3.f4386b     // Catch:{ all -> 0x02ea }
            java.lang.Object r0 = r4.mo19423a(r0)     // Catch:{ all -> 0x02ea }
            r4 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r4 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r4     // Catch:{ all -> 0x02ea }
        L_0x0297:
            if (r4 == 0) goto L_0x029d
            java.lang.Object r0 = r4.f4388a     // Catch:{ all -> 0x02ea }
            monitor-exit(r2)
            goto L_0x02a7
        L_0x029d:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x02ea }
            monitor-exit(r2)
            android.graphics.Typeface r0 = r8.mo7527a(r12)     // Catch:{ Exception -> 0x02d1 }
            androidx.compose.p015ui.text.font.AsyncTypefaceCache.m4261a(r3, r12, r8, r0)
        L_0x02a7:
            if (r0 == 0) goto L_0x02ba
            int r2 = r5.f4432d
            androidx.compose.ui.text.font.m r3 = r5.f4430b
            int r4 = r5.f4431c
            java.lang.Object r0 = kotlinx.coroutines.C19543e0.m33327p0(r2, r0, r12, r3, r4)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r11, r0)
            goto L_0x03d5
        L_0x02ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x02d1:
            r0 = move-exception
            r2 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to load font "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r2)
            throw r0
        L_0x02ea:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02ed:
            if (r0 != r13) goto L_0x02f1
            r14 = r13
            goto L_0x02f2
        L_0x02f1:
            r14 = 0
        L_0x02f2:
            if (r14 == 0) goto L_0x0350
            com.google.android.play.core.assetpacks.c1 r14 = r3.f4387c
            monitor-enter(r14)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x034d }
            r19.mo7528b()     // Catch:{ all -> 0x034d }
            r0.<init>(r12, r9)     // Catch:{ all -> 0x034d }
            j0.a<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r15 = r3.f4385a     // Catch:{ all -> 0x034d }
            java.lang.Object r15 = r15.mo19418a(r0)     // Catch:{ all -> 0x034d }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r15 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r15     // Catch:{ all -> 0x034d }
            if (r15 != 0) goto L_0x0312
            j0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r15 = r3.f4386b     // Catch:{ all -> 0x034d }
            java.lang.Object r0 = r15.mo19423a(r0)     // Catch:{ all -> 0x034d }
            r15 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r15 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r15     // Catch:{ all -> 0x034d }
        L_0x0312:
            if (r15 == 0) goto L_0x0318
            java.lang.Object r0 = r15.f4388a     // Catch:{ all -> 0x034d }
            monitor-exit(r14)
            goto L_0x0337
        L_0x0318:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x034d }
            monitor-exit(r14)
            android.graphics.Typeface r0 = r8.mo7527a(r12)     // Catch:{ all -> 0x0324 }
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x0324 }
            goto L_0x032d
        L_0x0324:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
        L_0x032d:
            boolean r14 = kotlin.Result.m35485isFailureimpl(r0)
            if (r14 == 0) goto L_0x0334
            r0 = r9
        L_0x0334:
            androidx.compose.p015ui.text.font.AsyncTypefaceCache.m4261a(r3, r12, r8, r0)
        L_0x0337:
            if (r0 == 0) goto L_0x034a
            int r2 = r5.f4432d
            androidx.compose.ui.text.font.m r3 = r5.f4430b
            int r4 = r5.f4431c
            java.lang.Object r0 = kotlinx.coroutines.C19543e0.m33327p0(r2, r0, r12, r3, r4)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r11, r0)
            goto L_0x03d5
        L_0x034a:
            r16 = 0
            goto L_0x03ae
        L_0x034d:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0350:
            r14 = 2
            if (r0 != r14) goto L_0x0355
            r0 = r13
            goto L_0x0356
        L_0x0355:
            r0 = 0
        L_0x0356:
            if (r0 == 0) goto L_0x03b5
            r3.getClass()
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            r19.mo7528b()
            r0.<init>(r12, r9)
            com.google.android.play.core.assetpacks.c1 r14 = r3.f4387c
            monitor-enter(r14)
            j0.a<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r15 = r3.f4385a     // Catch:{ all -> 0x03b2 }
            java.lang.Object r15 = r15.mo19418a(r0)     // Catch:{ all -> 0x03b2 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r15 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r15     // Catch:{ all -> 0x03b2 }
            if (r15 != 0) goto L_0x0379
            j0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r15 = r3.f4386b     // Catch:{ all -> 0x03b2 }
            java.lang.Object r0 = r15.mo19423a(r0)     // Catch:{ all -> 0x03b2 }
            r15 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r15 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r15     // Catch:{ all -> 0x03b2 }
        L_0x0379:
            monitor-exit(r14)
            if (r15 != 0) goto L_0x038f
            if (r11 != 0) goto L_0x0389
            androidx.compose.ui.text.font.f[] r0 = new androidx.compose.p015ui.text.font.C1950f[r13]
            r16 = 0
            r0[r16] = r12
            java.util.ArrayList r11 = p568fn.C17782b.m29866f0(r0)
            goto L_0x03ae
        L_0x0389:
            r16 = 0
            r11.add(r12)
            goto L_0x03ae
        L_0x038f:
            r16 = 0
            java.lang.Object r0 = r15.f4388a
            if (r0 != 0) goto L_0x0397
            r14 = r13
            goto L_0x0399
        L_0x0397:
            r14 = r16
        L_0x0399:
            if (r14 == 0) goto L_0x039c
            goto L_0x03ae
        L_0x039c:
            if (r0 == 0) goto L_0x03ae
            int r2 = r5.f4432d
            androidx.compose.ui.text.font.m r3 = r5.f4430b
            int r4 = r5.f4431c
            java.lang.Object r0 = kotlinx.coroutines.C19543e0.m33327p0(r2, r0, r12, r3, r4)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r11, r0)
            goto L_0x03d5
        L_0x03ae:
            int r10 = r10 + 1
            goto L_0x0265
        L_0x03b2:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x03b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown font type "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03cc:
            java.lang.Object r0 = r2.invoke(r5)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r11, r0)
        L_0x03d5:
            java.lang.Object r0 = r2.component1()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.component2()
            if (r3 != 0) goto L_0x03e8
            androidx.compose.ui.text.font.z$b r0 = new androidx.compose.ui.text.font.z$b
            r0.<init>(r4, r13)
            return r0
        L_0x03e8:
            androidx.compose.ui.text.font.AsyncFontListLoader r0 = new androidx.compose.ui.text.font.AsyncFontListLoader
            androidx.compose.ui.text.font.AsyncTypefaceCache r6 = r1.f4392a
            r2 = r0
            r5 = r18
            r7 = r20
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.internal.f r2 = r1.f4393b
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1 r4 = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1
            r4.<init>(r0, r9)
            kotlinx.coroutines.C19697g.m33468f(r2, r9, r3, r4, r13)
            androidx.compose.ui.text.font.z$a r2 = new androidx.compose.ui.text.font.z$a
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.FontListFontFamilyTypefaceAdapter.mo7517a(androidx.compose.ui.text.font.x, androidx.compose.ui.text.font.q, kq.l, kq.l):androidx.compose.ui.text.font.z");
    }
}
