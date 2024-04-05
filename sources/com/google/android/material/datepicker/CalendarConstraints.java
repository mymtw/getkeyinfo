package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C15252a();
    /* access modifiers changed from: private */
    public final Month end;
    private final int monthSpan;
    /* access modifiers changed from: private */
    public Month openAt;
    /* access modifiers changed from: private */
    public final Month start;
    /* access modifiers changed from: private */
    public final DateValidator validator;
    private final int yearSpan;

    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public static class C15252a implements Parcelable.Creator<CalendarConstraints> {
        public final Object createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (C15252a) null);
        }

        public final Object[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C15253b {

        /* renamed from: e */
        public static final long f34206e = C15301r.m24851a(Month.m24823a(ShippingUtilsKt.lowHeightScreen, 0).f34241g);

        /* renamed from: f */
        public static final long f34207f = C15301r.m24851a(Month.m24823a(2100, 11).f34241g);

        /* renamed from: a */
        public long f34208a = f34206e;

        /* renamed from: b */
        public long f34209b = f34207f;

        /* renamed from: c */
        public Long f34210c;

        /* renamed from: d */
        public DateValidator f34211d = DateValidatorPointForward.from(Long.MIN_VALUE);

        public C15253b(CalendarConstraints calendarConstraints) {
            this.f34208a = calendarConstraints.start.f34241g;
            this.f34209b = calendarConstraints.end.f34241g;
            this.f34210c = Long.valueOf(calendarConstraints.openAt.f34241g);
            this.f34211d = calendarConstraints.validator;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C15252a aVar) {
        this(month, month2, dateValidator, month3);
    }

    public Month clamp(Month month) {
        if (month.f34236b.compareTo(this.start.f34236b) < 0) {
            return this.start;
        }
        return month.f34236b.compareTo(this.end.f34236b) > 0 ? this.end : month;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && Objects.equals(this.openAt, calendarConstraints.openAt) && this.validator.equals(calendarConstraints.validator);
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    public Month getEnd() {
        return this.end;
    }

    public int getMonthSpan() {
        return this.monthSpan;
    }

    public Month getOpenAt() {
        return this.openAt;
    }

    public Month getStart() {
        return this.start;
    }

    public int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, this.validator});
    }

    public boolean isWithinBounds(long j) {
        if (this.start.mo53836f(1) <= j) {
            Month month = this.end;
            if (j <= month.mo53836f(month.f34240f)) {
                return true;
            }
        }
        return false;
    }

    public void setOpenAt(Month month) {
        this.openAt = month;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.validator = dateValidator;
        if (month3 != null && month.f34236b.compareTo(month3.f34236b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 != null && month3.f34236b.compareTo(month2.f34236b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (month.f34236b instanceof GregorianCalendar) {
            int i = month2.f34238d;
            int i2 = month.f34238d;
            this.monthSpan = (month2.f34237c - month.f34237c) + ((i - i2) * 12) + 1;
            this.yearSpan = (i - i2) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }
}
