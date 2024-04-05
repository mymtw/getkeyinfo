package com.braze.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.C2348w0;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.C5487e;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.io.File;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageBaseView */
public abstract class InAppMessageBaseView extends RelativeLayout implements C5697c {
    private static final String TAG = BrazeLogger.m11287i(InAppMessageBaseView.class);
    public boolean mHasAppliedWindowInsets = false;

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static String getAppropriateImageUrl(C5487e eVar) {
        String A = eVar.mo16031A();
        if (!StringUtils.m11343d(A)) {
            if (new File(A).exists()) {
                return A;
            }
            String str = TAG;
            BrazeLogger.m11285g(str, "Local bitmap file does not exist. Using remote url instead. Local path: " + A);
        }
        return eVar.mo16032v();
    }

    public void applyWindowInsets(C2348w0 w0Var) {
        this.mHasAppliedWindowInsets = true;
    }

    public abstract Object getMessageBackgroundObject();

    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public boolean hasAppliedWindowInsets() {
        return this.mHasAppliedWindowInsets;
    }

    public void resetMessageMargins(boolean z) {
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!z) {
                ViewUtils.m11483i(messageImageView);
            } else {
                ViewUtils.m11483i(getMessageIconView());
            }
        }
        if (getMessageIconView() != null && getMessageIconView().getText() != null && StringUtils.m11343d(getMessageIconView().getText().toString())) {
            ViewUtils.m11483i(getMessageIconView());
        }
    }

    public void setMessage(String str) {
        getMessageTextView().setText(str);
    }

    public void setMessageBackgroundColor(int i) {
        View view = (View) getMessageBackgroundObject();
        C19383o.m32797g(view, "view");
        view.setBackgroundColor(i);
    }

    public void setMessageIcon(String str, int i, int i2) {
        if (getMessageIconView() != null) {
            InAppMessageViewUtils.m11463c(getContext(), str, i, i2, getMessageIconView());
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        ImageView messageImageView = getMessageImageView();
        C19383o.m32797g(messageImageView, "imageView");
        if (bitmap != null) {
            messageImageView.setImageBitmap(bitmap);
        }
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        InAppMessageViewUtils.m11464d(getMessageTextView(), textAlign);
    }

    public void setMessageTextColor(int i) {
        TextView messageTextView = getMessageTextView();
        C19383o.m32797g(messageTextView, "textView");
        messageTextView.setTextColor(i);
    }
}
