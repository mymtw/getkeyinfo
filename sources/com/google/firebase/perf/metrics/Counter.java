package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C16614a();
    private final AtomicLong count;
    private final String name;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    public class C16614a implements Parcelable.Creator<Counter> {
        public final Object createFromParcel(Parcel parcel) {
            return new Counter(parcel, (C16614a) null);
        }

        public final Object[] newArray(int i) {
            return new Counter[i];
        }
    }

    public /* synthetic */ Counter(Parcel parcel, C16614a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public long getCount() {
        return this.count.get();
    }

    public String getName() {
        return this.name;
    }

    public void increment(long j) {
        this.count.addAndGet(j);
    }

    public void setCount(long j) {
        this.count.set(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeLong(this.count.get());
    }

    public Counter(String str) {
        this.name = str;
        this.count = new AtomicLong(0);
    }

    private Counter(Parcel parcel) {
        this.name = parcel.readString();
        this.count = new AtomicLong(parcel.readLong());
    }
}
