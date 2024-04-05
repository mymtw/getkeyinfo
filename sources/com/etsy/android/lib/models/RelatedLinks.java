package com.etsy.android.lib.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class RelatedLinks {
    public static final int $stable = 8;
    private final List<ShopRelatedLink> links;

    public RelatedLinks() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public RelatedLinks(List<ShopRelatedLink> list) {
        this.links = list;
    }

    public static /* synthetic */ RelatedLinks copy$default(RelatedLinks relatedLinks, List<ShopRelatedLink> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relatedLinks.links;
        }
        return relatedLinks.copy(list);
    }

    public final List<ShopRelatedLink> component1() {
        return this.links;
    }

    public final RelatedLinks copy(List<ShopRelatedLink> list) {
        return new RelatedLinks(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelatedLinks) && C19383o.m32792b(this.links, ((RelatedLinks) obj).links);
    }

    public final List<ShopRelatedLink> getLinks() {
        return this.links;
    }

    public int hashCode() {
        List<ShopRelatedLink> list = this.links;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("RelatedLinks(links="), this.links, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RelatedLinks(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.INSTANCE : list);
    }
}
