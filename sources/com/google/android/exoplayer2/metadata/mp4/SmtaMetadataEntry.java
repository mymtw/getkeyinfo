package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C14272a();
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$a */
    public class C14272a implements Parcelable.Creator<SmtaMetadataEntry> {
        public final Object createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (C14272a) null);
        }

        public final Object[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, C14272a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.captureFrameRate == smtaMetadataEntry.captureFrameRate && this.svcTemporalLayerCount == smtaMetadataEntry.svcTemporalLayerCount;
    }

    public int hashCode() {
        return ((Float.valueOf(this.captureFrameRate).hashCode() + 527) * 31) + this.svcTemporalLayerCount;
    }

    public String toString() {
        float f = this.captureFrameRate;
        int i = this.svcTemporalLayerCount;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.captureFrameRate);
        parcel.writeInt(this.svcTemporalLayerCount);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.captureFrameRate = f;
        this.svcTemporalLayerCount = i;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.captureFrameRate = parcel.readFloat();
        this.svcTemporalLayerCount = parcel.readInt();
    }
}
