package com.etsy.android.p327ui.util.countries;

import com.etsy.android.lib.models.Country;
import com.reddit.indicatorfastscroll.C17346a;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorFragment$setupAdapter$2$1 */
public final class CountrySelectorFragment$setupAdapter$2$1 extends Lambda implements C19857l<Integer, C17346a> {
    public final /* synthetic */ List<Country> $data;
    public final /* synthetic */ CountrySelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectorFragment$setupAdapter$2$1(List<Country> list, CountrySelectorFragment countrySelectorFragment) {
        super(1);
        this.$data = list;
        this.this$0 = countrySelectorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final C17346a invoke(int i) {
        String substring = this.$data.get(i).getName().substring(0, 1);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String upperCase = substring.toUpperCase(this.this$0.getCurrentLocale().mo46718b());
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return new C17346a.C17348b(upperCase);
    }
}
