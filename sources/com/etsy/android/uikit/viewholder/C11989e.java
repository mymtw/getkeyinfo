package com.etsy.android.uikit.viewholder;

import android.view.View;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.viewholder.C11989e.C11990a;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.uikit.viewholder.e */
public final class C11989e<T extends C11990a> extends C12086e<T> {

    /* renamed from: c */
    public final Button f26701c;

    /* renamed from: com.etsy.android.uikit.viewholder.e$a */
    public static class C11990a {

        /* renamed from: a */
        public final String f26702a;

        /* renamed from: b */
        public final TrackingOnClickListener f26703b;

        public C11990a(String str, TrackingOnClickListener trackingOnClickListener) {
            this.f26702a = str;
            this.f26703b = trackingOnClickListener;
        }
    }

    public C11989e(View view) {
        super(view);
        this.f26701c = (Button) view.findViewById(R.id.button);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C11990a aVar = (C11990a) obj;
        this.f26701c.setText(aVar.f26702a);
        TrackingOnClickListener trackingOnClickListener = aVar.f26703b;
        if (trackingOnClickListener != null) {
            this.f26701c.setOnClickListener(trackingOnClickListener);
        }
        this.f26701c.setVisibility(0);
    }
}
