package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;
import android.widget.EditText;
import androidx.preference.Preference;
import com.etsy.android.R;

public class EditTextPreference extends DialogPreference {

    /* renamed from: W */
    public String f6787W;

    /* renamed from: X */
    public C2997a f6788X;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public interface C2997a {
        /* renamed from: c */
        void mo37c(EditText editText);
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    public static final class C2998b implements Preference.C3012f<EditTextPreference> {

        /* renamed from: b */
        public static C2998b f6790b;

        /* renamed from: c */
        public final CharSequence mo11017c(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.f6787W) ? editTextPreference.f6821b.getString(R.string.not_set) : editTextPreference.f6787W;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969223(0x7f040287, float:1.7547122E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = p280x0.C8299j.m16588a(r0, r4, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = androidx.activity.C0114h.f168e
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L_0x0030
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.C2998b.f6790b
            if (r5 != 0) goto L_0x0029
            androidx.preference.EditTextPreference$b r5 = new androidx.preference.EditTextPreference$b
            r5.<init>()
            androidx.preference.EditTextPreference.C2998b.f6790b = r5
        L_0x0029:
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.C2998b.f6790b
            r3.f6819N = r5
            r3.mo11005j()
        L_0x0030:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: I */
    public final boolean mo11008I() {
        return TextUtils.isEmpty(this.f6787W) || super.mo11008I();
    }

    /* renamed from: L */
    public final void mo11009L(String str) {
        boolean I = mo11008I();
        this.f6787W = str;
        mo11064w(str);
        boolean I2 = mo11008I();
        if (I2 != I) {
            mo11058k(I2);
        }
        mo11005j();
    }

    /* renamed from: q */
    public final Object mo11010q(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: s */
    public final void mo11011s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo11011s(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo11011s(savedState.getSuperState());
        mo11009L(savedState.f6789b);
    }

    /* renamed from: t */
    public final Parcelable mo11012t() {
        this.f6817L = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6839t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6789b = this.f6787W;
        return savedState;
    }

    /* renamed from: u */
    public final void mo11013u(Object obj) {
        mo11009L(mo11056g((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2996a();

        /* renamed from: b */
        public String f6789b;

        /* renamed from: androidx.preference.EditTextPreference$SavedState$a */
        public static class C2996a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6789b = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6789b);
        }

        public SavedState(AbsSavedState absSavedState) {
            super((Parcelable) absSavedState);
        }
    }
}
