package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p513bj.C14049b0;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C14252a();
    private static final Format ID3_FORMAT;
    public static final String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    private static final Format SCTE35_FORMAT;
    public static final String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;

    /* renamed from: id */
    public final long f31703id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    public class C14252a implements Parcelable.Creator<EventMessage> {
        public final Object createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        public final Object[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    static {
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31303k = "application/id3";
        ID3_FORMAT = bVar.mo47144a();
        Format.C14176b bVar2 = new Format.C14176b();
        bVar2.f31303k = "application/x-scte35";
        SCTE35_FORMAT = bVar2.mo47144a();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.f31703id = j2;
        this.messageData = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.durationMs == eventMessage.durationMs && this.f31703id == eventMessage.f31703id && C14049b0.m21628a(this.schemeIdUri, eventMessage.schemeIdUri) && C14049b0.m21628a(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData);
    }

    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    public Format getWrappedMetadataFormat() {
        String str = this.schemeIdUri;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals(SCTE35_SCHEME_ID)) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals(ID3_SCHEME_ID_AOM)) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals(ID3_SCHEME_ID_APPLE)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return SCTE35_FORMAT;
            case 1:
            case 2:
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int i = 0;
            int hashCode2 = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.value;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.durationMs;
            long j2 = this.f31703id;
            this.hashCode = Arrays.hashCode(this.messageData) + ((((((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    public String toString() {
        String str = this.schemeIdUri;
        long j = this.f31703id;
        long j2 = this.durationMs;
        String str2 = this.value;
        StringBuilder sb = new StringBuilder(C0391c.m1055a(str2, C0391c.m1055a(str, 79)));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.f31703id);
        parcel.writeByteArray(this.messageData);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.schemeIdUri = readString;
        this.value = parcel.readString();
        this.durationMs = parcel.readLong();
        this.f31703id = parcel.readLong();
        this.messageData = parcel.createByteArray();
    }
}
