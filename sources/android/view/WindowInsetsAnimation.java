package android.view;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.graphics.Insets;
import android.view.animation.Interpolator;

public final /* synthetic */ class WindowInsetsAnimation {

    public final /* synthetic */ class Bounds {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Bounds(@NonNull Insets insets, @NonNull Insets insets2) {
        }

        @NonNull
        public native /* synthetic */ Insets getLowerBound();

        @NonNull
        public native /* synthetic */ Insets getUpperBound();
    }

    public /* synthetic */ class Callback {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Callback(int i) {
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsetsAnimation(int i, @Nullable Interpolator interpolator, long j) {
    }

    public native /* synthetic */ long getDurationMillis();

    public native /* synthetic */ float getFraction();

    public native /* synthetic */ float getInterpolatedFraction();

    public native /* synthetic */ int getTypeMask();

    public native /* synthetic */ void setFraction(float f);
}
