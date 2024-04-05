package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C15277a();

    /* renamed from: b */
    public final Calendar f34236b;

    /* renamed from: c */
    public final int f34237c;

    /* renamed from: d */
    public final int f34238d;

    /* renamed from: e */
    public final int f34239e;

    /* renamed from: f */
    public final int f34240f;

    /* renamed from: g */
    public final long f34241g;

    /* renamed from: h */
    public String f34242h;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    public static class C15277a implements Parcelable.Creator<Month> {
        public final Object createFromParcel(Parcel parcel) {
            return Month.m24823a(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = C15301r.m24853c(calendar);
        this.f34236b = c;
        this.f34237c = c.get(2);
        this.f34238d = c.get(1);
        this.f34239e = c.getMaximum(7);
        this.f34240f = c.getActualMaximum(5);
        this.f34241g = c.getTimeInMillis();
    }

    /* renamed from: a */
    public static Month m24823a(int i, int i2) {
        Calendar g = C15301r.m24857g((Calendar) null);
        g.set(1, i);
        g.set(2, i2);
        return new Month(g);
    }

    /* renamed from: c */
    public static Month m24824c(long j) {
        Calendar g = C15301r.m24857g((Calendar) null);
        g.setTimeInMillis(j);
        return new Month(g);
    }

    public final int compareTo(Object obj) {
        return this.f34236b.compareTo(((Month) obj).f34236b);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo53834e() {
        int firstDayOfWeek = this.f34236b.get(7) - this.f34236b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f34239e : firstDayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f34237c == month.f34237c && this.f34238d == month.f34238d;
    }

    /* renamed from: f */
    public final long mo53836f(int i) {
        Calendar c = C15301r.m24853c(this.f34236b);
        c.set(5, i);
        return c.getTimeInMillis();
    }

    /* renamed from: g */
    public final String mo53837g(Context context) {
        if (this.f34242h == null) {
            long timeInMillis = this.f34236b.getTimeInMillis();
            this.f34242h = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.f34242h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34237c), Integer.valueOf(this.f34238d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34238d);
        parcel.writeInt(this.f34237c);
    }
}
