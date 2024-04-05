package com.braze.p044ui.inappmessage.factories;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.p043ui.C4940R;
import com.braze.models.inappmessage.C5489g;
import com.braze.p044ui.inappmessage.views.InAppMessageFullView;
import com.braze.p044ui.support.ViewUtils;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.inappmessage.factories.b */
public final /* synthetic */ class C5648b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f12063b;

    /* renamed from: c */
    public final /* synthetic */ InAppMessageFullView f12064c;

    /* renamed from: d */
    public final /* synthetic */ C5489g f12065d;

    /* renamed from: e */
    public final /* synthetic */ Context f12066e;

    /* renamed from: f */
    public final /* synthetic */ View f12067f;

    public /* synthetic */ C5648b(View view, InAppMessageFullView inAppMessageFullView, C5489g gVar, Context context, View view2) {
        this.f12063b = view;
        this.f12064c = inAppMessageFullView;
        this.f12065d = gVar;
        this.f12066e = context;
        this.f12067f = view2;
    }

    public final void run() {
        View view = this.f12063b;
        InAppMessageFullView inAppMessageFullView = this.f12064c;
        C5489g gVar = this.f12065d;
        Context context = this.f12066e;
        View view2 = this.f12067f;
        C19383o.m32797g(inAppMessageFullView, "$view");
        C19383o.m32797g(gVar, "$inAppMessageFull");
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = inAppMessageFullView.findViewById(C4940R.C4942id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
            if (!gVar.f11812G.isEmpty()) {
                C19383o.m32796f(context, "applicationContext");
                i += (int) ViewUtils.m11475a(context, 64.0d);
            }
            int min = Math.min(view2.getHeight(), height - i);
            String str = ViewUtils.f12100a;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams2.height = min;
            view2.setLayoutParams(layoutParams2);
            view2.requestLayout();
            inAppMessageFullView.getMessageImageView().requestLayout();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
