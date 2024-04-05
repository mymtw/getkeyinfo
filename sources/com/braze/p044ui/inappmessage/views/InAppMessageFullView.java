package com.braze.p044ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C2348w0;
import com.appboy.p043ui.C4940R;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.C5485c;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageFullView */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView {
    private static final String TAG = BrazeLogger.m11287i(InAppMessageFullView.class);
    private InAppMessageImageView mInAppMessageImageView;
    private boolean mIsGraphic;

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void applyDisplayCutoutMarginsToCloseButton(C2348w0 w0Var, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.m11285g(TAG, "Close button layout params are null or not of the expected class. Not applying window insets.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(ViewUtils.m11477c(w0Var) + marginLayoutParams.leftMargin, ViewUtils.m11479e(w0Var) + marginLayoutParams.topMargin, ViewUtils.m11478d(w0Var) + marginLayoutParams.rightMargin, ViewUtils.m11476b(w0Var) + marginLayoutParams.bottomMargin);
    }

    private void applyDisplayCutoutMarginsToContentArea(C2348w0 w0Var, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.m11285g(TAG, "Content area layout params are null or not of the expected class. Not applying window insets.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(ViewUtils.m11477c(w0Var) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.m11478d(w0Var) + marginLayoutParams.rightMargin, ViewUtils.m11476b(w0Var) + marginLayoutParams.bottomMargin);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resetMessageMargins$0(View view) {
        BrazeLogger.m11285g(TAG, "Passing scrollView click event to message clickable view.");
        getMessageClickableView().performClick();
    }

    private void setInAppMessageImageViewAttributes(Activity activity, C5485c cVar, C5695a aVar) {
        aVar.setInAppMessageImageCropType(cVar.mo15969a0());
        if (ViewUtils.m11482h(activity)) {
            float a = (float) ViewUtils.m11475a(activity, 9.0d);
            if (cVar.mo16015D().equals(ImageStyle.GRAPHIC)) {
                aVar.setCornersRadiusPx(a);
            } else {
                aVar.setCornersRadiiPx(a, a, 0.0f, 0.0f);
            }
        } else {
            aVar.setCornersRadiusPx(0.0f);
        }
    }

    public void applyWindowInsets(C2348w0 w0Var) {
        super.applyWindowInsets(w0Var);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(w0Var, messageCloseButtonView);
        }
        if (this.mIsGraphic) {
            View findViewById = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById == null || findViewById.getVisibility() != 0) {
                View findViewById2 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_layout_dual);
                if (findViewById2 != null && findViewById2.getVisibility() == 0) {
                    applyDisplayCutoutMarginsToContentArea(w0Var, findViewById2);
                    return;
                }
                return;
            }
            applyDisplayCutoutMarginsToContentArea(w0Var, findViewById);
            return;
        }
        View findViewById3 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_text_and_button_content_parent);
        if (findViewById3 != null) {
            applyDisplayCutoutMarginsToContentArea(w0Var, findViewById3);
        }
    }

    public void createAppropriateViews(Activity activity, C5485c cVar, boolean z) {
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(C4940R.C4942id.com_braze_inappmessage_full_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        setInAppMessageImageViewAttributes(activity, cVar, inAppMessageImageView);
        this.mIsGraphic = z;
    }

    public View getFrameView() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_button_dual_two);
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
        return findViewById(C4940R.C4942id.com_braze_inappmessage_full);
    }

    public View getMessageCloseButtonView() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_full_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_full_header_text);
    }

    public TextView getMessageIconView() {
        return null;
    }

    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(C4940R.C4942id.com_braze_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        findViewById(C4940R.C4942id.com_braze_inappmessage_full_text_layout).setOnClickListener(new C5698d(this, 0));
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.m11465e(i, getMessageBackgroundObject());
        } else if (this.mIsGraphic) {
            super.setMessageBackgroundColor(i);
        } else {
            View findViewById = findViewById(C4940R.C4942id.com_braze_inappmessage_full_all_content_parent);
            C19383o.m32797g(findViewById, "view");
            findViewById.setBackgroundColor(i);
            View findViewById2 = findViewById(C4940R.C4942id.com_braze_inappmessage_full_text_and_button_content_parent);
            C19383o.m32797g(findViewById2, "view");
            findViewById2.setBackgroundColor(i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(C4940R.C4942id.com_braze_inappmessage_full);
    }
}
