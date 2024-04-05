package p638ok;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.etsy.android.R;

/* renamed from: ok.e */
public final class C18313e {

    /* renamed from: a */
    public static final int[] f40207a = {16843848};

    /* renamed from: a */
    public static void m30944a(float f, View view) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969926}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
