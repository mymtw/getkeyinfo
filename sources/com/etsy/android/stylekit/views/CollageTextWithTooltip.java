package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;
import p435rb.C13350a;

public final class CollageTextWithTooltip extends AppCompatTextView {
    public static final int $stable = 8;
    private final Path path;
    private final C19285c tooltipAnchorBottom$delegate;
    private final C19285c tooltipAnchorTop$delegate;
    private String tooltipText;
    private final C19285c tooltipView$delegate;
    private final int underlinePadding;
    private final Paint underlinePaint;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTextWithTooltip(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageTextWithTooltip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageTextWithTooltip(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-2  reason: not valid java name */
    public static final void m34901_init_$lambda2(PopupWindow popupWindow, CollageTextWithTooltip collageTextWithTooltip, View view) {
        int i;
        C19383o.m32797g(popupWindow, "$popupWindow");
        C19383o.m32797g(collageTextWithTooltip, "this$0");
        if (!popupWindow.isShowing()) {
            ((TextView) collageTextWithTooltip.getTooltipView().findViewById(R.id.tooltip_text)).setText(collageTextWithTooltip.tooltipText);
            collageTextWithTooltip.getTooltipView().measure(0, 0);
            popupWindow.setFocusable(true);
            int i2 = (-(collageTextWithTooltip.getTooltipView().getMeasuredWidth() - collageTextWithTooltip.getWidth())) / 2;
            int height = (collageTextWithTooltip.getHeight() - collageTextWithTooltip.getBaseline()) - collageTextWithTooltip.getResources().getDimensionPixelSize(R.dimen.clg_space_2);
            int measuredHeight = collageTextWithTooltip.getTooltipView().getMeasuredHeight();
            if (collageTextWithTooltip.getY() < ((float) measuredHeight)) {
                collageTextWithTooltip.getTooltipAnchorBottom().setVisibility(8);
                collageTextWithTooltip.getTooltipAnchorTop().setVisibility(0);
                i = 0 - height;
            } else {
                i = (-(collageTextWithTooltip.getHeight() + measuredHeight)) + height;
            }
            popupWindow.getContentView().addOnLayoutChangeListener(new CollageTextWithTooltip$2$1(popupWindow, collageTextWithTooltip));
            popupWindow.showAsDropDown(collageTextWithTooltip, i2, i);
        }
    }

    /* access modifiers changed from: private */
    public final View getTooltipAnchorBottom() {
        return (View) this.tooltipAnchorBottom$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final View getTooltipAnchorTop() {
        return (View) this.tooltipAnchorTop$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final View getTooltipView() {
        return (View) this.tooltipView$delegate.getValue();
    }

    public final String getTooltipText() {
        return this.tooltipText;
    }

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        super.onDraw(canvas);
        float baseline = ((float) getBaseline()) + ((float) this.underlinePadding);
        this.path.moveTo(0.0f, baseline);
        this.path.lineTo((float) getWidth(), baseline);
        canvas.drawPath(this.path, this.underlinePaint);
    }

    public final void setTooltipText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.tooltipText = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageTextWithTooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        String str = "";
        this.tooltipText = str;
        this.tooltipView$delegate = C19350d.m32677b(new CollageTextWithTooltip$tooltipView$2(context));
        this.tooltipAnchorBottom$delegate = C19350d.m32677b(new CollageTextWithTooltip$tooltipAnchorBottom$2(this));
        this.tooltipAnchorTop$delegate = C19350d.m32677b(new CollageTextWithTooltip$tooltipAnchorTop$2(this));
        this.underlinePadding = C13350a.m21014e(2, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) C13350a.m21014e(1, context));
        paint.setColor(C13350a.m21013d(context, R.attr.clg_color_text_primary));
        float e = (float) C13350a.m21014e(2, context);
        paint.setPathEffect(new DashPathEffect(new float[]{e, e}, 0.0f));
        this.underlinePaint = paint;
        this.path = new Path();
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_dp));
        setGravity(16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28657x);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…e.CollageTextWithTooltip)");
            String string = obtainStyledAttributes.getString(0);
            this.tooltipText = string != null ? string : str;
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new C9069r(0, new PopupWindow(getTooltipView(), -2, -2), this));
    }
}
