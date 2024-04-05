package androidx.compose.foundation.text;

import androidx.compose.p015ui.focus.C1469d;
import androidx.compose.p015ui.text.input.C1989i;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TextFieldState$onImeActionPerformed$1 extends Lambda implements C19857l<C1989i, C19394m> {
    public final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldState$onImeActionPerformed$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m34714invokeKlQnJC8(((C1989i) obj).f4479a);
        return C19394m.f43287a;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m34714invokeKlQnJC8(int i) {
        C19857l<C0952f, C19394m> lVar;
        C19394m mVar;
        C0951e eVar = this.this$0.f1956m;
        eVar.getClass();
        boolean z = false;
        if (i == 7) {
            lVar = eVar.mo4571a().f1979a;
        } else {
            if (i == 2) {
                lVar = eVar.mo4571a().f1980b;
            } else {
                if (i == 6) {
                    lVar = eVar.mo4571a().f1981c;
                } else {
                    if (i == 5) {
                        lVar = eVar.mo4571a().f1982d;
                    } else {
                        if (i == 3) {
                            lVar = eVar.mo4571a().f1983e;
                        } else {
                            if (i == 4) {
                                lVar = eVar.mo4571a().f1984f;
                            } else {
                                if ((i == 1) || i == 0) {
                                    lVar = null;
                                } else {
                                    throw new IllegalStateException("invalid ImeAction".toString());
                                }
                            }
                        }
                    }
                }
            }
        }
        if (lVar != null) {
            lVar.invoke(eVar);
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            if (i == 6) {
                C1469d dVar = eVar.f1977b;
                if (dVar != null) {
                    dVar.mo6184a(1);
                } else {
                    C19383o.m32805o("focusManager");
                    throw null;
                }
            } else {
                if (i == 5) {
                    z = true;
                }
                if (z) {
                    C1469d dVar2 = eVar.f1977b;
                    if (dVar2 != null) {
                        dVar2.mo6184a(2);
                    } else {
                        C19383o.m32805o("focusManager");
                        throw null;
                    }
                }
            }
        }
    }
}
