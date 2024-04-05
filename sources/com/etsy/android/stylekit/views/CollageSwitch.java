package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.animation.C0391c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;
import p753kq.C19861p;

public final class CollageSwitch extends ConstraintLayout {
    public static final int $stable = 8;
    private final TextView description;

    /* renamed from: switch  reason: not valid java name */
    private final SwitchCompat f44846switch;
    private final TextView title;

    public static final class SavedState extends View.BaseSavedState {
        public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
        private boolean checked;

        public static final class CREATOR implements Parcelable.Creator<SavedState> {
            private CREATOR() {
            }

            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public SavedState createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new SavedState(parcel, (DefaultConstructorMarker) null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public final void setChecked(boolean z) {
            this.checked = z;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("CollageSwitch.SavedState{");
            h.append(Integer.toHexString(System.identityHashCode(this)));
            h.append(" checked=");
            return C0391c.m1058d(h, this.checked, '}');
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.checked));
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            Object readValue = parcel.readValue(SavedState.class.getClassLoader());
            C19383o.m32795e(readValue, "null cannot be cast to non-null type kotlin.Boolean");
            this.checked = ((Boolean) readValue).booleanValue();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageSwitch(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollageSwitch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m34898_init_$lambda1(CollageSwitch collageSwitch, View view) {
        C19383o.m32797g(collageSwitch, "this$0");
        collageSwitch.setChecked(!collageSwitch.f44846switch.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnCheckedChangeListener$lambda-2  reason: not valid java name */
    public static final void m34899setOnCheckedChangeListener$lambda2(C19861p pVar, CompoundButton compoundButton, boolean z) {
        C19383o.m32797g(pVar, "$tmp0");
        pVar.invoke(compoundButton, Boolean.valueOf(z));
    }

    public final boolean isChecked() {
        return this.f44846switch.isChecked();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C19383o.m32795e(parcelable, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageSwitch.SavedState");
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44846switch.setChecked(savedState.getChecked());
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setChecked(this.f44846switch.isChecked());
        return savedState;
    }

    public final void setChecked(boolean z) {
        this.f44846switch.setChecked(z);
    }

    public final void setDescription(Spanned spanned) {
        C19383o.m32797g(spanned, "spanned");
        this.description.setText(spanned);
        TextView textView = this.description;
        int i = 0;
        if (spanned.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.title.setEnabled(z);
    }

    public final void setOnCheckedChangeListener(C19861p<? super View, ? super Boolean, C19394m> pVar) {
        C19383o.m32797g(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f44846switch.setOnCheckedChangeListener(new C9065p(pVar, 0));
    }

    public final void setSmallText(boolean z) {
        this.title.setTextSize(z ? 13.0f : 16.0f);
    }

    public final void setTitle(String str) {
        this.title.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.clg_switch, this, true);
        View findViewById = findViewById(R.id.clg_switch_title);
        C19383o.m32796f(findViewById, "findViewById(R.id.clg_switch_title)");
        this.title = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.clg_switch_description);
        C19383o.m32796f(findViewById2, "findViewById(R.id.clg_switch_description)");
        this.description = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.clg_switch_switch);
        C19383o.m32796f(findViewById3, "findViewById(R.id.clg_switch_switch)");
        this.f44846switch = (SwitchCompat) findViewById3;
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        setBackgroundResource(R.drawable.clg_touch_feedback);
        setFocusable(true);
        setClickable(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28653t, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…able.CollageSwitch, 0, 0)");
            String string = obtainStyledAttributes.getString(4);
            String string2 = obtainStyledAttributes.getString(1);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            boolean z3 = obtainStyledAttributes.getBoolean(3, false);
            setTitle(string);
            setDescription(string2);
            setChecked(z);
            setEnabled(z2);
            setSmallText(z3);
            obtainStyledAttributes.recycle();
        }
        setSaveEnabled(true);
        setOnClickListener(new C9064o(this, 0));
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f44846switch.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setDescription(String str) {
        this.description.setText(str);
        TextView textView = this.description;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
