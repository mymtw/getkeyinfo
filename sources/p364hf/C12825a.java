package p364hf;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: hf.a */
public final class C12825a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C12826b f28305a;

    public C12825a(C12826b bVar) {
        this.f28305a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue(ResponseConstants.HEIGHT)).intValue();
        ViewGroup.LayoutParams layoutParams = this.f28305a.f28306a.getLayoutParams();
        layoutParams.height = intValue;
        this.f28305a.f28306a.setLayoutParams(layoutParams);
    }
}
