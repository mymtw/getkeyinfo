package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import com.etsy.android.lib.models.apiv3.listing.ShopsManufacturer;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel$Companion$from$manufacturers$1 */
public final class ItemDetailsPanel$Companion$from$manufacturers$1 extends Lambda implements C19857l<ShopsManufacturer, CharSequence> {
    public static final ItemDetailsPanel$Companion$from$manufacturers$1 INSTANCE = new ItemDetailsPanel$Companion$from$manufacturers$1();

    public ItemDetailsPanel$Companion$from$manufacturers$1() {
        super(1);
    }

    public final CharSequence invoke(ShopsManufacturer shopsManufacturer) {
        C19383o.m32797g(shopsManufacturer, "it");
        return 10 + shopsManufacturer.getName();
    }
}
