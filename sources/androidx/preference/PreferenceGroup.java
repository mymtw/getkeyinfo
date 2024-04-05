package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.activity.C0114h;
import androidx.preference.Preference;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import p193o.C7506i;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: P */
    public final C7506i<String, Long> f6874P;

    /* renamed from: Q */
    public final Handler f6875Q;

    /* renamed from: R */
    public ArrayList f6876R;

    /* renamed from: S */
    public boolean f6877S;

    /* renamed from: T */
    public int f6878T;

    /* renamed from: V */
    public boolean f6879V;

    /* renamed from: W */
    public int f6880W;

    /* renamed from: X */
    public final C3030a f6881X;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    public class C3030a implements Runnable {
        public C3030a() {
        }

        public final void run() {
            synchronized (this) {
                PreferenceGroup.this.f6874P.clear();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface C3031b {
        /* renamed from: c */
        int mo11158c(Preference preference);

        /* renamed from: g */
        int mo11159g(String str);
    }

    public PreferenceGroup() {
        throw null;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6874P = new C7506i<>();
        this.f6875Q = new Handler();
        this.f6877S = true;
        this.f6878T = 0;
        this.f6879V = false;
        this.f6880W = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6881X = new C3030a();
        this.f6876R = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0114h.f174k, i, 0);
        this.f6877S = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            mo11153R(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: L */
    public final void mo11148L(Preference preference) {
        long j;
        if (!this.f6876R.contains(preference)) {
            if (preference.f6832m != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.f6816K;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.f6832m;
                if (preferenceGroup.mo11149M(str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            int i = preference.f6827h;
            if (i == Integer.MAX_VALUE) {
                if (this.f6877S) {
                    int i2 = this.f6878T;
                    this.f6878T = i2 + 1;
                    if (i2 != i) {
                        preference.f6827h = i2;
                        Preference.C3008b bVar = preference.f6814I;
                        if (bVar != null) {
                            C3040c cVar = (C3040c) bVar;
                            cVar.f6922f.removeCallbacks(cVar.f6923g);
                            cVar.f6922f.post(cVar.f6923g);
                        }
                    }
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).f6877S = this.f6877S;
                }
            }
            int binarySearch = Collections.binarySearch(this.f6876R, preference);
            if (binarySearch < 0) {
                binarySearch = (binarySearch * -1) - 1;
            }
            boolean I = mo11008I();
            if (preference.f6843x == I) {
                preference.f6843x = !I;
                preference.mo11058k(preference.mo11008I());
                preference.mo11005j();
            }
            synchronized (this) {
                this.f6876R.add(binarySearch, preference);
            }
            C3045f fVar = this.f6822c;
            String str2 = preference.f6832m;
            if (str2 == null || !this.f6874P.containsKey(str2)) {
                synchronized (fVar) {
                    j = fVar.f6937b;
                    fVar.f6937b = 1 + j;
                }
            } else {
                j = this.f6874P.getOrDefault(str2, null).longValue();
                this.f6874P.remove(str2);
            }
            preference.f6823d = j;
            preference.f6824e = true;
            try {
                preference.mo11060m(fVar);
                preference.f6824e = false;
                if (preference.f6816K == null) {
                    preference.f6816K = this;
                    if (this.f6879V) {
                        preference.mo11059l();
                    }
                    Preference.C3008b bVar2 = this.f6814I;
                    if (bVar2 != null) {
                        C3040c cVar2 = (C3040c) bVar2;
                        cVar2.f6922f.removeCallbacks(cVar2.f6923g);
                        cVar2.f6922f.post(cVar2.f6923g);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
            } catch (Throwable th) {
                preference.f6824e = false;
                throw th;
            }
        }
    }

    /* renamed from: M */
    public final <T extends Preference> T mo11149M(CharSequence charSequence) {
        T M;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.f6832m, charSequence)) {
            return this;
        } else {
            int O = mo11151O();
            for (int i = 0; i < O; i++) {
                T N = mo11150N(i);
                if (TextUtils.equals(N.f6832m, charSequence)) {
                    return N;
                }
                if ((N instanceof PreferenceGroup) && (M = ((PreferenceGroup) N).mo11149M(charSequence)) != null) {
                    return M;
                }
            }
            return null;
        }
    }

    /* renamed from: N */
    public final Preference mo11150N(int i) {
        return (Preference) this.f6876R.get(i);
    }

    /* renamed from: O */
    public final int mo11151O() {
        return this.f6876R.size();
    }

    /* renamed from: Q */
    public final void mo11152Q(Preference preference) {
        synchronized (this) {
            try {
                preference.mo11050K();
                if (preference.f6816K == this) {
                    preference.f6816K = null;
                }
                if (this.f6876R.remove(preference)) {
                    String str = preference.f6832m;
                    if (str != null) {
                        this.f6874P.put(str, Long.valueOf(preference.mo11055f()));
                        this.f6875Q.removeCallbacks(this.f6881X);
                        this.f6875Q.post(this.f6881X);
                    }
                    if (this.f6879V) {
                        preference.mo11061p();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: R */
    public final void mo11153R(int i) {
        if (i != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.f6832m))) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f6880W = i;
    }

    /* renamed from: c */
    public final void mo11052c(Bundle bundle) {
        super.mo11052c(bundle);
        int O = mo11151O();
        for (int i = 0; i < O; i++) {
            mo11150N(i).mo11052c(bundle);
        }
    }

    /* renamed from: e */
    public final void mo11054e(Bundle bundle) {
        super.mo11054e(bundle);
        int O = mo11151O();
        for (int i = 0; i < O; i++) {
            mo11150N(i).mo11054e(bundle);
        }
    }

    /* renamed from: k */
    public final void mo11058k(boolean z) {
        super.mo11058k(z);
        int O = mo11151O();
        for (int i = 0; i < O; i++) {
            Preference N = mo11150N(i);
            if (N.f6843x == z) {
                N.f6843x = !z;
                N.mo11058k(N.mo11008I());
                N.mo11005j();
            }
        }
    }

    /* renamed from: l */
    public final void mo11059l() {
        super.mo11059l();
        this.f6879V = true;
        int O = mo11151O();
        for (int i = 0; i < O; i++) {
            mo11150N(i).mo11059l();
        }
    }

    /* renamed from: p */
    public final void mo11061p() {
        mo11050K();
        this.f6879V = false;
        int O = mo11151O();
        for (int i = 0; i < O; i++) {
            mo11150N(i).mo11061p();
        }
    }

    /* renamed from: s */
    public final void mo11011s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo11011s(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f6880W = savedState.f6882b;
        super.mo11011s(savedState.getSuperState());
    }

    /* renamed from: t */
    public final Parcelable mo11012t() {
        this.f6817L = true;
        return new SavedState(AbsSavedState.EMPTY_STATE, this.f6880W);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3029a();

        /* renamed from: b */
        public int f6882b;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$a */
        public static class C3029a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6882b = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6882b);
        }

        public SavedState(AbsSavedState absSavedState, int i) {
            super((Parcelable) absSavedState);
            this.f6882b = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
