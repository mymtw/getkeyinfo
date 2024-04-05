package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0965r;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1981a;
import androidx.compose.p015ui.text.input.C1984d;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2001s;
import androidx.compose.p015ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.text.selection.o */
public final class C1021o extends C1004a<C1021o> {

    /* renamed from: h */
    public final TextFieldValue f2148h;

    /* renamed from: i */
    public final C0965r f2149i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1021o(TextFieldValue textFieldValue, C1994n nVar, C0965r rVar, C1025s sVar) {
        super(textFieldValue.f4448a, textFieldValue.f4449b, rVar != null ? rVar.f2042a : null, nVar, sVar);
        C19383o.m32797g(textFieldValue, "currentValue");
        C19383o.m32797g(nVar, "offsetMapping");
        C19383o.m32797g(sVar, "state");
        this.f2148h = textFieldValue;
        this.f2149i = rVar;
    }

    /* renamed from: x */
    public final List<C1984d> mo4724x(C19857l<? super C1021o, ? extends C1984d> lVar) {
        C19383o.m32797g(lVar, "or");
        if (C2022r.m4463b(this.f2110f)) {
            C1984d dVar = (C1984d) lVar.invoke(this);
            if (dVar != null) {
                return C17782b.m29864d0(dVar);
            }
            return null;
        }
        return C17782b.m29865e0(new C1981a("", 0), new C2001s(C2022r.m4466e(this.f2110f), C2022r.m4466e(this.f2110f)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r2 == null) goto L_0x0010;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4725y(androidx.compose.foundation.text.C0965r r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.j r0 = r6.f2043b
            if (r0 == 0) goto L_0x0010
            androidx.compose.ui.layout.j r1 = r6.f2044c
            r2 = 0
            if (r1 == 0) goto L_0x000e
            r2 = 1
            y.d r2 = r1.mo6689v(r0, r2)
        L_0x000e:
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            y.d r2 = p288y.C8345d.f18300e
        L_0x0012:
            androidx.compose.ui.text.input.n r0 = r5.f2108d
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.f2148h
            long r3 = r1.f4449b
            int r1 = androidx.compose.p015ui.text.C2022r.m4464c(r3)
            int r0 = r0.mo7684b(r1)
            androidx.compose.ui.text.q r1 = r6.f2042a
            y.d r0 = r1.mo7740c(r0)
            float r1 = r0.f18301a
            float r0 = r0.f18302b
            float r3 = r2.f18303c
            float r4 = r2.f18301a
            float r3 = r3 - r4
            float r4 = r2.f18304d
            float r2 = r2.f18302b
            float r4 = r4 - r2
            long r2 = androidx.activity.C0114h.m319t(r3, r4)
            float r2 = p288y.C8347f.m16654b(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r2 = r2 + r0
            androidx.compose.ui.text.input.n r7 = r5.f2108d
            androidx.compose.ui.text.q r6 = r6.f2042a
            long r0 = kotlin.reflect.C19421p.m32952q(r1, r2)
            int r6 = r6.mo7751l(r0)
            int r6 = r7.mo7683a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C1021o.mo4725y(androidx.compose.foundation.text.r, int):int");
    }
}
