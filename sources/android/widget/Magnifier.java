package android.widget;

import android.annotation.NonNull;
import android.view.View;

public final /* synthetic */ class Magnifier {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(@NonNull View view) {
        }

        @NonNull
        public native /* synthetic */ Magnifier build();

        @NonNull
        public native /* synthetic */ Builder setClippingEnabled(boolean z);

        @NonNull
        public native /* synthetic */ Builder setCornerRadius(float f);

        @NonNull
        public native /* synthetic */ Builder setElevation(float f);

        @NonNull
        public native /* synthetic */ Builder setInitialZoom(float f);

        @NonNull
        public native /* synthetic */ Builder setSize(int i, int i2);
    }

    static {
        throw new NoClassDefFoundError();
    }

    @Deprecated
    public /* synthetic */ Magnifier(@NonNull View view) {
    }

    public native /* synthetic */ void dismiss();

    public native /* synthetic */ int getHeight();

    public native /* synthetic */ int getWidth();

    public native /* synthetic */ void show(float f, float f2);

    public native /* synthetic */ void update();
}
