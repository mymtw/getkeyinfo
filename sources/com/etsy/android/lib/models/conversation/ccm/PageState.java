package com.etsy.android.lib.models.conversation.ccm;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;

@C17403o(generateAdapter = true)
public final class PageState {
    public static final int $stable = 0;
    private final int currentPage;
    private final boolean isSeller;
    private final int pageCount;

    public PageState(@C17402n(name = "total_pages") int i, @C17402n(name = "current_page") int i2, @C17402n(name = "is_seller") boolean z) {
        this.pageCount = i;
        this.currentPage = i2;
        this.isSeller = z;
    }

    public static /* synthetic */ PageState copy$default(PageState pageState, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pageState.pageCount;
        }
        if ((i3 & 2) != 0) {
            i2 = pageState.currentPage;
        }
        if ((i3 & 4) != 0) {
            z = pageState.isSeller;
        }
        return pageState.copy(i, i2, z);
    }

    public final int component1() {
        return this.pageCount;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final boolean component3() {
        return this.isSeller;
    }

    public final PageState copy(@C17402n(name = "total_pages") int i, @C17402n(name = "current_page") int i2, @C17402n(name = "is_seller") boolean z) {
        return new PageState(i, i2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageState)) {
            return false;
        }
        PageState pageState = (PageState) obj;
        return this.pageCount == pageState.pageCount && this.currentPage == pageState.currentPage && this.isSeller == pageState.isSeller;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.currentPage, Integer.hashCode(this.pageCount) * 31, 31);
        boolean z = this.isSeller;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public final boolean isSeller() {
        return this.isSeller;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PageState(pageCount=");
        h.append(this.pageCount);
        h.append(", currentPage=");
        h.append(this.currentPage);
        h.append(", isSeller=");
        return C0391c.m1058d(h, this.isSeller, ')');
    }
}
