package com.etsy.android.config.flags;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.TestTagKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.config.flags.events.C6350c;
import com.etsy.android.util.C12065v;
import com.etsy.collagecompose.C12161l;
import com.etsy.collagecompose.LoadingIndicatorKt;
import com.etsy.collagecompose.ThemeKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.C19689x1;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ConfigFlagsFragmentKt {
    /* renamed from: a */
    public static final void m12822a(C19689x1<? extends C6383l> x1Var, C19857l<? super C6350c, C19394m> lVar, C1302d dVar, int i) {
        C19383o.m32797g(x1Var, "stateFlow");
        C19383o.m32797g(lVar, "dispatch");
        ComposerImpl h = dVar.mo5440h(1138672608);
        ThemeKt.m19959a(false, C18263b.m30805A(h, -322880484, new ConfigFlagsFragmentKt$ConfigFlagsScreen$1(C12065v.m19873a(x1Var, h), lVar, i)), h, 48, 1);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ConfigFlagsFragmentKt$ConfigFlagsScreen$2(x1Var, lVar, i);
        }
    }

    /* renamed from: b */
    public static final void m12823b(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(-1809264533);
        if (i != 0 || !h.mo5442i()) {
            C1432b bVar = C1428a.C1429a.f3108d;
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1436d e = SizeKt.m1485e(SizeKt.m1487g(aVar));
            h.mo5465u(733328855);
            C1711v c = BoxKt.m1457c(bVar, false, h);
            h.mo5465u(-1323940314);
            C7282b bVar2 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(e);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar2);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, c, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar2, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                C1295a1 i2 = C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h);
                ComposerImpl composerImpl = h;
                C0326j.m868m(0, a, i2, composerImpl, 2058660585, -2137368960);
                LoadingIndicatorKt.m19951a(TestTagKt.m3948a(aVar, "Loading"), false, (C12161l) null, composerImpl, 6, 6);
                h.mo5418R(false);
                h.mo5418R(false);
                h.mo5418R(true);
                h.mo5418R(false);
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
            U.f3081d = new ConfigFlagsFragmentKt$ConfigLoading$2(i);
        }
    }
}
