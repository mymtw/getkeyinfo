package com.etsy.android.uikit.view.shop.policies;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.NonRefundableItem;
import com.etsy.android.lib.models.apiv3.StructuredShopRefunds;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import java.util.List;

public class RefundsView extends StructuredShopPoliciesView {
    private TextView listingLevelReturnDeadlineDescription;
    private TextView listingLevelReturnDeadlineSubtitle;
    private CollageHeadingTextView listingLevelReturnDeadlineTitle;
    private TextView listingLevelReturnDescription;
    private CollageHeadingTextView listingLevelReturnSectionTitle;
    private TextView listingLevelReturnSubtitle;
    private CollageHeadingTextView listingLevelReturnTitle;
    private View mSpacer;
    private TextView mTxtCancelWithin;
    private TextView mTxtContactWithin;
    private TextView mTxtNonreturnableInfo;
    private TextView mTxtNonreturnableItems;
    private TextView mTxtNotAcceptedInfo;
    private TextView mTxtQuestionsInfo;
    private TextView mTxtReturnConditionsInfo;
    private TextView mTxtReturnWithin;
    private CollageHeadingTextView mTxtSubheadAcceptedSummary;
    private CollageHeadingTextView mTxtSubheadNonreturnable;
    private CollageHeadingTextView mTxtSubheadNotAcceptedSummary;
    private CollageHeadingTextView mTxtSubheadQuestions;
    private CollageHeadingTextView mTxtSubheadReturnConditions;
    private TextView mUnstructuredText;
    private CollageHeadingTextView mUnstructuredTextHeader;

