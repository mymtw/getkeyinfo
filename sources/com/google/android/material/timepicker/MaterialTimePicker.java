package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.DialogFragment;
import com.etsy.android.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p003a2.C0015b;
import p507al.C14024b;
import p610kp.C18161c;

public final class MaterialTimePicker extends DialogFragment implements TimePickerView.C15523c {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    public static final String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    public static final String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    public static final String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    public static final String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    public static final String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    public static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    public static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    public static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    private C15531e activePresenter;
    private Button cancelButton;
    private final Set<DialogInterface.OnCancelListener> cancelListeners = new LinkedHashSet();
    private int clockIcon;
    private final Set<DialogInterface.OnDismissListener> dismissListeners = new LinkedHashSet();
    /* access modifiers changed from: private */
    public int inputMode = 0;
    private int keyboardIcon;
    /* access modifiers changed from: private */
    public MaterialButton modeButton;
    /* access modifiers changed from: private */
    public final Set<View.OnClickListener> negativeButtonListeners = new LinkedHashSet();
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId = 0;
    private int overrideThemeResId = 0;
    /* access modifiers changed from: private */
    public final Set<View.OnClickListener> positiveButtonListeners = new LinkedHashSet();
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId = 0;
    private ViewStub textInputStub;
    private TimeModel time;
    private C15530d timePickerClockPresenter;
    private C15533g timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private int titleResId = 0;
    private CharSequence titleText;

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$a */
    public class C15516a implements View.OnClickListener {
        public C15516a() {
        }

        public final void onClick(View view) {
            for (View.OnClickListener onClick : MaterialTimePicker.this.positiveButtonListeners) {
                onClick.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$b */
    public class C15517b implements View.OnClickListener {
        public C15517b() {
        }

        public final void onClick(View view) {
            for (View.OnClickListener onClick : MaterialTimePicker.this.negativeButtonListeners) {
                onClick.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$c */
    public class C15518c implements View.OnClickListener {
        public C15518c() {
        }

        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            int unused = materialTimePicker.inputMode = materialTimePicker.inputMode == 0 ? 1 : 0;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.updateInputMode(materialTimePicker2.modeButton);
        }
    }

    /* renamed from: com.google.android.material.timepicker.MaterialTimePicker$d */
    public static final class C15519d {
    }

    private Pair<Integer, Integer> dataForMode(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.keyboardIcon), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.clockIcon), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException(C0015b.m88g("no icon for mode: ", i));
    }

    private int getThemeResId() {
        int i = this.overrideThemeResId;
        if (i != 0) {
            return i;
        }
        TypedValue a = C14024b.m21580a(requireContext(), R.attr.materialTimePickerTheme);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    private C15531e initializeOrRetrieveActivePresenterForMode(int i, TimePickerView timePickerView2, ViewStub viewStub) {
        if (i == 0) {
            C15530d dVar = this.timePickerClockPresenter;
            if (dVar == null) {
                dVar = new C15530d(timePickerView2, this.time);
            }
            this.timePickerClockPresenter = dVar;
            return dVar;
        }
        if (this.timePickerTextInputPresenter == null) {
            this.timePickerTextInputPresenter = new C15533g((LinearLayout) viewStub.inflate(), this.time);
        }
        C15533g gVar = this.timePickerTextInputPresenter;
        gVar.f34908f.setChecked(false);
        gVar.f34909g.setChecked(false);
        return this.timePickerTextInputPresenter;
    }

    /* access modifiers changed from: private */
    public static MaterialTimePicker newInstance(C15519d dVar) {
        new MaterialTimePicker();
        new Bundle();
        throw null;
    }

    private void restoreState(Bundle bundle) {
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable(TIME_MODEL_EXTRA);
            this.time = timeModel;
            if (timeModel == null) {
                this.time = new TimeModel();
            }
            this.inputMode = bundle.getInt(INPUT_MODE_EXTRA, 0);
            this.titleResId = bundle.getInt(TITLE_RES_EXTRA, 0);
            this.titleText = bundle.getCharSequence(TITLE_TEXT_EXTRA);
            this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
            this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_EXTRA);
            this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
            this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA);
            this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID, 0);
        }
    }

    private void updateCancelButtonVisibility() {
        Button button = this.cancelButton;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    public void updateInputMode(MaterialButton materialButton) {
        if (materialButton != null && this.timePickerView != null && this.textInputStub != null) {
            C15531e eVar = this.activePresenter;
            if (eVar != null) {
                eVar.mo55193b();
            }
            C15531e initializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode, this.timePickerView, this.textInputStub);
            this.activePresenter = initializeOrRetrieveActivePresenterForMode;
            initializeOrRetrieveActivePresenterForMode.mo55192a();
            this.activePresenter.invalidate();
            Pair<Integer, Integer> dataForMode = dataForMode(this.inputMode);
            materialButton.setIconResource(((Integer) dataForMode.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) dataForMode.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    public int getHour() {
        return this.time.f34872e % 24;
    }

    public int getInputMode() {
        return this.inputMode;
    }

    public int getMinute() {
        return this.time.f34873f;
    }

    public C15530d getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.cancelListeners) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId());
        Context context = dialog.getContext();
        int b = C14024b.m21581b(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, (AttributeSet) null, R.attr.materialTimePickerStyle, 2132018662);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C18161c.f39670M, R.attr.materialTimePickerStyle, 2132018662);
        this.clockIcon = obtainStyledAttributes.getResourceId(0, 0);
        this.keyboardIcon = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(b));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        materialShapeDrawable.setElevation(C2364y.C2373i.m5262i(decorView));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView2 = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.timePickerView = timePickerView2;
        timePickerView2.f34883i = this;
        this.textInputStub = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.modeButton = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.titleResId;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.titleText)) {
            textView.setText(this.titleText);
        }
        updateInputMode(this.modeButton);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new C15516a());
        int i2 = this.positiveButtonTextResId;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.positiveButtonText)) {
            button.setText(this.positiveButtonText);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.cancelButton = button2;
        button2.setOnClickListener(new C15517b());
        int i3 = this.negativeButtonTextResId;
        if (i3 != 0) {
            this.cancelButton.setText(i3);
        } else if (!TextUtils.isEmpty(this.negativeButtonText)) {
            this.cancelButton.setText(this.negativeButtonText);
        }
        updateCancelButtonVisibility();
        this.modeButton.setOnClickListener(new C15518c());
        return viewGroup2;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        TimePickerView timePickerView2 = this.timePickerView;
        if (timePickerView2 != null) {
            timePickerView2.f34883i = null;
            this.timePickerView = null;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.dismissListeners) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onDoubleTap() {
        boolean z = true;
        this.inputMode = 1;
        updateInputMode(this.modeButton);
        C15533g gVar = this.timePickerTextInputPresenter;
        gVar.f34908f.setChecked(gVar.f34905c.f34874g == 12);
        ChipTextInputComboView chipTextInputComboView = gVar.f34909g;
        if (gVar.f34905c.f34874g != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(TIME_MODEL_EXTRA, this.time);
        bundle.putInt(INPUT_MODE_EXTRA, this.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, this.titleResId);
        bundle.putCharSequence(TITLE_TEXT_EXTRA, this.titleText);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, this.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, this.negativeButtonText);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        updateCancelButtonVisibility();
    }
}
