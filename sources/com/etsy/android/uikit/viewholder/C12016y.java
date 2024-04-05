package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.vespa.viewholders.C12086e;
import p415of.C13186o;

/* renamed from: com.etsy.android.uikit.viewholder.y */
public final class C12016y extends C12086e<C12017a> {

    /* renamed from: com.etsy.android.uikit.viewholder.y$a */
    public static class C12017a implements C13186o, C8698l {

        /* renamed from: b */
        public final int f26784b;

        /* renamed from: c */
        public final int f26785c;

        /* renamed from: d */
        public final int f26786d;

        public C12017a(int i, int i2, int i3) {
            this.f26784b = i;
            this.f26785c = i2;
            this.f26786d = i3;
        }

        public final int getViewType() {
            return this.f26786d;
        }
    }

    public C12016y(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.space, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C12017a aVar = (C12017a) obj;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.width = aVar.f26784b;
        layoutParams.height = aVar.f26785c;
    }
}
