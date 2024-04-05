package com.etsy.android.p327ui.singleactivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.singleactivity.GenericKey */
public final class GenericKey extends MultistackFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GenericKey> CREATOR = new Creator();
    private final int animationModeOrdinal;
    private final Bundle args;
    private final String fragClassName;
    private final boolean isDialog;
    private final String stackId;

    /* renamed from: com.etsy.android.ui.singleactivity.GenericKey$Creator */
    public static final class Creator implements Parcelable.Creator<GenericKey> {
        public final GenericKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new GenericKey(parcel.readString(), parcel.readString(), parcel.readBundle(), parcel.readInt() != 0, parcel.readInt());
        }

        public final GenericKey[] newArray(int i) {
            return new GenericKey[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GenericKey(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, boolean r10, int r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0005
            r10 = 0
        L_0x0005:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0013
            com.etsy.android.ui.singleactivity.MultistackFragmentKey$a r10 = com.etsy.android.p327ui.singleactivity.MultistackFragmentKey.Companion
            r10.getClass()
            int r11 = com.etsy.android.p327ui.singleactivity.MultistackFragmentKey.DEFAULT_ANIMATION_ORDINAL
        L_0x0013:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.singleactivity.GenericKey.<init>(java.lang.String, java.lang.String, android.os.Bundle, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public int animationModeOrdinal() {
        return this.animationModeOrdinal;
    }

    public int describeContents() {
        return 0;
    }

    public String fragmentClassName() {
        return this.fragClassName;
    }

    public Bundle getArguments() {
        return this.args;
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public String stackIdentifier() {
        return this.stackId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.fragClassName);
        parcel.writeString(this.stackId);
        parcel.writeBundle(this.args);
        parcel.writeInt(this.isDialog ? 1 : 0);
        parcel.writeInt(this.animationModeOrdinal);
    }

    public GenericKey(String str, String str2, Bundle bundle, boolean z, int i) {
        C19383o.m32797g(str, "fragClassName");
        C19383o.m32797g(str2, "stackId");
        this.fragClassName = str;
        this.stackId = str2;
        this.args = bundle;
        this.isDialog = z;
        this.animationModeOrdinal = i;
    }
}
