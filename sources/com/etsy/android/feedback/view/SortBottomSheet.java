package com.etsy.android.feedback.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.data.SortType;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p504ai.C13983i;
import p753kq.C19857l;

public final class SortBottomSheet extends LinearLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C19857l<? super SortType, C19394m> sortClickListener;

    /* renamed from: com.etsy.android.feedback.view.SortBottomSheet$a */
    public /* synthetic */ class C6485a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14386a;

        static {
            int[] iArr = new int[SortType.values().length];
            iArr[SortType.RECOMMENDED.ordinal()] = 1;
            iArr[SortType.MOST_RECENT.ordinal()] = 2;
            iArr[SortType.HIGHEST_RATED.ordinal()] = 3;
            iArr[SortType.LOWEST_RATED.ordinal()] = 4;
            f14386a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SortBottomSheet(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SortBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SortBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.menu_reviews_sort_list, this, true);
        setOrientation(1);
        C19421p.m32936d0(getResources().getDimensionPixelSize(R.dimen.clg_space_16), this);
        addSortRow(from, SortType.RECOMMENDED);
        addSortRow(from, SortType.MOST_RECENT);
        addSortRow(from, SortType.HIGHEST_RATED);
        addSortRow(from, SortType.LOWEST_RATED);
    }

    private final void addSortRow(LayoutInflater layoutInflater, SortType sortType) {
        String str;
        Resources resources = getContext().getResources();
        int i = C6485a.f14386a[sortType.ordinal()];
        if (i == 1) {
            str = resources.getString(R.string.sort_order_recommended);
        } else if (i == 2) {
            str = resources.getString(R.string.sort_order_most_recent);
        } else if (i == 3) {
            str = resources.getString(R.string.sort_order_highest_rated);
        } else if (i == 4) {
            str = resources.getString(R.string.sort_order_lowest_rated);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C19383o.m32796f(str, "when (sortType) {\n      …r_lowest_rated)\n        }");
        View inflate = layoutInflater.inflate(R.layout.view_review_sort, this, false);
        inflate.setTag(sortType);
        ((TextView) inflate.findViewById(R.id.review_sort_title)).setText(str);
        ViewExtensions.m12866j(inflate, new SortBottomSheet$addSortRow$1(this, sortType));
        addView(inflate);
    }

    private final String getSelectedSortDescription(SortType sortType) {
        Resources resources = getContext().getResources();
        int i = C6485a.f14386a[sortType.ordinal()];
        if (i == 1) {
            String string = resources.getString(R.string.sort_order_recommended_selected);
            C19383o.m32796f(string, "res.getString(R.string.s…der_recommended_selected)");
            return string;
        } else if (i == 2) {
            String string2 = resources.getString(R.string.sort_order_most_recent_selected);
            C19383o.m32796f(string2, "res.getString(R.string.s…der_most_recent_selected)");
            return string2;
        } else if (i == 3) {
            String string3 = resources.getString(R.string.sort_order_highest_rated_selected);
            C19383o.m32796f(string3, "res.getString(R.string.s…r_highest_rated_selected)");
            return string3;
        } else if (i == 4) {
            String string4 = resources.getString(R.string.sort_order_lowest_rated_selected);
            C19383o.m32796f(string4, "res.getString(R.string.s…er_lowest_rated_selected)");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
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

    public final C19857l<SortType, C19394m> getSortClickListener() {
        return this.sortClickListener;
    }

    public final void setSelectedSortType(SortType sortType) {
        C19383o.m32797g(sortType, "selectedSortType");
        SortType[] values = SortType.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            SortType sortType2 = values[i];
            View findViewById = ((ViewGroup) findViewWithTag(sortType2)).findViewById(R.id.review_sort_selected);
            findViewById.setVisibility(sortType2 == sortType ? 0 : 8);
            findViewById.setContentDescription(sortType2 == sortType ? getSelectedSortDescription(sortType) : null);
        }
    }

    public final void setSortClickListener(C19857l<? super SortType, C19394m> lVar) {
        this.sortClickListener = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SortBottomSheet(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
