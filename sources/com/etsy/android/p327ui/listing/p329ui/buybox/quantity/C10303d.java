package com.etsy.android.p327ui.listing.p329ui.buybox.quantity;

import android.content.Context;
import android.support.p013v4.media.C0069a;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.CollageSelectAdapter;
import com.etsy.android.stylekit.views.CollageSelectDropdown;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.quantity.d */
public final class C10303d extends C10424k {

    /* renamed from: b */
    public final C13573c f22614b;

    /* renamed from: c */
    public final CollageSelectDropdown f22615c;

    /* renamed from: d */
    public final CollageSelectAdapter f22616d;

    static {
        int i = CollageSelectAdapter.$stable;
        int i2 = CollageSelectDropdown.$stable;
    }

    public C10303d(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_quantity, false));
        this.f22614b = cVar;
        CollageSelectDropdown collageSelectDropdown = (CollageSelectDropdown) this.itemView.findViewById(R.id.collage_quantity_selector);
        this.f22615c = collageSelectDropdown;
        Context context = this.itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        CollageSelectAdapter collageSelectAdapter = new CollageSelectAdapter(context, 0, 2, (DefaultConstructorMarker) null);
        collageSelectDropdown.setCollageAdapter(collageSelectAdapter);
        collageSelectDropdown.setOnItemClickListener(new C10302c(this));
        this.f22616d = collageSelectAdapter;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10299a) {
            C10299a aVar = (C10299a) jVar;
            int i = aVar.f22609a;
            int[] iArr = aVar.f22610b;
            boolean z = aVar.f22611c;
            this.f22616d.clear();
            CollageSelectAdapter collageSelectAdapter = this.f22616d;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                arrayList.add(String.valueOf(valueOf));
            }
            collageSelectAdapter.addAll(arrayList);
            this.f22615c.setEnabled(z);
            this.f22615c.setSelection(String.valueOf(i));
            return;
        }
        throw new IllegalArgumentException();
    }
}
