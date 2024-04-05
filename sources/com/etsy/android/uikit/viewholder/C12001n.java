package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.vespa.viewholders.C12086e;
import p415of.C13171a;

/* renamed from: com.etsy.android.uikit.viewholder.n */
public final class C12001n extends C12086e<C12002a> {

    /* renamed from: c */
    public final ImageView f26742c;

    /* renamed from: d */
    public final CollageHeadingTextView f26743d;

    /* renamed from: e */
    public final int f26744e;

    /* renamed from: f */
    public final C13171a<C12002a> f26745f;

    /* renamed from: com.etsy.android.uikit.viewholder.n$a */
    public interface C12002a {
        /* renamed from: b */
        CharSequence mo38866b(Context context);

        /* renamed from: c */
        int mo38867c();

        String getImageUrl();

        void getType();
    }

    public C12001n(View view, C13171a<C12002a> aVar) {
        super(view);
        this.f26742c = (ImageView) view.findViewById(R.id.image);
        this.f26743d = (CollageHeadingTextView) view.findViewById(R.id.heading);
        this.f26744e = (int) view.getResources().getDimension(R.dimen.shop2_horizontal_circular_image_size);
        this.f26745f = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C12002a aVar = (C12002a) obj;
        this.itemView.setOnClickListener(new C12000m(this, aVar));
        aVar.getType();
        C0761x.m1710b0(this.f26742c, aVar.getImageUrl(), this.f26744e);
        ((LinearLayout.LayoutParams) this.f26743d.getLayoutParams()).gravity = aVar.mo38867c();
        this.f26743d.setText(aVar.mo38866b(this.itemView.getContext()));
        CollageHeadingTextView collageHeadingTextView = this.f26743d;
        collageHeadingTextView.setContentDescription(collageHeadingTextView.getResources().getString(R.string.item_button, new Object[]{this.f26743d.getText()}));
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f26742c.setImageDrawable((Drawable) null);
        this.f26743d.setText((CharSequence) null);
    }
}
