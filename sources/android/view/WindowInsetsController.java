package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.os.CancellationSignal;
import android.view.animation.Interpolator;

public /* synthetic */ interface WindowInsetsController {
    static {
        throw new NoClassDefFoundError();
    }

    /* synthetic */ void controlWindowInsetsAnimation(int i, long j, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListener windowInsetsAnimationControlListener);

    /* synthetic */ void hide(int i);

    /* synthetic */ void setSystemBarsAppearance(int i, int i2);

    /* synthetic */ void show(int i);
}
