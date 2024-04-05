package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class ContextMenu_androidKt {
    /* renamed from: a */
    public static final void m1955a(SelectionManager selectionManager, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(selectionManager, "manager");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(605522716);
        if ((i & 112) == 0) {
            i2 = (h.mo5408I(pVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !h.mo5442i()) {
            pVar.invoke(h, Integer.valueOf((i2 >> 3) & 14));
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ContextMenu_androidKt$ContextMenuArea$2(selectionManager, pVar, i);
        }
    }

    /* renamed from: b */
    public static final void m1956b(TextFieldSelectionManager textFieldSelectionManager, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(textFieldSelectionManager, "manager");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1985516685);
        if ((i & 112) == 0) {
            i2 = (h.mo5408I(pVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !h.mo5442i()) {
            pVar.invoke(h, Integer.valueOf((i2 >> 3) & 14));
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, pVar, i);
        }
    }
}
