package com.paypal.pyplcheckout.home.view.customviews.alertview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.room.C3257w;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.extensions.ViewExtensionsKt;
import com.paypal.pyplcheckout.utils.AccessibilityUtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;

public final class PayPalAlertToastView extends CardView {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private TextView body;
    private TextView header;
    private ImageView icon;
    private final ConcurrentLinkedQueue<AlertToast> pendingToasts = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean showing = new AtomicBoolean(false);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalAlertToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attributeSet");
        View.inflate(context, C17165R.C17169layout.paypal_alert_toast_view, this);
        setAlpha(0.0f);
    }

    private final void animateShow() {
        ViewPropertyAnimator duration = animate().alpha(1.0f).setDuration(250);
        C19383o.m32796f(duration, "animate().alpha(1f).setD…ation(ANIMATION_DURATION)");
        ViewExtensionsKt.runOnFinish(duration, new PayPalAlertToastView$animateShow$1(this));
        postDelayed(new C3257w(this, 3), getShownDuration());
    }

    /* access modifiers changed from: private */
    /* renamed from: animateShow$lambda-0  reason: not valid java name */
    public static final void m35395animateShow$lambda0(PayPalAlertToastView payPalAlertToastView) {
        C19383o.m32797g(payPalAlertToastView, "this$0");
        payPalAlertToastView.dismiss();
    }

    private final void clearViews() {
        this.icon = null;
        this.header = null;
        this.body = null;
    }

    private final void dismiss() {
        ViewPropertyAnimator duration = animate().alpha(0.0f).setDuration(250);
        C19383o.m32796f(duration, "animate().alpha(0f).setD…ation(ANIMATION_DURATION)");
        ViewExtensionsKt.runOnFinish(duration, new PayPalAlertToastView$dismiss$1(this));
    }

    private final long getShownDuration() {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        return AccessibilityUtilsKt.isAccessibilityEnabled(context) ? 12000 : 4000;
    }

    private final void initViews() {
        this.icon = (ImageView) findViewById(C17165R.C17167id.alert_icon);
        this.header = (TextView) findViewById(C17165R.C17167id.alert_header);
        this.body = (TextView) findViewById(C17165R.C17167id.alert_body);
    }

    private final void renderToast(AlertToast alertToast) {
        int i = 0;
        setVisibility(0);
        setIcon(alertToast.getIcon());
        setTextColor(alertToast.getTextColor());
        Context context = getContext();
        int backgroundColor = alertToast.getBackgroundColor();
        Object obj = C8184a.f17966a;
        setCardBackgroundColor(C8184a.C8188d.m16468a(context, backgroundColor));
        TextView textView = this.body;
        if (textView != null) {
            textView.setText(alertToast.getBodyText());
        }
        TextView textView2 = this.header;
        if (textView2 != null) {
            textView2.setText(alertToast.getHeaderText());
        }
        TextView textView3 = this.header;
        if (textView3 != null) {
            String headerText = alertToast.getHeaderText();
            if (!(!(headerText == null || headerText.length() == 0))) {
                i = 8;
            }
            textView3.setVisibility(i);
        }
        setContentDescription(alertToast);
        animateShow();
    }

    private final void setContentDescription(AlertToast alertToast) {
        setImportantForAccessibility(1);
        String headerText = alertToast.getHeaderText();
        String str = "";
        if (headerText == null) {
            headerText = str;
        }
        String bodyText = alertToast.getBodyText();
        if (bodyText != null) {
            str = bodyText;
        }
        setContentDescription(headerText + " " + str);
    }

    private final void setIcon(Integer num) {
        if (num == null) {
            ImageView imageView = this.icon;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = this.icon;
        if (imageView3 != null) {
            Context context = getContext();
            int intValue = num.intValue();
            Object obj = C8184a.f17966a;
            imageView3.setBackground(C8184a.C8187c.m16466b(context, intValue));
        }
    }

    private final void setTextColor(int i) {
        TextView textView = this.header;
        if (textView != null) {
            Context context = getContext();
            Object obj = C8184a.f17966a;
            textView.setTextColor(C8184a.C8188d.m16468a(context, i));
        }
        TextView textView2 = this.body;
        if (textView2 != null) {
            Context context2 = getContext();
            Object obj2 = C8184a.f17966a;
            textView2.setTextColor(C8184a.C8188d.m16468a(context2, i));
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

    public final synchronized void consumeQueue() {
        AlertToast poll = this.pendingToasts.poll();
        if (poll == null) {
            this.showing.set(false);
            setVisibility(8);
            return;
        }
        renderToast(poll);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initViews();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearViews();
    }

    public final synchronized void showToast(AlertToast alertToast) {
        C19383o.m32797g(alertToast, "toast");
        bringToFront();
        this.pendingToasts.add(alertToast);
        if (this.showing.compareAndSet(false, true)) {
            consumeQueue();
        }
    }
}
