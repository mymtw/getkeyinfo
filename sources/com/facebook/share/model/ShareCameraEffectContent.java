package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareContent;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, C12389b> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C12388a();
    private CameraEffectArguments arguments;
    private String effectId;
    private CameraEffectTextures textures;

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    public static class C12388a implements Parcelable.Creator<ShareCameraEffectContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$b */
    public static final class C12389b extends ShareContent.C12390a<ShareCameraEffectContent, C12389b> {
    }

    public /* synthetic */ ShareCameraEffectContent(C12389b bVar, C12388a aVar) {
        this(bVar);
    }

    public CameraEffectArguments getArguments() {
        return this.arguments;
    }

    public String getEffectId() {
        return this.effectId;
    }

    public CameraEffectTextures getTextures() {
        return this.textures;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.arguments, 0);
        parcel.writeParcelable(this.textures, 0);
    }

    private ShareCameraEffectContent(C12389b bVar) {
        super(bVar);
        throw null;
    }

    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.effectId = parcel.readString();
        CameraEffectArguments.C12383b bVar = new CameraEffectArguments.C12383b();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            bVar.f27582a.putAll(cameraEffectArguments.params);
        }
        this.arguments = new CameraEffectArguments(bVar, (CameraEffectArguments.C12382a) null);
        CameraEffectTextures.C12385b bVar2 = new CameraEffectTextures.C12385b();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            bVar2.f27583a.putAll(cameraEffectTextures.textures);
        }
        this.textures = new CameraEffectTextures(bVar2, (CameraEffectTextures.C12384a) null);
    }
}
