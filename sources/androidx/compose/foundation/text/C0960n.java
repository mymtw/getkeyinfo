package androidx.compose.foundation.text;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.platform.AndroidParagraph;
import androidx.compose.p015ui.text.platform.C2016a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p173m.C7279a;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.text.n */
public final class C0960n {

    /* renamed from: a */
    public static final String f2024a = C19457k.m33022Z0(10, "H");

    /* renamed from: a */
    public static final long m1999a(C2023s sVar, C7282b bVar, C1952g.C1953a aVar, String str, int i) {
        C19383o.m32797g(sVar, "style");
        C7282b bVar2 = bVar;
        C19383o.m32797g(bVar2, "density");
        C1952g.C1953a aVar2 = aVar;
        C19383o.m32797g(aVar2, "fontFamilyResolver");
        String str2 = str;
        C19383o.m32797g(str2, "text");
        EmptyList emptyList = EmptyList.INSTANCE;
        long r = C0114h.m315r(0, 0, 15);
        C19383o.m32797g(emptyList, "spanStyles");
        C2016a aVar3 = new C2016a(sVar, aVar2, bVar2, str2, emptyList, emptyList);
        return C0761x.m1707a(C7279a.m13954l((float) Math.ceil((double) aVar3.mo7365c())), C7279a.m13954l((float) Math.ceil((double) new AndroidParagraph(aVar3, i, false, r).getHeight())));
    }
}
