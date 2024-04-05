package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.GraphRequest;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1 implements Parcelable.Creator<GraphRequest.ParcelableResourceWithMimeType<?>> {
    public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        return new GraphRequest.ParcelableResourceWithMimeType<>(parcel, (DefaultConstructorMarker) null);
    }

    public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int i) {
        return new GraphRequest.ParcelableResourceWithMimeType[i];
    }
}
