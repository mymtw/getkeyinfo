package com.etsy.android.p327ui.giftcards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.lib.models.GiftCardDesign;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.List;

/* renamed from: com.etsy.android.ui.giftcards.GiftCardDesignSelecterView */
public class GiftCardDesignSelecterView extends LinearLayout implements ViewPager.C3334i {
    private TrackingOnClickListener mDesignOnClickListener = new C9909a();
    private C9915e mGiftCardDesignAdapter;
    /* access modifiers changed from: private */
    public ViewPager mViewPagerGiftCardDesigns;

    /* renamed from: com.etsy.android.ui.giftcards.GiftCardDesignSelecterView$a */
    public class C9909a extends TrackingOnClickListener {
        public C9909a() {
        }

        public final void onViewClick(View view) {
            Object tag = view.getTag();
            if (tag != null) {
                GiftCardDesignSelecterView.this.mViewPagerGiftCardDesigns.setCurrentItem(((Integer) tag).intValue());
            }
        }
    }

    public GiftCardDesignSelecterView(Context context) {
        super(context);
        initViews(context);
    }

    private void initViews(Context context) {
        View.inflate(context, R.layout.view_gift_card_design_selector, this);
        this.mViewPagerGiftCardDesigns = (ViewPager) findViewById(R.id.view_pager_card_designs);
    }

    public int getSelectedGiftCardId() {
        C9915e eVar = this.mGiftCardDesignAdapter;
        return eVar.f21868d.get(this.mViewPagerGiftCardDesigns.getCurrentItem()).getId();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        C9915e eVar = this.mGiftCardDesignAdapter;
        GiftCardDesign giftCardDesign = eVar.f21868d.get(this.mViewPagerGiftCardDesigns.getCurrentItem());
    }

    public void setGiftCardDesigns(List<GiftCardDesign> list) {
        C9915e eVar = new C9915e(this.mDesignOnClickListener);
        this.mGiftCardDesignAdapter = eVar;
        eVar.f21868d.addAll(list);
        this.mViewPagerGiftCardDesigns.addOnPageChangeListener(this);
        this.mViewPagerGiftCardDesigns.setAdapter(this.mGiftCardDesignAdapter);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == 4) {
                this.mViewPagerGiftCardDesigns.setCurrentItem(i);
            }
        }
    }

    public GiftCardDesignSelecterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews(context);
    }

    public GiftCardDesignSelecterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews(context);
    }
}
