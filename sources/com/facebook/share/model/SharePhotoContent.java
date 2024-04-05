package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, C12418a> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new SharePhotoContent$Companion$CREATOR$1();
    public static final C12419b Companion = new C12419b();
    private final List<SharePhoto> photos;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static final class C12418a extends ShareContent.C12390a<SharePhotoContent, C12418a> {
    }

    /* renamed from: com.facebook.share.model.SharePhotoContent$b */
    public static final class C12419b {
    }

    public /* synthetic */ SharePhotoContent(C12418a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public int describeContents() {
        return 0;
    }

    public final List<SharePhoto> getPhotos() {
        return this.photos;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        super.writeToParcel(parcel, i);
        List<SharePhoto> list = this.photos;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }

    private SharePhotoContent(C12418a aVar) {
        super(aVar);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        C19383o.m32797g(parcel, "parcel");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList arrayList = new ArrayList(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ShareMedia shareMedia = (ShareMedia) it.next();
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add((SharePhoto) shareMedia);
            }
        }
        this.photos = C19327t.m32660p1(arrayList2);
    }
}
