package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class TextFieldSelectionManagerKt {

    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$a */
    public /* synthetic */ class C0996a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2102a;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.Cursor.ordinal()] = 1;
            iArr[Handle.SelectionStart.ordinal()] = 2;
            iArr[Handle.SelectionEnd.ordinal()] = 3;
            f2102a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m2057a(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, C1302d dVar, int i) {
        C19383o.m32797g(resolvedTextDirection, "direction");
        C19383o.m32797g(textFieldSelectionManager, "manager");
        ComposerImpl h = dVar.mo5440h(-1344558920);
        Boolean valueOf = Boolean.valueOf(z);
        h.mo5465u(511388516);
        boolean I = h.mo5408I(valueOf) | h.mo5408I(textFieldSelectionManager);
        Object c0 = h.mo5431c0();
        if (I || c0 == C1302d.C1303a.f2828a) {
            c0 = new C1023q(textFieldSelectionManager, z);
            h.mo5407H0(c0);
        }
        h.mo5418R(false);
        C0958l lVar = (C0958l) c0;
        long i2 = textFieldSelectionManager.mo4650i(z);
        boolean f = C2022r.m4467f(textFieldSelectionManager.mo4651j().f4449b);
        C1436d b = SuspendingPointerInputFilterKt.m3484b(C1436d.C1437a.f3125b, lVar, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(lVar, (C19340c<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$1>) null));
        int i3 = i << 3;
        AndroidSelectionHandles_androidKt.m2008c(i2, z, resolvedTextDirection, f, b, (C19861p<? super C1302d, ? super Integer, C19394m>) null, h, 196608 | (i3 & 112) | (i3 & 896));
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z, resolvedTextDirection, textFieldSelectionManager, i);
        }
    }

    /* renamed from: b */
    public static final boolean m2058b(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        C1689j jVar;
        C19383o.m32797g(textFieldSelectionManager, "<this>");
        TextFieldState textFieldState = textFieldSelectionManager.f2086d;
        if (textFieldState == null || (jVar = textFieldState.f1949f) == null) {
            return false;
        }
        return C1016k.m2109b(textFieldSelectionManager.mo4650i(z), C1016k.m2111d(jVar));
    }
}
