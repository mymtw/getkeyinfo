package com.etsy.android.p327ui.favorites;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.C0761x;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.BuyersInformationHeader */
public final class BuyersInformationHeader extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private ImageView collectionBuyersNameImageView;
    private TextView collectionBuyersNameTextView;
    private CollageTabLayout tabs;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BuyersInformationHeader(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BuyersInformationHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuyersInformationHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.neu_collection_header, this, true);
        View findViewById = findViewById(R.id.collection_buyers_name);
        C19383o.m32796f(findViewById, "findViewById(R.id.collection_buyers_name)");
        this.collectionBuyersNameTextView = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.collection_buyers_photo);
        C19383o.m32796f(findViewById2, "findViewById(R.id.collection_buyers_photo)");
        this.collectionBuyersNameImageView = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.tabs);
        C19383o.m32796f(findViewById3, "findViewById(R.id.tabs)");
        this.tabs = (CollageTabLayout) findViewById3;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(C13350a.m21013d(context, R.attr.clg_color_bg_primary)));
        materialShapeDrawable.setElevation((float) context.getResources().getDimensionPixelSize(R.dimen.app_bar_elevation));
        setBackground(materialShapeDrawable);
        setLayoutTransition(new LayoutTransition());
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

    public int getId() {
        return R.id.new_collection_header;
    }

    public final void scrollInformation(int i, boolean z) {
        boolean z2 = true;
        if (z) {
            if (this.tabs.getVisibility() != 0) {
                z2 = false;
            }
            if (!z2) {
                ViewExtensions.m12869m(this);
            } else if (C18263b.m30839d0(this.collectionBuyersNameTextView.getText())) {
                ViewExtensions.m12869m(this.collectionBuyersNameTextView);
                ViewExtensions.m12869m(this.collectionBuyersNameImageView);
            }
        } else if (i > getMeasuredHeight()) {
            if (this.tabs.getVisibility() != 0) {
                z2 = false;
            }
            if (z2) {
                ViewExtensions.m12860d(this.collectionBuyersNameTextView);
                ViewExtensions.m12860d(this.collectionBuyersNameImageView);
                return;
            }
            ViewExtensions.m12860d(this);
        }
    }

    public final void setInformation(String str, String str2) {
        if (C18263b.m30839d0(str)) {
            TextView textView = this.collectionBuyersNameTextView;
            ViewExtensions.m12869m(textView);
            textView.setText(str);
        }
        if (C18263b.m30839d0(str2)) {
            ViewExtensions.m12869m(this.collectionBuyersNameImageView);
            C0761x.m1708a0(24, this.collectionBuyersNameImageView, str2);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.tabs.getVisibility() == 0) {
            this.collectionBuyersNameTextView.setOnClickListener(onClickListener);
            this.collectionBuyersNameImageView.setOnClickListener(onClickListener);
            return;
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        C19383o.m32797g(viewPager, "viewPager");
        ViewExtensions.m12869m(this);
        CollageTabLayout collageTabLayout = this.tabs;
        ViewExtensions.m12869m(collageTabLayout);
        collageTabLayout.setTabMode(1);
        collageTabLayout.setupWithViewPager(viewPager);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuyersInformationHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
