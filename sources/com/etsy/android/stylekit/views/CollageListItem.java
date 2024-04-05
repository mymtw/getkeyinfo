package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0073e;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p388lb.C13006a;
import p435rb.C13350a;
import p753kq.C19861p;

public final class CollageListItem extends ConstraintLayout {
    public static final int $stable = 8;
    private Actions actionType;
    private final TextView badge;
    private final ImageView categoryImage;
    private final ImageView checkmark;
    private final int defaultMaxBadgeCount;
    private final View draggableGroup;
    private final View draggableTouchTarget;
    private final TextView helperText;
    private final ImageView icon;
    private int maxBadgeCount;
    private final TextView meta;
    private final TextView text;

    public enum Actions {
        ACTION_NORMAL,
        ACTION_DESTRUCTIVE
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageListItem$a */
    public /* synthetic */ class C9038a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19909a;

        static {
            int[] iArr = new int[Actions.values().length];
            iArr[Actions.ACTION_NORMAL.ordinal()] = 1;
            iArr[Actions.ACTION_DESTRUCTIVE.ordinal()] = 2;
            f19909a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageListItem(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setActionColor() {
        if (isEnabled()) {
            int i = C9038a.f19909a[this.actionType.ordinal()];
            if (i == 1) {
                Context context = getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                int d = C13350a.m21013d(context, R.attr.clg_color_text_primary);
                Context context2 = getContext();
                C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                int d2 = C13350a.m21013d(context2, R.attr.clg_color_text_secondary);
                this.text.setTextColor(d);
                this.icon.setColorFilter(d2);
            } else if (i == 2) {
                Context context3 = getContext();
                C19383o.m32796f(context3, ResponseConstants.CONTEXT);
                int d3 = C13350a.m21013d(context3, R.attr.clg_color_text_destructive);
                this.text.setTextColor(d3);
                this.icon.setColorFilter(d3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setDraggableTouchListener$lambda-1  reason: not valid java name */
    public static final boolean m34888setDraggableTouchListener$lambda1(C19861p pVar, View view, MotionEvent motionEvent) {
        C19383o.m32797g(pVar, "$tmp0");
        return ((Boolean) pVar.invoke(view, motionEvent)).booleanValue();
    }

    public final Actions getActionType() {
        return this.actionType;
    }

    public final ImageView getCategoryImageView() {
        return this.categoryImage;
    }

    public final void setActionType(Actions actions) {
        C19383o.m32797g(actions, "value");
        this.actionType = actions;
        setActionColor();
    }

    public final void setBadgeCount(int i) {
        if (i > 0) {
            this.badge.setText(i > this.maxBadgeCount ? C0073e.m208h(new StringBuilder(), this.maxBadgeCount, '+') : String.valueOf(i));
            this.badge.setVisibility(0);
            return;
        }
        this.badge.setText("");
        this.badge.setVisibility(8);
    }

    public final void setCategoryImage(Drawable drawable) {
        if (drawable != null) {
            this.categoryImage.setVisibility(0);
            this.categoryImage.setImageDrawable(drawable);
            return;
        }
        this.categoryImage.setVisibility(8);
    }

    public final void setDragHandleVisible(boolean z) {
        if (z) {
            this.draggableGroup.setVisibility(0);
        } else {
            this.draggableGroup.setVisibility(8);
        }
    }

    public final void setDraggableTouchListener(C19861p<? super View, ? super MotionEvent, Boolean> pVar) {
        C19383o.m32797g(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.draggableTouchTarget.setOnTouchListener(new C9057h(pVar, 0));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.text.setEnabled(z);
        if (z) {
            ImageView imageView = this.icon;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            imageView.setImageTintList(ColorStateList.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_secondary)));
        } else {
            ImageView imageView2 = this.icon;
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            imageView2.setImageTintList(ColorStateList.valueOf(C13350a.m21013d(context2, R.attr.clg_color_text_tertiary)));
            TextView textView = this.text;
            Context context3 = getContext();
            C19383o.m32796f(context3, ResponseConstants.CONTEXT);
            textView.setTextColor(C13350a.m21013d(context3, R.attr.clg_color_text_primary));
            ImageView imageView3 = this.icon;
            Context context4 = getContext();
            C19383o.m32796f(context4, ResponseConstants.CONTEXT);
            imageView3.setColorFilter(C13350a.m21013d(context4, R.attr.clg_color_text_tertiary));
        }
        setActionColor();
    }

    public final void setHelperText(String str) {
        this.helperText.setText(str);
        CharSequence text2 = this.helperText.getText();
        if (text2 == null || C19457k.m33020X0(text2)) {
            this.helperText.setVisibility(8);
        } else {
            this.helperText.setVisibility(0);
        }
    }

    public final void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.icon.setVisibility(0);
            this.icon.setImageDrawable(drawable);
            return;
        }
        this.icon.setVisibility(8);
    }

    public final void setIconRes(int i) {
        setIcon(getContext().getDrawable(i));
    }

    public final void setMaxBadgeCount(int i) {
        this.maxBadgeCount = i;
    }

    public final void setMetaText(String str) {
        this.meta.setText(str);
        CharSequence text2 = this.meta.getText();
        if (text2 == null || C19457k.m33020X0(text2)) {
            this.meta.setVisibility(8);
        } else {
            this.meta.setVisibility(0);
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            this.checkmark.setVisibility(0);
        } else {
            this.checkmark.setVisibility(8);
        }
    }

    public final void setText(String str) {
        this.text.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.defaultMaxBadgeCount = 99;
        this.maxBadgeCount = 99;
        Actions actions = Actions.ACTION_NORMAL;
        this.actionType = actions;
        LayoutInflater.from(context).inflate(R.layout.clg_list_item, this, true);
        View findViewById = findViewById(R.id.clg_line_item_text);
        C19383o.m32796f(findViewById, "findViewById(R.id.clg_line_item_text)");
        this.text = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.clg_line_item_badge);
        C19383o.m32796f(findViewById2, "findViewById(R.id.clg_line_item_badge)");
        this.badge = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_line_item_icon);
        C19383o.m32796f(findViewById3, "findViewById(R.id.clg_line_item_icon)");
        this.icon = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.clg_line_item_meta);
        C19383o.m32796f(findViewById4, "findViewById(R.id.clg_line_item_meta)");
        this.meta = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.clg_line_item_draggable_touch_target);
        C19383o.m32796f(findViewById5, "findViewById(R.id.clg_li…m_draggable_touch_target)");
        this.draggableTouchTarget = findViewById5;
        View findViewById6 = findViewById(R.id.clg_line_item_draggable_group);
        C19383o.m32796f(findViewById6, "findViewById(R.id.clg_line_item_draggable_group)");
        this.draggableGroup = findViewById6;
        View findViewById7 = findViewById(R.id.clg_line_item_checkmark);
        C19383o.m32796f(findViewById7, "findViewById(R.id.clg_line_item_checkmark)");
        this.checkmark = (ImageView) findViewById7;
        View findViewById8 = findViewById(R.id.clg_line_item_category_image);
        C19383o.m32796f(findViewById8, "findViewById(R.id.clg_line_item_category_image)");
        this.categoryImage = (ImageView) findViewById8;
        View findViewById9 = findViewById(R.id.clg_line_item_helper_text);
        C19383o.m32796f(findViewById9, "findViewById(R.id.clg_line_item_helper_text)");
        this.helperText = (TextView) findViewById9;
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_dp));
        setBackgroundResource(R.drawable.clg_touch_feedback);
        setFocusable(true);
        setClickable(true);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C13006a.f28647n, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…le.CollageListItem, 0, 0)");
            String string = obtainStyledAttributes.getString(10);
            int integer = obtainStyledAttributes.getInteger(1, 0);
            int integer2 = obtainStyledAttributes.getInteger(7, 99);
            String string2 = obtainStyledAttributes.getString(8);
            Drawable drawable = obtainStyledAttributes.getDrawable(6);
            boolean z = obtainStyledAttributes.getBoolean(3, false);
            boolean z2 = obtainStyledAttributes.getBoolean(9, false);
            boolean z3 = obtainStyledAttributes.getBoolean(4, true);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
            String string3 = obtainStyledAttributes.getString(5);
            int i2 = obtainStyledAttributes.getInt(0, -1);
            if (i2 >= 0) {
                Actions[] values = Actions.values();
                C19383o.m32797g(values, "<this>");
                Actions actions2 = (i2 < 0 || i2 > values.length + -1) ? null : values[i2];
                if (actions2 != null) {
                    actions = actions2;
                }
            }
            setText(string);
            setMaxBadgeCount(integer2);
            setBadgeCount(integer);
            setMetaText(string2);
            setIcon(drawable);
            setActionType(actions);
            setDragHandleVisible(z);
            setSelected(z2);
            setEnabled(z3);
            setCategoryImage(drawable2);
            setHelperText(string3);
            obtainStyledAttributes.recycle();
        }
    }

    public final void setText(int i) {
        this.text.setText(i);
    }

    public final void setHelperText(int i) {
        this.helperText.setText(i);
        CharSequence text2 = this.helperText.getText();
        if (text2 == null || C19457k.m33020X0(text2)) {
            this.helperText.setVisibility(8);
        } else {
            this.helperText.setVisibility(0);
        }
    }

    public final void setMetaText(int i) {
        this.meta.setText(i);
        CharSequence text2 = this.meta.getText();
        if (text2 == null || C19457k.m33020X0(text2)) {
            this.meta.setVisibility(8);
        } else {
            this.meta.setVisibility(0);
        }
    }
}
