package androidx.compose.p015ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.j */
public final class C1841j implements C1835h {

    /* renamed from: a */
    public final AccessibilityManager f4099a;

    public C1841j(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            this.f4099a = (AccessibilityManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }

    /* renamed from: a */
    public final long mo7224a(long j, boolean z) {
        if (j >= ParserMinimalBase.MAX_INT_L) {
            return j;
        }
        int i = 3;
        if (z) {
            i = 7;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a = C1813a0.f4066a.mo7181a(this.f4099a, (int) j, i);
            if (a != Integer.MAX_VALUE) {
                return (long) a;
            }
        } else if (!z || !this.f4099a.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
