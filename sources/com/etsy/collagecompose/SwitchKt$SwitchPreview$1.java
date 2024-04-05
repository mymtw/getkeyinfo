package com.etsy.collagecompose;

import android.content.Context;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

final class SwitchKt$SwitchPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ Context $toastContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchPreview$1(Context context) {
        super(2);
        this.$toastContext = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d g = SizeKt.m1487g(SizeKt.m1485e(ScrollKt.m1317c(C1436d.C1437a.f3125b, ScrollKt.m1315a(dVar))));
            C1432b.C1433a aVar = C1428a.C1429a.f3117m;
            Context context = this.$toastContext;
            dVar2.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(C0718d.f1478c, aVar, dVar2);
            dVar2.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(g);
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar2.mo5450m(aVar2);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar2, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar2, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar2, layoutDirection, ComposeUiNode.Companion.f3782f);
                C0472h.m1246i(0, a2, C0073e.m204d(dVar2, j1Var, ComposeUiNode.Companion.f3783g, dVar2), dVar, 2058660585, -1163856341);
                Context context2 = context;
                TextKt.m19958a("Switches", (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) dVar2.mo5410J(TypographyKt.f27060a)).f27195a, dVar, 6, 0, 4094);
                C1302d dVar3 = dVar;
                dVar3.mo5465u(-492369756);
                Object v = dVar.mo5467v();
                Object obj = C1302d.C1303a.f2828a;
                if (v == obj) {
                    v = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
                    dVar3.mo5454o(v);
                }
                dVar.mo5406H();
                C1338j0 j0Var = (C1338j0) v;
                boolean booleanValue = ((Boolean) j0Var.getValue()).booleanValue();
                dVar3.mo5465u(1157296644);
                boolean I = dVar3.mo5408I(j0Var);
                Object v2 = dVar.mo5467v();
                if (I || v2 == obj) {
                    v2 = new SwitchKt$SwitchPreview$1$1$1$1(j0Var);
                    dVar3.mo5454o(v2);
                }
                dVar.mo5406H();
                SwitchKt.m19956a(booleanValue, (C19857l) v2, (C1436d) null, dVar, 0, 4);
                dVar3.mo5465u(-492369756);
                Object v3 = dVar.mo5467v();
                if (v3 == obj) {
                    v3 = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
                    dVar3.mo5454o(v3);
                }
                dVar.mo5406H();
                C1338j0 j0Var2 = (C1338j0) v3;
                boolean booleanValue2 = ((Boolean) j0Var2.getValue()).booleanValue();
                dVar3.mo5465u(1157296644);
                boolean I2 = dVar3.mo5408I(j0Var2);
                Object v4 = dVar.mo5467v();
                if (I2 || v4 == obj) {
                    v4 = new SwitchKt$SwitchPreview$1$1$2$1(j0Var2);
                    dVar3.mo5454o(v4);
                }
                dVar.mo5406H();
                SwitchKt.m19956a(booleanValue2, (C19857l) v4, (C1436d) null, dVar, 0, 4);
                dVar3.mo5465u(-492369756);
                Object v5 = dVar.mo5467v();
                if (v5 == obj) {
                    v5 = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
                    dVar3.mo5454o(v5);
                }
                dVar.mo5406H();
                Context context3 = context2;
                SwitchKt.m19957b("Receive notifications for a title that's really long", (String) null, ((Boolean) ((C1338j0) v5).getValue()).booleanValue(), new SwitchKt$SwitchPreview$1$1$3(context3), false, dVar, 6, 18);
                dVar3.mo5465u(-492369756);
                Object v6 = dVar.mo5467v();
                if (v6 == obj) {
                    v6 = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
                    dVar3.mo5454o(v6);
                }
                dVar.mo5406H();
                SwitchKt.m19957b("Personalized advertising", "Allow Etsy to share my data to personalize my ad experience", ((Boolean) ((C1338j0) v6).getValue()).booleanValue(), new SwitchKt$SwitchPreview$1$1$4(context3), false, dVar, 54, 16);
                dVar3.mo5465u(-492369756);
                Object v7 = dVar.mo5467v();
                if (v7 == obj) {
                    v7 = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
                    dVar3.mo5454o(v7);
                }
                dVar.mo5406H();
                SwitchKt.m19957b("Personalized advertising smaller", "Allow Etsy to share my data to personalize my ad experience", ((Boolean) ((C1338j0) v7).getValue()).booleanValue(), new SwitchKt$SwitchPreview$1$1$5(context3), true, dVar, 24630, 0);
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
