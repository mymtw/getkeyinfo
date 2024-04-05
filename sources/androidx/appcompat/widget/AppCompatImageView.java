package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageView;
import com.etsy.android.R;

public class AppCompatImageView extends ImageView {
    private final C0306d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C0328k mImageHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped = false;
        private int mTintId;
        private int mTintModeId;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mTintId = propertyMapper.mapObject("tint", R.attr.tint);
            this.mTintModeId = propertyMapper.mapObject("tintMode", R.attr.tintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatImageView appCompatImageView, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatImageView.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatImageView.getBackgroundTintMode());
                propertyReader.readObject(this.mTintId, appCompatImageView.getImageTintList());
                propertyReader.readObject(this.mTintModeId, appCompatImageView.getImageTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3023a();
        }
        C0328k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.mo3072a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo3024b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo3025c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0336n0 n0Var;
        C0328k kVar = this.mImageHelper;
        if (kVar == null || (n0Var = kVar.f823b) == null) {
            return null;
        }
        return n0Var.f862a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0336n0 n0Var;
        C0328k kVar = this.mImageHelper;
        if (kVar == null || (n0Var = kVar.f823b) == null) {
            return null;
        }
        return n0Var.f863b;
    }

    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.f822a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3027e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3028f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0328k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.mo3072a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0328k kVar = this.mImageHelper;
        if (!(kVar == null || drawable == null || this.mHasLevel)) {
            kVar.f824c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C0328k kVar2 = this.mImageHelper;
        if (kVar2 != null) {
            kVar2.mo3072a();
            if (!this.mHasLevel) {
                C0328k kVar3 = this.mImageHelper;
                if (kVar3.f822a.getDrawable() != null) {
                    kVar3.f822a.getDrawable().setLevel(kVar3.f824c);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    public void setImageResource(int i) {
        C0328k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.mo3074c(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0328k kVar = this.mImageHelper;
        if (kVar != null) {
            kVar.mo3072a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3030h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3031i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0328k kVar = this.mImageHelper;
        if (kVar != null) {
            if (kVar.f823b == null) {
                kVar.f823b = new C0336n0();
            }
            C0336n0 n0Var = kVar.f823b;
            n0Var.f862a = colorStateList;
            n0Var.f865d = true;
            kVar.mo3072a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0328k kVar = this.mImageHelper;
        if (kVar != null) {
            if (kVar.f823b == null) {
                kVar.f823b = new C0336n0();
            }
            C0336n0 n0Var = kVar.f823b;
            n0Var.f863b = mode;
            n0Var.f864c = true;
            kVar.mo3072a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mHasLevel = false;
        C0334m0.m882a(this, getContext());
        C0306d dVar = new C0306d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo3026d(attributeSet, i);
        C0328k kVar = new C0328k(this);
        this.mImageHelper = kVar;
        kVar.mo3073b(attributeSet, i);
    }
}
