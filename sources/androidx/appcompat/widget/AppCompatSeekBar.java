package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.etsy.android.R;

public class AppCompatSeekBar extends SeekBar {
    private final C0337o mAppCompatSeekBarHelper;

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0337o oVar = this.mAppCompatSeekBarHelper;
        Drawable drawable = oVar.f867e;
        if (drawable != null && drawable.isStateful() && drawable.setState(oVar.f866d.getDrawableState())) {
            oVar.f866d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mAppCompatSeekBarHelper.f867e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.mo3096d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0334m0.m882a(this, getContext());
        C0337o oVar = new C0337o(this);
        this.mAppCompatSeekBarHelper = oVar;
        oVar.mo3093a(attributeSet, i);
    }
}
