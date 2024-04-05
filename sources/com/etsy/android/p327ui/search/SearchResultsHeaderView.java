package com.etsy.android.p327ui.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.p327ui.cardview.clickhandlers.C9141v;
import com.google.android.material.card.MaterialCardView;
import java.util.Map;
import p414oe.C13163b;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.SearchResultsHeaderView */
public abstract class SearchResultsHeaderView extends MaterialCardView {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
    }

    public static /* synthetic */ void bind$default(SearchResultsHeaderView searchResultsHeaderView, BasicSectionHeader basicSectionHeader, C9141v vVar, boolean z, boolean z2, C13163b bVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z2 = false;
            }
            boolean z3 = z2;
            if ((i & 16) != 0) {
                bVar = null;
            }
            searchResultsHeaderView.bind(basicSectionHeader, vVar, z, z3, bVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void bind(BasicSectionHeader basicSectionHeader, C9141v vVar, boolean z, boolean z2, C13163b bVar);
}
