package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14077r;
import p513bj.C14086y;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C14274a();
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<C14275b> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public class C14274a implements Parcelable.Creator<SpliceInsertCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (C14274a) null);
        }

        public final Object[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C14275b {

        /* renamed from: a */
        public final int f31713a;

        /* renamed from: b */
        public final long f31714b;

        /* renamed from: c */
        public final long f31715c;

        public C14275b(long j, long j2, int i) {
            this.f31713a = i;
            this.f31714b = j;
            this.f31715c = j2;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C14274a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand parseFromSection(C14077r rVar, long j, C14086y yVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        C14086y yVar2 = yVar;
        long q = rVar.mo46926q();
        boolean z6 = (rVar.mo46925p() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int p = rVar.mo46925p();
            boolean z7 = (p & 128) != 0;
            boolean z8 = (p & 64) != 0;
            boolean z9 = (p & 32) != 0;
            boolean z10 = (p & 16) != 0;
            long parseSpliceTime = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(rVar, j);
            if (!z8) {
                int p2 = rVar.mo46925p();
                ArrayList arrayList = new ArrayList(p2);
                for (int i4 = 0; i4 < p2; i4++) {
                    int p3 = rVar.mo46925p();
                    long parseSpliceTime2 = !z10 ? TimeSignalCommand.parseSpliceTime(rVar, j) : -9223372036854775807L;
                    arrayList.add(new C14275b(parseSpliceTime2, yVar2.mo46958b(parseSpliceTime2), p3));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long p4 = (long) rVar.mo46925p();
                boolean z11 = (128 & p4) != 0;
                j4 = ((((p4 & 1) << 32) | rVar.mo46926q()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = rVar.mo46930u();
            z = z8;
            i2 = rVar.mo46925p();
            i = rVar.mo46925p();
            list = emptyList;
            long j5 = parseSpliceTime;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new SpliceInsertCommand(q, z6, z4, z, z3, j3, yVar2.mo46958b(j3), list, z2, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C14275b bVar = this.componentSpliceList.get(i2);
            parcel.writeInt(bVar.f31713a);
            parcel.writeLong(bVar.f31714b);
            parcel.writeLong(bVar.f31715c);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C14275b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z2;
        this.programSpliceFlag = z3;
        this.spliceImmediateFlag = z4;
        this.programSplicePts = j2;
        this.programSplicePlaybackPositionUs = j3;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z5;
        this.breakDurationUs = j4;
        this.uniqueProgramId = i;
        this.availNum = i2;
        this.availsExpected = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        boolean z = false;
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C14275b(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1 ? true : z;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
