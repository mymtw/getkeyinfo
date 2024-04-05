package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.graphics.C1545s;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.style.TextDrawStyle */
public interface TextDrawStyle {

    /* renamed from: androidx.compose.ui.text.style.TextDrawStyle$a */
    public static final class C2024a implements TextDrawStyle {

        /* renamed from: a */
        public static final C2024a f4602a = new C2024a();

        /* renamed from: a */
        public final long mo7763a() {
            int i = C1545s.f3365j;
            return C1545s.f3364i;
        }

        /* renamed from: d */
        public final void mo7766d() {
        }
    }

    /* renamed from: a */
    long mo7763a();

    /* renamed from: b */
    TextDrawStyle mo7764b(TextDrawStyle textDrawStyle) {
        C19383o.m32797g(textDrawStyle, "other");
        textDrawStyle.mo7766d();
        mo7766d();
        return textDrawStyle.mo7765c(new TextDrawStyle$merge$1(this));
    }

    /* renamed from: c */
    TextDrawStyle mo7765c(C19846a<? extends TextDrawStyle> aVar) {
        C19383o.m32797g(aVar, "other");
        return !C19383o.m32792b(this, C2024a.f4602a) ? this : (TextDrawStyle) aVar.invoke();
    }

    /* renamed from: d */
    void mo7766d();
}
