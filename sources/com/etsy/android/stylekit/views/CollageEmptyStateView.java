package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p388lb.C13006a;

public final class CollageEmptyStateView extends NestedScrollView {
    public static final int $stable = 8;
    private final TextView bodyTextView;
    private final ConstraintLayout constraintLayout;
    private final ImageView iconImageView;
    private final Button primaryButton;
    private final Button secondaryButton;
    private final Button tertiaryButton;
    private final TextView titleTextView;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageEmptyStateView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageEmptyStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageEmptyStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setBodyText(int i) {
        setBodyText(getContext().getString(i));
    }

    public final void setIconDrawable(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setIconDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public final void setPrimaryButtonOnClickListener(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.primaryButton.setOnClickListener(onClickListener);
    }

    public final void setPrimaryButtonText(int i) {
        setPrimaryButtonText(getContext().getString(i));
    }

    public final void setSecondaryButtonOnClickListener(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.secondaryButton.setOnClickListener(onClickListener);
    }

    public final void setSecondaryButtonText(int i) {
        setSecondaryButtonText(getContext().getString(i));
    }

    public final void setTertiaryButtonOnClickListener(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.tertiaryButton.setOnClickListener(onClickListener);
    }

    public final void setTertiaryButtonText(int i) {
        setTertiaryButtonText(getContext().getString(i));
    }

    public final void setTitleText(int i) {
        setTitleText(getContext().getString(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageEmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        View.inflate(context, R.layout.clg_empty_state_view, this);
        setFillViewport(true);
        View findViewById = findViewById(R.id.empty_view_constraint_layout);
        C19383o.m32796f(findViewById, "findViewById(R.id.empty_view_constraint_layout)");
        this.constraintLayout = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.empty_view_icon_image_view);
        C19383o.m32796f(findViewById2, "findViewById(R.id.empty_view_icon_image_view)");
        this.iconImageView = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.empty_view_title_text_view);
        C19383o.m32796f(findViewById3, "findViewById(R.id.empty_view_title_text_view)");
        this.titleTextView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.empty_view_body_text_view);
        C19383o.m32796f(findViewById4, "findViewById(R.id.empty_view_body_text_view)");
        this.bodyTextView = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.empty_view_primary_button);
        C19383o.m32796f(findViewById5, "findViewById(R.id.empty_view_primary_button)");
        this.primaryButton = (Button) findViewById5;
        View findViewById6 = findViewById(R.id.empty_view_secondary_button);
        C19383o.m32796f(findViewById6, "findViewById(R.id.empty_view_secondary_button)");
        this.secondaryButton = (Button) findViewById6;
        View findViewById7 = findViewById(R.id.empty_view_tertiary_button);
        C19383o.m32796f(findViewById7, "findViewById(R.id.empty_view_tertiary_button)");
        this.tertiaryButton = (Button) findViewById7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28645l, 0, 0);
            setIconDrawable(obtainStyledAttributes.getDrawable(1));
            setTitleText(obtainStyledAttributes.getString(5));
            setBodyText(obtainStyledAttributes.getString(0));
            setPrimaryButtonText(obtainStyledAttributes.getString(2));
            setSecondaryButtonText(obtainStyledAttributes.getString(3));
            setTertiaryButtonText(obtainStyledAttributes.getString(4));
            obtainStyledAttributes.recycle();
        }
    }

    public final void setBodyText(String str) {
        this.bodyTextView.setText(str);
        TextView textView = this.bodyTextView;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setPrimaryButtonText(String str) {
        this.primaryButton.setText(str);
        Button button = this.primaryButton;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public final void setSecondaryButtonText(String str) {
        this.secondaryButton.setText(str);
        if (str == null || str.length() == 0) {
            this.secondaryButton.setVisibility(8);
            return;
        }
        this.secondaryButton.setVisibility(0);
        this.tertiaryButton.setVisibility(8);
    }

    public final void setTertiaryButtonText(String str) {
        this.tertiaryButton.setText(str);
        if (str == null || str.length() == 0) {
            this.tertiaryButton.setVisibility(8);
            return;
        }
        this.tertiaryButton.setVisibility(0);
        this.secondaryButton.setVisibility(8);
    }

    public final void setTitleText(String str) {
        this.titleTextView.setText(str);
        TextView textView = this.titleTextView;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setIconDrawable(Drawable drawable) {
        this.iconImageView.setImageDrawable(drawable);
        this.iconImageView.setVisibility(drawable == null ? 8 : 0);
    }
}
