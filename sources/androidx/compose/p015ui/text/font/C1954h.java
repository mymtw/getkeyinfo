package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.font.C1952g;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.font.h */
public final class C1954h implements C1952g.C1953a {

    /* renamed from: a */
    public final C1963q f4397a;

    /* renamed from: b */
    public final C1964r f4398b;

    /* renamed from: c */
    public final C1973y f4399c;

    /* renamed from: d */
    public final FontListFontFamilyTypefaceAdapter f4400d;

    /* renamed from: e */
    public final C1962p f4401e;

    /* renamed from: f */
    public final C19857l<C1972x, Object> f4402f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);

    public C1954h(C1946b bVar, C1947c cVar) {
        C1973y yVar = C1955i.f4403a;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = new FontListFontFamilyTypefaceAdapter(C1955i.f4404b);
        C1962p pVar = new C1962p();
        C19383o.m32797g(yVar, "typefaceRequestCache");
        this.f4397a = bVar;
        this.f4398b = cVar;
        this.f4399c = yVar;
        this.f4400d = fontListFontFamilyTypefaceAdapter;
        this.f4401e = pVar;
    }

    /* renamed from: a */
    public final C1974z mo7537a(C1952g gVar, C1959m mVar, int i, int i2) {
        C19383o.m32797g(mVar, "fontWeight");
        this.f4398b.getClass();
        int i3 = C1964r.f4421a;
        C1959m a = this.f4398b.mo7530a(mVar);
        this.f4398b.getClass();
        this.f4398b.getClass();
        this.f4397a.mo7528b();
        return mo7538b(new C1972x(gVar, a, i, i2, (Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.compose.ui.text.font.z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.text.font.C1974z mo7538b(androidx.compose.p015ui.text.font.C1972x r6) {
        /*
            r5 = this;
            androidx.compose.ui.text.font.y r0 = r5.f4399c
            androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1 r1 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            r1.<init>(r5, r6)
            r0.getClass()
            com.google.android.play.core.assetpacks.c1 r2 = r0.f4434a
            monitor-enter(r2)
            j0.a<androidx.compose.ui.text.font.x, androidx.compose.ui.text.font.z> r3 = r0.f4435b     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r3.mo19418a(r6)     // Catch:{ all -> 0x005a }
            androidx.compose.ui.text.font.z r3 = (androidx.compose.p015ui.text.font.C1974z) r3     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0027
            boolean r4 = r3.mo7592a()     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x001f
            monitor-exit(r2)
            goto L_0x004d
        L_0x001f:
            j0.a<androidx.compose.ui.text.font.x, androidx.compose.ui.text.font.z> r3 = r0.f4435b     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r3.mo19420c(r6)     // Catch:{ all -> 0x005a }
            androidx.compose.ui.text.font.z r3 = (androidx.compose.p015ui.text.font.C1974z) r3     // Catch:{ all -> 0x005a }
        L_0x0027:
            monitor-exit(r2)
            androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 r2 = new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r0, r6)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r1 = r1.invoke(r2)     // Catch:{ Exception -> 0x0051 }
            r3 = r1
            androidx.compose.ui.text.font.z r3 = (androidx.compose.p015ui.text.font.C1974z) r3     // Catch:{ Exception -> 0x0051 }
            com.google.android.play.core.assetpacks.c1 r1 = r0.f4434a
            monitor-enter(r1)
            j0.a<androidx.compose.ui.text.font.x, androidx.compose.ui.text.font.z> r2 = r0.f4435b     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.mo19418a(r6)     // Catch:{ all -> 0x004e }
            if (r2 != 0) goto L_0x004a
            boolean r2 = r3.mo7592a()     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x004a
            j0.a<androidx.compose.ui.text.font.x, androidx.compose.ui.text.font.z> r0 = r0.f4435b     // Catch:{ all -> 0x004e }
            r0.mo19419b(r6, r3)     // Catch:{ all -> 0x004e }
        L_0x004a:
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x004e }
            monitor-exit(r1)
        L_0x004d:
            return r3
        L_0x004e:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x0051:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r6)
            throw r0
        L_0x005a:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.C1954h.mo7538b(androidx.compose.ui.text.font.x):androidx.compose.ui.text.font.z");
    }
}
