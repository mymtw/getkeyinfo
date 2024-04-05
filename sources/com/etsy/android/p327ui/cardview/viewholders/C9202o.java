package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.o */
public final class C9202o extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C9145z f20312b;

    /* renamed from: c */
    public final MaterialCardView f20313c;

    /* renamed from: d */
    public ImageView f20314d;

    /* renamed from: e */
    public TextView f20315e;

    public C9202o(ViewGroup viewGroup, C9145z zVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_mosaic_card, viewGroup, false));
        this.f20312b = zVar;
        View findViewById = this.itemView.findViewById(R.id.card);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.card)");
        this.f20313c = (MaterialCardView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.image)");
        this.f20314d = (ImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.title)");
        this.f20315e = (TextView) findViewById3;
    }
}
