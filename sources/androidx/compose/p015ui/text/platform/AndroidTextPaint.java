package androidx.compose.p015ui.text.platform;

import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.p015ui.graphics.C1526i0;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.style.C2030e;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;
import p288y.C8347f;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.text.platform.AndroidTextPaint */
public final class AndroidTextPaint extends TextPaint {
    private C1533m brush;
    private C8347f brushSize;
    private C1528j0 shadow;
    private C2030e textDecoration = C2030e.f4612b;

    public AndroidTextPaint(int i, float f) {
        super(i);
        this.density = f;
        C1528j0 j0Var = C1528j0.f3322d;
        this.shadow = C1528j0.f3322d;
    }

    /* renamed from: setBrush-d16Qtg0  reason: not valid java name */
    public final void m34824setBrushd16Qtg0(C1533m mVar, long j) {
        if (mVar == null) {
            setShader((Shader) null);
            return;
        }
        boolean z = false;
        if (C19383o.m32792b(this.brush, mVar)) {
            C8347f fVar = this.brushSize;
            if (fVar == null ? false : C8347f.m16653a(fVar.f18316a, j)) {
                return;
            }
        }
        this.brush = mVar;
        this.brushSize = new C8347f(j);
        if (mVar instanceof C1532l0) {
            setShader((Shader) null);
            m34825setColor8_81llA(((C1532l0) mVar).f3331a);
        } else if (mVar instanceof C1526i0) {
            if (j != C8347f.f18314c) {
                z = true;
            }
            if (z) {
                setShader(((C1526i0) mVar).mo6360b());
            }
        }
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m34825setColor8_81llA(long j) {
        int o0;
        int i = C1545s.f3365j;
        if ((j != C1545s.f3364i) && getColor() != (o0 = C18263b.m30859o0(j))) {
            setColor(o0);
        }
    }

    public final void setShadow(C1528j0 j0Var) {
        if (j0Var == null) {
            C1528j0 j0Var2 = C1528j0.f3322d;
            j0Var = C1528j0.f3322d;
        }
        if (!C19383o.m32792b(this.shadow, j0Var)) {
            this.shadow = j0Var;
            C1528j0 j0Var3 = C1528j0.f3322d;
            if (C19383o.m32792b(j0Var, C1528j0.f3322d)) {
                clearShadowLayer();
                return;
            }
            C1528j0 j0Var4 = this.shadow;
            setShadowLayer(j0Var4.f3325c, C8343c.m16642c(j0Var4.f3324b), C8343c.m16643d(this.shadow.f3324b), C18263b.m30859o0(this.shadow.f3323a));
        }
    }

    public final void setTextDecoration(C2030e eVar) {
        if (eVar == null) {
            eVar = C2030e.f4612b;
        }
        if (!C19383o.m32792b(this.textDecoration, eVar)) {
            this.textDecoration = eVar;
            setUnderlineText(eVar.mo7779a(C2030e.f4613c));
            setStrikeThruText(this.textDecoration.mo7779a(C2030e.f4614d));
        }
    }
}
