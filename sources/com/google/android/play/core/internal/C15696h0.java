package com.google.android.play.core.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.play.core.internal.h0 */
public final class C15696h0 {

    /* renamed from: a */
    public static final /* synthetic */ int f35459a = 0;

    static {
        C15696h0.class.getClassLoader();
    }

    /* renamed from: a */
    public static Parcelable m25522a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
