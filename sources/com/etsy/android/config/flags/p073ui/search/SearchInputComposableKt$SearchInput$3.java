package com.etsy.android.config.flags.p073ui.search;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.search.SearchInputComposableKt$SearchInput$3 */
public final class SearchInputComposableKt$SearchInput$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19846a<C19394m> $onClearClick;
    public final /* synthetic */ C19857l<String, C19394m> $onSearchTextChanged;
    public final /* synthetic */ String $searchText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInputComposableKt$SearchInput$3(String str, C19857l<? super String, C19394m> lVar, C19846a<C19394m> aVar, int i) {
        super(2);
        this.$searchText = str;
        this.$onSearchTextChanged = lVar;
        this.$onClearClick = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SearchInputComposableKt.m12834a(this.$searchText, this.$onSearchTextChanged, this.$onClearClick, dVar, this.$$changed | 1);
    }
}
