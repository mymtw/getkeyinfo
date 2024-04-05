package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: W */
    public CharSequence[] f6800W;

    /* renamed from: X */
    public CharSequence[] f6801X;

    /* renamed from: Y */
    public HashSet f6802Y = new HashSet();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969182(0x7f04025e, float:1.7547039E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p280x0.C8299j.m16588a(r0, r4, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.f6802Y = r1
            int[] r1 = androidx.activity.C0114h.f170g
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0026
            java.lang.CharSequence[] r5 = r4.getTextArray(r2)
        L_0x0026:
            r3.f6800W = r5
            r5 = 3
            r0 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0034
            java.lang.CharSequence[] r5 = r4.getTextArray(r0)
        L_0x0034:
            r3.f6801X = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: L */
    public final void mo11038L(Set<String> set) {
        this.f6802Y.clear();
        this.f6802Y.addAll(set);
        if (mo11049J()) {
            Set<String> set2 = null;
            if (mo11049J()) {
                set2 = this.f6822c.mo11205b().getStringSet(this.f6832m, (Set) null);
            }
            if (!set.equals(set2)) {
                SharedPreferences.Editor a = this.f6822c.mo11204a();
                a.putStringSet(this.f6832m, set);
                if (!this.f6822c.f6940e) {
                    a.apply();
                }
            }
        }
        mo11005j();
    }

    /* renamed from: q */
    public final Object mo11010q(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* renamed from: s */
    public final void mo11011s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo11011s(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo11011s(savedState.getSuperState());
        mo11038L(savedState.f6803b);
    }

    /* renamed from: t */
    public final Parcelable mo11012t() {
        this.f6817L = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6839t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6803b = this.f6802Y;
        return savedState;
    }

    /* renamed from: u */
    public final void mo11013u(Object obj) {
        Set<String> set = (Set) obj;
        if (mo11049J()) {
            set = this.f6822c.mo11205b().getStringSet(this.f6832m, set);
        }
        mo11038L(set);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3003a();

        /* renamed from: b */
        public HashSet f6803b;

        /* renamed from: androidx.preference.MultiSelectListPreference$SavedState$a */
        public static class C3003a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f6803b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f6803b, strArr);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6803b.size());
            HashSet hashSet = this.f6803b;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public SavedState(AbsSavedState absSavedState) {
            super((Parcelable) absSavedState);
        }
    }
}
