package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Insets;

public /* synthetic */ interface WindowInsetsAnimationController {
    static {
        throw new NoClassDefFoundError();
    }

    /* synthetic */ void finish(boolean z);

    @NonNull
    /* synthetic */ Insets getCurrentInsets();

    @NonNull
    /* synthetic */ Insets getHiddenStateInsets();

    @NonNull
    /* synthetic */ Insets getShownStateInsets();

    /* synthetic */ boolean isReady();

    /* synthetic */ void setInsetsAndAlpha(@Nullable Insets insets, float f, float f2);
}
