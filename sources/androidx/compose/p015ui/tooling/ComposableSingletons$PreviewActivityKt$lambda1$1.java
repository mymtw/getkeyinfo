package androidx.compose.p015ui.tooling;

import androidx.compose.material.TextKt;
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

/* renamed from: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivityKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PreviewActivityKt$lambda1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public static final ComposableSingletons$PreviewActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$PreviewActivityKt$lambda1$1();

    public ComposableSingletons$PreviewActivityKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextKt.m2283b("Next", (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, 0, (C2030e) null, (C2029d) null, 0, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, (C2023s) null, dVar, 6, 0, 65534);
        } else {
            dVar.mo5396C();
        }
    }
}
