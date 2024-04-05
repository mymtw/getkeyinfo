package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C15258a();
    private final long point;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    public static class C15258a implements Parcelable.Creator<DateValidatorPointBackward> {
        public final Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (C15258a) null);
        }

        public final Object[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j, C15258a aVar) {
        this(j);
    }

    public static DateValidatorPointBackward before(long j) {
        return new DateValidatorPointBackward(j);
    }

    public static DateValidatorPointBackward now() {
        return before(C15301r.m24856f().getTimeInMillis());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointBackward)) {
            return false;
        }
        return this.point == ((DateValidatorPointBackward) obj).point;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    public boolean isValid(long j) {
        return j <= this.point;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.point);
    }

    private DateValidatorPointBackward(long j) {
        this.point = j;
    }
}
