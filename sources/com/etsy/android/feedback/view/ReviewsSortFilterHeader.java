package com.etsy.android.feedback.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.feedback.data.SortType;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.chip.Chip;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p131h9.C6962a;
import p435rb.C13350a;
import p504ai.C13983i;
import p753kq.C19857l;

public final class ReviewsSortFilterHeader extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C6481a clickHandler;
    private final TextView countMessage;
    private final Button ratingFilter;
    private final Chip removableRatingFilter;
    private final Button sortButton;
    private final Button withPhotosFilter;
    private final Button withVideosFilter;

    /* renamed from: com.etsy.android.feedback.view.ReviewsSortFilterHeader$a */
    public interface C6481a {
        /* renamed from: a */
        void mo18422a();

        /* renamed from: b */
        void mo18423b();

        /* renamed from: c */
        void mo18424c();

        /* renamed from: d */
        void mo18425d();

        /* renamed from: e */
        void mo18426e();
    }

    /* renamed from: com.etsy.android.feedback.view.ReviewsSortFilterHeader$b */
    public /* synthetic */ class C6482b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14384a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f14385b;

        static {
            int[] iArr = new int[SortType.values().length];
            iArr[SortType.RECOMMENDED.ordinal()] = 1;
            iArr[SortType.MOST_RECENT.ordinal()] = 2;
            iArr[SortType.HIGHEST_RATED.ordinal()] = 3;
            iArr[SortType.LOWEST_RATED.ordinal()] = 4;
            f14384a = iArr;
            int[] iArr2 = new int[Rating.values().length];
            iArr2[Rating.NONE.ordinal()] = 1;
            iArr2[Rating.ONE_STAR.ordinal()] = 2;
            iArr2[Rating.TWO_STAR.ordinal()] = 3;
            iArr2[Rating.THREE_STAR.ordinal()] = 4;
            iArr2[Rating.FOUR_STAR.ordinal()] = 5;
            iArr2[Rating.FIVE_STAR.ordinal()] = 6;
            f14385b = iArr2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewsSortFilterHeader(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReviewsSortFilterHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewsSortFilterHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.item_review_sort_filter, this, true);
        View findViewById = findViewById(R.id.review_sort_button);
        C19383o.m32796f(findViewById, "findViewById(R.id.review_sort_button)");
        Button button = (Button) findViewById;
        this.sortButton = button;
        View findViewById2 = findViewById(R.id.review_filter_with_photos);
        C19383o.m32796f(findViewById2, "findViewById(R.id.review_filter_with_photos)");
        Button button2 = (Button) findViewById2;
        this.withPhotosFilter = button2;
        View findViewById3 = findViewById(R.id.review_filter_with_videos);
        C19383o.m32796f(findViewById3, "findViewById(R.id.review_filter_with_videos)");
        Button button3 = (Button) findViewById3;
        this.withVideosFilter = button3;
        View findViewById4 = findViewById(R.id.review_filter_rating);
        C19383o.m32796f(findViewById4, "findViewById(R.id.review_filter_rating)");
        Button button4 = (Button) findViewById4;
        this.ratingFilter = button4;
        View findViewById5 = findViewById(R.id.review_filter_rating_removable);
        C19383o.m32796f(findViewById5, "findViewById(R.id.review_filter_rating_removable)");
        Chip chip = (Chip) findViewById5;
        this.removableRatingFilter = chip;
        View findViewById6 = findViewById(R.id.sort_filter_count_msg);
        C19383o.m32796f(findViewById6, "findViewById(R.id.sort_filter_count_msg)");
        this.countMessage = (TextView) findViewById6;
        ViewExtensions.m12866j(button, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ ReviewsSortFilterHeader this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C6481a clickHandler = this.this$0.getClickHandler();
                if (clickHandler != null) {
                    clickHandler.mo18423b();
                }
            }
        });
        ViewExtensions.m12866j(button4, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ ReviewsSortFilterHeader this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C6481a clickHandler = this.this$0.getClickHandler();
                if (clickHandler != null) {
                    clickHandler.mo18424c();
                }
            }
        });
        ViewExtensions.m12866j(button2, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ ReviewsSortFilterHeader this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C6481a clickHandler = this.this$0.getClickHandler();
                if (clickHandler != null) {
                    clickHandler.mo18425d();
                }
            }
        });
        ViewExtensions.m12866j(button3, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ ReviewsSortFilterHeader this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C6481a clickHandler = this.this$0.getClickHandler();
                if (clickHandler != null) {
                    clickHandler.mo18422a();
                }
            }
        });
        chip.setOnCloseIconClickListener(new C6486a(this, 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m34862_init_$lambda0(ReviewsSortFilterHeader reviewsSortFilterHeader, View view) {
        C19383o.m32797g(reviewsSortFilterHeader, "this$0");
        C6481a aVar = reviewsSortFilterHeader.clickHandler;
        if (aVar != null) {
            aVar.mo18426e();
        }
    }

    private final String getRatingText(Rating rating) {
        Resources resources = getContext().getResources();
        switch (C6482b.f14385b[rating.ordinal()]) {
            case 1:
                String string = resources.getString(R.string.rating);
                C19383o.m32796f(string, "res.getString(R.string.rating)");
                return string;
            case 2:
                String string2 = resources.getString(R.string.review_one_star);
                C19383o.m32796f(string2, "res.getString(R.string.review_one_star)");
                return string2;
            case 3:
                String string3 = resources.getString(R.string.review_two_star);
                C19383o.m32796f(string3, "res.getString(R.string.review_two_star)");
                return string3;
            case 4:
                String string4 = resources.getString(R.string.review_three_star);
                C19383o.m32796f(string4, "res.getString(R.string.review_three_star)");
                return string4;
            case 5:
                String string5 = resources.getString(R.string.review_four_star);
                C19383o.m32796f(string5, "res.getString(R.string.review_four_star)");
                return string5;
            case 6:
                String string6 = resources.getString(R.string.review_five_star);
                C19383o.m32796f(string6, "res.getString(R.string.review_five_star)");
                return string6;
            default:
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

    public final C6481a getClickHandler() {
        return this.clickHandler;
    }

    public final void hideRatingsFilter() {
        ViewExtensions.m12860d(this.ratingFilter);
    }

    public final void hideResultCount() {
        ViewExtensions.m12860d(this.countMessage);
    }

    public final void hideVideosFilter() {
        ViewExtensions.m12860d(this.withVideosFilter);
    }

    public final void setClickHandler(C6481a aVar) {
        this.clickHandler = aVar;
    }

    public final void setData(C6962a aVar) {
        String str;
        C19383o.m32797g(aVar, "sortFiltersData");
        Resources resources = getContext().getResources();
        Button button = this.sortButton;
        int i = C6482b.f14384a[aVar.f15444a.ordinal()];
        boolean z = true;
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
        button.setText(str);
        this.sortButton.setSelected(aVar.f15448e);
        this.ratingFilter.setText(getRatingText(aVar.f15445b));
        Button button2 = this.ratingFilter;
        if (aVar.f15445b == Rating.NONE) {
            z = false;
        }
        button2.setSelected(z);
        this.withPhotosFilter.setSelected(aVar.f15446c);
        this.withVideosFilter.setSelected(aVar.f15447d);
    }

    public final void showRatingsFilter() {
        ViewExtensions.m12869m(this.ratingFilter);
    }

    public final void showResultCount() {
        ViewExtensions.m12869m(this.countMessage);
    }

    public final void showVideosFilter() {
        ViewExtensions.m12869m(this.withVideosFilter);
    }

    public final void updateFilterStyle(int i) {
        C13350a.m21010a(this.sortButton, i);
        C13350a.m21010a(this.withPhotosFilter, i);
        C13350a.m21010a(this.withVideosFilter, i);
        C13350a.m21010a(this.ratingFilter, i);
    }

    public final void updateRemovableRatingFilter(Rating rating) {
        C19383o.m32797g(rating, ResponseConstants.RATING);
        String ratingText = getRatingText(rating);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.sort_filter_list);
        if (rating != Rating.NONE) {
            Chip chip = this.removableRatingFilter;
            ViewExtensions.m12869m(chip);
            chip.setText(ratingText);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(chip) || chip.isLayoutRequested()) {
                chip.addOnLayoutChangeListener(new C6483x44229069(horizontalScrollView));
            } else {
                horizontalScrollView.fullScroll(66);
            }
        } else {
            Chip chip2 = this.removableRatingFilter;
            ViewExtensions.m12860d(chip2);
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            if (!C2364y.C2371g.m5246c(chip2) || chip2.isLayoutRequested()) {
                chip2.addOnLayoutChangeListener(new C6484xd885c2eb(horizontalScrollView));
            } else {
                horizontalScrollView.fullScroll(17);
            }
        }
    }

    public final void updateResultCount(int i, int i2) {
        this.countMessage.setText(getContext().getString(R.string.reviews_filtered_count, new Object[]{C15588c1.m25356x0((float) i, (Integer) null), C15588c1.m25356x0((float) i2, (Integer) null)}));
        showResultCount();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReviewsSortFilterHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
