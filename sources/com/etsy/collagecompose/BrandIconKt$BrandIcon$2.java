package com.etsy.collagecompose;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0731e;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1489a;
import androidx.compose.p015ui.graphics.C1529k;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.p015ui.layout.C1670c;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.R;
import com.etsy.collagecompose.C12126b;
import com.etsy.collagecompose.C12132c;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p174m0.C7282b;
import p202p.C7645g;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

final class BrandIconKt$BrandIcon$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C12126b $brandIconSize;
    public final /* synthetic */ C12132c $brandIconStyle;
    public final /* synthetic */ int $iconRes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrandIconKt$BrandIcon$2(C12126b bVar, C12132c cVar, int i, int i2) {
        super(2);
        this.$brandIconSize = bVar;
        this.$brandIconStyle = cVar;
        this.$iconRes = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        int i3;
        long j;
        long j2;
        int i4;
        C12126b bVar = this.$brandIconSize;
        C12132c cVar = this.$brandIconStyle;
        int i5 = this.$iconRes;
        int i6 = this.$$changed | 1;
        C19383o.m32797g(bVar, "brandIconSize");
        C19383o.m32797g(cVar, "brandIconStyle");
        ComposerImpl h = dVar.mo5440h(-1885667796);
        if ((i6 & 14) == 0) {
            i2 = (h.mo5408I(bVar) ? 4 : 2) | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            i2 |= h.mo5408I(cVar) ? 32 : 16;
        }
        if ((i6 & 896) == 0) {
            i2 |= h.mo5432d(i5) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C12126b.C12127a aVar2 = C12126b.C12127a.f27067a;
            if (C19383o.m32792b(bVar, aVar2)) {
                i3 = R.dimen.clg_size_brand_icon_container_base;
            } else if (C19383o.m32792b(bVar, C12126b.C12131e.f27071a)) {
                i3 = R.dimen.clg_size_brand_icon_container_smallest;
            } else if (C19383o.m32792b(bVar, C12126b.C12130d.f27070a)) {
                i3 = R.dimen.clg_size_brand_icon_container_smaller;
            } else if (C19383o.m32792b(bVar, C12126b.C12128b.f27068a)) {
                i3 = R.dimen.clg_size_brand_icon_container_larger;
            } else if (C19383o.m32792b(bVar, C12126b.C12129c.f27069a)) {
                i3 = R.dimen.clg_size_brand_icon_container_largest;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C1436d l = SizeKt.m1492l(aVar, C19382n.m32735W(i3, h));
            h.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(C1428a.C1429a.f3105a, false, h);
            h.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(l);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar3);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0326j.m868m(0, a, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -2137368960);
                if (C19383o.m32792b(cVar, C12132c.C12133a.f27072a)) {
                    h.mo5465u(175481880);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27095A;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12134b.f27073a)) {
                    h.mo5465u(175481982);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27096B;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12135c.f27074a)) {
                    h.mo5465u(175482087);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27099E;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12136d.f27075a)) {
                    h.mo5465u(175482194);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27100F;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12137e.f27076a)) {
                    h.mo5465u(175482305);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27101G;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12138f.f27077a)) {
                    h.mo5465u(175482420);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27102H;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12139g.f27078a)) {
                    h.mo5465u(175482535);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27103I;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12140h.f27079a)) {
                    h.mo5465u(175482648);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27097C;
                    h.mo5418R(false);
                } else if (C19383o.m32792b(cVar, C12132c.C12141i.f27080a)) {
                    h.mo5465u(175482759);
                    j = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27098D;
                    h.mo5418R(false);
                } else {
                    h.mo5465u(175479683);
                    h.mo5418R(false);
                    throw new NoWhenBranchMatchedException();
                }
                C1436d A = C0761x.m1655A(aVar, j, C7645g.f16941a);
                C19383o.m32797g(A, "<this>");
                C1432b bVar3 = C1428a.C1429a.f3108d;
                C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
                BoxKt.m1455a(A.mo6148i0(new C0731e(bVar3, true)), h, 0);
                Painter p0 = C19388s.m32878p0(i5, h);
                if (C19383o.m32792b(cVar, C12132c.C12134b.f27073a)) {
                    h.mo5465u(175483174);
                    j2 = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27169y;
                    h.mo5418R(false);
                } else {
                    if (C19383o.m32792b(cVar, C12132c.C12137e.f27076a) ? true : C19383o.m32792b(cVar, C12132c.C12138f.f27077a) ? true : C19383o.m32792b(cVar, C12132c.C12139g.f27078a)) {
                        h.mo5465u(175483362);
                        j2 = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27171z;
                        h.mo5418R(false);
                    } else {
                        h.mo5465u(175483436);
                        j2 = ((C12158i) h.mo5410J(ColorsKt.f27041n)).f27167x;
                        h.mo5418R(false);
                    }
                }
                C1546t tVar = new C1546t(Build.VERSION.SDK_INT >= 29 ? C1529k.f3326a.mo6367a(j2, 5) : new PorterDuffColorFilter(C18263b.m30859o0(j2), C1489a.m3160b(5)));
                if (C19383o.m32792b(bVar, aVar2)) {
                    i4 = R.dimen.clg_size_brand_icon_base;
                } else if (C19383o.m32792b(bVar, C12126b.C12131e.f27071a)) {
                    i4 = R.dimen.clg_size_brand_icon_smallest;
                } else if (C19383o.m32792b(bVar, C12126b.C12130d.f27070a)) {
                    i4 = R.dimen.clg_size_brand_icon_smaller;
                } else if (C19383o.m32792b(bVar, C12126b.C12128b.f27068a)) {
                    i4 = R.dimen.clg_size_brand_icon_larger;
                } else if (C19383o.m32792b(bVar, C12126b.C12129c.f27069a)) {
                    i4 = R.dimen.clg_size_brand_icon_largest;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                C1436d l2 = SizeKt.m1492l(aVar, C19382n.m32735W(i4, h));
                C19383o.m32797g(l2, "<this>");
                ImageKt.m1308a(p0, (String) null, l2.mo6148i0(new C0731e(bVar3, false)), (C1428a) null, (C1670c) null, 0.0f, tVar, h, 56, 56);
                C0087d.m238h(h, false, false, true, false);
                h.mo5418R(false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BrandIconKt$BrandIcon$2(bVar, cVar, i5, i6);
        }
    }
}
