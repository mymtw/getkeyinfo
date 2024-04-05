package com.etsy.android.p327ui.feedback;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8922t;
import com.jakewharton.rxbinding2.widget.C17025m;
import com.jakewharton.rxbinding2.widget.C17026n;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p260v0.C8184a;
import p269vp.C8221a;
import p277w8.C8264b;
import p435rb.C13350a;
import p504ai.C13983i;
import p525co.C14173a;

/* renamed from: com.etsy.android.ui.feedback.AppFeedbackView */
public final class AppFeedbackView extends FrameLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final Drawable errorFieldDrawable;
    private final Drawable normalFieldDrawable;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppFeedbackView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppFeedbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppFeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutTransition layoutTransition = getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
        }
        Object obj = C8184a.f17966a;
        this.normalFieldDrawable = C8184a.C8187c.m16466b(context, R.drawable.bg_edit_listing_field);
        this.errorFieldDrawable = C8184a.C8187c.m16466b(context, R.drawable.bg_im_edit_field_error);
    }

    /* access modifiers changed from: private */
    /* renamed from: focus$lambda-0  reason: not valid java name */
    public static final void m34982focus$lambda0(AppFeedbackView appFeedbackView, C17025m mVar) {
        C19383o.m32797g(appFeedbackView, "this$0");
        Editable editable = mVar.editable();
        if (!(editable == null || C19457k.m33020X0(editable))) {
            appFeedbackView.hideError();
        }
    }

    private final void hideError() {
        ((TextView) _$_findCachedViewById(R.id.error_label)).setText((CharSequence) null);
        ViewExtensions.m12860d((TextView) _$_findCachedViewById(R.id.error_label));
        Drawable mutate = ((EditText) _$_findCachedViewById(R.id.edittext_feedback)).getBackground().mutate();
        ((LinearLayout) _$_findCachedViewById(R.id.feedback_border_box)).setBackground(this.normalFieldDrawable);
        mutate.clearColorFilter();
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

    public final void focus() {
        EditText editText = (EditText) _$_findCachedViewById(R.id.edittext_feedback);
        if (editText != null) {
            editText.postDelayed(new C8922t(editText, (InputMethodManager) editText.getContext().getSystemService("input_method")), 200);
        }
        EditText editText2 = (EditText) _$_findCachedViewById(R.id.edittext_feedback);
        if (editText2 != null) {
            new C14173a.C14174a(new C17026n(editText2)).mo20639i(C8221a.m16513a()).mo20637g(new C8264b(this, 7));
            return;
        }
        throw new NullPointerException("view == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = (r0 = r0.getText()).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFeedback() {
        /*
            r1 = this;
            r0 = 2131428254(0x7f0b039e, float:1.8478147E38)
            android.view.View r0 = r1._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            if (r0 == 0) goto L_0x0017
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.feedback.AppFeedbackView.getFeedback():java.lang.String");
    }

    public final void setFeedback(String str) {
        C19383o.m32797g(str, "previousText");
        EditText editText = (EditText) _$_findCachedViewById(R.id.edittext_feedback);
        if (editText != null) {
            editText.setText(str);
        }
    }

    public final void showError(int i) {
        ViewExtensions.m12869m((TextView) _$_findCachedViewById(R.id.error_label));
        ((TextView) _$_findCachedViewById(R.id.error_label)).setText(getContext().getResources().getString(i));
        Drawable mutate = ((EditText) _$_findCachedViewById(R.id.edittext_feedback)).getBackground().mutate();
        ((LinearLayout) _$_findCachedViewById(R.id.feedback_border_box)).setBackground(this.errorFieldDrawable);
        mutate.clearColorFilter();
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        mutate.setColorFilter(new PorterDuffColorFilter(C13350a.m21013d(context, R.attr.clg_color_bg_error), PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppFeedbackView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
