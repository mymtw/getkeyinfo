package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.preference.Preference;
import com.etsy.android.R;

public class SeekBarPreference extends Preference {

    /* renamed from: P */
    public int f6885P;

    /* renamed from: Q */
    public int f6886Q;

    /* renamed from: R */
    public int f6887R;

    /* renamed from: S */
    public int f6888S;

    /* renamed from: T */
    public boolean f6889T;

    /* renamed from: V */
    public SeekBar f6890V;

    /* renamed from: W */
    public TextView f6891W;

    /* renamed from: X */
    public boolean f6892X;

    /* renamed from: Y */
    public boolean f6893Y;

    /* renamed from: Z */
    public boolean f6894Z;

    /* renamed from: j1 */
    public C3034b f6895j1 = new C3034b();

    /* renamed from: k0 */
    public C3033a f6896k0 = new C3033a();

    /* renamed from: androidx.preference.SeekBarPreference$a */
    public class C3033a implements SeekBar.OnSeekBarChangeListener {
        public C3033a() {
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f6894Z || !seekBarPreference.f6889T) {
                    seekBarPreference.mo11161M(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            int i2 = i + seekBarPreference2.f6886Q;
            TextView textView = seekBarPreference2.f6891W;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f6889T = true;
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f6889T = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f6886Q != seekBarPreference.f6885P) {
                seekBarPreference.mo11161M(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    public class C3034b implements View.OnKeyListener {
        public C3034b() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f6892X && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f6890V;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0114h.f176m, R.attr.seekBarPreferenceStyle, 0);
        this.f6886Q = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.f6886Q;
        i = i < i2 ? i2 : i;
        if (i != this.f6887R) {
            this.f6887R = i;
            mo11005j();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f6888S) {
            this.f6888S = Math.min(this.f6887R - this.f6886Q, Math.abs(i3));
            mo11005j();
        }
        this.f6892X = obtainStyledAttributes.getBoolean(2, true);
        this.f6893Y = obtainStyledAttributes.getBoolean(5, false);
        this.f6894Z = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: L */
    public final void mo11160L(int i, boolean z) {
        int i2 = this.f6886Q;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f6887R;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f6885P) {
            this.f6885P = i;
            TextView textView = this.f6891W;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (mo11049J()) {
                int i4 = ~i;
                if (mo11049J()) {
                    i4 = this.f6822c.mo11205b().getInt(this.f6832m, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor a = this.f6822c.mo11204a();
                    a.putInt(this.f6832m, i);
                    if (!this.f6822c.f6940e) {
                        a.apply();
                    }
                }
            }
            if (z) {
                mo11005j();
            }
        }
    }

    /* renamed from: M */
    public final void mo11161M(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f6886Q;
        if (progress == this.f6885P) {
            return;
        }
        if (mo11051a(Integer.valueOf(progress))) {
            mo11160L(progress, false);
            return;
        }
        seekBar.setProgress(this.f6885P - this.f6886Q);
        int i = this.f6885P;
        TextView textView = this.f6891W;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* renamed from: n */
    public final void mo11000n(C3051h hVar) {
        super.mo11000n(hVar);
        hVar.itemView.setOnKeyListener(this.f6895j1);
        this.f6890V = (SeekBar) hVar.mo11208e(R.id.seekbar);
        TextView textView = (TextView) hVar.mo11208e(R.id.seekbar_value);
        this.f6891W = textView;
        if (this.f6893Y) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f6891W = null;
        }
        SeekBar seekBar = this.f6890V;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f6896k0);
        this.f6890V.setMax(this.f6887R - this.f6886Q);
        int i = this.f6888S;
        if (i != 0) {
            this.f6890V.setKeyProgressIncrement(i);
        } else {
            this.f6888S = this.f6890V.getKeyProgressIncrement();
        }
        this.f6890V.setProgress(this.f6885P - this.f6886Q);
        int i2 = this.f6885P;
        TextView textView2 = this.f6891W;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.f6890V.setEnabled(mo11057i());
    }

    /* renamed from: q */
    public final Object mo11010q(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: s */
    public final void mo11011s(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo11011s(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo11011s(savedState.getSuperState());
        this.f6885P = savedState.f6897b;
        this.f6886Q = savedState.f6898c;
        this.f6887R = savedState.f6899d;
        mo11005j();
    }

    /* renamed from: t */
    public final Parcelable mo11012t() {
        this.f6817L = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6839t) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.f6897b = this.f6885P;
        savedState.f6898c = this.f6886Q;
        savedState.f6899d = this.f6887R;
        return savedState;
    }

    /* renamed from: u */
    public final void mo11013u(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (mo11049J()) {
            intValue = this.f6822c.mo11205b().getInt(this.f6832m, intValue);
        }
        mo11160L(intValue, true);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3032a();

        /* renamed from: b */
        public int f6897b;

        /* renamed from: c */
        public int f6898c;

        /* renamed from: d */
        public int f6899d;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$a */
        public static class C3032a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6897b = parcel.readInt();
            this.f6898c = parcel.readInt();
            this.f6899d = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6897b);
            parcel.writeInt(this.f6898c);
            parcel.writeInt(this.f6899d);
        }

        public SavedState(AbsSavedState absSavedState) {
            super((Parcelable) absSavedState);
        }
    }
}
