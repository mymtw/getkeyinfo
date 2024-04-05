package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C12410b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new C12409a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static class C12409a implements Parcelable.Creator<ShareOpenGraphAction> {
        public final Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$b */
    public static final class C12410b extends ShareOpenGraphValueContainer.C12415a<ShareOpenGraphAction, C12410b> {
    }

    public /* synthetic */ ShareOpenGraphAction(C12410b bVar, C12409a aVar) {
        this(bVar);
    }

    public String getActionType() {
        return getString("og:type");
    }

    private ShareOpenGraphAction(C12410b bVar) {
        super(bVar);
    }

    public ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
