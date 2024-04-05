package com.etsy.android.p327ui.listing.p329ui.buyitnow.summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.SummaryItemView */
public final class SummaryItemView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C19857l<? super View, C19394m> onItemViewClickedListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        C0114h.m305j0(this, R.layout.view_native_buy_it_now_summary_item, true);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        Object obj = C8184a.f17966a;
        setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
        ViewExtensions.m12866j(this, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ SummaryItemView this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C19857l<View, C19394m> onItemViewClickedListener = this.this$0.getOnItemViewClickedListener();
                if (onItemViewClickedListener != null) {
                    onItemViewClickedListener.invoke(this.this$0);
                }
            }
        });
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

    public final C19857l<View, C19394m> getOnItemViewClickedListener() {
        return this.onItemViewClickedListener;
    }

    public final void setIcon(int i) {
        ((ImageView) findViewById(R.id.icon)).setImageResource(i);
    }

    public final void setOnItemViewClickedListener(C19857l<? super View, C19394m> lVar) {
        this.onItemViewClickedListener = lVar;
    }

    public final void setSubtitle(String str) {
        C19383o.m32797g(str, "subtitle");
        ((TextView) findViewById(R.id.subtitle)).setText(str);
    }

    public final void setSubtitleTextColor(int i) {
        ((TextView) findViewById(R.id.subtitle)).setTextColor(i);
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "title");
        ((TextView) findViewById(R.id.title)).setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SummaryItemView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SummaryItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SummaryItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
