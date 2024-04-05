package com.etsy.android.p327ui.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.FragmentAnimationMode */
public enum FragmentAnimationMode implements Parcelable {
    SLIDING,
    FADE,
    OVERLAY,
    NONE,
    SLIDE_BOTTOM,
    SLIDE_BOTTOM_ONTOP,
    SLIDE_BOTTOM_ONTOP_MULTIBACKSTACK,
    ZOOM_IN_OUT;
    
    public static final Parcelable.Creator<FragmentAnimationMode> CREATOR = null;

    /* renamed from: com.etsy.android.ui.navigation.FragmentAnimationMode$Creator */
    public static final class Creator implements Parcelable.Creator<FragmentAnimationMode> {
        public final FragmentAnimationMode createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return FragmentAnimationMode.valueOf(parcel.readString());
        }

        public final FragmentAnimationMode[] newArray(int i) {
            return new FragmentAnimationMode[i];
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
