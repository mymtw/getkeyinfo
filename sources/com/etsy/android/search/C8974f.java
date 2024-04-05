package com.etsy.android.search;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.ILink;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.search.QueryReformulation;
import java.util.List;

/* renamed from: com.etsy.android.search.f */
public final class C8974f implements ILink {

    /* renamed from: b */
    public final QueryReformulation f19800b;

    /* renamed from: c */
    public final String f19801c;

    public C8974f(QueryReformulation queryReformulation, String str) {
        this.f19800b = queryReformulation;
        this.f19801c = str;
    }

    public final Integer getBackgroundColor() {
        return Integer.valueOf(this.f19800b.getColor());
    }

    public final List<ListingImage> getImages() {
        return this.f19800b.getImages();
    }

    public final String getLink() {
        StringBuilder h = C0072d.m201h("etsy://search?");
        h.append(this.f19801c);
        return h.toString();
    }

    public final String getTitle() {
        return this.f19800b.getDisplay();
    }
}
