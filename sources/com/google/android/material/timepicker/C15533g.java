package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Arrays;
import java.util.Locale;
import p260v0.C8184a;

/* renamed from: com.google.android.material.timepicker.g */
public final class C15533g implements TimePickerView.C15525e, C15531e {

    /* renamed from: b */
    public final LinearLayout f34904b;

    /* renamed from: c */
    public final TimeModel f34905c;

    /* renamed from: d */
    public final C15534a f34906d;

    /* renamed from: e */
    public final C15535b f34907e;

    /* renamed from: f */
    public final ChipTextInputComboView f34908f;

    /* renamed from: g */
    public final ChipTextInputComboView f34909g;

    /* renamed from: h */
    public final EditText f34910h;

    /* renamed from: i */
    public final EditText f34911i;

    /* renamed from: j */
    public MaterialButtonToggleGroup f34912j;

    /* renamed from: com.google.android.material.timepicker.g$a */
    public class C15534a extends TextWatcherAdapter {
        public C15534a() {
        }

        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimeModel timeModel = C15533g.this.f34905c;
                    timeModel.getClass();
                    timeModel.f34873f = 0;
                    return;
                }
                int parseInt = Integer.parseInt(editable.toString());
                TimeModel timeModel2 = C15533g.this.f34905c;
                timeModel2.getClass();
                timeModel2.f34873f = parseInt % 60;
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.g$b */
    public class C15535b extends TextWatcherAdapter {
        public C15535b() {
        }

        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C15533g.this.f34905c.mo55175c(0);
                    return;
                }
                C15533g.this.f34905c.mo55175c(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.g$c */
    public class C15536c implements View.OnClickListener {
        public C15536c() {
        }

        public final void onClick(View view) {
            C15533g.this.mo55186c(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    public C15533g(LinearLayout linearLayout, TimeModel timeModel) {
        C15534a aVar = new C15534a();
        this.f34906d = aVar;
        C15535b bVar = new C15535b();
        this.f34907e = bVar;
        this.f34904b = linearLayout;
        this.f34905c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f34908f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f34909g = chipTextInputComboView2;
        ((TextView) chipTextInputComboView.findViewById(R.id.material_label)).setText(resources.getString(R.string.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(R.id.material_label)).setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.f34871d == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.f34912j = materialButtonToggleGroup;
            materialButtonToggleGroup.addOnButtonCheckedListener(new C15537h(this));
            this.f34912j.setVisibility(0);
            mo55203e();
        }
        C15536c cVar = new C15536c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        C15527b bVar2 = timeModel.f34870c;
        InputFilter[] filters = chipTextInputComboView2.f34828d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = bVar2;
        chipTextInputComboView2.f34828d.setFilters(inputFilterArr);
        C15527b bVar3 = timeModel.f34869b;
        InputFilter[] filters2 = chipTextInputComboView.f34828d.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = bVar3;
        chipTextInputComboView.f34828d.setFilters(inputFilterArr2);
        EditText editText = chipTextInputComboView2.f34827c.getEditText();
        this.f34910h = editText;
        EditText editText2 = chipTextInputComboView.f34827c.getEditText();
        this.f34911i = editText2;
        C15532f fVar = new C15532f(chipTextInputComboView2, chipTextInputComboView, timeModel);
        C2364y.m5201p(chipTextInputComboView2.f34826b, new C15526a(linearLayout.getContext(), R.string.material_hour_selection));
        C2364y.m5201p(chipTextInputComboView.f34826b, new C15526a(linearLayout.getContext(), R.string.material_minute_selection));
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(aVar);
        mo55202d(timeModel);
        TextInputLayout textInputLayout = chipTextInputComboView2.f34827c;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f34827c;
        EditText editText3 = textInputLayout.getEditText();
        EditText editText4 = textInputLayout2.getEditText();
        editText3.setImeOptions(268435461);
        editText4.setImeOptions(268435462);
        editText3.setOnEditorActionListener(fVar);
        editText3.setOnKeyListener(fVar);
        editText4.setOnKeyListener(fVar);
    }

    /* renamed from: a */
    public final void mo55192a() {
        this.f34904b.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo55193b() {
        View focusedChild = this.f34904b.getFocusedChild();
        if (focusedChild == null) {
            this.f34904b.setVisibility(8);
            return;
        }
        Object obj = C8184a.f17966a;
        InputMethodManager inputMethodManager = (InputMethodManager) C8184a.C8188d.m16469b(this.f34904b.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f34904b.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo55186c(int i) {
        this.f34905c.f34874g = i;
        boolean z = true;
        this.f34908f.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f34909g;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        mo55203e();
    }

    /* renamed from: d */
    public final void mo55202d(TimeModel timeModel) {
        this.f34910h.removeTextChangedListener(this.f34907e);
        this.f34911i.removeTextChangedListener(this.f34906d);
        Locale locale = this.f34904b.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.f34873f)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.mo55174b())});
        this.f34908f.mo55134a(format);
        this.f34909g.mo55134a(format2);
        this.f34910h.addTextChangedListener(this.f34907e);
        this.f34911i.addTextChangedListener(this.f34906d);
        mo55203e();
    }

    /* renamed from: e */
    public final void mo55203e() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f34912j;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.check(this.f34905c.f34875h == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
        }
    }

    public final void invalidate() {
        mo55202d(this.f34905c);
    }
}
