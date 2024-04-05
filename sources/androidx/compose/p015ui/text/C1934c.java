package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0069a;
import androidx.activity.C0114h;
import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.p015ui.text.platform.AndroidParagraph;
import androidx.compose.p015ui.text.platform.C2016a;
import androidx.compose.p015ui.text.style.C2030e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7280a;
import p288y.C8345d;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.text.c */
public final class C1934c {

    /* renamed from: a */
    public final MultiParagraphIntrinsics f4360a;

    /* renamed from: b */
    public final int f4361b;

    /* renamed from: c */
    public final boolean f4362c;

    /* renamed from: d */
    public final float f4363d;

    /* renamed from: e */
    public final float f4364e;

    /* renamed from: f */
    public final int f4365f;

    /* renamed from: g */
    public final ArrayList f4366g;

    /* renamed from: h */
    public final ArrayList f4367h;

    public C1934c(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        int i2;
        float height;
        int i3;
        MultiParagraphIntrinsics multiParagraphIntrinsics2 = multiParagraphIntrinsics;
        this.f4360a = multiParagraphIntrinsics2;
        this.f4361b = i;
        if (C7280a.m13965j(j) == 0 && C7280a.m13964i(j) == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = multiParagraphIntrinsics2.f4275e;
            int size = arrayList2.size();
            float f = 0.0f;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= size) {
                    z2 = false;
                    break;
                }
                C1937f fVar = (C1937f) arrayList2.get(i4);
                C1977g gVar = fVar.f4375a;
                int h = C7280a.m13963h(j);
                if (C7280a.m13958c(j)) {
                    i2 = C7280a.m13962g(j) - ((int) ((float) Math.ceil((double) f)));
                    if (i2 < 0) {
                        i2 = 0;
                    }
                } else {
                    i2 = C7280a.m13962g(j);
                }
                long r = C0114h.m315r(h, i2, 5);
                C19383o.m32797g(gVar, "paragraphIntrinsics");
                AndroidParagraph androidParagraph = new AndroidParagraph((C2016a) gVar, this.f4361b - i5, z, r);
                height = androidParagraph.getHeight() + f;
                int i6 = i5 + androidParagraph.f4569d.f4353c;
                C1936e eVar = r7;
                AndroidParagraph androidParagraph2 = androidParagraph;
                ArrayList arrayList3 = arrayList2;
                i3 = i6;
                C1936e eVar2 = new C1936e(androidParagraph, fVar.f4376b, fVar.f4377c, i5, i6, f, height);
                arrayList.add(eVar);
                if (androidParagraph2.f4569d.f4351a || (i3 == this.f4361b && i4 != C17782b.m29859Y(this.f4360a.f4275e))) {
                    i5 = i3;
                    f = height;
                    z2 = true;
                } else {
                    i4++;
                    i5 = i3;
                    f = height;
                    arrayList2 = arrayList3;
                }
            }
            i5 = i3;
            f = height;
            z2 = true;
            this.f4364e = f;
            this.f4365f = i5;
            this.f4362c = z2;
            this.f4367h = arrayList;
            this.f4363d = (float) C7280a.m13963h(j);
            ArrayList arrayList4 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                C1936e eVar3 = (C1936e) arrayList.get(i7);
                List<C8345d> s = eVar3.f4368a.mo7490s();
                ArrayList arrayList5 = new ArrayList(s.size());
                int size3 = s.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    C8345d dVar = s.get(i8);
                    arrayList5.add(dVar != null ? eVar3.mo7492a(dVar) : null);
                }
                C19324q.m32628J0(arrayList5, arrayList4);
            }
            if (arrayList4.size() < this.f4360a.f4272b.size()) {
                int size4 = this.f4360a.f4272b.size() - arrayList4.size();
                ArrayList arrayList6 = new ArrayList(size4);
                for (int i9 = 0; i9 < size4; i9++) {
                    arrayList6.add((Object) null);
                }
                arrayList4 = C19327t.m32650f1(arrayList6, arrayList4);
            }
            this.f4366g = arrayList4;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    /* renamed from: a */
    public final C1521g mo7467a(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > this.f4360a.f4271a.f4296b.length()) {
            z = false;
        }
        if (!z) {
            StringBuilder g = C0472h.m1244g("Start(", i, ") or End(", i2, ") is out of range [0..");
            g.append(this.f4360a.f4271a.f4296b.length());
            g.append("), or start > end!");
            throw new IllegalArgumentException(g.toString().toString());
        } else if (i == i2) {
            return C18263b.m30838d();
        } else {
            C1521g d = C18263b.m30838d();
            int size = this.f4367h.size();
            for (int A = C1993m.m4340A(i, this.f4367h); A < size; A++) {
                C1936e eVar = (C1936e) this.f4367h.get(A);
                int i3 = eVar.f4369b;
                if (i3 >= i2) {
                    break;
                }
                if (i3 != eVar.f4370c) {
                    C1521g l = eVar.f4368a.mo7483l(eVar.mo7493b(i), eVar.mo7493b(i2));
                    C19383o.m32797g(l, "<this>");
                    l.mo6340p(C19421p.m32952q(0.0f, eVar.f4373f));
                    C1492b0.m3195i(d, l);
                }
            }
            return d;
        }
    }

    /* renamed from: b */
    public final void mo7468b(C1537o oVar, long j, C1528j0 j0Var, C2030e eVar) {
        oVar.mo6264r();
        ArrayList arrayList = this.f4367h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1936e eVar2 = (C1936e) arrayList.get(i);
            eVar2.f4368a.mo7491t(oVar, j, j0Var, eVar);
            oVar.mo6260l(0.0f, eVar2.f4368a.getHeight());
        }
        oVar.mo6261m();
    }

    /* renamed from: c */
    public final void mo7469c(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f4360a.f4271a.f4296b.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder h = C0069a.m177h("offset(", i, ") is out of bounds [0, ");
            h.append(this.f4360a.f4271a.length());
            h.append(']');
            throw new IllegalArgumentException(h.toString().toString());
        }
    }

    /* renamed from: d */
    public final void mo7470d(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f4365f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
        }
    }
}
