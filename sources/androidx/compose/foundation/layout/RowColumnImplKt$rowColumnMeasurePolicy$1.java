package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1681g;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$IntRef;
import p173m.C7279a;
import p174m0.C7280a;
import p174m0.C7282b;
import p753kq.C19864s;

public final class RowColumnImplKt$rowColumnMeasurePolicy$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ LayoutOrientation f1421a;

    /* renamed from: b */
    public final /* synthetic */ float f1422b;

    /* renamed from: c */
    public final /* synthetic */ SizeMode f1423c;

    /* renamed from: d */
    public final /* synthetic */ C19864s<Integer, int[], LayoutDirection, C7282b, int[], C19394m> f1424d;

    /* renamed from: e */
    public final /* synthetic */ C0743k f1425e;

    public RowColumnImplKt$rowColumnMeasurePolicy$1(float f, C0743k kVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, C19864s sVar) {
        this.f1421a = layoutOrientation;
        this.f1422b = f;
        this.f1423c = sizeMode;
        this.f1424d = sVar;
        this.f1425e = kVar;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return (this.f1421a == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f1406e : IntrinsicMeasureBlocks.f1407f).invoke(list, Integer.valueOf(i), Integer.valueOf(fVar.mo3791V(this.f1422b))).intValue();
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        String str;
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        C1713x xVar2 = xVar;
        List<? extends C1710u> list2 = list;
        C19383o.m32797g(xVar2, "$this$measure");
        C19383o.m32797g(list2, "measurables");
        LayoutOrientation layoutOrientation = this.f1421a;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        int j2 = layoutOrientation == layoutOrientation2 ? C7280a.m13965j(j) : C7280a.m13964i(j);
        int h = layoutOrientation == layoutOrientation2 ? C7280a.m13963h(j) : C7280a.m13962g(j);
        int i5 = layoutOrientation == layoutOrientation2 ? C7280a.m13964i(j) : C7280a.m13965j(j);
        int g = layoutOrientation == layoutOrientation2 ? C7280a.m13962g(j) : C7280a.m13963h(j);
        int V = xVar2.mo3791V(this.f1422b);
        C1686i0[] i0VarArr = new C1686i0[list.size()];
        int size = list.size();
        C0762y[] yVarArr = new C0762y[size];
        for (int i6 = 0; i6 < size; i6++) {
            yVarArr[i6] = C0761x.m1701X((C1681g) list2.get(i6));
        }
        int size2 = list.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        float f = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            str = "orientation";
            if (i7 >= size2) {
                break;
            }
            C1710u uVar = (C1710u) list2.get(i7);
            float g0 = C0761x.m1722g0(yVarArr[i7]);
            if (g0 > 0.0f) {
                f += g0;
                i9++;
                i3 = size2;
                i4 = g;
            } else {
                i3 = size2;
                int i12 = h == Integer.MAX_VALUE ? Api.BaseClientBuilder.API_PRIORITY_OTHER : h - i10;
                LayoutOrientation layoutOrientation3 = this.f1421a;
                C19383o.m32797g(layoutOrientation3, str);
                LayoutOrientation layoutOrientation4 = LayoutOrientation.Horizontal;
                long q = layoutOrientation3 == layoutOrientation4 ? C0114h.m313q(0, i12, 0, g) : C0114h.m313q(0, g, 0, i12);
                i4 = g;
                C1686i0 J = uVar.mo6665J(q);
                i11 = Math.min(V, (h - i10) - (this.f1421a == layoutOrientation4 ? J.f3722b : J.f3723c));
                LayoutOrientation layoutOrientation5 = this.f1421a;
                i10 = (layoutOrientation5 == layoutOrientation4 ? J.f3722b : J.f3723c) + i11 + i10;
                i8 = Math.max(i8, layoutOrientation5 == layoutOrientation4 ? J.f3723c : J.f3722b);
                i0VarArr[i7] = J;
            }
            i7++;
            C1713x xVar3 = xVar;
            list2 = list;
            g = i4;
            size2 = i3;
        }
        int i13 = g;
        if (i9 == 0) {
            i10 -= i11;
            i = 0;
        } else {
            int i14 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i15 = (i9 - 1) * V;
            int i16 = (((i14 <= 0 || h == Integer.MAX_VALUE) ? j2 : h) - i10) - i15;
            float f2 = i14 > 0 ? ((float) i16) / f : 0.0f;
            int i17 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                i17 += C7279a.m13954l(C0761x.m1722g0(yVarArr[i18]) * f2);
            }
            int size3 = list.size();
            int i19 = i16 - i17;
            int i20 = 0;
            int i21 = 0;
            while (i20 < size3) {
                if (i0VarArr[i20] == null) {
                    C1710u uVar2 = (C1710u) list.get(i20);
                    C0762y yVar = yVarArr[i20];
                    float g02 = C0761x.m1722g0(yVar);
                    if (g02 > 0.0f) {
                        int i22 = i19 < 0 ? -1 : i19 > 0 ? 1 : 0;
                        i2 = size3;
                        int l = C7279a.m13954l(g02 * f2) + i22;
                        int i23 = i19 - i22;
                        int max = Math.max(0, l);
                        int i24 = (!(yVar != null ? yVar.f1570b : true) || max == Integer.MAX_VALUE) ? 0 : max;
                        LayoutOrientation layoutOrientation6 = this.f1421a;
                        C19383o.m32797g(layoutOrientation6, str);
                        str2 = str;
                        LayoutOrientation layoutOrientation7 = LayoutOrientation.Horizontal;
                        C1686i0 J2 = uVar2.mo6665J(layoutOrientation6 == layoutOrientation7 ? C0114h.m313q(i24, max, 0, i13) : C0114h.m313q(0, i13, i24, max));
                        LayoutOrientation layoutOrientation8 = this.f1421a;
                        int i25 = (layoutOrientation8 == layoutOrientation7 ? J2.f3722b : J2.f3723c) + i21;
                        i8 = Math.max(i8, layoutOrientation8 == layoutOrientation7 ? J2.f3723c : J2.f3722b);
                        i0VarArr[i20] = J2;
                        i21 = i25;
                        i19 = i23;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    i2 = size3;
                    str2 = str;
                }
                i20++;
                size3 = i2;
                str = str2;
            }
            i = i21 + i15;
            int i26 = h - i10;
            if (i > i26) {
                i = i26;
            }
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int max2 = Math.max(i10 + i, j2);
        if (i13 == Integer.MAX_VALUE || this.f1423c != SizeMode.Expand) {
            i13 = Math.max(i8, Math.max(i5, ref$IntRef.element + 0));
        }
        LayoutOrientation layoutOrientation9 = this.f1421a;
        LayoutOrientation layoutOrientation10 = LayoutOrientation.Horizontal;
        int i27 = layoutOrientation9 == layoutOrientation10 ? max2 : i13;
        int i28 = layoutOrientation9 == layoutOrientation10 ? i13 : max2;
        int size4 = list.size();
        int[] iArr = new int[size4];
        for (int i29 = 0; i29 < size4; i29++) {
            iArr[i29] = 0;
        }
        return xVar.mo4387Z(i27, i28, C19294b0.m32559p0(), new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(list, i0VarArr, this.f1424d, max2, xVar, iArr, this.f1421a, yVarArr, this.f1425e, i13, ref$IntRef));
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return (this.f1421a == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f1402a : IntrinsicMeasureBlocks.f1403b).invoke(list, Integer.valueOf(i), Integer.valueOf(fVar.mo3791V(this.f1422b))).intValue();
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return (this.f1421a == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f1408g : IntrinsicMeasureBlocks.f1409h).invoke(list, Integer.valueOf(i), Integer.valueOf(fVar.mo3791V(this.f1422b))).intValue();
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return (this.f1421a == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f1404c : IntrinsicMeasureBlocks.f1405d).invoke(list, Integer.valueOf(i), Integer.valueOf(fVar.mo3791V(this.f1422b))).intValue();
    }
}
