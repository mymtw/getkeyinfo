package androidx.compose.foundation.text;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class TextFieldCursorKt$cursor$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1533m $cursorBrush;
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1(C1533m mVar, TextFieldState textFieldState, TextFieldValue textFieldValue, C1994n nVar) {
        super(3);
        this.$cursorBrush = mVar;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if ((((androidx.compose.p015ui.graphics.C1532l0) r11).f3331a == androidx.compose.p015ui.graphics.C1545s.f3364i) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.C1436d invoke(androidx.compose.p015ui.C1436d r9, androidx.compose.runtime.C1302d r10, int r11) {
        /*
            r8 = this;
            java.lang.String r11 = "$this$composed"
            kotlin.jvm.internal.C19383o.m32797g(r9, r11)
            r11 = 1634330012(0x6169e59c, float:2.6966478E20)
            r10.mo5465u(r11)
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r11)
            java.lang.Object r11 = r10.mo5467v()
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r11 != r0) goto L_0x0022
            r11 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.animation.core.Animatable r11 = kotlin.reflect.C19421p.m32945m(r11)
            r10.mo5454o(r11)
        L_0x0022:
            r10.mo5406H()
            r1 = r11
            androidx.compose.animation.core.Animatable r1 = (androidx.compose.animation.core.Animatable) r1
            androidx.compose.ui.graphics.m r11 = r8.$cursorBrush
            boolean r0 = r11 instanceof androidx.compose.p015ui.graphics.C1532l0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003f
            androidx.compose.ui.graphics.l0 r11 = (androidx.compose.p015ui.graphics.C1532l0) r11
            long r4 = r11.f3331a
            long r6 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x003c
            r11 = r3
            goto L_0x003d
        L_0x003c:
            r11 = r2
        L_0x003d:
            if (r11 != 0) goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            androidx.compose.foundation.text.TextFieldState r11 = r8.$state
            boolean r11 = r11.mo4561b()
            if (r11 == 0) goto L_0x007d
            androidx.compose.ui.text.input.TextFieldValue r11 = r8.$value
            long r3 = r11.f4449b
            boolean r11 = androidx.compose.p015ui.text.C2022r.m4463b(r3)
            if (r11 == 0) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            androidx.compose.ui.graphics.m r11 = r8.$cursorBrush
            androidx.compose.ui.text.input.TextFieldValue r0 = r8.$value
            androidx.compose.ui.text.a r2 = r0.f4448a
            long r3 = r0.f4449b
            androidx.compose.ui.text.r r0 = new androidx.compose.ui.text.r
            r0.<init>(r3)
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 r3 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1
            r4 = 0
            r3.<init>(r1, r4)
            androidx.compose.runtime.C1415u.m3029c(r11, r2, r0, r3, r10)
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2 r11 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2
            androidx.compose.ui.text.input.n r2 = r8.$offsetMapping
            androidx.compose.ui.text.input.TextFieldValue r3 = r8.$value
            androidx.compose.foundation.text.TextFieldState r4 = r8.$state
            androidx.compose.ui.graphics.m r5 = r8.$cursorBrush
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.ui.d r9 = androidx.compose.p015ui.draw.DrawModifierKt.m3072c(r9, r11)
            goto L_0x007f
        L_0x007d:
            androidx.compose.ui.d$a r9 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x007f:
            r10.mo5406H()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.invoke(androidx.compose.ui.d, androidx.compose.runtime.d, int):androidx.compose.ui.d");
    }
}
