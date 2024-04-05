package com.etsy.android.vespa.viewholders;

import android.content.Context;
import android.support.p013v4.media.session.C0087d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Button;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.C19383o;
import p423pf.C13231b;
import p435rb.C13350a;

/* renamed from: com.etsy.android.vespa.viewholders.g */
public final class C12090g extends C12086e<Button> {

    /* renamed from: c */
    public final C13231b f26966c;

    /* renamed from: d */
    public final int f26967d;

    /* renamed from: e */
    public final int f26968e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12090g(ViewGroup viewGroup, C13231b bVar, int i, int i2) {
        super(new FrameLayout(viewGroup.getContext()));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(bVar, "clickHandler");
        this.f26966c = bVar;
        this.f26967d = i;
        this.f26968e = i2;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        Button button = (Button) obj;
        C19383o.m32797g(button, "data");
        int b = C0087d.m233b(this.itemView, R.dimen.clg_space_4);
        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(this.f26967d);
        int dimensionPixelSize2 = this.itemView.getContext().getResources().getDimensionPixelSize(this.f26968e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(b, dimensionPixelSize, b, dimensionPixelSize2);
        layoutParams.gravity = 17;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        CollageButton collageButton = new CollageButton(context, (AttributeSet) null);
        collageButton.setText(button.getText());
        collageButton.setLayoutParams(layoutParams);
        C13350a.m21010a(collageButton, button.getStyle());
        collageButton.setOnClickListener(new C12088f(button, this));
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).addView(collageButton);
    }

    /* renamed from: b */
    public final void mo31374b() {
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).removeAllViews();
    }
}
