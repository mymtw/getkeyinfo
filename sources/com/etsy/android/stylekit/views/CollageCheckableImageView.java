package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p088e1.C6689b;
import p388lb.C13006a;

public final class CollageCheckableImageView extends AppCompatImageView implements Checkable {
    public static final int $stable = 8;
    public static final C9024b Companion = new C9024b();
    public static final int DRAWABLE_TYPE_CHECKBOX = 1;
    public static final int DRAWABLE_TYPE_RADIO = 0;
    private final int[] checkedState;
    private int drawableType;
    private boolean isChecked;
    private boolean isSmall;

    /* renamed from: com.etsy.android.stylekit.views.CollageCheckableImageView$a */
    public static final class C9023a extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ CollageCheckableImageView f19897a;

        public C9023a(CollageCheckableImageView collageCheckableImageView) {
            this.f19897a = collageCheckableImageView;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(accessibilityEvent, "event");
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(this.f19897a.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(bVar, "info");
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18865o(this.f19897a.isEnabled());
            bVar.mo18866p(this.f19897a.isChecked());
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollageCheckableImageView$b */
    public static final class C9024b {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageCheckableImageView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageCheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageCheckableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setDrawable(int i, boolean z) {
        if (i == 0) {
            setImageResource(z ? R.drawable.clg_radio_button_selector_small : R.drawable.clg_radio_button_selector);
        } else if (i == 1) {
            setImageResource(z ? R.drawable.clg_checkbox_selector_small : R.drawable.clg_checkbox_selector);
        }
    }

    private final void setDrawableType(int i) {
        setDrawable(this.drawableType, this.isSmall);
        this.drawableType = i;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isSmall() {
        return this.isSmall;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C19383o.m32796f(onCreateDrawableState, "super.onCreateDrawableState(extraSpace + 1)");
        if (this.isChecked) {
            View.mergeDrawableStates(onCreateDrawableState, this.checkedState);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.isChecked != z) {
            this.isChecked = z;
            refreshDrawableState();
        }
    }

    public final void setSmall(boolean z) {
        setDrawable(this.drawableType, z);
    }

    public void toggle() {
        setChecked(!this.isChecked);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageCheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.checkedState = new int[]{16842912};
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28639f, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…CheckableImageView, 0, 0)");
            setDrawableType(obtainStyledAttributes.getInt(0, 0));
            setSmall(obtainStyledAttributes.getBoolean(1, false));
            obtainStyledAttributes.recycle();
        }
        C2364y.m5201p(this, new C9023a(this));
    }
}
