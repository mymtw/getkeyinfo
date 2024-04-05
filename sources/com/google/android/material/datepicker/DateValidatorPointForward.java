package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C15259a();
    private final long point;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    public static class C15259a implements Parcelable.Creator<DateValidatorPointForward> {
        public final Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (C15259a) null);
        }

        public final Object[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, C15259a aVar) {
        this(j);
    }

    public static DateValidatorPointForward from(long j) {
        return new DateValidatorPointForward(j);
    }

    public static DateValidatorPointForward now() {
        return from(C15301r.m24856f().getTimeInMillis());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        return this.point == ((DateValidatorPointForward) obj).point;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    public boolean isValid(long j) {
        return j >= this.point;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }

    private DateValidatorPointForward(long j) {
        this.point = j;
    }
}
