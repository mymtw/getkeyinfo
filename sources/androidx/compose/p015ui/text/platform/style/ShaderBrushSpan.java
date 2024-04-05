package androidx.compose.p015ui.text.platform.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p015ui.graphics.C1526i0;
import kotlin.jvm.internal.C19383o;
import p288y.C8347f;

/* renamed from: androidx.compose.ui.text.platform.style.ShaderBrushSpan */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    private final C1526i0 shaderBrush;
    private C8347f size;

    public ShaderBrushSpan(C1526i0 i0Var) {
        C19383o.m32797g(i0Var, "shaderBrush");
        this.shaderBrush = i0Var;
    }

    public final C1526i0 getShaderBrush() {
        return this.shaderBrush;
    }

    /* renamed from: getSize-VsRJwc0  reason: not valid java name */
    public final C8347f m34826getSizeVsRJwc0() {
        return this.size;
    }

    /* renamed from: setSize-iaC8Vc4  reason: not valid java name */
    public final void m34827setSizeiaC8Vc4(C8347f fVar) {
        this.size = fVar;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null && this.size != null) {
            textPaint.setShader(this.shaderBrush.mo6360b());
        }
    }
}
