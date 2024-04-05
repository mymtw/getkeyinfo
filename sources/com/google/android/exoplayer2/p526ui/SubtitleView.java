package com.google.android.exoplayer2.p526ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p636oi.C18296a;
import p636oi.C18306i;
import p670si.C18508b;
import p726zi.C18906a;
import p726zi.C18928n;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
public final class SubtitleView extends FrameLayout implements C18306i {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private List<C18296a> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private View innerSubtitleView;
    private C14411a output;
    private C18906a style;
    private int viewType;

    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface C14411a {
        /* renamed from: a */
        void mo48149a(List<C18296a> list, C18906a aVar, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    private List<C18296a> getCuesWithStylingPreferencesApplied() {
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            return this.cues;
        }
        ArrayList arrayList = new ArrayList(this.cues.size());
        for (int i = 0; i < this.cues.size(); i++) {
            arrayList.add(removeEmbeddedStyling(this.cues.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C14049b0.f30913a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C18906a getUserCaptionStyle() {
        int i = C14049b0.f30913a;
        if (i < 19 || isInEditMode()) {
            return C18906a.f42117g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return C18906a.f42117g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i < 21) {
            return new C18906a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        int i2 = -1;
        int i3 = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;
        int i4 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;
        int i5 = 0;
        int i6 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;
        if (userStyle.hasEdgeType()) {
            i5 = userStyle.edgeType;
        }
        int i7 = i5;
        if (userStyle.hasEdgeColor()) {
            i2 = userStyle.edgeColor;
        }
        return new C18906a(i3, i4, i6, i7, i2, userStyle.getTypeface());
    }

    private C18296a removeEmbeddedStyling(C18296a aVar) {
        aVar.getClass();
        C18296a.C18297a aVar2 = new C18296a.C18297a(aVar);
        if (!this.applyEmbeddedStyles) {
            aVar2.f40177n = false;
            CharSequence charSequence = aVar2.f40164a;
            if (charSequence instanceof Spanned) {
                if (!(charSequence instanceof Spannable)) {
                    aVar2.f40164a = SpannableString.valueOf(charSequence);
                }
                CharSequence charSequence2 = aVar2.f40164a;
                charSequence2.getClass();
                Spannable spannable = (Spannable) charSequence2;
                for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                    if (!(obj instanceof C18508b)) {
                        spannable.removeSpan(obj);
                    }
                }
            }
            C18928n.m32023a(aVar2);
        } else if (!this.applyEmbeddedFontSizes) {
            C18928n.m32023a(aVar2);
        }
        return aVar2.mo69838a();
    }

    private void setTextSize(int i, float f) {
        this.defaultTextSizeType = i;
        this.defaultTextSize = f;
        updateOutput();
    }

    private <T extends View & C14411a> void setView(T t) {
        removeView(this.innerSubtitleView);
        View view = this.innerSubtitleView;
        if (view instanceof C14422d) {
            ((C14422d) view).f32466c.destroy();
        }
        this.innerSubtitleView = t;
        this.output = (C14411a) t;
        addView(t);
    }

    private void updateOutput() {
        this.output.mo48149a(getCuesWithStylingPreferencesApplied(), this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    public void onCues(List<C18296a> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.applyEmbeddedFontSizes = z;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.applyEmbeddedStyles = z;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f) {
        this.bottomPaddingFraction = f;
        updateOutput();
    }

    public void setCues(List<C18296a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.cues = list;
        updateOutput();
    }

    public void setFixedTextSize(int i, float f) {
        Context context = getContext();
        setTextSize(2, TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public void setStyle(C18906a aVar) {
        this.style = aVar;
        updateOutput();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i) {
        if (this.viewType != i) {
            if (i == 1) {
                setView(new C14415a(getContext(), (AttributeSet) null));
            } else if (i == 2) {
                setView(new C14422d(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.viewType = i;
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cues = Collections.emptyList();
        this.style = C18906a.f42117g;
        this.defaultTextSizeType = 0;
        this.defaultTextSize = 0.0533f;
        this.bottomPaddingFraction = 0.08f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        C14415a aVar = new C14415a(context, attributeSet);
        this.output = aVar;
        this.innerSubtitleView = aVar;
        addView(aVar);
        this.viewType = 1;
    }

    public void setFractionalTextSize(float f, boolean z) {
        setTextSize(z ? 1 : 0, f);
    }
}
