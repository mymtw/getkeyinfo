package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Page implements Serializable {
    public static final int $stable = 8;
    private final List<ListSection> list;

    public Page() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public Page(@C17402n(name = "list") List<ListSection> list2) {
        C19383o.m32797g(list2, ResponseConstants.LIST);
        this.list = list2;
    }

    public static /* synthetic */ Page copy$default(Page page, List<ListSection> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = page.list;
        }
        return page.copy(list2);
    }

    public final List<ListSection> component1() {
        return this.list;
    }

    public final Page copy(@C17402n(name = "list") List<ListSection> list2) {
        C19383o.m32797g(list2, ResponseConstants.LIST);
        return new Page(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Page) && C19383o.m32792b(this.list, ((Page) obj).list);
    }

    public final List<ListSection> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("Page(list="), this.list, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Page(List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.INSTANCE : list2);
    }
}
