package com.braze.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.C2348w0;
import com.appboy.p043ui.C4940R;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.C5483a;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageSlideupView */
public class InAppMessageSlideupView extends InAppMessageBaseView {
    private static final String TAG = BrazeLogger.m11287i(InAppMessageSlideupView.class);
    private InAppMessageImageView mInAppMessageImageView;

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void applyInAppMessageParameters(C5483a aVar) {
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        inAppMessageImageView.setInAppMessageImageCropType(aVar.mo15969a0());
    }

    public void applyWindowInsets(C2348w0 w0Var) {
        super.applyWindowInsets(w0Var);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.m11285g(TAG, "Close button view is null or not of the expected class. Not applying window insets.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.setMargins(ViewUtils.m11477c(w0Var) + marginLayoutParams.leftMargin, ViewUtils.m11479e(w0Var) + marginLayoutParams.topMargin, ViewUtils.m11478d(w0Var) + marginLayoutParams.rightMargin, ViewUtils.m11476b(w0Var) + marginLayoutParams.bottomMargin);
    }

    public View getMessageChevronView() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_chevron);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_icon);
    }

    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_message);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        boolean z2 = getMessageIconView() == null || getMessageIconView().getText() == null || getMessageIconView().getText().length() == 0;
        if (!z && z2) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_image_layout);
            if (relativeLayout != null) {
                ViewUtils.m11483i(relativeLayout);
            }
            TextView textView = (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_message);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
            textView.setLayoutParams(layoutParams);
        }
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.m11465e(i, getMessageBackgroundObject());
        } else {
            super.setMessageBackgroundColor(i);
        }
    }

    public void setMessageChevron(int i, ClickAction clickAction) {
        if (clickAction == ClickAction.NONE) {
            getMessageChevronView().setVisibility(8);
        } else {
            InAppMessageViewUtils.m11465e(i, getMessageChevronView());
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_slideup_container);
    }
}
