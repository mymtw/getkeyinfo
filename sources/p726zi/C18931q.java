package p726zi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: zi.q */
public final class C18931q extends WebView {
    public C18931q(Context context) {
        super(context, (AttributeSet) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
