package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.text.q */
public final class C0964q {

    /* renamed from: a */
    public LayoutDirection f2036a;

    /* renamed from: b */
    public C7282b f2037b;

    /* renamed from: c */
    public C1952g.C1953a f2038c;

    /* renamed from: d */
    public C2023s f2039d;

    /* renamed from: e */
    public Object f2040e;

    /* renamed from: f */
    public long f2041f;

    public C0964q(LayoutDirection layoutDirection, C7282b bVar, C1952g.C1953a aVar, C2023s sVar, Object obj) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(aVar, "fontFamilyResolver");
        C19383o.m32797g(sVar, "resolvedStyle");
        C19383o.m32797g(obj, "typeface");
        this.f2036a = layoutDirection;
        this.f2037b = bVar;
        this.f2038c = aVar;
        this.f2039d = sVar;
        this.f2040e = obj;
        this.f2041f = C0960n.m1999a(sVar, bVar, aVar, C0960n.f2024a, 1);
    }
}
