package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class SizeKt {

    /* renamed from: a */
    public static final FillModifier f1427a = new FillModifier(Direction.Horizontal, 1.0f, new SizeKt$createFillWidthModifier$1(1.0f));

    /* renamed from: b */
    public static final FillModifier f1428b;

    /* renamed from: c */
    public static final FillModifier f1429c = new FillModifier(Direction.Both, 1.0f, new SizeKt$createFillSizeModifier$1(1.0f));

    /* renamed from: d */
    public static final WrapContentModifier f1430d = m1482b(C1428a.C1429a.f3117m, false);

    /* renamed from: e */
    public static final WrapContentModifier f1431e = m1482b(C1428a.C1429a.f3116l, false);

    /* renamed from: f */
    public static final WrapContentModifier f1432f = m1481a(C1428a.C1429a.f3108d, false);

    /* renamed from: g */
    public static final WrapContentModifier f1433g = m1481a(C1428a.C1429a.f3105a, false);

    static {
        Direction direction = Direction.Vertical;
        f1428b = new FillModifier(direction, 1.0f, new SizeKt$createFillHeightModifier$1(1.0f));
        C1432b.C1434b bVar = C1428a.C1429a.f3114j;
        new SizeKt$createWrapContentHeightModifier$1(bVar);
        new SizeKt$createWrapContentHeightModifier$2(bVar, false);
        C19383o.m32797g(direction, "direction");
        C1432b.C1434b bVar2 = C1428a.C1429a.f3113i;
        new SizeKt$createWrapContentHeightModifier$1(bVar2);
        new SizeKt$createWrapContentHeightModifier$2(bVar2, false);
        C19383o.m32797g(direction, "direction");
    }

    /* renamed from: a */
    public static final WrapContentModifier m1481a(C1428a aVar, boolean z) {
        return new WrapContentModifier(Direction.Both, z, new SizeKt$createWrapContentSizeModifier$1(aVar), aVar, new SizeKt$createWrapContentSizeModifier$2(aVar, z));
    }

    /* renamed from: b */
    public static final WrapContentModifier m1482b(C1428a.C1430b bVar, boolean z) {
        return new WrapContentModifier(Direction.Horizontal, z, new SizeKt$createWrapContentWidthModifier$1(bVar), bVar, new SizeKt$createWrapContentWidthModifier$2(bVar, z));
    }

    /* renamed from: c */
    public static final C1436d m1483c(C1436d dVar, float f, float f2) {
        C19383o.m32797g(dVar, "$this$defaultMinSize");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new UnspecifiedConstraintsModifier(f, f2));
    }

    /* renamed from: d */
    public static /* synthetic */ C1436d m1484d(C1436d dVar, float f, int i) {
        float f2 = (i & 1) != 0 ? Float.NaN : 0.0f;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        return m1483c(dVar, f2, f);
    }

    /* renamed from: e */
    public static C1436d m1485e(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return dVar.mo6148i0(f1428b);
    }

    /* renamed from: f */
    public static C1436d m1486f(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return dVar.mo6148i0(f1429c);
    }

    /* renamed from: g */
    public static C1436d m1487g(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return dVar.mo6148i0(f1427a);
    }

    /* renamed from: h */
    public static final C1436d m1488h(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "$this$height");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(0.0f, f, 0.0f, f, true, 5));
    }

    /* renamed from: i */
    public static C1436d m1489i(C1436d dVar, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? Float.NaN : f;
        float f4 = (i & 2) != 0 ? Float.NaN : f2;
        C19383o.m32797g(dVar, "$this$heightIn");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(0.0f, f3, 0.0f, f4, true, 5));
    }

    /* renamed from: j */
    public static final C1436d m1490j(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "$this$requiredSize");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f, f, f, f, false));
    }

    /* renamed from: k */
    public static C1436d m1491k(C1436d dVar, float f, float f2) {
        C19383o.m32797g(dVar, "$this$requiredSizeIn");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f, f2, Float.NaN, Float.NaN, false));
    }

    /* renamed from: l */
    public static final C1436d m1492l(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "$this$size");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f, f, f, f, true));
    }

    /* renamed from: m */
    public static final C1436d m1493m(C1436d dVar, float f, float f2) {
        C19383o.m32797g(dVar, "$this$size");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f, f2, f, f2, true));
    }

    /* renamed from: n */
    public static C1436d m1494n(C1436d dVar, float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 1) != 0 ? Float.NaN : f;
        float f6 = (i & 2) != 0 ? Float.NaN : f2;
        float f7 = (i & 4) != 0 ? Float.NaN : f3;
        float f8 = (i & 8) != 0 ? Float.NaN : f4;
        C19383o.m32797g(dVar, "$this$sizeIn");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f5, f6, f7, f8, true));
    }

    /* renamed from: o */
    public static final C1436d m1495o(C1436d dVar, float f) {
        C19383o.m32797g(dVar, "$this$width");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f, 0.0f, f, 0.0f, true, 10));
    }

    /* renamed from: p */
    public static C1436d m1496p(C1436d dVar, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? Float.NaN : f;
        float f4 = (i & 2) != 0 ? Float.NaN : f2;
        C19383o.m32797g(dVar, "$this$widthIn");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new SizeModifier(f3, 0.0f, f4, 0.0f, true, 10));
    }

    /* renamed from: q */
    public static C1436d m1497q(C1436d dVar, C1432b bVar) {
        C19383o.m32797g(dVar, "<this>");
        return dVar.mo6148i0(C19383o.m32792b(bVar, C1428a.C1429a.f3108d) ? f1432f : C19383o.m32792b(bVar, C1428a.C1429a.f3105a) ? f1433g : m1481a(bVar, false));
    }

    /* renamed from: r */
    public static C1436d m1498r(C1436d dVar) {
        C1432b.C1433a aVar = C1428a.C1429a.f3117m;
        C19383o.m32797g(dVar, "<this>");
        return dVar.mo6148i0(C19383o.m32792b(aVar, aVar) ? f1430d : C19383o.m32792b(aVar, C1428a.C1429a.f3116l) ? f1431e : m1482b(aVar, false));
    }
}
