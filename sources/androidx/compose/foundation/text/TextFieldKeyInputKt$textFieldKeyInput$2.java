package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C1021o;
import androidx.compose.foundation.text.selection.C1025s;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.key.C1612b;
import androidx.compose.p015ui.input.key.C1613c;
import androidx.compose.p015ui.input.key.KeyInputModifierKt;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1981a;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p568fn.C17782b;
import p753kq.C19857l;
import p753kq.C19862q;

final class TextFieldKeyInputKt$textFieldKeyInput$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $editable;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ C19857l<TextFieldValue, C19394m> $onValueChange;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ C0966s $undoManager;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInputKt$textFieldKeyInput$2(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, C1994n nVar, C0966s sVar, C19857l<? super TextFieldValue, C19394m> lVar) {
        super(3);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$editable = z;
        this.$singleLine = z2;
        this.$offsetMapping = nVar;
        this.$undoManager = sVar;
        this.$onValueChange = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(58482146);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new C1025s();
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1436d a = KeyInputModifierKt.m3421a(C1436d.C1437a.f3125b, new C19857l<C1612b, Boolean>(new C0961o(this.$state, this.$manager, this.$value, this.$editable, this.$singleLine, (C1025s) v, this.$offsetMapping, this.$undoManager, this.$onValueChange)) {
            public /* synthetic */ Object invoke(Object obj) {
                return m34710invokeZmokQxo(((C1612b) obj).f3587a);
            }

            /* renamed from: invoke-ZmokQxo  reason: not valid java name */
            public final Boolean m34710invokeZmokQxo(KeyEvent keyEvent) {
                C1981a aVar;
                KeyCommand a;
                C19383o.m32797g(keyEvent, "p0");
                C0961o oVar = (C0961o) this.receiver;
                oVar.getClass();
                boolean z = false;
                if (keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0) {
                    StringBuilder appendCodePoint = new StringBuilder().appendCodePoint(keyEvent.getUnicodeChar());
                    C19383o.m32796f(appendCodePoint, "appendCodePointX");
                    String sb = appendCodePoint.toString();
                    C19383o.m32796f(sb, "StringBuilder().appendCo…              .toString()");
                    aVar = new C1981a(sb, 1);
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    if ((C1613c.m3424b(keyEvent) == 2) && (a = oVar.f2033i.mo4495a(keyEvent)) != null && (!a.getEditsText() || oVar.f2028d)) {
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        TextFieldKeyInput$process$2 textFieldKeyInput$process$2 = new TextFieldKeyInput$process$2(a, oVar, ref$BooleanRef);
                        C1021o oVar2 = new C1021o(oVar.f2027c, oVar.f2031g, oVar.f2025a.mo4562c(), oVar.f2030f);
                        textFieldKeyInput$process$2.invoke(oVar2);
                        if (!C2022r.m4462a(oVar2.f2110f, oVar.f2027c.f4449b) || !C19383o.m32792b(oVar2.f2111g, oVar.f2027c.f4448a)) {
                            oVar.f2034j.invoke(TextFieldValue.m4312a(oVar2.f2148h, oVar2.f2111g, oVar2.f2110f, 4));
                        }
                        C0966s sVar = oVar.f2032h;
                        if (sVar != null) {
                            sVar.f2050f = true;
                        }
                        z = ref$BooleanRef.element;
                    }
                } else if (oVar.f2028d) {
                    oVar.mo4577a(C17782b.m29864d0(aVar));
                    oVar.f2030f.f2153a = null;
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        dVar2.mo5406H();
        return a;
    }
}
