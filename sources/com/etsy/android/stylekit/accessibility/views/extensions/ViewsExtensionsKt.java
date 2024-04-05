package com.etsy.android.stylekit.accessibility.views.extensions;

import android.view.View;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2362x;
import androidx.core.view.C2364y;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import java.util.WeakHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p088e1.C6689b;
import p427qb.C13281a;

public final class ViewsExtensionsKt {

    /* renamed from: com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt$a */
    public static final class C9017a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ C2273a f19888a;

        /* renamed from: b */
        public final /* synthetic */ AccessibilityClassNames f19889b;

        public C9017a(C2273a aVar, AccessibilityClassNames accessibilityClassNames) {
            this.f19888a = aVar;
            this.f19889b = accessibilityClassNames;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19394m mVar;
            C2273a aVar = this.f19888a;
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, bVar);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
            }
            if (bVar != null) {
                bVar.mo18867q(this.f19889b.getAccessibilityClassName());
            }
        }
    }

    /* renamed from: a */
    public static final void m17422a(View view, CharSequence charSequence, long j) {
        C19383o.m32797g(view, "<this>");
        C19383o.m32797g(charSequence, "text");
        C13281a aVar = new C13281a(0, view, charSequence);
        view.addOnAttachStateChangeListener(new ViewsExtensionsKt$makeAccessibilityAnnouncement$1(view, aVar));
        view.postDelayed(aVar, j);
    }

    /* renamed from: b */
    public static final void m17423b(View view, AccessibilityClassNames accessibilityClassNames) {
        C19383o.m32797g(view, "<this>");
        C19383o.m32797g(accessibilityClassNames, "accessibilityClassName");
        C2364y.m5201p(view, new C9017a(C2364y.m5189d(view), accessibilityClassNames));
    }

    /* renamed from: c */
    public static final boolean m17424c(View view, boolean z) {
        C19383o.m32797g(view, "<this>");
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        new C2362x().mo8988e(view, Boolean.valueOf(z));
        view.setFocusable(z);
        return C2364y.m5194i(view);
    }
}
