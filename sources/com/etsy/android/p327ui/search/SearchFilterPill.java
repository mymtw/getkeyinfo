package com.etsy.android.p327ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.SearchFilterPill */
public final class SearchFilterPill extends LinearLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final Button button;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterPill(Context context) {
        super(context);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_search_filter_pill, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        setGravity(16);
        View findViewById = findViewById(R.id.search_filter_pill_button);
        C19383o.m32796f(findViewById, "findViewById(R.id.search_filter_pill_button)");
        this.button = (Button) findViewById;
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

    public final String getText() {
        return this.button.getText().toString();
    }

    public final void setText(String str) {
        C19383o.m32797g(str, "value");
        this.button.setText(str);
    }
}
