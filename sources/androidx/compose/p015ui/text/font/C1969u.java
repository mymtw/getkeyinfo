package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.font.u */
public final class C1969u {

    /* renamed from: a */
    public static final C1969u f4427a = new C1969u();

    /* renamed from: a */
    public final Typeface mo7587a(Context context, C1968t tVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(tVar, "font");
        Typeface font = context.getResources().getFont(tVar.f4423a);
        C19383o.m32796f(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