    /* renamed from: com.etsy.android.uikit.view.shop.policies.RefundsView$a */
    public static /* synthetic */ class C11954a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26555a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.etsy.android.lib.models.apiv3.CancellationType[] r0 = com.etsy.android.lib.models.apiv3.CancellationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26555a = r0
                com.etsy.android.lib.models.apiv3.CancellationType r1 = com.etsy.android.lib.models.apiv3.CancellationType.TYPE_CANCEL_WITHIN_HOURS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26555a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.lib.models.apiv3.CancellationType r1 = com.etsy.android.lib.models.apiv3.CancellationType.TYPE_CANCEL_BEFORE_SHIPPED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.view.shop.policies.RefundsView.C11954a.<clinit>():void");
        }
    }

    public RefundsView(Context context) {
        super(context);
    }

    private void buildCancellationSection(StructuredShopRefunds structuredShopRefunds, boolean z, StructuredShopPoliciesView.C11957b bVar) {
        Resources resources = getContext().getResources();
        if (structuredShopRefunds.getAcceptsCancellations() != null) {
            if (structuredShopRefunds.getAcceptsCancellations().booleanValue() && structuredShopRefunds.getCancellationType() != null) {
                String str = null;
                int i = C11954a.f26555a[structuredShopRefunds.getCancellationType().ordinal()];
                if (i == 1) {
                    int cancelWithinHours = structuredShopRefunds.getCancelWithinHours();
                    if (cancelWithinHours > 24) {
                        int i2 = cancelWithinHours / 24;
                        str = resources.getQuantityString(R.plurals.structured_refunds_days_of_purchase, i2, new Object[]{Integer.valueOf(i2)});
                    } else {
                        str = resources.getQuantityString(R.plurals.structured_refunds_hours_of_purchase, cancelWithinHours, new Object[]{Integer.valueOf(cancelWithinHours)});
                    }
                } else if (i == 2) {
                    str = resources.getString(R.string.structured_refunds_before_shipped);
                }
                if (str != null) {
                    this.mTxtCancelWithin.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(R.string.structured_refunds_accept_cancellations_within));
                    spannableStringBuilder.append(" ").append(str);
                    this.mTxtCancelWithin.setText(spannableStringBuilder);
                }
            } else if (!structuredShopRefunds.getAcceptsCancellations().booleanValue() && z) {
                this.mTxtSubheadNotAcceptedSummary.setVisibility(0);
                this.mTxtNotAcceptedInfo.setVisibility(0);
                this.mTxtSubheadNotAcceptedSummary.setText(getContext().getText(R.string.shop_policies_cancellations_not_accepted));
                this.mTxtNotAcceptedInfo.setText(Html.fromHtml(resources.getString(R.string.structured_refunds_cancellation_message)));
                linkifyContactShopUrlSpan(this.mTxtNotAcceptedInfo, bVar);
            }
        }
    }

    public void hideConditions() {
        this.mTxtSubheadReturnConditions.setVisibility(8);
        this.mTxtReturnConditionsInfo.setVisibility(8);
    }

    public void init(Context context, LinearLayout linearLayout) {
        View.inflate(context, R.layout.view_structured_shop_refunds, linearLayout);
        this.mTxtSubheadAcceptedSummary = (CollageHeadingTextView) findViewById(R.id.txt_subhead_accepted_summary);
        this.mTxtContactWithin = (TextView) findViewById(R.id.txt_contact_within);
        this.mTxtReturnWithin = (TextView) findViewById(R.id.txt_return_within);
        this.mTxtCancelWithin = (TextView) findViewById(R.id.txt_cancel_within);
        this.mSpacer = findViewById(R.id.spacer);
        this.mTxtSubheadNotAcceptedSummary = (CollageHeadingTextView) findViewById(R.id.txt_subhead_not_accepted_summary);
        this.mTxtNotAcceptedInfo = (TextView) findViewById(R.id.txt_not_accepted_info);
        this.mTxtSubheadNonreturnable = (CollageHeadingTextView) findViewById(R.id.txt_subhead_nonreturnable);
        this.mTxtNonreturnableInfo = (TextView) findViewById(R.id.txt_nonreturnable_info);
        this.mTxtNonreturnableItems = (TextView) findViewById(R.id.txt_nonreturnable_items);
        this.mTxtSubheadReturnConditions = (CollageHeadingTextView) findViewById(R.id.txt_subhead_return_conditions);
        this.mTxtReturnConditionsInfo = (TextView) findViewById(R.id.txt_return_conditions_info);
        this.mTxtSubheadQuestions = (CollageHeadingTextView) findViewById(R.id.txt_subhead_questions);
        this.mTxtQuestionsInfo = (TextView) findViewById(R.id.txt_questions_info);
        this.mUnstructuredText = (TextView) findViewById(R.id.textview_unstructured_refunds_message);
        this.mUnstructuredTextHeader = (CollageHeadingTextView) findViewById(R.id.textview_unstructured_refunds_header);
        this.listingLevelReturnSectionTitle = (CollageHeadingTextView) findViewById(R.id.listing_level_return_section_title);
        this.listingLevelReturnTitle = (CollageHeadingTextView) findViewById(R.id.listing_level_return_title);
        this.listingLevelReturnSubtitle = (TextView) findViewById(R.id.listing_level_return_subtitle);
        this.listingLevelReturnDescription = (TextView) findViewById(R.id.listing_level_return_description);
        this.listingLevelReturnDeadlineTitle = (CollageHeadingTextView) findViewById(R.id.listing_level_deadline_title);
        this.listingLevelReturnDeadlineSubtitle = (TextView) findViewById(R.id.listing_level_deadline_subtitle);
        this.listingLevelReturnDeadlineDescription = (TextView) findViewById(R.id.listing_level_deadline_description);
    }

    public void setRefunds(StructuredShopRefunds structuredShopRefunds, boolean z, ListingLevelReturnPolicies listingLevelReturnPolicies, StructuredShopPoliciesView.C11957b bVar) {
        Resources resources = getContext().getResources();
        new SpannableStringBuilder();
        boolean z2 = structuredShopRefunds.getAcceptsReturns() && !z;
        boolean z3 = structuredShopRefunds.getAcceptsExchanges() && !z;
        boolean z4 = structuredShopRefunds.getAcceptsCancellations() != null && structuredShopRefunds.getAcceptsCancellations().booleanValue();
        boolean z5 = z2 || z3 || z4;
        boolean z6 = z2 || z3;
        boolean z7 = z2 && z3 && z4;
        int i = 8;
        this.mTxtSubheadAcceptedSummary.setVisibility(8);
        this.mTxtContactWithin.setVisibility(8);
        this.mTxtReturnWithin.setVisibility(8);
        this.mTxtCancelWithin.setVisibility(8);
        this.mTxtSubheadNotAcceptedSummary.setVisibility(8);
        this.mTxtNotAcceptedInfo.setVisibility(8);
        this.mTxtSubheadNonreturnable.setVisibility(8);
        this.mTxtNonreturnableInfo.setVisibility(8);
        this.mTxtNonreturnableItems.setVisibility(8);
        this.mTxtSubheadReturnConditions.setVisibility(8);
        this.mTxtReturnConditionsInfo.setVisibility(8);
        this.mTxtSubheadQuestions.setVisibility(8);
        this.mTxtQuestionsInfo.setVisibility(8);
        this.listingLevelReturnSectionTitle.setVisibility(8);
        this.listingLevelReturnTitle.setVisibility(8);
        this.listingLevelReturnSubtitle.setVisibility(8);
        this.listingLevelReturnDescription.setVisibility(8);
        this.listingLevelReturnDeadlineTitle.setVisibility(8);
        this.listingLevelReturnDeadlineSubtitle.setVisibility(8);
        this.listingLevelReturnDeadlineDescription.setVisibility(8);
        this.mSpacer.setVisibility(8);
        if (!z || listingLevelReturnPolicies == null) {
            if (z4 && z) {
                this.mTxtSubheadAcceptedSummary.setVisibility(0);
                this.mTxtSubheadAcceptedSummary.setText(getContext().getText(R.string.shop_policies_cancellations_accepted));
            }
            if (z5 && !z) {
                this.mTxtSubheadAcceptedSummary.setVisibility(0);
                this.mTxtSubheadAcceptedSummary.setText(structuredShopRefunds.getAcceptedSummaryString());
            }
            if (z6) {
                this.mTxtContactWithin.setVisibility(0);
                this.mTxtReturnWithin.setVisibility(0);
                int contactWithinDays = structuredShopRefunds.getContactWithinDays();
                String quantityString = resources.getQuantityString(R.plurals.structured_refunds_days, contactWithinDays, new Object[]{Integer.valueOf(contactWithinDays)});
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(R.string.structured_refunds_contact_within));
                spannableStringBuilder.append(" ").append(quantityString);
                this.mTxtContactWithin.setText(spannableStringBuilder);
                int returnWithinDays = structuredShopRefunds.getReturnWithinDays();
                String quantityString2 = resources.getQuantityString(R.plurals.structured_refunds_days, returnWithinDays, new Object[]{Integer.valueOf(returnWithinDays)});
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(resources.getString(R.string.structured_refunds_return_within));
                spannableStringBuilder2.append(" ").append(quantityString2);
                this.mTxtReturnWithin.setText(spannableStringBuilder2);
                List<NonRefundableItem> nonRefundableItems = structuredShopRefunds.getNonRefundableItems();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                int i2 = 0;
                for (NonRefundableItem next : nonRefundableItems) {
                    if (next.isNonRefundable()) {
                        i2++;
                        if (spannableStringBuilder3.length() != 0) {
                            spannableStringBuilder3.append("\n");
                        }
                        spannableStringBuilder3.append(Html.fromHtml(StructuredShopPoliciesView.BULLET_POINT_AND_SPACE)).append(next.getName());
                    }
                }
                if (i2 > 0) {
                    this.mTxtSubheadNonreturnable.setVisibility(0);
                    this.mTxtNonreturnableInfo.setVisibility(0);
                    this.mTxtNonreturnableItems.setVisibility(0);
                    this.mTxtNonreturnableItems.setText(spannableStringBuilder3);
                }
            }
            buildCancellationSection(structuredShopRefunds, z, bVar);
            if (!z) {
                View view = this.mSpacer;
                if (z5 && !z7) {
                    i = 0;
                }
                view.setVisibility(i);
                if (!z7) {
                    this.mTxtSubheadNotAcceptedSummary.setVisibility(0);
                    this.mTxtNotAcceptedInfo.setVisibility(0);
                    this.mTxtSubheadNotAcceptedSummary.setText(structuredShopRefunds.getNotAcceptedSummaryString());
                    this.mTxtNotAcceptedInfo.setText(Html.fromHtml(resources.getString(R.string.structured_refunds_cancellation_message)));
                    linkifyContactShopUrlSpan(this.mTxtNotAcceptedInfo, bVar);
                }
                if (z6) {
                    this.mTxtSubheadReturnConditions.setVisibility(0);
                    this.mTxtReturnConditionsInfo.setVisibility(0);
                }
                if (z7) {
                    this.mTxtSubheadQuestions.setVisibility(0);
                    this.mTxtQuestionsInfo.setVisibility(0);
                    this.mTxtQuestionsInfo.setText(Html.fromHtml(resources.getString(R.string.structured_refunds_questions_message)));
                    linkifyContactShopUrlSpan(this.mTxtQuestionsInfo, bVar);
                }
            }
            setContentCollapsible(z6);
            return;
        }
        this.listingLevelReturnSectionTitle.setVisibility(0);
        this.listingLevelReturnTitle.setVisibility(0);
        this.listingLevelReturnSubtitle.setVisibility(0);
        this.listingLevelReturnDescription.setVisibility(0);
        this.listingLevelReturnTitle.setText(listingLevelReturnPolicies.getReturnsTitle());
        this.listingLevelReturnSubtitle.setText(listingLevelReturnPolicies.getReturnsSubtitle());
        this.listingLevelReturnDescription.setText(listingLevelReturnPolicies.getReturnsDescription());
        if (listingLevelReturnPolicies.getAcceptsReturns() || listingLevelReturnPolicies.getAcceptsExchanges()) {
            this.listingLevelReturnDeadlineTitle.setVisibility(0);
            this.listingLevelReturnDeadlineSubtitle.setVisibility(0);
            this.listingLevelReturnDeadlineDescription.setVisibility(0);
            this.listingLevelReturnDeadlineTitle.setText(listingLevelReturnPolicies.getDeadlineTitle());
            this.listingLevelReturnDeadlineSubtitle.setText(listingLevelReturnPolicies.getDeadlineSubtitle());
            this.listingLevelReturnDeadlineDescription.setText(listingLevelReturnPolicies.getDeadlineDescription());
        }
    }

    public void setUnstructuredReturnText(String str) {
        this.mUnstructuredText.setText(str);
        this.mUnstructuredText.setVisibility(0);
        this.mUnstructuredTextHeader.setVisibility(0);
    }

    public RefundsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RefundsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RefundsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
