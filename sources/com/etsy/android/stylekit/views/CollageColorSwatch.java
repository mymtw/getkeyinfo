package com.etsy.android.stylekit.views;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.C6125e;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.R;
import com.etsy.android.feedback.view.C6486a;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p036c5.C4416e;
import p088e1.C6689b;
import p260v0.C8184a;
import p302z4.C8441d;
import p388lb.C13006a;
import p435rb.C13350a;

public final class CollageColorSwatch extends View implements Checkable {
    public static final int $stable = 8;
    private int bottomColor;
    private final int checkedOutlineInset;
    private final float checkedOutlineStrokeWidth;
    private final int checkedShapeInset;
    private int color;
    private final int colorMatchingBackgroundExtraStrokeWidth;
    /* access modifiers changed from: private */
    public Drawable imageDrawable;
    private String imageUrl;
    private boolean isChecked;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final int totalColorCircleSize;
    private final int uncheckedShapeInset;

    /* renamed from: com.etsy.android.stylekit.views.CollageColorSwatch$a */
    public static final class C9028a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ CollageColorSwatch f19899a;

        public C9028a(CollageColorSwatch collageColorSwatch) {
            this.f19899a = collageColorSwatch;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(accessibilityEvent, "event");
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f19899a.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(bVar, "info");
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18865o(this.f19899a.isEnabled());
            bVar.mo18866p(this.f19899a.isChecked());
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageColorSwatch$b */
    public static final class C9029b extends C8441d<CollageColorSwatch, Drawable> {

        /* renamed from: d */
        public final /* synthetic */ CollageColorSwatch f19900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9029b(CollageColorSwatch collageColorSwatch) {
            super(collageColorSwatch);
            this.f19900d = collageColorSwatch;
        }

        /* renamed from: b */
        public final void mo16750b(Object obj) {
            this.f19900d.imageDrawable = (Drawable) obj;
            CollageColorSwatch collageColorSwatch = this.f19900d;
            collageColorSwatch.setBackground(collageColorSwatch.createDrawable());
        }

        /* renamed from: e */
        public final void mo16809e() {
            this.f19900d.imageDrawable = null;
            CollageColorSwatch collageColorSwatch = this.f19900d;
            collageColorSwatch.setBackground(collageColorSwatch.createDrawable());
        }

        /* renamed from: i */
        public final void mo16755i(Drawable drawable) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageColorSwatch(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageColorSwatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageColorSwatch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    public final Drawable createDrawable() {
        Drawable drawable;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.clg_color_actiongroup_circle_selected, typedValue, true);
        int i = typedValue.data;
        Drawable innerCircleDrawable = getInnerCircleDrawable();
        if (this.isChecked) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setAntiAlias(true);
            shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
            shapeDrawable.getPaint().setColor(i);
            shapeDrawable.getPaint().setStrokeWidth(this.checkedOutlineStrokeWidth);
            drawable = new LayerDrawable(new InsetDrawable[]{new InsetDrawable(shapeDrawable, this.checkedOutlineInset), new InsetDrawable(innerCircleDrawable, this.checkedShapeInset)});
        } else {
            drawable = new InsetDrawable(innerCircleDrawable, this.uncheckedShapeInset);
        }
        TypedValue typedValue2 = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.rippleOnSurface, typedValue2, true);
        return new RippleDrawable(ColorStateList.valueOf(typedValue2.data), drawable, (Drawable) null);
    }

    private final Drawable getInnerCircleDrawable() {
        Drawable drawable = this.imageDrawable;
        if (drawable != null) {
            return drawable;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i = this.bottomColor;
        if (i == -1) {
            gradientDrawable.setColor(this.color);
        } else {
            gradientDrawable.setColors(new int[]{this.color, i});
        }
        int i2 = this.color;
        if (i2 == -1) {
            gradientDrawable.setStroke(this.colorMatchingBackgroundExtraStrokeWidth, Color.argb(76, 0, 0, 0));
        } else if (i2 == -16777216) {
            gradientDrawable.setStroke(this.colorMatchingBackgroundExtraStrokeWidth, Color.argb(176, 255, 255, 255));
        }
        return gradientDrawable;
    }

    private final Drawable loadImageDrawable() {
        C5959e<Drawable> J = Glide.with((View) this).load(this.imageUrl).mo16829a(C6128g.m12232J());
        J.mo16817N(new C9029b(this), (C6125e) null, J, C4416e.f9694a);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        paint.setColor(C13350a.m21012c(context, R.color.clg_color_ice));
        return shapeDrawable;
    }

    private final void setOnCheckedListener() {
        setOnClickListener(new C6486a(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnCheckedListener$lambda-1  reason: not valid java name */
    public static final void m34883setOnCheckedListener$lambda1(CollageColorSwatch collageColorSwatch, View view) {
        C19383o.m32797g(collageColorSwatch, "this$0");
        collageColorSwatch.toggle();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = collageColorSwatch.onCheckedChangeListener;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged((CompoundButton) null, collageColorSwatch.isChecked);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return CheckBox.class.getName();
    }

    public final int getBottomColor() {
        return this.bottomColor;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final CompoundButton.OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.totalColorCircleSize;
        setMeasuredDimension(i3, i3);
    }

    public final void setBottomColor(int i) {
        this.bottomColor = i;
        setBackground(createDrawable());
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
        setBackground(createDrawable());
        sendAccessibilityEvent(RecyclerView.C3084b0.FLAG_MOVED);
    }

    public final void setColor(int i) {
        this.color = i;
        this.imageDrawable = null;
        setBackground(createDrawable());
    }

    public final void setDrawableRes(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        this.imageDrawable = C8184a.C8187c.m16466b(context, i);
        setBackground(createDrawable());
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
        setBackground(loadImageDrawable());
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener2) {
        this.onCheckedChangeListener = onCheckedChangeListener2;
    }

    public void toggle() {
        setChecked(!this.isChecked);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageColorSwatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.totalColorCircleSize = C13350a.m21014e(48, context);
        this.uncheckedShapeInset = C13350a.m21014e(5, context);
        this.checkedShapeInset = C13350a.m21014e(4, context);
        this.checkedOutlineInset = C13350a.m21014e(Double.valueOf(1.5d), context);
        this.checkedOutlineStrokeWidth = (float) C13350a.m21014e(2, context);
        this.colorMatchingBackgroundExtraStrokeWidth = C13350a.m21014e(1, context);
        this.color = -16777216;
        this.bottomColor = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28641h, i, 0);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…rSwatch, defStyleAttr, 0)");
        setColor(obtainStyledAttributes.getColor(2, -16777216));
        setBottomColor(obtainStyledAttributes.getColor(0, -1));
        setChecked(obtainStyledAttributes.getBoolean(1, false));
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, R.xml.button_animate_scale));
        setOnCheckedListener();
        obtainStyledAttributes.recycle();
        C2364y.m5201p(this, new C9028a(this));
    }
}
