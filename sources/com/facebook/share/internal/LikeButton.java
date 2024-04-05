package com.facebook.share.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.etsy.android.R;
import com.facebook.FacebookButtonBase;
import p075d.C6614a;

@Deprecated
public class LikeButton extends FacebookButtonBase {
    @Deprecated
    public LikeButton(Context context, boolean z) {
        super(context, (AttributeSet) null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    private void updateForLikeStatus() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(R.string.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(C6614a.m12981a(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        setText(getResources().getString(R.string.com_facebook_like_button_not_liked));
    }

    public void configureButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super.configureButton(context, attributeSet, i, i2);
        updateForLikeStatus();
    }

    public int getDefaultRequestCode() {
        return 0;
    }

    public int getDefaultStyleResource() {
        return R.style.com_facebook_button_like;
    }

    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        updateForLikeStatus();
    }
}
