package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p260v0.C8184a;

public class EmptyMessageView extends LinearLayout {
    private static final int MISSING_IMAGE_ID = 0;
    public ImageView mImageView;
    public Button mLinkButton;
    public TextView mTextSubtitle;
    public TextView mTextTitle;

    public EmptyMessageView(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        View.inflate(context, R.layout.list_item_card_view_message, this);
        this.mTextTitle = (TextView) findViewById(R.id.txt_title);
        this.mTextSubtitle = (TextView) findViewById(R.id.txt_subtitle);
        this.mImageView = (ImageView) findViewById(R.id.image);
        this.mLinkButton = (Button) findViewById(R.id.btn_link);
    }

    public void bind(MessageCard messageCard) {
        if (getDrawableForImageType(messageCard.getImageName()) != 0) {
            setImage(getDrawableForImageType(messageCard.getImageName()));
        }
        setTitle(messageCard.getTitle());
        setSubtitle(messageCard.getSubtitle());
        this.mLinkButton.setVisibility(8);
        if (messageCard.isTryAgain()) {
            setTryAgain();
        } else {
            setButtonText(messageCard.getLinkTitle());
        }
    }

    public int getDrawableForImageType(String str) {
        return "empty_recommmendations".equals(str) ? R.drawable.empty_recommendations : "empty_heart".equals(str) ? R.drawable.empty_favorites : "face_chair".equals(str) ? R.drawable.empty_activity : "empty_basket".equals(str) ? R.drawable.empty_cart_large : getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    public void recycle() {
        this.mImageView.setImageDrawable((Drawable) null);
    }

    public void setButtonClickListener(TrackingOnClickListener trackingOnClickListener) {
        this.mLinkButton.setOnClickListener(trackingOnClickListener);
        this.mLinkButton.setVisibility(trackingOnClickListener == null ? 8 : 0);
    }

    public void setButtonContentDescription(String str) {
        this.mLinkButton.setContentDescription(str);
    }

    public void setButtonText(int i) {
        setButtonText(getResources().getString(i));
    }

    public void setImage(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        if (C8184a.C8187c.m16466b(context, i) != null) {
            this.mImageView.setVisibility(0);
            this.mImageView.setImageResource(i);
            return;
        }
        this.mImageView.setVisibility(8);
    }

    public void setSubtitle(int i) {
        setSubtitle(getResources().getString(i));
    }

    public void setTitle(int i) {
        setTitle(getResources().getString(i));
    }

    public void setTryAgain() {
        this.mLinkButton.setText(R.string.try_again);
    }

    public void setButtonText(String str) {
        this.mLinkButton.setText(str);
    }

    public void setSubtitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mTextSubtitle.setVisibility(8);
            return;
        }
        this.mTextSubtitle.setVisibility(0);
        this.mTextSubtitle.setText(str);
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mTextTitle.setVisibility(8);
            return;
        }
        this.mTextTitle.setVisibility(0);
        this.mTextTitle.setText(str);
    }

    public EmptyMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public EmptyMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    public EmptyMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }
}
