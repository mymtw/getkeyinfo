package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11047d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.p */
public final class C11070p extends C11100x {

    /* renamed from: b */
    public final C11047d.C11049b f24536b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11070p(android.view.ViewGroup r4, com.etsy.android.p327ui.search.p330v2.suggestions.C11047d.C11049b r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624683(0x7f0e02eb, float:1.8876553E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "from(parent.context)\n   …LAYOUT_ID, parent, false)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            r3.<init>(r4)
            r3.f24536b = r5
            android.view.View r4 = r3.itemView
            r5 = 2131429594(0x7f0b08da, float:1.8480865E38)
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = "itemView.findViewById<Te…_suggestion_large_header)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames r5 = com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames.BUTTON
            com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt.m17423b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.suggestions.C11070p.<init>(android.view.ViewGroup, com.etsy.android.ui.search.v2.suggestions.d$b):void");
    }

    /* renamed from: e */
    public final void mo36669e(int i) {
        ViewGroup.LayoutParams layoutParams = ((TextView) this.itemView.findViewById(R.id.search_suggestion_large_header)).getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = marginLayoutParams.getMarginStart();
        int i2 = marginLayoutParams.topMargin;
        int marginEnd = marginLayoutParams.getMarginEnd();
        marginLayoutParams.setMarginStart(marginStart);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(marginEnd);
        marginLayoutParams.bottomMargin = i;
    }
}
