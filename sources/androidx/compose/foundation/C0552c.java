package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.c */
public final class C0552c {

    /* renamed from: a */
    public static final C0552c f1293a = new C0552c();

    /* renamed from: a */
    public final EdgeEffect mo3712a(Context context, AttributeSet attributeSet) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public final float mo3713b(EdgeEffect edgeEffect) {
        C19383o.m32797g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float mo3714c(EdgeEffect edgeEffect, float f, float f2) {
        C19383o.m32797g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
