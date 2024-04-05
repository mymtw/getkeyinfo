package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: P */
    public boolean f6910P;

    /* renamed from: Q */
    public CharSequence f6911Q;

    /* renamed from: R */
    public CharSequence f6912R;

    /* renamed from: S */
    public boolean f6913S;

    /* renamed from: T */
    public boolean f6914T;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: I */
    public final boolean mo11008I() {
        return (this.f6914T ? this.f6910P : !this.f6910P) || super.mo11008I();
    }

    /* renamed from: L */
    public final void mo11173L(boolean z) {
        boolean z2 = this.f6910P != z;
        if (z2 || !this.f6913S) {
            this.f6910P = z;
            this.f6913S = true;
            if (mo11049J()) {
                boolean z3 = !z;
                if (mo11049J()) {
                    z3 = this.f6822c.mo11205b().getBoolean(this.f6832m, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor a = this.f6822c.mo11204a();
                    a.putBoolean(this.f6832m, z);
                    if (!this.f6822c.f6940e) {
                        a.apply();
                    }
                }
            }
            if (z2) {
                mo11058k(mo11008I());
                mo11005j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11174M(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f6910P
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f6911Q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f6911Q
            r5.setText(r0)
        L_0x001a:
            r0 = r2
            goto L_0x002e
        L_0x001c:
            boolean r1 = r4.f6910P
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r1 = r4.f6912R
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r0 = r4.f6912R
            r5.setText(r0)
            goto L_0x001a
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r4.mo11030h()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003e
            r5.setText(r1)
            r0 = r2
        L_0x003e:
            r1 = 8
            if (r0 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004d
            r5.setVisibility(r2)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo11174M(android.view.View):void");
    }

    /* renamed from: o */
    public final void mo11003o() {
        boolean z = !this.f6910P;
        if (mo11051a(Boolean.valueOf(z))) {
            mo11173L(z);
        }
    }

    /* renamed from: q */
    public final Object mo11010q(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* renamed from: s */
    public final void mo11011s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo11011s(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo11011s(savedState.getSuperState());
        mo11173L(savedState.f6915b);
    }

    /* renamed from: t */
    public final Parcelable mo11012t() {
        this.f6817L = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6839t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6915b = this.f6910P;
        return savedState;
    }

    /* renamed from: u */
    public final void mo11013u(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (mo11049J()) {
            booleanValue = this.f6822c.mo11205b().getBoolean(this.f6832m, booleanValue);
        }
        mo11173L(booleanValue);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3037a();

        /* renamed from: b */
        public boolean f6915b;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$a */
        public static class C3037a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6915b = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6915b ? 1 : 0);
        }

        public SavedState(AbsSavedState absSavedState) {
            super((Parcelable) absSavedState);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
