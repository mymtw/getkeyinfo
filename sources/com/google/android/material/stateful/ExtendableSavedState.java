package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.customview.view.AbsSavedState;
import p193o.C7506i;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C15445a();
    public final C7506i<String, Bundle> extendableStates;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    public static class C15445a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (C15445a) null);
        }

        public final Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        public final Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (C15445a) null);
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C15445a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ExtendableSavedState{");
        h.append(Integer.toHexString(System.identityHashCode(this)));
        h.append(" states=");
        h.append(this.extendableStates);
        h.append("}");
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.extendableStates.f16745d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.extendableStates.mo19978h(i3);
            bundleArr[i3] = this.extendableStates.mo19980n(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new C7506i<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new C7506i<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.extendableStates.put(strArr[i], bundleArr[i]);
        }
    }
}
