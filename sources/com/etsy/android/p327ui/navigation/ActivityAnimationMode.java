package com.etsy.android.p327ui.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.ActivityAnimationMode */
public enum ActivityAnimationMode implements Parcelable {
    SLIDE_RIGHT,
    SLIDE_LEFT,
    SLIDE_BOTTOM,
    FADE_SLOW,
    FADE_IN_OUT,
    POP,
    DEFAULT,
    DEFAULT_OUT,
    ZOOM_IN_OUT,
    NONE,
    BOTTOM_NAV_FADE_IN_OUT;
    
    public static final Parcelable.Creator<ActivityAnimationMode> CREATOR = null;

    /* renamed from: com.etsy.android.ui.navigation.ActivityAnimationMode$Creator */
    public static final class Creator implements Parcelable.Creator<ActivityAnimationMode> {
        public final ActivityAnimationMode createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return ActivityAnimationMode.valueOf(parcel.readString());
        }

        public final ActivityAnimationMode[] newArray(int i) {
            return new ActivityAnimationMode[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new Creator();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(name());
    }
}
