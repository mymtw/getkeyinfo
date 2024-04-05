package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C12382a();
    /* access modifiers changed from: private */
    public final Bundle params;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C12382a implements Parcelable.Creator<CameraEffectArguments> {
        public final Object createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        public final Object[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$b */
    public static class C12383b {

        /* renamed from: a */
        public Bundle f27582a = new Bundle();
    }

    public /* synthetic */ CameraEffectArguments(C12383b bVar, C12382a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public Object get(String str) {
        return this.params.get(str);
    }

    public String getString(String str) {
        return this.params.getString(str);
    }

    public String[] getStringArray(String str) {
        return this.params.getStringArray(str);
    }

    public Set<String> keySet() {
        return this.params.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }

    private CameraEffectArguments(C12383b bVar) {
        this.params = bVar.f27582a;
    }

    public CameraEffectArguments(Parcel parcel) {
        this.params = parcel.readBundle(getClass().getClassLoader());
    }
}
