package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C15520a();

    /* renamed from: b */
    public final C15527b f34869b;

    /* renamed from: c */
    public final C15527b f34870c;

    /* renamed from: d */
    public final int f34871d;

    /* renamed from: e */
    public int f34872e;

    /* renamed from: f */
    public int f34873f;

    /* renamed from: g */
    public int f34874g;

    /* renamed from: h */
    public int f34875h;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    public static class C15520a implements Parcelable.Creator<TimeModel> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    /* renamed from: a */
    public static String m25113a(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: b */
    public final int mo55174b() {
        if (this.f34871d == 1) {
            return this.f34872e % 24;
        }
        int i = this.f34872e;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f34875h == 1 ? i - 12 : i;
    }

    /* renamed from: c */
    public final void mo55175c(int i) {
        if (this.f34871d == 1) {
            this.f34872e = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f34875h != 1) {
            i2 = 0;
        }
        this.f34872e = i3 + i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f34872e == timeModel.f34872e && this.f34873f == timeModel.f34873f && this.f34871d == timeModel.f34871d && this.f34874g == timeModel.f34874g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34871d), Integer.valueOf(this.f34872e), Integer.valueOf(this.f34873f), Integer.valueOf(this.f34874g)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34872e);
        parcel.writeInt(this.f34873f);
        parcel.writeInt(this.f34874g);
        parcel.writeInt(this.f34871d);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f34872e = i;
        this.f34873f = i2;
        this.f34874g = i3;
        this.f34871d = i4;
        int i5 = 12;
        this.f34875h = i >= 12 ? 1 : 0;
        this.f34869b = new C15527b(59);
        this.f34870c = new C15527b(i4 == 1 ? 24 : i5);
    }
}
