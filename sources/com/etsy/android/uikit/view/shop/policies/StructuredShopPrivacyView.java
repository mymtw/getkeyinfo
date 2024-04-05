package com.etsy.android.uikit.view.shop.policies;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.PrivacyFlag;
import com.etsy.android.lib.models.apiv3.StructuredShopPrivacy;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;

public class StructuredShopPrivacyView extends StructuredShopPoliciesView {
    private static final int FIELD_OTHER_VISIBILITY_LIMIT = 250;
    /* access modifiers changed from: private */
    public View mBtnExpandPrivacyOther;
    private StructuredShopPrivacy mPrivacyPolicy;
    private TextView mTxtPrivacyInfo;
    private TextView mTxtPrivacyItems;

    /* renamed from: com.etsy.android.uikit.view.shop.policies.StructuredShopPrivacyView$a */
    public class C11959a extends TrackingOnClickListener {
        public C11959a() {
        }

        public final void onViewClick(View view) {
            StructuredShopPrivacyView.this.mBtnExpandPrivacyOther.setVisibility(8);
            StructuredShopPrivacyView.this.setPrivacyContent(true);
        }
    }

    /* renamed from: com.etsy.android.uikit.view.shop.policies.StructuredShopPrivacyView$b */
    public class C11960b extends TrackingOnClickListener {
        public C11960b() {
        }

        public final void onViewClick(View view) {
            StructuredShopPrivacyView.this.mBtnExpandPrivacyOther.setVisibility(8);
            StructuredShopPrivacyView.this.setPrivacyContentGDPR(true);
        }
    }

    public StructuredShopPrivacyView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    public void setPrivacyContent(boolean z) {
        this.mTxtPrivacyInfo.setText(getResources().getString(R.string.structured_privacy_message));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        PrivacyFlag communication = this.mPrivacyPolicy.getCommunication();
        if (communication.isEnabled()) {
            spannableStringBuilder.append(Html.fromHtml(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE)).append(communication.getLabel()).append("\n");
        }
        PrivacyFlag fulfillment = this.mPrivacyPolicy.getFulfillment();
        if (fulfillment.isEnabled()) {
            spannableStringBuilder.append(Html.fromHtml(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE)).append(fulfillment.getLabel()).append("\n");
        }
        PrivacyFlag legal = this.mPrivacyPolicy.getLegal();
        if (legal.isEnabled()) {
            spannableStringBuilder.append(Html.fromHtml(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE)).append(legal.getLabel()).append("\n");
        }
        PrivacyFlag other = this.mPrivacyPolicy.getOther();
        if (other.isEnabled()) {
            String label = other.getLabel();
            if (other.getLabel().length() <= 250 || z) {
                this.mBtnExpandPrivacyOther.setVisibility(8);
            } else {
                this.mBtnExpandPrivacyOther.setVisibility(0);
                this.mBtnExpandPrivacyOther.setOnClickListener(new C11959a());
                label = label.substring(0, 250).trim() + "…";
            }
            spannableStringBuilder.append(Html.fromHtml(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE)).append(label).append("\n");
        }
        this.mTxtPrivacyItems.setText(spannableStringBuilder.toString().trim());
    }

    /* access modifiers changed from: private */
    public void setPrivacyContentGDPR(boolean z) {
        if (this.mPrivacyPolicy.getFlags().getCommunication().isEnabled() || this.mPrivacyPolicy.getFlags().getFulfillment().isEnabled() || this.mPrivacyPolicy.getFlags().getLegal().isEnabled()) {
            setPrivacyContent(z);
            return;
        }
        this.mTxtPrivacyItems.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        PrivacyFlag other = this.mPrivacyPolicy.getOther();
        if (other.isEnabled()) {
            String label = other.getLabel();
            if (other.getLabel().length() <= 250 || z) {
                this.mBtnExpandPrivacyOther.setVisibility(8);
            } else {
                this.mBtnExpandPrivacyOther.setVisibility(0);
                this.mBtnExpandPrivacyOther.setOnClickListener(new C11960b());
                label = label.substring(0, 250).trim() + "…";
            }
            spannableStringBuilder.append(label).append("\n");
        }
        this.mTxtPrivacyInfo.setText(spannableStringBuilder.toString().trim());
    }

    public void init(Context context, LinearLayout linearLayout) {
        View.inflate(context, R.layout.view_structured_shop_privacy, linearLayout);
        this.mBtnExpandPrivacyOther = findViewById(R.id.btn_privacy_other_expand);
        this.mTxtPrivacyInfo = (TextView) findViewById(R.id.txt_privacy_info);
        this.mTxtPrivacyItems = (TextView) findViewById(R.id.txt_privacy_items);
    }

    public void setStructuredShopPrivacy(StructuredShopPrivacy structuredShopPrivacy, StructuredShopPoliciesView.C11957b bVar, C8672b bVar2) {
        this.mPrivacyPolicy = structuredShopPrivacy;
        if (structuredShopPrivacy.hasAnyEnabledFlags()) {
            setPrivacyContentGDPR(false);
            return;
        }
        this.mTxtPrivacyInfo.setText(Html.fromHtml(getResources().getString(R.string.structured_privacy_no_info_alternate_text)));
        linkifyContactShopUrlSpan(this.mTxtPrivacyInfo, bVar);
        this.mTxtPrivacyItems.setVisibility(8);
    }

    public StructuredShopPrivacyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StructuredShopPrivacyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StructuredShopPrivacyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
