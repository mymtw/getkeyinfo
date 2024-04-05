package com.etsy.android.p327ui.user.addresses;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageTextView;

/* renamed from: com.etsy.android.ui.user.addresses.v */
public final class C11453v extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final View f25271b;

    /* renamed from: c */
    public final CollageTextView f25272c;

    /* renamed from: d */
    public final CollageTextView f25273d;

    public C11453v(View view) {
        super(view);
        this.f25271b = view;
        this.f25272c = (CollageTextView) view.findViewById(R.id.address_item_text);
        this.f25273d = (CollageTextView) view.findViewById(R.id.default_label);
    }
}
