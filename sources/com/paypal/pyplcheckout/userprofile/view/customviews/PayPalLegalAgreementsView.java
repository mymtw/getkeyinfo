package com.paypal.pyplcheckout.userprofile.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalLegalAgreementsView extends RelativeLayout implements ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalLegalAgreementsView";
    public Map<Integer, View> _$_findViewCache;
    private RelativeLayout payPalLegalAgreementsContainer;
    private TextView userProfileLegalAgreementsTv;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalLegalAgreementsView> cls = PayPalLegalAgreementsView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLegalAgreementsView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLegalAgreementsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalLegalAgreementsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
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

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalLegalAgreementsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        View.inflate(context, C17165R.C17169layout.paypal_legal_agreement_view_layout, this);
        View findViewById = findViewById(C17165R.C17167id.payPalLegalAgreementsContainer);
        C19383o.m32796f(findViewById, "findViewById(R.id.payPalLegalAgreementsContainer)");
        this.payPalLegalAgreementsContainer = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.userProfileLegalAgreementsTextView);
        C19383o.m32796f(findViewById2, "findViewById(R.id.userPr…eLegalAgreementsTextView)");
        this.userProfileLegalAgreementsTv = (TextView) findViewById2;
    }
}
