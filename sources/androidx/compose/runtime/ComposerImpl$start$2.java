package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19862q;

final class ComposerImpl$start$2 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ int $currentRelativePosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$start$2(int i) {
        super(3);
        this.$currentRelativePosition = i;
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        int i;
        int i2;
        C1306d1 d1Var2 = d1Var;
        C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "slots", y0Var, "<anonymous parameter 2>");
        int i3 = this.$currentRelativePosition;
        if (d1Var2.f2844m == 0) {
            if (!(i3 >= 0)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            } else if (i3 != 0) {
                int i4 = d1Var2.f2849r;
                int i5 = d1Var2.f2850s;
                int i6 = d1Var2.f2838g;
                int i7 = i4;
                while (i3 > 0) {
                    i7 += C0005b.m63u(d1Var2.mo5679n(i7), d1Var2.f2833b);
                    if (i7 <= i6) {
                        i3--;
                    } else {
                        throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
                    }
                }
                int u = C0005b.m63u(d1Var2.mo5679n(i7), d1Var2.f2833b);
                int i8 = d1Var2.f2839h;
                int g = d1Var2.mo5672g(d1Var2.mo5679n(i7), d1Var2.f2833b);
                int i9 = i7 + u;
                int g2 = d1Var2.mo5672g(d1Var2.mo5679n(i9), d1Var2.f2833b);
                int i10 = g2 - g;
                d1Var2.mo5683r(i10, Math.max(d1Var2.f2849r - 1, 0));
                d1Var2.mo5682q(u);
                int[] iArr = d1Var2.f2833b;
                int n = d1Var2.mo5679n(i9) * 5;
                C19318k.m32600R0(d1Var2.mo5679n(i4) * 5, n, (u * 5) + n, iArr, iArr);
                if (i10 > 0) {
                    Object[] objArr = d1Var2.f2834c;
                    C19318k.m32603U0(objArr, i8, objArr, d1Var2.mo5673h(g + i10), d1Var2.mo5673h(g2 + i10));
                }
                int i11 = g + i10;
                int i12 = i11 - i8;
                int i13 = d1Var2.f2841j;
                int i14 = d1Var2.f2842k;
                int length = d1Var2.f2834c.length;
                int i15 = d1Var2.f2843l;
                int i16 = i4 + u;
                int i17 = i4;
                while (i17 < i16) {
                    int n2 = d1Var2.mo5679n(i17);
                    int i18 = i13;
                    int g3 = d1Var2.mo5672g(n2, iArr) - i12;
                    if (i15 < n2) {
                        i = i12;
                        i2 = 0;
                    } else {
                        i = i12;
                        i2 = i18;
                    }
                    if (g3 > i2) {
                        g3 = -(((length - i14) - g3) + 1);
                    }
                    int i19 = d1Var2.f2841j;
                    int i20 = i14;
                    int i21 = d1Var2.f2842k;
                    int i22 = length;
                    int length2 = d1Var2.f2834c.length;
                    if (g3 > i19) {
                        g3 = -(((length2 - i21) - g3) + 1);
                    }
                    iArr[(n2 * 5) + 4] = g3;
                    i17++;
                    i13 = i18;
                    i12 = i;
                    i14 = i20;
                    length = i22;
                }
                int i23 = u + i9;
                int m = d1Var.mo5678m();
                int A = C0005b.m7A(d1Var2.f2835d, i9, m);
                ArrayList arrayList = new ArrayList();
                if (A >= 0) {
                    while (A < d1Var2.f2835d.size()) {
                        C1296b bVar = d1Var2.f2835d.get(A);
                        C19383o.m32796f(bVar, "anchors[index]");
                        C1296b bVar2 = bVar;
                        int c = d1Var2.mo5668c(bVar2);
                        if (c < i9 || c >= i23) {
                            break;
                        }
                        arrayList.add(bVar2);
                        d1Var2.f2835d.remove(A);
                    }
                }
                int i24 = i4 - i9;
                int size = arrayList.size();
                for (int i25 = 0; i25 < size; i25++) {
                    C1296b bVar3 = (C1296b) arrayList.get(i25);
                    int c2 = d1Var2.mo5668c(bVar3) + i24;
                    if (c2 >= d1Var2.f2836e) {
                        bVar3.f2800a = -(m - c2);
                    } else {
                        bVar3.f2800a = c2;
                    }
                    d1Var2.f2835d.add(C0005b.m7A(d1Var2.f2835d, c2, m), bVar3);
                }
                if (!d1Var2.mo5654C(i9, u)) {
                    d1Var2.mo5677l(i5, d1Var2.f2838g, i4);
                    if (i10 > 0) {
                        d1Var2.mo5655D(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.m2526c("Unexpectedly removed anchors".toString());
                throw null;
            }
        } else {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
