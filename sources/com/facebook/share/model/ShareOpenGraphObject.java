package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, C12413a> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new ShareOpenGraphObject$Companion$CREATOR$1();
    public static final C12414b Companion = new C12414b();

    /* renamed from: com.facebook.share.model.ShareOpenGraphObject$a */
    public static final class C12413a extends ShareOpenGraphValueContainer.C12415a<ShareOpenGraphObject, C12413a> {
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphObject$b */
    public static final class C12414b {
    }

    public /* synthetic */ ShareOpenGraphObject(C12413a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private ShareOpenGraphObject(C12413a aVar) {
        super(aVar);
    }

    public ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
