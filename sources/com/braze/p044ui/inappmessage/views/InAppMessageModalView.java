package com.braze.p044ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.p043ui.C4940R;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.C5485c;
import com.braze.models.inappmessage.C5492j;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageModalView */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private static final String TAG = BrazeLogger.m11287i(InAppMessageModalView.class);
    private C5492j mInAppMessage;
    private InAppMessageImageView mInAppMessageImageView;

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resetMessageMargins$0(View view) {
        BrazeLogger.m11285g(TAG, "Passing scrollView click event to message clickable view.");
        getMessageClickableView().performClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resizeGraphicFrameIfAppropriate$1(int i, int i2, int i3, double d) {
        double min = (double) Math.min(getMeasuredWidth() - i, i2);
        double min2 = (double) Math.min(getMeasuredHeight() - i, i3);
        View findViewById = findViewById(C4940R.C4942id.com_braze_inappmessage_modal_graphic_bound);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        if (d >= min / min2) {
            layoutParams.width = (int) min;
            layoutParams.height = (int) (min / d);
        } else {
            layoutParams.width = (int) (d * min2);
            layoutParams.height = (int) min2;
        }
        findViewById.setLayoutParams(layoutParams);
    }

    private void resizeGraphicFrameIfAppropriate(Context context, C5492j jVar) {
        if (jVar != null && jVar.f11847z != null && jVar.f11813H.equals(ImageStyle.GRAPHIC)) {
            Resources resources = context.getResources();
            post(new C5700f(this, resources.getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_modal_margin), resources.getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_modal_max_width), resources.getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_modal_max_height), ((double) jVar.f11847z.getWidth()) / ((double) jVar.f11847z.getHeight())));
        }
    }

    private void setInAppMessageImageViewAttributes(Context context, C5485c cVar, C5695a aVar) {
        float a = (float) ViewUtils.m11475a(context, 9.0d);
        if (cVar.mo16015D().equals(ImageStyle.GRAPHIC)) {
            aVar.setCornersRadiusPx(a);
        } else {
            aVar.setCornersRadiiPx(a, a, 0.0f, 0.0f);
        }
        aVar.setInAppMessageImageCropType(cVar.mo15969a0());
    }

    public void applyInAppMessageParameters(Context context, C5492j jVar) {
        this.mInAppMessage = jVar;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(C4940R.C4942id.com_braze_inappmessage_modal_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        setInAppMessageImageViewAttributes(context, jVar, inAppMessageImageView);
        resizeGraphicFrameIfAppropriate(context, jVar);
    }

    public View getFrameView() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_modal_frame);
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(C4940R.C4942id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(C4940R.C4942id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(C4940R.C4942id.com_braze_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(C4940R.C4942id.com_braze_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(C4940R.C4942id.com_braze_inappmessage_modal_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    public View getMessageClickableView() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_modal);
    }

    public View getMessageCloseButtonView() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_modal_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_modal_header_text);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_modal_icon);
    }

    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_modal_message);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        resizeGraphicFrameIfAppropriate(getContext(), this.mInAppMessage);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C4940R.C4942id.com_braze_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        findViewById(C4940R.C4942id.com_braze_inappmessage_modal_text_layout).setOnClickListener(new C5701g(this, 0));
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.m11465e(i, findViewById(C4940R.C4942id.com_braze_inappmessage_modal));
    }

    public Drawable getMessageBackgroundObject() {
        return getMessageClickableView().getBackground();
    }
}
