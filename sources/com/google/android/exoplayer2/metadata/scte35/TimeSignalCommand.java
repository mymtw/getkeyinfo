package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p513bj.C14077r;
import p513bj.C14086y;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C14280a();
    public final long playbackPositionUs;
    public final long ptsTime;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public class C14280a implements Parcelable.Creator<TimeSignalCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), (C14280a) null);
        }

        public final Object[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C14280a aVar) {
        this(j, j2);
    }

    public static TimeSignalCommand parseFromSection(C14077r rVar, long j, C14086y yVar) {
        long parseSpliceTime = parseSpliceTime(rVar, j);
        return new TimeSignalCommand(parseSpliceTime, yVar.mo46958b(parseSpliceTime));
    }

    public static long parseSpliceTime(C14077r rVar, long j) {
        long p = (long) rVar.mo46925p();
        if ((128 & p) != 0) {
            return 8589934591L & ((((p & 1) << 32) | rVar.mo46926q()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsTime);
        parcel.writeLong(this.playbackPositionUs);
    }

    private TimeSignalCommand(long j, long j2) {
        this.ptsTime = j;
        this.playbackPositionUs = j2;
    }
}
