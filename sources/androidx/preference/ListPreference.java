package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.activity.C0114h;
import androidx.preference.Preference;
import com.etsy.android.R;
import p280x0.C8299j;

public class ListPreference extends DialogPreference {

    /* renamed from: W */
    public CharSequence[] f6791W;

    /* renamed from: X */
    public CharSequence[] f6792X;

    /* renamed from: Y */
    public String f6793Y;

    /* renamed from: Z */
    public String f6794Z;

    /* renamed from: k0 */
    public boolean f6795k0;

    /* renamed from: androidx.preference.ListPreference$a */
    public static final class C3000a implements Preference.C3012f<ListPreference> {

        /* renamed from: b */
        public static C3000a f6797b;

        /* renamed from: c */
        public final CharSequence mo11017c(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            return TextUtils.isEmpty(listPreference.mo11028M()) ? listPreference.f6821b.getString(R.string.not_set) : listPreference.mo11028M();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0114h.f169f, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f6791W = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.f6792X = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C3000a.f6797b == null) {
                C3000a.f6797b = new C3000a();
            }
            this.f6819N = C3000a.f6797b;
            mo11005j();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0114h.f171h, i, 0);
        this.f6794Z = C8299j.m16594g(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: F */
    public final void mo11026F(CharSequence charSequence) {
        super.mo11026F(charSequence);
        if (charSequence == null && this.f6794Z != null) {
            this.f6794Z = null;
        } else if (charSequence != null && !charSequence.equals(this.f6794Z)) {
            this.f6794Z = charSequence.toString();
        }
    }

    /* renamed from: L */
    public final int mo11027L(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f6792X) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f6792X[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public final CharSequence mo11028M() {
        CharSequence[] charSequenceArr;
        int L = mo11027L(this.f6793Y);
        if (L < 0 || (charSequenceArr = this.f6791W) == null) {
            return null;
        }
        return charSequenceArr[L];
    }

    /* renamed from: N */
    public final void mo11029N(String str) {
        boolean z = !TextUtils.equals(this.f6793Y, str);
        if (z || !this.f6795k0) {
            this.f6793Y = str;
            this.f6795k0 = true;
            mo11064w(str);
            if (z) {
                mo11005j();
            }
        }
    }

    /* renamed from: h */
    public final CharSequence mo11030h() {
        Preference.C3012f fVar = this.f6819N;
        if (fVar != null) {
            return fVar.mo11017c(this);
        }
        Object M = mo11028M();
        CharSequence h = super.mo11030h();
        String str = this.f6794Z;
        if (str == null) {
            return h;
        }
        Object[] objArr = new Object[1];
        if (M == null) {
            M = "";
        }
        objArr[0] = M;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, h)) {
            return h;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
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
        mo11029N(savedState.f6796b);
    }

    /* renamed from: t */
    public final Parcelable mo11012t() {
        this.f6817L = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6839t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6796b = this.f6793Y;
        return savedState;
    }

    /* renamed from: u */
    public final void mo11013u(Object obj) {
        mo11029N(mo11056g((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2999a();

        /* renamed from: b */
        public String f6796b;

        /* renamed from: androidx.preference.ListPreference$SavedState$a */
        public static class C2999a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6796b = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6796b);
        }

        public SavedState(AbsSavedState absSavedState) {
            super((Parcelable) absSavedState);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8299j.m16588a(R.attr.dialogPreferenceStyle, context, 16842897));
    }
}
