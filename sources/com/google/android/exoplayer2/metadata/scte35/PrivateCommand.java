package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p513bj.C14049b0;
import p513bj.C14077r;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C14273a();
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    public class C14273a implements Parcelable.Creator<PrivateCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, (C14273a) null);
        }

        public final Object[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C14273a aVar) {
        this(parcel);
    }

    public static PrivateCommand parseFromSection(C14077r rVar, int i, long j) {
        long q = rVar.mo46926q();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        rVar.mo46911b(0, i2, bArr);
        return new PrivateCommand(q, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsAdjustment);
        parcel.writeLong(this.identifier);
        parcel.writeByteArray(this.commandBytes);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.ptsAdjustment = j2;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.ptsAdjustment = parcel.readLong();
        this.identifier = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = C14049b0.f30913a;
        this.commandBytes = createByteArray;
    }
}
