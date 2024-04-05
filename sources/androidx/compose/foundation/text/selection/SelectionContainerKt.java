package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1822c1;
import androidx.compose.p015ui.platform.C1827e0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p020b0.C3449a;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SelectionContainerKt {
    /* renamed from: a */
    public static final void m2019a(C1436d dVar, C1011g gVar, C19857l<? super C1011g, C19394m> lVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar2, int i, int i2) {
        int i3;
        C1436d dVar3;
        C1436d dVar4;
        C1011g gVar2 = gVar;
        C19857l<? super C1011g, C19394m> lVar2 = lVar;
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        int i4 = i;
        C19383o.m32797g(lVar2, "onSelectionChange");
        C19383o.m32797g(pVar2, ResponseConstants.CHILDREN);
        ComposerImpl h = dVar2.mo5440h(2078139907);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i4 | 6;
            dVar3 = dVar;
        } else if ((i4 & 14) == 0) {
            dVar3 = dVar;
            i3 = (h.mo5408I(dVar) ? 4 : 2) | i4;
        } else {
            dVar3 = dVar;
            i3 = i4;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i4 & 112) == 0) {
            i3 |= h.mo5408I(gVar2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i4 & 896) == 0) {
            i3 |= h.mo5408I(lVar2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i3 |= h.mo5408I(pVar2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        int i6 = i3;
        if ((i6 & 5851) != 1170 || !h.mo5442i()) {
            dVar4 = i5 != 0 ? C1436d.C1437a.f3125b : dVar3;
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            Object obj = C1302d.C1303a.f2828a;
            if (c0 == obj) {
                c0 = new C1020n();
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1020n nVar = (C1020n) c0;
            h.mo5465u(-492369756);
            Object c02 = h.mo5431c0();
            if (c02 == obj) {
                c02 = new SelectionManager(nVar);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            SelectionManager selectionManager = (SelectionManager) c02;
            selectionManager.f2068d = (C3449a) h.mo5410J(CompositionLocalsKt.f4023i);
            selectionManager.f2069e = (C1827e0) h.mo5410J(CompositionLocalsKt.f4018d);
            selectionManager.f2070f = (C1822c1) h.mo5410J(CompositionLocalsKt.f4027m);
            selectionManager.f2067c = lVar2;
            selectionManager.f2066b.setValue(gVar2);
            if (gVar2 != null) {
                selectionManager.mo4619k();
            }
            ContextMenu_androidKt.m1955a(selectionManager, C18263b.m30805A(h, -123806316, new SelectionContainerKt$SelectionContainer$3(nVar, dVar4, selectionManager, pVar, i6)), h, 56);
            C1415u.m3028b(selectionManager, new SelectionContainerKt$SelectionContainer$4(selectionManager), h);
        } else {
            h.mo5396C();
            dVar4 = dVar3;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SelectionContainerKt$SelectionContainer$5(dVar4, gVar, lVar, pVar, i, i2);
        }
    }
}
