package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C0966s;
import androidx.compose.foundation.text.selection.C1021o;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1981a;
import androidx.compose.p015ui.text.input.C1984d;
import androidx.compose.p015ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p568fn.C17782b;
import p753kq.C19857l;

final class TextFieldKeyInput$process$2 extends Lambda implements C19857l<C1021o, C19394m> {
    public final /* synthetic */ KeyCommand $command;
    public final /* synthetic */ Ref$BooleanRef $consumed;
    public final /* synthetic */ C0961o this$0;

    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$a */
    public /* synthetic */ class C0935a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1935a;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            iArr[KeyCommand.COPY.ordinal()] = 1;
            iArr[KeyCommand.PASTE.ordinal()] = 2;
            iArr[KeyCommand.CUT.ordinal()] = 3;
            iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            iArr[KeyCommand.UP.ordinal()] = 10;
            iArr[KeyCommand.DOWN.ordinal()] = 11;
            iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            iArr[KeyCommand.LINE_START.ordinal()] = 14;
            iArr[KeyCommand.LINE_END.ordinal()] = 15;
            iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            iArr[KeyCommand.HOME.ordinal()] = 18;
            iArr[KeyCommand.END.ordinal()] = 19;
            iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            iArr[KeyCommand.TAB.ordinal()] = 27;
            iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            iArr[KeyCommand.DESELECT.ordinal()] = 45;
            iArr[KeyCommand.UNDO.ordinal()] = 46;
            iArr[KeyCommand.REDO.ordinal()] = 47;
            iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            f1935a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInput$process$2(KeyCommand keyCommand, C0961o oVar, Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.$command = keyCommand;
        this.this$0 = oVar;
        this.$consumed = ref$BooleanRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1021o) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1021o oVar) {
        C2021q qVar;
        C2021q qVar2;
        C0965r rVar;
        C0965r rVar2;
        C2021q qVar3;
        C2021q qVar4;
        C0965r rVar3;
        C0965r rVar4;
        C0966s.C0967a aVar;
        C19383o.m32797g(oVar, "$this$commandExecutionContext");
        TextFieldValue textFieldValue = null;
        boolean z = false;
        boolean z2 = true;
        switch (C0935a.f1935a[this.$command.ordinal()]) {
            case 1:
                this.this$0.f2026b.mo4646d(false);
                return;
            case 2:
                this.this$0.f2026b.mo4653l();
                return;
            case 3:
                this.this$0.f2026b.mo4647f();
                return;
            case 4:
                C09271 r0 = C09271.INSTANCE;
                C19383o.m32797g(r0, "or");
                oVar.f2109e.f2153a = null;
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (!z) {
                    return;
                }
                if (C2022r.m4463b(oVar.f2110f)) {
                    r0.invoke(oVar);
                    return;
                } else if (oVar.mo4675e()) {
                    int e = C2022r.m4466e(oVar.f2110f);
                    oVar.mo4693w(e, e);
                    return;
                } else {
                    int d = C2022r.m4465d(oVar.f2110f);
                    oVar.mo4693w(d, d);
                    return;
                }
            case 5:
                C09282 r02 = C09282.INSTANCE;
                C19383o.m32797g(r02, "or");
                oVar.f2109e.f2153a = null;
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (!z) {
                    return;
                }
                if (C2022r.m4463b(oVar.f2110f)) {
                    r02.invoke(oVar);
                    return;
                } else if (oVar.mo4675e()) {
                    int d2 = C2022r.m4465d(oVar.f2110f);
                    oVar.mo4693w(d2, d2);
                    return;
                } else {
                    int e2 = C2022r.m4466e(oVar.f2110f);
                    oVar.mo4693w(e2, e2);
                    return;
                }
            case 6:
                oVar.mo4678h();
                return;
            case 7:
                oVar.mo4686p();
                return;
            case 8:
                oVar.mo4683m();
                return;
            case 9:
                oVar.mo4680j();
                return;
            case 10:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (qVar = oVar.f2107c) != null) {
                    int f = oVar.mo4676f(qVar, -1);
                    oVar.mo4693w(f, f);
                    return;
                }
                return;
            case 11:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (qVar2 = oVar.f2107c) != null) {
                    int f2 = oVar.mo4676f(qVar2, 1);
                    oVar.mo4693w(f2, f2);
                    return;
                }
                return;
            case 12:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (rVar = oVar.f2149i) != null) {
                    int y = oVar.mo4725y(rVar, -1);
                    oVar.mo4693w(y, y);
                    return;
                }
                return;
            case 13:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (rVar2 = oVar.f2149i) != null) {
                    int y2 = oVar.mo4725y(rVar2, 1);
                    oVar.mo4693w(y2, y2);
                    return;
                }
                return;
            case 14:
                oVar.mo4691u();
                return;
            case 15:
                oVar.mo4688r();
                return;
            case 16:
                oVar.mo4689s();
                return;
            case 17:
                oVar.mo4690t();
                return;
            case 18:
                oVar.f2109e.f2153a = null;
                if (oVar.f2111g.f4296b.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    oVar.mo4693w(0, 0);
                    return;
                }
                return;
            case 19:
                oVar.mo4687q();
                return;
            case 20:
                List<C1984d> x = oVar.mo4724x(C09293.INSTANCE);
                if (x != null) {
                    this.this$0.mo4577a(x);
                    return;
                }
                return;
            case 21:
                List<C1984d> x2 = oVar.mo4724x(C09304.INSTANCE);
                if (x2 != null) {
                    this.this$0.mo4577a(x2);
                    return;
                }
                return;
            case 22:
                List<C1984d> x3 = oVar.mo4724x(C09315.INSTANCE);
                if (x3 != null) {
                    this.this$0.mo4577a(x3);
                    return;
                }
                return;
            case 23:
                List<C1984d> x4 = oVar.mo4724x(C09326.INSTANCE);
                if (x4 != null) {
                    this.this$0.mo4577a(x4);
                    return;
                }
                return;
            case 24:
                List<C1984d> x5 = oVar.mo4724x(C09337.INSTANCE);
                if (x5 != null) {
                    this.this$0.mo4577a(x5);
                    return;
                }
                return;
            case 25:
                List<C1984d> x6 = oVar.mo4724x(C09348.INSTANCE);
                if (x6 != null) {
                    this.this$0.mo4577a(x6);
                    return;
                }
                return;
            case 26:
                C0961o oVar2 = this.this$0;
                if (!oVar2.f2029e) {
                    oVar2.mo4577a(C17782b.m29864d0(new C1981a("\n", 1)));
                    return;
                } else {
                    this.$consumed.element = false;
                    return;
                }
            case 27:
                C0961o oVar3 = this.this$0;
                if (!oVar3.f2029e) {
                    oVar3.mo4577a(C17782b.m29864d0(new C1981a("\t", 1)));
                    return;
                } else {
                    this.$consumed.element = false;
                    return;
                }
            case 28:
                oVar.f2109e.f2153a = null;
                if (oVar.f2111g.f4296b.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    oVar.mo4693w(0, oVar.f2111g.f4296b.length());
                    return;
                }
                return;
            case 29:
                oVar.mo4677g();
                oVar.mo4692v();
                return;
            case 30:
                oVar.mo4685o();
                oVar.mo4692v();
                return;
            case 31:
                oVar.mo4678h();
                oVar.mo4692v();
                return;
            case 32:
                oVar.mo4686p();
                oVar.mo4692v();
                return;
            case 33:
                oVar.mo4683m();
                oVar.mo4692v();
                return;
            case 34:
                oVar.mo4680j();
                oVar.mo4692v();
                return;
            case 35:
                oVar.mo4691u();
                oVar.mo4692v();
                return;
            case 36:
                oVar.mo4688r();
                oVar.mo4692v();
                return;
            case 37:
                oVar.mo4689s();
                oVar.mo4692v();
                return;
            case 38:
                oVar.mo4690t();
                oVar.mo4692v();
                return;
            case 39:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (qVar3 = oVar.f2107c) != null) {
                    int f3 = oVar.mo4676f(qVar3, -1);
                    oVar.mo4693w(f3, f3);
                }
                oVar.mo4692v();
                return;
            case 40:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (qVar4 = oVar.f2107c) != null) {
                    int f4 = oVar.mo4676f(qVar4, 1);
                    oVar.mo4693w(f4, f4);
                }
                oVar.mo4692v();
                return;
            case 41:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (rVar3 = oVar.f2149i) != null) {
                    int y3 = oVar.mo4725y(rVar3, -1);
                    oVar.mo4693w(y3, y3);
                }
                oVar.mo4692v();
                return;
            case 42:
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z && (rVar4 = oVar.f2149i) != null) {
                    int y4 = oVar.mo4725y(rVar4, 1);
                    oVar.mo4693w(y4, y4);
                }
                oVar.mo4692v();
                return;
            case 43:
                oVar.f2109e.f2153a = null;
                if (oVar.f2111g.f4296b.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    oVar.mo4693w(0, 0);
                }
                oVar.mo4692v();
                return;
            case 44:
                oVar.mo4687q();
                oVar.mo4692v();
                return;
            case 45:
                oVar.f2109e.f2153a = null;
                if (oVar.f2111g.f4296b.length() > 0) {
                    z = true;
                }
                if (z) {
                    int c = C2022r.m4464c(oVar.f2110f);
                    oVar.mo4693w(c, c);
                    return;
                }
                return;
            case 46:
                C0966s sVar = this.this$0.f2032h;
                if (sVar != null) {
                    sVar.mo4581a(TextFieldValue.m4312a(oVar.f2148h, oVar.f2111g, oVar.f2110f, 4));
                }
                C0966s sVar2 = this.this$0.f2032h;
                if (sVar2 != null) {
                    C0966s.C0967a aVar2 = sVar2.f2046b;
                    if (!(aVar2 == null || (aVar = aVar2.f2051a) == null)) {
                        sVar2.f2046b = aVar;
                        sVar2.f2048d -= aVar2.f2052b.f4448a.f4296b.length();
                        sVar2.f2047c = new C0966s.C0967a(sVar2.f2047c, aVar2.f2052b);
                        textFieldValue = aVar.f2052b;
                    }
                    if (textFieldValue != null) {
                        this.this$0.f2034j.invoke(textFieldValue);
                        return;
                    }
                    return;
                }
                return;
            case 47:
                C0966s sVar3 = this.this$0.f2032h;
                if (sVar3 != null) {
                    C0966s.C0967a aVar3 = sVar3.f2047c;
                    if (aVar3 != null) {
                        sVar3.f2047c = aVar3.f2051a;
                        sVar3.f2046b = new C0966s.C0967a(sVar3.f2046b, aVar3.f2052b);
                        sVar3.f2048d = aVar3.f2052b.f4448a.f4296b.length() + sVar3.f2048d;
                        textFieldValue = aVar3.f2052b;
                    }
                    if (textFieldValue != null) {
                        this.this$0.f2034j.invoke(textFieldValue);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
