package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SnackbarKt$Snackbar$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C1251s1 $snackbarData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$3(C1251s1 s1Var) {
        super(2);
        this.$snackbarData = s1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextKt.m2283b(this.$snackbarData.getMessage(), (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, 0, (C2030e) null, (C2029d) null, 0, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, (C2023s) null, dVar, 0, 0, 65534);
            return;
        }
        dVar.mo5396C();
    }
}
