package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C16624a();
    private long highResTime;
    private long timeInMicros;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    public class C16624a implements Parcelable.Creator<Timer> {
        public final Object createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C16624a) null);
        }

        public final Object[] newArray(int i) {
            return new Timer[i];
        }
    }

    public /* synthetic */ Timer(Parcel parcel, C16624a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        return getDurationMicros() + this.timeInMicros;
    }

    public long getDurationMicros() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.highResTime);
    }

    @VisibleForTesting
    public long getHighResTime() {
        return TimeUnit.NANOSECONDS.toMicros(this.highResTime);
    }

    public long getMicros() {
        return this.timeInMicros;
    }

    public void reset() {
        this.timeInMicros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.highResTime = System.nanoTime();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timeInMicros);
        parcel.writeLong(this.highResTime);
    }

    public Timer() {
        this.timeInMicros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.highResTime = System.nanoTime();
    }

    public long getDurationMicros(Timer timer) {
        return TimeUnit.NANOSECONDS.toMicros(timer.highResTime - this.highResTime);
    }

    @VisibleForTesting
    public Timer(long j) {
        this.timeInMicros = j;
        this.highResTime = TimeUnit.MICROSECONDS.toNanos(j);
    }

    @VisibleForTesting
    public Timer(long j, long j2) {
        this.timeInMicros = j;
        this.highResTime = j2;
    }

    private Timer(Parcel parcel) {
        this.timeInMicros = parcel.readLong();
        this.highResTime = parcel.readLong();
    }
}
