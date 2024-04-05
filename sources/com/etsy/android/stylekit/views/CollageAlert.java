package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.accessibility.capabilities.AccessibilityCapabilities;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p388lb.C13006a;
import p435rb.C13350a;
import p435rb.C13351b;
import p568fn.C17782b;

public final class CollageAlert extends ConstraintLayout {
    public static final int $stable = 8;
    private final float alertGutterWidth;
    private AlertType alertType;
    private final Button altButton;
    private View.OnClickListener altButtonClickListener;
    private AnchorDirection anchorDirection;
    private final View anchorDown;
    private float anchorOffset;
    private AnchorOffsetDirection anchorOffsetDirection;
    private final View anchorUp;
    private final View background;
    private View.OnClickListener backgroundClickListener;
    private final TextView badge;
    private final float baseAnchorOffset;
    private final TextView body;
    private final Space bottomSpace;
    private final ImageView disclosureArrow;
    private final Button dismissButton;
    private View.OnClickListener dismissButtonClickListener;
    private final float floatingElevation;
    private boolean fullWidth;
    private final float halfAnchorWidth;
    private final ImageView icon;
    private final View iconAndImageHolder;
    private final View imageCard;
    private final Button mainButton;
    private View.OnClickListener mainButtonClickListener;
    private boolean showAnchor;
    private final TextView title;
    private final ViewGroup titleAndBodyContainer;
    private final Space topSpace;

    public enum AlertType {
        SUCCESS,
        NEWS,
        INFO,
        INFO_SUBTLE,
        WARNING,
        ERROR,
        UNKNOWN
    }

    public enum AnchorDirection {
        DOWN,
        UP
    }

    public enum AnchorOffsetDirection {
        END,
        START,
        MIDDLE
    }

    public enum IconAlignment {
        CENTER,
        TOP
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageAlert$a */
    public /* synthetic */ class C9022a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19893a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19894b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f19895c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f19896d;

