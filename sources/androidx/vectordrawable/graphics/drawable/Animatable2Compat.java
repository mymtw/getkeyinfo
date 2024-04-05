package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;

public interface Animatable2Compat extends Animatable {

    /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$a */
    public static abstract class C3306a {

        /* renamed from: a */
        public C3319a f7715a;

        /* renamed from: a */
        public void mo12418a() {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(C3306a aVar);

    boolean unregisterAnimationCallback(C3306a aVar);
}
