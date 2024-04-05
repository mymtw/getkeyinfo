package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C12384a();
    /* access modifiers changed from: private */
    public final Bundle textures;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C12384a implements Parcelable.Creator<CameraEffectTextures> {
        public final Object createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        public final Object[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$b */
    public static class C12385b {

        /* renamed from: a */
        public Bundle f27583a = new Bundle();
    }

    public /* synthetic */ CameraEffectTextures(C12385b bVar, C12384a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public Object get(String str) {
        return this.textures.get(str);
    }

    public Bitmap getTextureBitmap(String str) {
        Object obj = this.textures.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public Uri getTextureUri(String str) {
        Object obj = this.textures.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public Set<String> keySet() {
        return this.textures.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.textures);
    }

    private CameraEffectTextures(C12385b bVar) {
        this.textures = bVar.f27583a;
    }

    public CameraEffectTextures(Parcel parcel) {
        this.textures = parcel.readBundle(getClass().getClassLoader());
    }
}
