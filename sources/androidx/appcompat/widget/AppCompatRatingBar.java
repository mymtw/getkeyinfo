package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.etsy.android.R;

public class AppCompatRatingBar extends RatingBar {
    private final C0333m mAppCompatProgressBarHelper;

    public AppCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.mAppCompatProgressBarHelper.f854b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0334m0.m882a(this, getContext());
        C0333m mVar = new C0333m(this);
        this.mAppCompatProgressBarHelper = mVar;
        mVar.mo3093a(attributeSet, i);
    }
}
