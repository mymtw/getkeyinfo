package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.C0114h;
import com.etsy.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p260v0.C8184a;

public class AttachmentThumbnailsView extends LinearLayout {
    public static final int maxImages = 3;
    public int dividerPadding = 0;
    public int itemHeight = 0;
    public int itemWidth = 0;
    public int loadingColor = 0;
    private List<C11915a> mImageViews;

    public enum AttachmentType {
        UNKNOWN,
        FILE,
        URL
    }

    /* renamed from: com.etsy.android.uikit.view.AttachmentThumbnailsView$a */
    public static class C11915a {

        /* renamed from: a */
        public ImageView f26474a;

        /* renamed from: b */
        public String f26475b = null;

        /* renamed from: c */
        public AttachmentType f26476c = AttachmentType.UNKNOWN;

        public C11915a(ImageView imageView) {
            this.f26474a = imageView;
        }
    }

    public AttachmentThumbnailsView(Context context) {
        super(context);
        init(context);
    }

    public boolean addImage(File file) {
        return addImage(file, (View.OnClickListener) null);
    }

    public void clear() {
        for (C11915a next : this.mImageViews) {
            next.getClass();
            next.f26476c = AttachmentType.UNKNOWN;
            next.f26475b = "";
            next.f26474a.setImageDrawable((Drawable) null);
            next.f26474a.setVisibility(8);
        }
    }

    public ImageView createImageView(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        Context context2 = getContext();
        int i = typedValue.resourceId;
        Object obj = C8184a.f17966a;
        imageView.setForeground(C8184a.C8187c.m16466b(context2, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.itemWidth, this.itemHeight);
        layoutParams.rightMargin = this.dividerPadding;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public C11915a getAvailableSlot() {
        boolean z;
        for (C11915a next : this.mImageViews) {
            if (next.f26476c == AttachmentType.UNKNOWN || TextUtils.isEmpty(next.f26475b)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return next;
            }
        }
        return null;
    }

    public void init(Context context) {
        this.mImageViews = new ArrayList(3);
        this.dividerPadding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium_large);
        this.loadingColor = context.getResources().getColor(R.color.lighter_grey);
        int dimension = (int) context.getResources().getDimension(R.dimen.attachment_thumbnail_size);
        this.itemWidth = dimension;
        this.itemHeight = dimension;
        for (int i = 0; i < 3; i++) {
            ImageView createImageView = createImageView(context);
            this.mImageViews.add(i, new C11915a(createImageView));
            addView(createImageView);
        }
    }

    public void loadImage(C11915a aVar) {
        if (aVar.f26476c != AttachmentType.UNKNOWN && !TextUtils.isEmpty(aVar.f26475b)) {
            aVar.f26474a.setVisibility(0);
            C0114h.m270B0(aVar.f26474a.getContext()).load(aVar.f26475b).mo17160t(new ColorDrawable(this.loadingColor)).mo17151i().mo16816M(aVar.f26474a);
            return;
        }
        aVar.f26474a.setVisibility(8);
    }

    public boolean addImage(File file, View.OnClickListener onClickListener) {
        C11915a availableSlot = getAvailableSlot();
        StringBuilder h = C0072d.m201h("file://");
        h.append(file.getAbsolutePath());
        String sb = h.toString();
        if (availableSlot == null || !URLUtil.isValidUrl(sb)) {
            return false;
        }
        availableSlot.f26475b = sb;
        availableSlot.f26476c = AttachmentType.FILE;
        availableSlot.f26474a.setOnClickListener(onClickListener);
        loadImage(availableSlot);
        return true;
    }

    public AttachmentThumbnailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AttachmentThumbnailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public boolean addImage(String str) {
        return addImage(str, (View.OnClickListener) null);
    }

    public boolean addImage(String str, View.OnClickListener onClickListener) {
        return addImage(str, onClickListener, 1);
    }

    public boolean addImage(String str, View.OnClickListener onClickListener, int i) {
        C11915a availableSlot = getAvailableSlot();
        if (availableSlot == null || !URLUtil.isValidUrl(str)) {
            return false;
        }
        availableSlot.f26475b = str;
        availableSlot.f26476c = AttachmentType.URL;
        availableSlot.f26474a.setOnClickListener(onClickListener);
        ImageView imageView = availableSlot.f26474a;
        imageView.setContentDescription(imageView.getResources().getString(R.string.attached_image_button, new Object[]{Integer.valueOf(i)}));
        loadImage(availableSlot);
        return true;
    }
}
