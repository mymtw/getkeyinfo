package androidx.compose.p015ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p015ui.focus.FocusModifier;
import androidx.compose.p015ui.focus.FocusModifierKt;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p219r.C7734e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.key.d */
public final class C1614d implements C6764b, C6765c<C1614d>, C1678e0 {

    /* renamed from: b */
    public final C19857l<C1612b, Boolean> f3588b;

    /* renamed from: c */
    public final C19857l<C1612b, Boolean> f3589c;

    /* renamed from: d */
    public FocusModifier f3590d;

    /* renamed from: e */
    public C1614d f3591e;

    /* renamed from: f */
    public LayoutNode f3592f;

    public C1614d(C19857l<? super C1612b, Boolean> lVar, C19857l<? super C1612b, Boolean> lVar2) {
        this.f3588b = lVar;
        this.f3589c = lVar2;
    }

    /* renamed from: D */
    public final void mo3725D(C1689j jVar) {
        C19383o.m32797g(jVar, "coordinates");
        this.f3592f = ((LayoutNodeWrapper) jVar).f3850f;
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C7734e<C1614d> eVar;
        C7734e<C1614d> eVar2;
        C19383o.m32797g(dVar, "scope");
        FocusModifier focusModifier = this.f3590d;
        if (!(focusModifier == null || (eVar2 = focusModifier.f3164p) == null)) {
            eVar2.mo20241o(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) dVar.mo6818a(FocusModifierKt.f3166a);
        this.f3590d = focusModifier2;
        if (!(focusModifier2 == null || (eVar = focusModifier2.f3164p) == null)) {
            eVar.mo20232c(this);
        }
        this.f3591e = (C1614d) dVar.mo6818a(KeyInputModifierKt.f3575a);
    }

    /* renamed from: a */
    public final boolean mo6533a(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "keyEvent");
        C19857l<C1612b, Boolean> lVar = this.f3588b;
        Boolean invoke = lVar != null ? lVar.invoke(new C1612b(keyEvent)) : null;
        if (C19383o.m32792b(invoke, Boolean.TRUE)) {
            return invoke.booleanValue();
        }
        C1614d dVar = this.f3591e;
        if (dVar != null) {
            return dVar.mo6533a(keyEvent);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6534b(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "keyEvent");
        C1614d dVar = this.f3591e;
        Boolean valueOf = dVar != null ? Boolean.valueOf(dVar.mo6534b(keyEvent)) : null;
        if (C19383o.m32792b(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        C19857l<C1612b, Boolean> lVar = this.f3589c;
        if (lVar != null) {
            return lVar.invoke(new C1612b(keyEvent)).booleanValue();
        }
        return false;
    }

    public final C6767e<C1614d> getKey() {
        return KeyInputModifierKt.f3575a;
    }

    public final Object getValue() {
        return this;
    }
}
