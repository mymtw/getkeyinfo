package com.etsy.android.uikit.view.shop.policies;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.apiv3.CountryToRegionMap;
import com.etsy.android.lib.models.apiv3.StructuredShopShipping;
import com.etsy.android.lib.models.apiv3.StructuredShopShippingEstimate;
import com.etsy.android.lib.util.C8902h;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StructuredShopShippingView extends StructuredShopPoliciesView {
    private Country mCountryFilter;
    private StructuredShopShipping mShippingPolicy;
    private boolean mShowProcessingTimeSection;
    private View mSpacer1;
    private View mSpacer2;
    private TextView mTxtCustomsFees;
    private TextView mTxtProcessingTime;
    private TextView mTxtShippingDisclaimer;
    private TextView mTxtShippingTime;
    private CollageHeadingTextView mTxtSubheadCustomsFees;
    private CollageHeadingTextView mTxtSubheadProcessingTime;
    private CollageHeadingTextView mTxtSubheadShippingTime;

    public StructuredShopShippingView(Context context) {
        super(context);
    }

    private String generateShippingEstimatesString(StructuredShopShipping structuredShopShipping) {
        List<StructuredShopShippingEstimate> list = (List) structuredShopShipping.getEstimates().stream().filter(new C11962b()).collect(Collectors.toList());
        if (list.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Country country = this.mCountryFilter;
        if (country != null) {
            int countryId = country.getCountryId();
            Object obj = C8902h.f19658a;
            CountryToRegionMap countryToRegionMap = EtsyApplication.get().getRegionsRepository().f29321b;
            String regionByCountryId = countryToRegionMap != null ? countryToRegionMap.getRegionByCountryId(countryId) : null;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StructuredShopShippingEstimate structuredShopShippingEstimate = (StructuredShopShippingEstimate) it.next();
                if (structuredShopShippingEstimate.getCountryId() == null || structuredShopShippingEstimate.getCountryId().intValue() != this.mCountryFilter.getCountryId()) {
                    if (regionByCountryId != null && regionByCountryId.equals(structuredShopShippingEstimate.getRegionCode())) {
                        arrayList.add(structuredShopShippingEstimate);
                        break;
                    }
                } else {
                    arrayList.add(structuredShopShippingEstimate);
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        for (StructuredShopShippingEstimate structuredShopShippingEstimate2 : list) {
            String string = getResources().getString(StructuredShopShippingEstimate.UNIT_WEEKS.equals(structuredShopShippingEstimate2.getUnit()) ? R.string.structured_shipping_time_range_weeks : R.string.structured_shipping_time_range_business_days, new Object[]{Integer.valueOf(structuredShopShippingEstimate2.getMin()), Integer.valueOf(structuredShopShippingEstimate2.getMax())});
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder2.append("\n");
            }
            spannableStringBuilder2.append(structuredShopShippingEstimate2.getDisplayName()).append(": ").append(string);
            spannableStringBuilder.append(spannableStringBuilder2);
        }
        if (spannableStringBuilder.length() != 0) {
            return spannableStringBuilder.toString();
        }
        return null;
    }

    private boolean setShippingEstimatesSection(StructuredShopShipping structuredShopShipping) {
        String generateShippingEstimatesString = generateShippingEstimatesString(structuredShopShipping);
        boolean z = generateShippingEstimatesString != null;
        if (z) {
            this.mTxtSubheadShippingTime.setVisibility(0);
            this.mTxtShippingTime.setVisibility(0);
            this.mTxtShippingTime.setText(generateShippingEstimatesString);
            this.mTxtShippingDisclaimer.setVisibility(0);
        } else {
            this.mTxtSubheadShippingTime.setVisibility(8);
            this.mTxtShippingTime.setVisibility(8);
            this.mTxtShippingDisclaimer.setVisibility(8);
        }
        return z;
    }

    public void filterEstimates(Country country) {
        this.mCountryFilter = country;
        StructuredShopShipping structuredShopShipping = this.mShippingPolicy;
        if (structuredShopShipping != null) {
            setupView(structuredShopShipping, this.mShowProcessingTimeSection);
        }
    }

    public void init(Context context, LinearLayout linearLayout) {
        View.inflate(context, R.layout.view_structured_shop_shipping, linearLayout);
        this.mTxtSubheadProcessingTime = (CollageHeadingTextView) findViewById(R.id.txt_subhead_processing_time);
        this.mTxtProcessingTime = (TextView) findViewById(R.id.txt_processing_time);
        this.mSpacer1 = findViewById(R.id.spacer_1);
        this.mTxtSubheadShippingTime = (CollageHeadingTextView) findViewById(R.id.txt_subhead_shipping_time);
        this.mTxtShippingTime = (TextView) findViewById(R.id.txt_shipping_time);
        this.mTxtShippingDisclaimer = (TextView) findViewById(R.id.txt_shipping_disclaimer);
        this.mSpacer2 = findViewById(R.id.spacer_2);
        this.mTxtSubheadCustomsFees = (CollageHeadingTextView) findViewById(R.id.txt_subhead_customs_fees);
        this.mTxtCustomsFees = (TextView) findViewById(R.id.txt_customs_fees);
    }

    public void setStructuredShopShipping(StructuredShopShipping structuredShopShipping, boolean z) {
        this.mShippingPolicy = structuredShopShipping;
        this.mShowProcessingTimeSection = z;
        setupView(structuredShopShipping, z);
    }

    public void setupView(StructuredShopShipping structuredShopShipping, boolean z) {
        int i = 8;
        boolean z2 = false;
        if (z) {
            this.mTxtSubheadProcessingTime.setVisibility(0);
            this.mTxtProcessingTime.setVisibility(0);
            this.mTxtProcessingTime.setText(structuredShopShipping.getProcessingTimeText());
        } else {
            this.mTxtSubheadProcessingTime.setVisibility(8);
            this.mTxtProcessingTime.setVisibility(8);
        }
        boolean shippingEstimatesSection = setShippingEstimatesSection(structuredShopShipping);
        boolean shipsInternational = structuredShopShipping.shipsInternational();
        if (!shipsInternational) {
            this.mTxtSubheadCustomsFees.setVisibility(8);
            this.mTxtCustomsFees.setVisibility(8);
        } else {
            this.mTxtSubheadCustomsFees.setVisibility(0);
            this.mTxtCustomsFees.setVisibility(0);
        }
        this.mSpacer1.setVisibility((!z || (!shippingEstimatesSection && !shipsInternational)) ? 8 : 0);
        View view = this.mSpacer2;
        if (shippingEstimatesSection && shipsInternational) {
            i = 0;
        }
        view.setVisibility(i);
        if (shippingEstimatesSection || shipsInternational) {
            z2 = true;
        }
        setContentCollapsible(z2);
    }

    public StructuredShopShippingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StructuredShopShippingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StructuredShopShippingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
