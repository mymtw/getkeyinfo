package androidx.compose.p015ui.window;

import android.view.View;
import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.C1366b;
import androidx.compose.runtime.saveable.C1374h;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.UUID;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt */
public final class AndroidDialog_androidKt {
    /* renamed from: a */
    public static final void m4511a(C19846a<C19394m> aVar, C2089b bVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i, int i2) {
        int i3;
        C2089b bVar2;
        C2089b bVar3;
        C2089b bVar4;
        Object c0;
        C2089b bVar5;
        int i4;
        C19846a<C19394m> aVar2 = aVar;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        int i5 = i;
        C19383o.m32797g(aVar2, "onDismissRequest");
        C19383o.m32797g(pVar2, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i3 = (h.mo5408I(aVar2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            if ((i2 & 2) == 0) {
                bVar2 = bVar;
                if (h.mo5408I(bVar2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                bVar2 = bVar;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            bVar2 = bVar;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= h.mo5408I(pVar2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i5 & 1) == 0 || h.mo5425Y()) {
                if ((i2 & 2) != 0) {
                    bVar5 = new C2089b(0);
                }
                bVar4 = bVar2;
                h.mo5419S();
                View view = (View) h.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
                C7282b bVar6 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
                LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
                C1324g m0 = C0005b.m50m0(h);
                C1338j0 E0 = C0761x.m1664E0(pVar2, h);
                UUID uuid = (UUID) C1366b.m2863a(new Object[0], (C1374h) null, AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE, h, 6);
                h.mo5465u(511388516);
                boolean I = h.mo5408I(view) | h.mo5408I(bVar6);
                c0 = h.mo5431c0();
                if (I || c0 == C1302d.C1303a.f2828a) {
                    C19383o.m32796f(uuid, "dialogId");
                    DialogWrapper dialogWrapper = r0;
                    DialogWrapper dialogWrapper2 = new DialogWrapper(aVar, bVar4, view, layoutDirection, bVar6, uuid);
                    ComposableLambdaImpl B = C18263b.m30807B(new AndroidDialog_androidKt$Dialog$dialog$1$1$1(E0), 488261145, true);
                    C19383o.m32797g(m0, "parentComposition");
                    DialogLayout dialogLayout = dialogWrapper.f4720e;
                    dialogLayout.getClass();
                    dialogLayout.setParentCompositionContext(m0);
                    dialogLayout.f4714c.setValue(B);
                    dialogLayout.f4716e = true;
                    dialogLayout.createComposition();
                    h.mo5407H0(dialogWrapper);
                    c0 = dialogWrapper;
                }
                h.mo5418R(false);
                DialogWrapper dialogWrapper3 = (DialogWrapper) c0;
                C1415u.m3028b(dialogWrapper3, new AndroidDialog_androidKt$Dialog$1(dialogWrapper3), h);
                C1415u.m3033g(new AndroidDialog_androidKt$Dialog$2(dialogWrapper3, aVar2, bVar4, layoutDirection), h);
                bVar3 = bVar4;
            } else {
                h.mo5396C();
                if ((i2 & 2) != 0) {
                    bVar5 = bVar2;
                }
                bVar4 = bVar2;
                h.mo5419S();
                View view2 = (View) h.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
                C7282b bVar62 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
                LayoutDirection layoutDirection2 = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
                C1324g m02 = C0005b.m50m0(h);
                C1338j0 E02 = C0761x.m1664E0(pVar2, h);
                UUID uuid2 = (UUID) C1366b.m2863a(new Object[0], (C1374h) null, AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE, h, 6);
                h.mo5465u(511388516);
                boolean I2 = h.mo5408I(view2) | h.mo5408I(bVar62);
                c0 = h.mo5431c0();
                C19383o.m32796f(uuid2, "dialogId");
                DialogWrapper dialogWrapper4 = dialogWrapper2;
                DialogWrapper dialogWrapper22 = new DialogWrapper(aVar, bVar4, view2, layoutDirection2, bVar62, uuid2);
                ComposableLambdaImpl B2 = C18263b.m30807B(new AndroidDialog_androidKt$Dialog$dialog$1$1$1(E02), 488261145, true);
                C19383o.m32797g(m02, "parentComposition");
                DialogLayout dialogLayout2 = dialogWrapper4.f4720e;
                dialogLayout2.getClass();
                dialogLayout2.setParentCompositionContext(m02);
                dialogLayout2.f4714c.setValue(B2);
                dialogLayout2.f4716e = true;
                dialogLayout2.createComposition();
                h.mo5407H0(dialogWrapper4);
                c0 = dialogWrapper4;
                h.mo5418R(false);
                DialogWrapper dialogWrapper32 = (DialogWrapper) c0;
                C1415u.m3028b(dialogWrapper32, new AndroidDialog_androidKt$Dialog$1(dialogWrapper32), h);
                C1415u.m3033g(new AndroidDialog_androidKt$Dialog$2(dialogWrapper32, aVar2, bVar4, layoutDirection2), h);
                bVar3 = bVar4;
            }
            bVar4 = bVar5;
            h.mo5419S();
            View view22 = (View) h.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
            C7282b bVar622 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection22 = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1324g m022 = C0005b.m50m0(h);
            C1338j0 E022 = C0761x.m1664E0(pVar2, h);
            UUID uuid22 = (UUID) C1366b.m2863a(new Object[0], (C1374h) null, AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE, h, 6);
            h.mo5465u(511388516);
            boolean I22 = h.mo5408I(view22) | h.mo5408I(bVar622);
            c0 = h.mo5431c0();
            C19383o.m32796f(uuid22, "dialogId");
            DialogWrapper dialogWrapper42 = dialogWrapper22;
            DialogWrapper dialogWrapper222 = new DialogWrapper(aVar, bVar4, view22, layoutDirection22, bVar622, uuid22);
            ComposableLambdaImpl B22 = C18263b.m30807B(new AndroidDialog_androidKt$Dialog$dialog$1$1$1(E022), 488261145, true);
            C19383o.m32797g(m022, "parentComposition");
            DialogLayout dialogLayout22 = dialogWrapper42.f4720e;
            dialogLayout22.getClass();
            dialogLayout22.setParentCompositionContext(m022);
            dialogLayout22.f4714c.setValue(B22);
            dialogLayout22.f4716e = true;
            dialogLayout22.createComposition();
            h.mo5407H0(dialogWrapper42);
            c0 = dialogWrapper42;
            h.mo5418R(false);
            DialogWrapper dialogWrapper322 = (DialogWrapper) c0;
            C1415u.m3028b(dialogWrapper322, new AndroidDialog_androidKt$Dialog$1(dialogWrapper322), h);
            C1415u.m3033g(new AndroidDialog_androidKt$Dialog$2(dialogWrapper322, aVar2, bVar4, layoutDirection22), h);
            bVar3 = bVar4;
        } else {
            h.mo5396C();
            bVar3 = bVar2;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidDialog_androidKt$Dialog$3(aVar, bVar3, pVar, i, i2);
        }
    }

    /* renamed from: b */
    public static final void m4512b(C1436d dVar, C19861p pVar, C1302d dVar2, int i, int i2) {
        int i3;
        ComposerImpl h = dVar2.mo5440h(-1177876616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !h.mo5442i()) {
            if (i4 != 0) {
                dVar = C1436d.C1437a.f3125b;
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.f4704a;
            h.mo5465u(-1323940314);
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(dVar);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, androidDialog_androidKt$DialogLayout$1, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i5 >> 3) & 112));
                h.mo5465u(2058660585);
                C0472h.m1247j((i5 >> 9) & 14, pVar, h, false, true, false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidDialog_androidKt$DialogLayout$2(dVar, pVar, i, i2);
        }
    }
}
