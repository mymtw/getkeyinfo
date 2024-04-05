package com.etsy.android.stylekit.views;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.braze.p044ui.inappmessage.factories.C5651e;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p280x0.C8292f;
import p388lb.C13006a;
import p435rb.C13350a;

public final class CollageActionGroupItem extends AppCompatCheckBox {
    public static final int $stable = 8;
    private final float circleOffset;
    private final Paint linePaint;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageActionGroupItem(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageActionGroupItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageActionGroupItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.checkboxStyle : i);
    }

    private final void setOnCheckedListener() {
        setOnClickListener(new C5651e(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnCheckedListener$lambda-0  reason: not valid java name */
    public static final void m34881setOnCheckedListener$lambda0(CollageActionGroupItem collageActionGroupItem, View view) {
        C19383o.m32797g(collageActionGroupItem, "this$0");
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = collageActionGroupItem.onCheckedChangeListener;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged((CompoundButton) null, collageActionGroupItem.isChecked());
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isEnabled() && canvas != null) {
            float f = this.circleOffset;
            canvas.drawLine(f, f, ((float) getWidth()) - this.circleOffset, ((float) getHeight()) - this.circleOffset, this.linePaint);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener2) {
        this.onCheckedChangeListener = onCheckedChangeListener2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageActionGroupItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28637d, i, 0);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…\n            0,\n        )");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        int i3 = z ? R.drawable.clg_actiongroup_bg_small : R.drawable.clg_actiongroup_bg;
        Object obj = C8184a.f17966a;
        setBackground(C8184a.C8187c.m16466b(context, i3));
        setButtonDrawable((Drawable) null);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, R.xml.button_animate_scale));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_text_primary, typedValue, true);
        setTextColor(C8184a.m16459b(context, typedValue.resourceId));
        if (!isInEditMode()) {
            setTypeface(C8292f.m16582a(getContext(), R.font.clg_typeface_bold));
        } else {
            setTypeface((Typeface) null, 1);
        }
        setEllipsize(TextUtils.TruncateAt.MIDDLE);
        setMaxLines(1);
        setAllCaps(false);
        setGravity(17);
        setIncludeFontPadding(false);
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        setMinWidth(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        setTextSize(0, (float) getResources().getDimensionPixelSize(z ? R.dimen.button_text_size_small : R.dimen.button_text_size));
        if (z) {
            i2 = C13350a.m21015f(12, context);
        } else {
            i2 = C13350a.m21015f(20, context);
        }
        setPaddingRelative(i2, getPaddingTop(), i2, getPaddingBottom());
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.clg_color_actiongroup_outline, typedValue2, true);
        int i4 = typedValue2.data;
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setStrokeWidth((float) C13350a.m21014e(2, context));
        this.circleOffset = (float) C13350a.m21015f(Integer.valueOf(z ? 10 : 8), context);
        setOnCheckedListener();
    }
}