        static {
            int[] iArr = new int[AnchorDirection.values().length];
            iArr[AnchorDirection.UP.ordinal()] = 1;
            iArr[AnchorDirection.DOWN.ordinal()] = 2;
            f19893a = iArr;
            int[] iArr2 = new int[AnchorOffsetDirection.values().length];
            iArr2[AnchorOffsetDirection.START.ordinal()] = 1;
            iArr2[AnchorOffsetDirection.END.ordinal()] = 2;
            iArr2[AnchorOffsetDirection.MIDDLE.ordinal()] = 3;
            f19894b = iArr2;
            int[] iArr3 = new int[AlertType.values().length];
            iArr3[AlertType.SUCCESS.ordinal()] = 1;
            iArr3[AlertType.NEWS.ordinal()] = 2;
            iArr3[AlertType.INFO.ordinal()] = 3;
            iArr3[AlertType.INFO_SUBTLE.ordinal()] = 4;
            iArr3[AlertType.WARNING.ordinal()] = 5;
            iArr3[AlertType.ERROR.ordinal()] = 6;
            iArr3[AlertType.UNKNOWN.ordinal()] = 7;
            f19895c = iArr3;
            int[] iArr4 = new int[IconAlignment.values().length];
            iArr4[IconAlignment.CENTER.ordinal()] = 1;
            iArr4[IconAlignment.TOP.ordinal()] = 2;
            f19896d = iArr4;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageAlert(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageAlert(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageAlert(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void setAnchorOffset$default(CollageAlert collageAlert, AnchorOffsetDirection anchorOffsetDirection2, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        collageAlert.setAnchorOffset(anchorOffsetDirection2, f);
    }

    public static /* synthetic */ void setBodyText$default(CollageAlert collageAlert, CharSequence charSequence, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        collageAlert.setBodyText(charSequence, drawable);
    }

    private final void setButtonStyles(int i, int i2, int i3, int i4, int i5, int i6) {
        if (!isInEditMode()) {
            if (i != 0) {
                C13350a.m21011b(this.mainButton, i);
            }
            if (i2 != 0) {
                C13350a.m21011b(this.altButton, i2);
            }
            if (i3 != 0) {
                C13350a.m21011b(this.dismissButton, i3);
            }
            if (i4 != 0) {
                C13350a.m21010a(this.mainButton, i4);
            }
            if (i5 != 0) {
                C13350a.m21010a(this.altButton, i5);
            }
            if (i6 != 0) {
                C13350a.m21010a(this.dismissButton, i6);
            }
        }
    }

    public static /* synthetic */ void setButtonStyles$default(CollageAlert collageAlert, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = 0;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        collageAlert.setButtonStyles(i, i2, i3, i4, i5, i6);
    }

    private final void setTextColor(int i) {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        int d = C13350a.m21013d(context, i);
        this.title.setTextColor(d);
        this.body.setTextColor(d);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        Drawable[] compoundDrawables = this.body.getCompoundDrawables();
        C19383o.m32796f(compoundDrawables, "body.compoundDrawables");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        this.disclosureArrow.setColorFilter(porterDuffColorFilter);
    }

    private final void tintBackground(int i) {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C13350a.m21013d(context, i), PorterDuff.Mode.SRC_IN);
        this.background.getBackground().mutate().setColorFilter(porterDuffColorFilter);
        this.anchorDown.getBackground().mutate().setColorFilter(porterDuffColorFilter);
        this.anchorUp.getBackground().mutate().setColorFilter(porterDuffColorFilter);
    }

    private final void updateIconImageSpacing() {
        int dimensionPixelSize = (this.icon.getVisibility() == 0 || this.imageCard.getVisibility() == 0) ? this.topSpace.getResources().getDimensionPixelSize(R.dimen.clg_space_12) : this.topSpace.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        this.topSpace.getLayoutParams().height = dimensionPixelSize;
        this.bottomSpace.getLayoutParams().height = dimensionPixelSize;
    }

    public final View.OnClickListener getAltButtonClickListener() {
        return this.altButtonClickListener;
    }

    public final View.OnClickListener getBackgroundClickListener() {
        return this.backgroundClickListener;
    }

    public final CharSequence getBodyText() {
        return this.body.getText();
    }

    public final View.OnClickListener getDismissButtonClickListener() {
        return this.dismissButtonClickListener;
    }

    public final View.OnClickListener getMainButtonClickListener() {
        return this.mainButtonClickListener;
    }

    public final CharSequence getTitleText() {
        return this.title.getText();
    }

    public final void setAlertType(AlertType alertType2) {
        C19383o.m32797g(alertType2, "alertType");
        this.alertType = alertType2;
        switch (C9022a.f19895c[alertType2.ordinal()]) {
            case 1:
                tintBackground(R.attr.clg_color_alert_success);
                setTextColor(R.attr.clg_color_text_primary_on_light);
                setButtonStyles$default(this, R.attr.clg_button_primary_small_on_light, R.attr.clg_button_tertiary_small_on_light, R.attr.clg_button_tertiary_transparent_icon_small_on_light, 0, 0, 0, 56, (Object) null);
                return;
            case 2:
                tintBackground(R.attr.clg_color_alert_news);
                setTextColor(R.attr.clg_color_text_primary_on_dark);
                setButtonStyles$default(this, R.attr.clg_button_primary_small_on_dark, R.attr.clg_button_tertiary_small_on_dark, R.attr.clg_button_tertiary_transparent_icon_small_on_dark, 0, 0, 0, 56, (Object) null);
                return;
            case 3:
                tintBackground(R.attr.clg_color_alert_info);
                setTextColor(R.attr.clg_color_text_primary_on_dark);
                setButtonStyles$default(this, R.attr.clg_button_primary_small_on_dark, R.attr.clg_button_tertiary_small_on_dark, R.attr.clg_button_tertiary_transparent_icon_small_on_dark, 0, 0, 0, 56, (Object) null);
                return;
            case 4:
                tintBackground(R.attr.clg_color_alert_info_subtle);
                setTextColor(R.attr.clg_color_text_primary);
                setButtonStyles$default(this, 0, 0, 0, R.style.clg_button_primary_small, R.style.clg_button_tertiary_small, R.style.clg_button_tertiary_transparent_icon_small, 7, (Object) null);
                return;
            case 5:
                tintBackground(R.attr.clg_color_alert_warning);
                setTextColor(R.attr.clg_color_text_primary_on_light);
                setButtonStyles$default(this, R.attr.clg_button_tertiary_small_on_light, R.attr.clg_button_tertiary_transparent_small_on_light, R.attr.clg_button_tertiary_transparent_icon_small_on_light, 0, 0, 0, 56, (Object) null);
                return;
            case 6:
                tintBackground(R.attr.clg_color_alert_error);
                setTextColor(R.attr.clg_color_text_primary_on_dark);
                setButtonStyles$default(this, R.attr.clg_button_tertiary_small_on_dark, R.attr.clg_button_tertiary_transparent_small_on_dark, R.attr.clg_button_tertiary_transparent_icon_small_on_dark, 0, 0, 0, 56, (Object) null);
                return;
            case 7:
                Log.e("Collage", "Alert type must be one of [success, news, info, warning, error].");
                return;
            default:
                return;
        }
    }

    public final void setAltButtonClickListener(View.OnClickListener onClickListener) {
        this.altButton.setOnClickListener(onClickListener);
    }

    public final void setAltButtonText(String str) {
        if (!(str == null || str.length() == 0)) {
            this.altButton.setText(str);
            this.altButton.setVisibility(0);
            return;
        }
        this.altButton.setVisibility(8);
    }

    public final void setAnchorDirection(AnchorDirection anchorDirection2) {
        C19383o.m32797g(anchorDirection2, "anchorDirection");
        this.anchorDirection = anchorDirection2;
        setShowAnchor(this.showAnchor);
    }

    public final void setAnchorOffset(AnchorOffsetDirection anchorOffsetDirection2, float f) {
        int i;
        C19383o.m32797g(anchorOffsetDirection2, "anchorOffsetDirection");
        this.anchorOffset = f;
        this.anchorOffsetDirection = anchorOffsetDirection2;
        C2236a aVar = new C2236a();
        aVar.mo8487e(this);
        int i2 = C9022a.f19893a[this.anchorDirection.ordinal()];
        if (i2 == 1) {
            i = R.id.clg_alert_anchor_arrow_up;
        } else if (i2 == 2) {
            i = R.id.clg_alert_anchor_arrow;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.fullWidth) {
            f -= this.alertGutterWidth;
        }
        float f2 = this.baseAnchorOffset;
        float f3 = f <= f2 ? f2 - this.halfAnchorWidth : f - this.halfAnchorWidth;
        int i3 = C9022a.f19894b[anchorOffsetDirection2.ordinal()];
        if (i3 == 1) {
            aVar.mo8490j(i).f5379d.f5439u = 0.0f;
            aVar.mo8494o(i, 6, (int) f3);
            aVar.mo8484b(this);
        } else if (i3 == 2) {
            aVar.mo8490j(i).f5379d.f5439u = 1.0f;
            aVar.mo8494o(i, 7, (int) f3);
            aVar.mo8484b(this);
        } else if (i3 == 3) {
            aVar.mo8490j(i).f5379d.f5439u = 0.5f;
            aVar.mo8494o(i, 6, 0);
            aVar.mo8494o(i, 7, 0);
            aVar.mo8484b(this);
        }
    }

    public final void setBackgroundClickListener(View.OnClickListener onClickListener) {
        this.background.setOnClickListener(onClickListener);
        List<String> list = AccessibilityCapabilities.f19885a;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        if (AccessibilityCapabilities.Companion.m17419b(context, AccessibilityCapabilities.Companion.AssistiveTools.SWITCH_ACCESS, AccessibilityCapabilities.Companion.AssistiveTools.TALKBACK)) {
            setOnClickListener(onClickListener);
        }
    }

    public final void setBadgeText(String str) {
        if (!(str == null || str.length() == 0)) {
            this.badge.setText(str);
            this.badge.setVisibility(0);
            return;
        }
        this.badge.setVisibility(8);
    }

    public final void setBodyLinkClickListener(View.OnClickListener onClickListener) {
        this.body.setMovementMethod(LinkMovementMethod.getInstance());
        URLSpan[] urls = this.body.getUrls();
        C19383o.m32796f(urls, "body.urls");
        if (!(urls.length == 0)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.body.getText());
            URLSpan[] urls2 = this.body.getUrls();
            C19383o.m32796f(urls2, "body.urls");
            for (URLSpan uRLSpan : urls2) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                spannableStringBuilder.removeSpan(uRLSpan);
                if (onClickListener != null) {
                    spannableStringBuilder.setSpan(new CollageAlert$setBodyLinkClickListener$1(onClickListener, uRLSpan.getURL()), spanStart, spanEnd, 33);
                }
            }
            this.body.setText(spannableStringBuilder);
        }
    }

    public final void setBodyText(CharSequence charSequence, Drawable drawable) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            this.body.setText(charSequence);
            if (drawable != null) {
                drawable.setBounds(0, 0, getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller), getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smaller));
            }
            C13351b.m21020d(this.body, drawable, (Drawable) null, 14);
            this.body.setVisibility(0);
            return;
        }
        this.body.setVisibility(8);
    }

    public final void setClickableBackground(boolean z) {
        List<String> list = AccessibilityCapabilities.f19885a;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        boolean b = AccessibilityCapabilities.Companion.m17419b(context, AccessibilityCapabilities.Companion.AssistiveTools.SWITCH_ACCESS, AccessibilityCapabilities.Companion.AssistiveTools.TALKBACK);
        if (z || this.disclosureArrow.getVisibility() == 0) {
            this.background.setClickable(true);
            this.background.setFocusable(true);
            if (b) {
                setClickable(true);
                return;
            }
            return;
        }
        this.background.setClickable(false);
        this.background.setFocusable(false);
        if (b) {
            setClickable(false);
        }
    }

    public final void setDismissButtonClickListener(View.OnClickListener onClickListener) {
        this.dismissButton.setOnClickListener(onClickListener);
    }

    public final void setFloating(boolean z) {
        float f = z ? this.floatingElevation : 0.0f;
        List<View> e0 = C17782b.m29865e0(this.background, this.iconAndImageHolder, this.titleAndBodyContainer, this.dismissButton, this.mainButton, this.altButton, this.anchorDown, this.anchorUp);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(e0));
        for (View elevation : e0) {
            elevation.setElevation(f);
            arrayList.add(C19394m.f43287a);
        }
    }

    public final void setFullWidth(boolean z) {
        C2236a aVar = new C2236a();
        aVar.mo8487e(this);
        if (z) {
            aVar.mo8488f(R.id.clg_alert_background, 6, 0, 6);
            aVar.mo8488f(R.id.clg_alert_background, 7, 0, 7);
            aVar.mo8484b(this);
            View view = this.background;
            Context context = getContext();
            Object obj = C8184a.f17966a;
            view.setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_alert_bg_fullwidth));
        } else {
            aVar.mo8488f(R.id.clg_alert_background, 6, R.id.clg_alert_gutter_start, 6);
            aVar.mo8488f(R.id.clg_alert_background, 7, R.id.clg_alert_gutter_end, 7);
            aVar.mo8484b(this);
            View view2 = this.background;
            Context context2 = getContext();
            Object obj2 = C8184a.f17966a;
            view2.setBackground(C8184a.C8187c.m16466b(context2, R.drawable.clg_alert_bg));
        }
        setAlertType(this.alertType);
    }

    public final void setIcon(String str) {
        if (str == null || str.length() == 0) {
            this.icon.setVisibility(8);
            return;
        }
        try {
            setIconDrawableRes(getResources().getIdentifier(str, "drawable", getContext().getPackageName()));
            this.icon.setVisibility(0);
        } catch (Resources.NotFoundException e) {
            Log.e(C19386q.m32807a(CollageAlert.class).mo71919c(), "Unknown icon", e);
            this.icon.setVisibility(8);
        }
    }

    public final void setIconAlignment(IconAlignment iconAlignment) {
        C19383o.m32797g(iconAlignment, ResponseConstants.ALIGNMENT);
        C2236a aVar = new C2236a();
        aVar.mo8487e(this);
        int i = C9022a.f19896d[iconAlignment.ordinal()];
        if (i == 1) {
            aVar.mo8488f(R.id.clg_alert_icon_or_image, 3, R.id.top_barrier, 4);
            aVar.mo8488f(R.id.clg_alert_icon_or_image, 4, R.id.bottom_barrier, 3);
        } else if (i == 2) {
            aVar.mo8488f(R.id.clg_alert_icon_or_image, 3, R.id.top_barrier, 4);
            aVar.mo8486d(R.id.clg_alert_icon_or_image, 4);
        }
        aVar.mo8484b(this);
    }

    public final void setIconDrawable(Drawable drawable) {
        if (drawable == null) {
            this.icon.setVisibility(8);
        } else {
            this.icon.setVisibility(0);
            this.icon.setImageDrawable(drawable);
        }
        updateIconImageSpacing();
    }

    public final void setIconDrawableRes(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setIconDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            this.imageCard.setVisibility(8);
        } else {
            this.imageCard.setVisibility(0);
            ((ImageView) this.imageCard.findViewById(R.id.clg_alert_image)).setImageDrawable(drawable);
        }
        updateIconImageSpacing();
    }

    public final void setImageDrawableRes(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setImageDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public final void setMainButtonClickListener(View.OnClickListener onClickListener) {
        this.mainButton.setOnClickListener(onClickListener);
    }

    public final void setMainButtonIconDrawable(Drawable drawable) {
        Drawable mutate;
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setColorFilter(this.mainButton.getTextColors().getDefaultColor(), PorterDuff.Mode.SRC_ATOP);
        }
        Button button = this.mainButton;
        C19383o.m32795e(button, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageButton");
        ((CollageButton) button).setIcon(drawable);
    }

    public final void setMainButtonIconDrawableRes(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setMainButtonIconDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public final void setMainButtonText(String str) {
        if (!(str == null || str.length() == 0)) {
            this.mainButton.setText(str);
            this.mainButton.setVisibility(0);
            return;
        }
        this.mainButton.setVisibility(8);
    }

    public final void setShowAnchor(boolean z) {
        this.showAnchor = z;
        if (z) {
            int i = C9022a.f19893a[this.anchorDirection.ordinal()];
            if (i == 1) {
                this.anchorDown.setVisibility(8);
                this.anchorUp.setVisibility(0);
            } else if (i == 2) {
                this.anchorDown.setVisibility(0);
                this.anchorUp.setVisibility(8);
            }
            setAnchorOffset(this.anchorOffsetDirection, this.anchorOffset);
            return;
        }
        this.anchorDown.setVisibility(8);
        this.anchorUp.setVisibility(8);
    }

    public final void setTitleLarge(boolean z) {
        if (z) {
            this.title.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_default));
        } else {
            this.title.setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.clg_text_size_small));
        }
    }

    public final void setTitleText(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            this.title.setText(charSequence);
            this.title.setVisibility(0);
            return;
        }
        this.title.setVisibility(8);
    }

    public final void showDisclosureArrow(boolean z) {
        if (z) {
            this.disclosureArrow.setVisibility(0);
            setClickableBackground(true);
            showDismissButton(false);
            return;
        }
        this.disclosureArrow.setVisibility(8);
        setClickableBackground(false);
    }

    public final void showDismissButton(boolean z) {
        if (z) {
            this.dismissButton.setVisibility(0);
            showDisclosureArrow(false);
            return;
        }
        this.dismissButton.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageAlert(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnchorOffsetDirection anchorOffsetDirection2;
        AlertType alertType2;
        IconAlignment iconAlignment;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.floatingElevation = (float) C13350a.m21014e(6, context2);
        float e = (float) C13350a.m21014e(20, context2);
        this.baseAnchorOffset = e;
        this.halfAnchorWidth = (float) C13350a.m21014e(12, context2);
        this.alertGutterWidth = (float) C13350a.m21014e(8, context2);
        AlertType alertType3 = AlertType.UNKNOWN;
        this.alertType = alertType3;
        AnchorDirection anchorDirection2 = AnchorDirection.DOWN;
        this.anchorDirection = anchorDirection2;
        AnchorOffsetDirection anchorOffsetDirection3 = AnchorOffsetDirection.END;
        this.anchorOffsetDirection = anchorOffsetDirection3;
        LayoutInflater.from(context).inflate(R.layout.clg_alert, this, true);
        View findViewById = findViewById(R.id.clg_alert_background);
        C19383o.m32796f(findViewById, "findViewById(R.id.clg_alert_background)");
        this.background = findViewById;
        View findViewById2 = findViewById(R.id.clg_alert_title);
        C19383o.m32796f(findViewById2, "findViewById(R.id.clg_alert_title)");
        this.title = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_alert_body);
        C19383o.m32796f(findViewById3, "findViewById(R.id.clg_alert_body)");
        this.body = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.title_and_body_container);
        C19383o.m32796f(findViewById4, "findViewById(R.id.title_and_body_container)");
        this.titleAndBodyContainer = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(R.id.clg_alert_badge);
        C19383o.m32796f(findViewById5, "findViewById(R.id.clg_alert_badge)");
        this.badge = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.clg_alert_icon);
        C19383o.m32796f(findViewById6, "findViewById(R.id.clg_alert_icon)");
        this.icon = (ImageView) findViewById6;
        View findViewById7 = findViewById(R.id.clg_alert_image_card);
        C19383o.m32796f(findViewById7, "findViewById(R.id.clg_alert_image_card)");
        this.imageCard = findViewById7;
        View findViewById8 = findViewById(R.id.clg_alert_icon_or_image);
        C19383o.m32796f(findViewById8, "findViewById(R.id.clg_alert_icon_or_image)");
        this.iconAndImageHolder = findViewById8;
        View findViewById9 = findViewById(R.id.clg_alert_dismiss);
        C19383o.m32796f(findViewById9, "findViewById(R.id.clg_alert_dismiss)");
        this.dismissButton = (Button) findViewById9;
        View findViewById10 = findViewById(R.id.clg_alert_disclosure);
        C19383o.m32796f(findViewById10, "findViewById(R.id.clg_alert_disclosure)");
        this.disclosureArrow = (ImageView) findViewById10;
        View findViewById11 = findViewById(R.id.clg_alert_button_main);
        C19383o.m32796f(findViewById11, "findViewById(R.id.clg_alert_button_main)");
        this.mainButton = (Button) findViewById11;
        View findViewById12 = findViewById(R.id.clg_alert_button_alt);
        C19383o.m32796f(findViewById12, "findViewById(R.id.clg_alert_button_alt)");
        this.altButton = (Button) findViewById12;
        View findViewById13 = findViewById(R.id.clg_alert_anchor_arrow);
        C19383o.m32796f(findViewById13, "findViewById(R.id.clg_alert_anchor_arrow)");
        this.anchorDown = findViewById13;
        View findViewById14 = findViewById(R.id.clg_alert_anchor_arrow_up);
        C19383o.m32796f(findViewById14, "findViewById(R.id.clg_alert_anchor_arrow_up)");
        this.anchorUp = findViewById14;
        View findViewById15 = findViewById(R.id.clg_alert_top_space);
        C19383o.m32796f(findViewById15, "findViewById(R.id.clg_alert_top_space)");
        this.topSpace = (Space) findViewById15;
        View findViewById16 = findViewById(R.id.clg_alert_bottom_space);
        C19383o.m32796f(findViewById16, "findViewById(R.id.clg_alert_bottom_space)");
        this.bottomSpace = (Space) findViewById16;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C13006a.f28638e, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…eable.CollageAlert, 0, 0)");
            boolean z = obtainStyledAttributes.getBoolean(11, false);
            this.fullWidth = obtainStyledAttributes.getBoolean(12, false);
            boolean z2 = obtainStyledAttributes.getBoolean(10, false);
            boolean z3 = obtainStyledAttributes.getBoolean(9, false);
            boolean z4 = obtainStyledAttributes.getBoolean(16, false);
            String string = obtainStyledAttributes.getString(20);
            String string2 = obtainStyledAttributes.getString(7);
            String string3 = obtainStyledAttributes.getString(5);
            String string4 = obtainStyledAttributes.getString(18);
            Drawable drawable = obtainStyledAttributes.getDrawable(17);
            AlertType alertType4 = alertType3;
            String string5 = obtainStyledAttributes.getString(1);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(13);
            AnchorDirection anchorDirection3 = anchorDirection2;
            Drawable drawable3 = obtainStyledAttributes.getDrawable(15);
            AnchorOffsetDirection anchorOffsetDirection4 = anchorOffsetDirection3;
            String str = string5;
            boolean z5 = obtainStyledAttributes.getBoolean(19, false);
            Drawable drawable4 = drawable;
            int integer = obtainStyledAttributes.getInteger(2, 0);
            AnchorDirection anchorDirection4 = (integer == 0 || integer != 1) ? anchorDirection3 : AnchorDirection.UP;
            boolean z6 = obtainStyledAttributes.getBoolean(8, false);
            int integer2 = obtainStyledAttributes.getInteger(4, 0);
            if (integer2 == 1) {
                anchorOffsetDirection2 = AnchorOffsetDirection.START;
            } else if (integer2 != 2) {
                anchorOffsetDirection2 = anchorOffsetDirection4;
            } else {
                anchorOffsetDirection2 = AnchorOffsetDirection.MIDDLE;
            }
            float dimension = obtainStyledAttributes.getDimension(3, e);
            switch (obtainStyledAttributes.getInteger(0, 0)) {
                case 1:
                    alertType2 = AlertType.SUCCESS;
                    break;
                case 2:
                    alertType2 = AlertType.NEWS;
                    break;
                case 3:
                    alertType2 = AlertType.INFO;
                    break;
                case 4:
                    alertType2 = AlertType.WARNING;
                    break;
                case 5:
                    alertType2 = AlertType.ERROR;
                    break;
                case 6:
                    alertType2 = AlertType.INFO_SUBTLE;
                    break;
                default:
                    alertType2 = alertType4;
                    break;
            }
            this.alertType = alertType2;
            if (!isInEditMode()) {
                setFloating(z);
            }
            setFullWidth(this.fullWidth);
            setIconDrawable(drawable2);
            setImageDrawable(drawable3);
            showDismissButton(z2);
            showDisclosureArrow(z3);
            setTitleText(string);
            setTitleLarge(z4);
            setBodyText(string2, obtainStyledAttributes.getDrawable(6));
            setBadgeText(string3);
            setMainButtonText(string4);
            setMainButtonIconDrawable(drawable4);
            setAltButtonText(str);
            setShowAnchor(z5);
            setAnchorDirection(anchorDirection4);
            setAlertType(this.alertType);
            setClickableBackground(z6);
            setAnchorOffset(anchorOffsetDirection2, dimension);
            try {
                iconAlignment = IconAlignment.values()[obtainStyledAttributes.getInteger(14, IconAlignment.CENTER.ordinal())];
            } catch (IndexOutOfBoundsException unused) {
                iconAlignment = IconAlignment.CENTER;
            }
            setIconAlignment(iconAlignment);
            obtainStyledAttributes.recycle();
        }
    }
}
