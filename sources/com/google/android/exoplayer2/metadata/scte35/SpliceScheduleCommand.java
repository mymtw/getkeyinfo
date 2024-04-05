package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14077r;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C14277a();
    public final List<C14279c> events;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public class C14277a implements Parcelable.Creator<SpliceScheduleCommand> {
        public final Object createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (C14277a) null);
        }

        public final Object[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C14278b {

        /* renamed from: a */
        public final int f31716a;

        /* renamed from: b */
        public final long f31717b;

        public C14278b(int i, long j) {
            this.f31716a = i;
            this.f31717b = j;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C14277a aVar) {
        this(parcel);
    }

    public static SpliceScheduleCommand parseFromSection(C14077r rVar) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        long j3;
        boolean z5;
        int p = rVar.mo46925p();
        ArrayList arrayList2 = new ArrayList(p);
        int i5 = 0;
        while (i5 < p) {
            long q = rVar.mo46926q();
            boolean z6 = (rVar.mo46925p() & 128) != 0;
            ArrayList arrayList3 = new ArrayList();
            if (!z6) {
                int p2 = rVar.mo46925p();
                boolean z7 = (p2 & 128) != 0;
                boolean z8 = (p2 & 64) != 0;
                boolean z9 = (p2 & 32) != 0;
                long q2 = z8 ? rVar.mo46926q() : -9223372036854775807L;
                if (!z8) {
                    int p3 = rVar.mo46925p();
                    ArrayList arrayList4 = new ArrayList(p3);
                    int i6 = 0;
                    while (i6 < p3) {
                        arrayList4.add(new C14278b(rVar.mo46925p(), rVar.mo46926q()));
                        i6++;
                        z7 = z7;
                        z8 = z8;
                        p = p;
                    }
                    i = p;
                    z2 = z7;
                    z4 = z8;
                    arrayList3 = arrayList4;
                } else {
                    i = p;
                    z2 = z7;
                    z4 = z8;
                }
                if (z9) {
                    long p4 = (long) rVar.mo46925p();
                    z5 = (p4 & 128) != 0;
                    j3 = ((((p4 & 1) << 32) | rVar.mo46926q()) * 1000) / 90;
                } else {
                    z5 = false;
                    j3 = -9223372036854775807L;
                }
                i4 = rVar.mo46930u();
                arrayList = arrayList3;
                z = z5;
                j2 = q2;
                j = j3;
                i3 = rVar.mo46925p();
                i2 = rVar.mo46925p();
                z3 = z4;
            } else {
                i = p;
                arrayList = arrayList3;
                z3 = false;
                z2 = false;
                j2 = -9223372036854775807L;
                z = false;
                j = -9223372036854775807L;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            }
            arrayList2.add(new C14279c(q, z6, z2, z3, arrayList, j2, z, j, i4, i3, i2));
            i5++;
            p = i;
        }
        return new SpliceScheduleCommand((List<C14279c>) arrayList2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C14279c cVar = this.events.get(i2);
            parcel.writeLong(cVar.f31718a);
            parcel.writeByte(cVar.f31719b ? (byte) 1 : 0);
            parcel.writeByte(cVar.f31720c ? (byte) 1 : 0);
            parcel.writeByte(cVar.f31721d ? (byte) 1 : 0);
            int size2 = cVar.f31723f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C14278b bVar = cVar.f31723f.get(i3);
                parcel.writeInt(bVar.f31716a);
                parcel.writeLong(bVar.f31717b);
            }
            parcel.writeLong(cVar.f31722e);
            parcel.writeByte(cVar.f31724g ? (byte) 1 : 0);
            parcel.writeLong(cVar.f31725h);
            parcel.writeInt(cVar.f31726i);
            parcel.writeInt(cVar.f31727j);
            parcel.writeInt(cVar.f31728k);
        }
    }

    private SpliceScheduleCommand(List<C14279c> list) {
        this.events = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C14279c(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C14279c {

        /* renamed from: a */
        public final long f31718a;

        /* renamed from: b */
        public final boolean f31719b;

        /* renamed from: c */
        public final boolean f31720c;

        /* renamed from: d */
        public final boolean f31721d;

        /* renamed from: e */
        public final long f31722e;

        /* renamed from: f */
        public final List<C14278b> f31723f;

        /* renamed from: g */
        public final boolean f31724g;

        /* renamed from: h */
        public final long f31725h;

        /* renamed from: i */
        public final int f31726i;

        /* renamed from: j */
        public final int f31727j;

        /* renamed from: k */
        public final int f31728k;

        public C14279c(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f31718a = j;
            this.f31719b = z;
            this.f31720c = z2;
            this.f31721d = z3;
            this.f31723f = Collections.unmodifiableList(arrayList);
            this.f31722e = j2;
            this.f31724g = z4;
            this.f31725h = j3;
            this.f31726i = i;
            this.f31727j = i2;
            this.f31728k = i3;
        }

        public C14279c(Parcel parcel) {
            this.f31718a = parcel.readLong();
            boolean z = false;
            this.f31719b = parcel.readByte() == 1;
            this.f31720c = parcel.readByte() == 1;
            this.f31721d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new C14278b(parcel.readInt(), parcel.readLong()));
            }
            this.f31723f = Collections.unmodifiableList(arrayList);
            this.f31722e = parcel.readLong();
            this.f31724g = parcel.readByte() == 1 ? true : z;
            this.f31725h = parcel.readLong();
            this.f31726i = parcel.readInt();
            this.f31727j = parcel.readInt();
            this.f31728k = parcel.readInt();
        }
    }
}
