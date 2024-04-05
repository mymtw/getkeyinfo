package com.etsy.android.stylekit.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;

public final class CollageImageUpload extends MaterialCardView {
    public static final int $stable = 8;
    private final ImageView imageView;
    private final LoadingIndicatorView loadingView;
    private final Button removeImageButton;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageImageUpload(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageImageUpload(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageImageUpload(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.imageView.setImageBitmap(bitmap);
    }

    public final void setImageResource(int i) {
        this.imageView.setImageResource(i);
    }

    public final void setLoading(boolean z) {
        this.loadingView.setVisibility(z ? 0 : 8);
    }

    public final void setRemoveButtonOnClick(View.OnClickListener onClickListener) {
        C19383o.m32797g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.removeImageButton.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageImageUpload(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.clg_image_upload, this, true);
        setRadius(context.getResources().getDimension(R.dimen.clg_border_radius));
        setElevation(0.0f);
        setStrokeColor(C13350a.m21013d(context, R.attr.clg_color_image_upload_border));
        setStrokeWidth(C13350a.m21014e(1, context));
        View findViewById = findViewById(R.id.clg_image_upload);
        C19383o.m32796f(findViewById, "findViewById<ImageView>(R.id.clg_image_upload)");
        this.imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.clg_image_upload_loading_indicator);
        C19383o.m32796f(findViewById2, "findViewById<LoadingIndi…upload_loading_indicator)");
        this.loadingView = (LoadingIndicatorView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_image_upload_remove_button);
        C19383o.m32796f(findViewById3, "findViewById<Button>(R.i…age_upload_remove_button)");
        this.removeImageButton = (Button) findViewById3;
    }
}
