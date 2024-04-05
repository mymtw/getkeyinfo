package com.paypal.pyplcheckout.home.view.customviews;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"CustomViewStyleable"})
public final class LoadingProgressSpinnerView extends ConstraintLayout implements ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "LoadingProgressSpinnerView";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ImageView cryptoProgressIV;
    private ConstraintLayout fullProgressView;
    private TextView loadingMessageTv;
    private ImageView loadingProgressIV;
    private ProgressBar progressBar;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return LoadingProgressSpinnerView.TAG;
        }
    }

    static {
        Class<LoadingProgressSpinnerView> cls = LoadingProgressSpinnerView.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingProgressSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17165R.styleable.preferred_fi_view_attrs, 0, 0);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…iew_attrs, 0, 0\n        )");
        obtainStyledAttributes.recycle();
        View.inflate(context, C17165R.C17169layout.loading_progress_spinner_view, this);
        View findViewById = findViewById(C17165R.C17167id.loading_progress_iv);
        C19383o.m32796f(findViewById, "findViewById(R.id.loading_progress_iv)");
        this.loadingProgressIV = (ImageView) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.crypto_progress_iv);
        C19383o.m32796f(findViewById2, "findViewById(R.id.crypto_progress_iv)");
        this.cryptoProgressIV = (ImageView) findViewById2;
        View findViewById3 = findViewById(C17165R.C17167id.loading_message_tv);
        C19383o.m32796f(findViewById3, "findViewById(R.id.loading_message_tv)");
        this.loadingMessageTv = (TextView) findViewById3;
        View findViewById4 = findViewById(C17165R.C17167id.progress_bar);
        C19383o.m32796f(findViewById4, "findViewById(R.id.progress_bar)");
        this.progressBar = (ProgressBar) findViewById4;
        View findViewById5 = findViewById(C17165R.C17167id.full_loading_view);
        C19383o.m32796f(findViewById5, "findViewById(R.id.full_loading_view)");
        this.fullProgressView = (ConstraintLayout) findViewById5;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.progressBar, "progress", new int[]{0, 0});
        ofInt.setDuration(0);
        ofInt.setInterpolator(new AccelerateInterpolator());
        if (DebugConfigManager.getInstance().getProviderContext() != null) {
            PLog.info(PEnums.LogType.FPTI, "startprogress");
        }
        ofInt.start();
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

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    public final void setCustomMessage(String str) {
        C19383o.m32797g(str, "message");
        this.loadingMessageTv.setText(str);
    }

    public final void setFetchingUserCheckoutResponsePhase() {
        this.loadingMessageTv.setText(getContext().getString(C17165R.string.paypal_checkout_pulling_up_digital_wallet));
        this.progressBar.clearAnimation();
    }

    public final void setLoggingInUserPhase() {
        this.loadingMessageTv.setText(getContext().getString(C17165R.string.paypal_checkout_securely_logging_you_in));
    }

    public final void setWaitingForFirebasePhase() {
        this.loadingMessageTv.setText(getContext().getString(C17165R.string.paypal_checkout_welcome_to_paypal));
    }

    public final void showCryptoProgress() {
        this.fullProgressView.setVisibility(0);
        this.cryptoProgressIV.setVisibility(0);
    }
}
