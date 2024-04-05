package com.cardinalcommerce.shared.p065cs.userinterfaces.uielements;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6323c;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.uielements.CCAImageView */
public class CCAImageView extends ImageView {
    public CCAImageView(Context context) {
        super(context);
    }

    public CCAImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CCAImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CCAImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public Drawable getCCADrawable() {
        return super.getDrawable();
    }

    public Drawable getDrawable() {
        return null;
    }

    public void setCCAImageBitmap(Bitmap bitmap) {
        setCCAImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    public void setCCAImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void setCCAImageIcon(Icon icon) {
        super.setImageIcon(icon);
    }

    public void setCCAImageResource(int i) {
        super.setImageResource(i);
    }

    public void setCCAImageUri(Uri uri) {
        super.setImageURI(uri);
    }

    public void setCCAOnClickListener(C6323c.C6324a aVar) {
        super.setOnClickListener(aVar);
    }

    public void setCCAOnFocusChangeListener(C6323c.C6325b bVar) {
        super.setOnFocusChangeListener(bVar);
    }

    public void setCCAOnTouchListener(C6323c.C6327d dVar) {
        super.setOnTouchListener(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
    }

    public void setImageDrawable(Drawable drawable) {
    }

    public void setImageIcon(Icon icon) {
    }

    public void setImageResource(int i) {
    }

    public void setImageURI(Uri uri) {
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }
}
