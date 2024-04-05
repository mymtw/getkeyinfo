package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.C12390a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public abstract class ShareContent<P extends ShareContent<P, E>, E extends C12390a<P, E>> implements ShareModel {
    private final Uri contentUrl;
    private final String pageId;
    private final List<String> peopleIds;
    private final String placeId;
    private final String ref;
    private final ShareHashtag shareHashtag;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class C12390a<P extends ShareContent<P, E>, E extends C12390a<P, E>> {
    }

    public ShareContent(C12390a<P, E> aVar) {
        C19383o.m32797g(aVar, "builder");
        this.contentUrl = null;
        this.peopleIds = null;
        this.placeId = null;
        this.pageId = null;
        this.ref = null;
        this.shareHashtag = null;
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public final Uri getContentUrl() {
        return this.contentUrl;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<String> getPeopleIds() {
        return this.peopleIds;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getRef() {
        return this.ref;
    }

    public final ShareHashtag getShareHashtag() {
        return this.shareHashtag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.shareHashtag, 0);
    }

    public ShareContent(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        ShareHashtag.C12392b bVar = new ShareHashtag.C12392b();
        ShareHashtag shareHashtag2 = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag2 != null) {
            bVar.f27584a = shareHashtag2.getHashtag();
        }
        this.shareHashtag = new ShareHashtag(bVar, (ShareHashtag.C12391a) null);
    }
}
