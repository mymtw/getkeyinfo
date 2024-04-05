package androidx.compose.p015ui;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.focus.C1466b;
import androidx.compose.p015ui.focus.C1479m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.ComposedModifierKt$materialize$1 */
public final class ComposedModifierKt$materialize$1 extends Lambda implements C19857l<C1436d.C1438b, Boolean> {
    public static final ComposedModifierKt$materialize$1 INSTANCE = new ComposedModifierKt$materialize$1();

    public ComposedModifierKt$materialize$1() {
        super(1);
    }

    public final Boolean invoke(C1436d.C1438b bVar) {
        C19383o.m32797g(bVar, "it");
        return Boolean.valueOf(!(bVar instanceof C1435c) && !(bVar instanceof C1466b) && !(bVar instanceof C1479m));
    }
}
