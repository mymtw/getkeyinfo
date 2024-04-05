package androidx.compose.foundation.text;

import androidx.compose.animation.core.C0414b0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class TextFieldCursorKt$cursorAnimationSpec$1 extends Lambda implements C19857l<C0414b0.C0416b<Float>, C19394m> {
    public static final TextFieldCursorKt$cursorAnimationSpec$1 INSTANCE = new TextFieldCursorKt$cursorAnimationSpec$1();

    public TextFieldCursorKt$cursorAnimationSpec$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0414b0.C0416b<Float>) (C0414b0.C0416b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0414b0.C0416b<Float> bVar) {
        C19383o.m32797g(bVar, "$this$keyframes");
        bVar.f1089a = 1000;
        Float valueOf = Float.valueOf(1.0f);
        bVar.mo3476a(0, valueOf);
        bVar.mo3476a(499, valueOf);
        Float valueOf2 = Float.valueOf(0.0f);
        bVar.mo3476a(500, valueOf2);
        bVar.mo3476a(999, valueOf2);
    }
}
