package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.conversation.MessageDraft;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p504ai.C13983i;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17954o0;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C14281a();
    public final String customCacheKey;
    public final byte[] data;

    /* renamed from: id */
    public final String f31729id;
    public final byte[] keySetId;
    public final String mimeType;
    public final List<StreamKey> streamKeys;
    public final Uri uri;

    public static class UnsupportedRequestException extends IOException {
    }

    /* renamed from: com.google.android.exoplayer2.offline.DownloadRequest$a */
    public class C14281a implements Parcelable.Creator<DownloadRequest> {
        public final Object createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        public final Object[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri2, String str2, List list, byte[] bArr, String str3, byte[] bArr2, C14281a aVar) {
        this(str, uri2, str2, list, bArr, str3, bArr2);
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.uri, this.mimeType, this.streamKeys, this.keySetId, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithKeySetId(byte[] bArr) {
        return new DownloadRequest(this.f31729id, this.uri, this.mimeType, this.streamKeys, bArr, this.customCacheKey, this.data);
    }

    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        ArrayList arrayList;
        C14075p.m21691c(this.f31729id.equals(downloadRequest.f31729id));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i);
                if (!arrayList2.contains(streamKey)) {
                    arrayList2.add(streamKey);
                }
            }
            arrayList = arrayList2;
        }
        return new DownloadRequest(this.f31729id, downloadRequest.uri, downloadRequest.mimeType, arrayList, downloadRequest.keySetId, downloadRequest.customCacheKey, downloadRequest.data);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f31729id.equals(downloadRequest.f31729id) && this.uri.equals(downloadRequest.uri) && C14049b0.m21628a(this.mimeType, downloadRequest.mimeType) && this.streamKeys.equals(downloadRequest.streamKeys) && Arrays.equals(this.keySetId, downloadRequest.keySetId) && C14049b0.m21628a(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data);
    }

    public final int hashCode() {
        int hashCode = (this.uri.hashCode() + (this.f31729id.hashCode() * 31 * 31)) * 31;
        String str = this.mimeType;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = (Arrays.hashCode(this.keySetId) + ((this.streamKeys.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
        String str2 = this.customCacheKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Arrays.hashCode(this.data) + ((hashCode3 + i) * 31);
    }

    public C17954o0 toMediaItem() {
        C17954o0.C17956b bVar = new C17954o0.C17956b();
        String str = this.f31729id;
        str.getClass();
        bVar.f39145a = str;
        bVar.f39146b = this.uri;
        bVar.f39161q = this.customCacheKey;
        bVar.f39147c = this.mimeType;
        List<StreamKey> list = this.streamKeys;
        bVar.f39160p = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
        byte[] bArr = this.keySetId;
        bVar.f39159o = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        return bVar.mo69497a();
    }

    public String toString() {
        String str = this.mimeType;
        String str2 = this.f31729id;
        return C13983i.m21492k(C0391c.m1055a(str2, C0391c.m1055a(str, 1)), str, MessageDraft.IMAGE_DELIMITER, str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31729id);
        parcel.writeString(this.uri.toString());
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.streamKeys.size());
        for (int i2 = 0; i2 < this.streamKeys.size(); i2++) {
            parcel.writeParcelable(this.streamKeys.get(i2), 0);
        }
        parcel.writeByteArray(this.keySetId);
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
    }

    private DownloadRequest(String str, Uri uri2, String str2, List<StreamKey> list, byte[] bArr, String str3, byte[] bArr2) {
        int z = C14049b0.m21653z(uri2, str2);
        boolean z2 = true;
        if (z == 0 || z == 2 || z == 1) {
            z2 = str3 != null ? false : z2;
            StringBuilder sb = new StringBuilder(49);
            sb.append("customCacheKey must be null for type: ");
            sb.append(z);
            C14075p.m21692d(z2, sb.toString());
        }
        this.f31729id = str;
        this.uri = uri2;
        this.mimeType = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.customCacheKey = str3;
        this.data = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : C14049b0.f30918f;
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.f31729id = readString;
        this.uri = Uri.parse(parcel.readString());
        this.mimeType = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.keySetId = parcel.createByteArray();
        this.customCacheKey = parcel.readString();
        this.data = parcel.createByteArray();
    }
}
