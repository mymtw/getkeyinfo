package com.etsy.android.uikit.viewholder;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class ListingCardViewHolderOptions$FavoriteItems$showKebabMenu$2 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ C8618c $configMap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCardViewHolderOptions$FavoriteItems$showKebabMenu$2(C8618c cVar) {
        super(0);
        this.$configMap = cVar;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(!this.$configMap.mo21132b(C8592b.f18775a1));
    }
}
