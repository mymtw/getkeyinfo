package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    /* access modifiers changed from: private */
    public static final C15257d ALL_OPERATOR = new C15255b();
    /* access modifiers changed from: private */
    public static final C15257d ANY_OPERATOR = new C15254a();
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C15256c();
    private final C15257d operator;
    private final List<CalendarConstraints.DateValidator> validators;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    public static class C15254a implements C15257d {
        /* renamed from: a */
        public final boolean mo53762a(long j, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.isValid(j)) {
                    return true;
                }
            }
            return false;
        }

        public final int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    public static class C15255b implements C15257d {
        /* renamed from: a */
        public final boolean mo53762a(long j, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.isValid(j)) {
                    return false;
                }
            }
            return true;
        }

        public final int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    public static class C15256c implements Parcelable.Creator<CompositeDateValidator> {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            C15257d access$000 = readInt == 2 ? CompositeDateValidator.ALL_OPERATOR : readInt == 1 ? CompositeDateValidator.ANY_OPERATOR : CompositeDateValidator.ALL_OPERATOR;
            readArrayList.getClass();
            return new CompositeDateValidator(readArrayList, access$000, (C15254a) null);
        }

        public final Object[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    public interface C15257d {
        /* renamed from: a */
        boolean mo53762a(long j, List list);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, C15257d dVar, C15254a aVar) {
        this(list, dVar);
    }

    public static CalendarConstraints.DateValidator allOf(List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ALL_OPERATOR);
    }

    public static CalendarConstraints.DateValidator anyOf(List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ANY_OPERATOR);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    public boolean isValid(long j) {
        return this.operator.mo53762a(j, this.validators);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list, C15257d dVar) {
        this.validators = list;
        this.operator = dVar;
    }
}
