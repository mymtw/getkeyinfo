package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p075d.C6614a;
import p507al.C14024b;

public final class MaterialDatePicker<S> extends DialogFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    public static final Object CANCEL_BUTTON_TAG = "CANCEL_BUTTON_TAG";
    public static final Object CONFIRM_BUTTON_TAG = "CONFIRM_BUTTON_TAG";
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    public static final Object TOGGLE_BUTTON_TAG = "TOGGLE_BUTTON_TAG";
    private MaterialShapeDrawable background;
    private MaterialCalendar<S> calendar;
    private CalendarConstraints calendarConstraints;
    /* access modifiers changed from: private */
    public Button confirmButton;
    private DateSelector<S> dateSelector;
    private boolean fullscreen;
    private TextView headerSelectionText;
    /* access modifiers changed from: private */
    public CheckableImageButton headerToggleButton;
    private int inputMode;
    private final LinkedHashSet<DialogInterface.OnCancelListener> onCancelListeners = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> onDismissListeners = new LinkedHashSet<>();
    /* access modifiers changed from: private */
    public final LinkedHashSet<View.OnClickListener> onNegativeButtonClickListeners = new LinkedHashSet<>();
    /* access modifiers changed from: private */
    public final LinkedHashSet<C15291i<? super S>> onPositiveButtonClickListeners = new LinkedHashSet<>();
    private int overrideThemeResId;
    private C15297n<S> pickerFragment;
    private CharSequence titleText;
    private int titleTextResId;

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$a */
    public class C15271a implements View.OnClickListener {
        public C15271a() {
        }

        public final void onClick(View view) {
            Iterator it = MaterialDatePicker.this.onPositiveButtonClickListeners.iterator();
            while (it.hasNext()) {
                MaterialDatePicker.this.getSelection();
                ((C15291i) it.next()).mo53862a();
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$b */
    public class C15272b implements View.OnClickListener {
        public C15272b() {
        }

        public final void onClick(View view) {
            Iterator it = MaterialDatePicker.this.onNegativeButtonClickListeners.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$c */
    public class C15273c extends C15296m<S> {
        public C15273c() {
        }

        /* renamed from: a */
        public final void mo53828a() {
            MaterialDatePicker.this.confirmButton.setEnabled(false);
        }

        /* renamed from: b */
        public final void mo53829b(S s) {
            MaterialDatePicker.this.updateHeader();
            MaterialDatePicker.this.confirmButton.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$d */
    public class C15274d implements View.OnClickListener {
        public C15274d() {
        }

        public final void onClick(View view) {
            MaterialDatePicker.this.confirmButton.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
            MaterialDatePicker.this.headerToggleButton.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.updateToggleContentDescription(materialDatePicker.headerToggleButton);
            MaterialDatePicker.this.startPickerFragment();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$e */
    public static final class C15275e<S> {
    }

    private static Drawable createHeaderToggleDrawable(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C6614a.m12981a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C6614a.m12981a(context, R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    public DateSelector<S> getDateSelector() {
        if (this.dateSelector == null) {
            this.dateSelector = (DateSelector) getArguments().getParcelable(DATE_SELECTOR_KEY);
        }
        return this.dateSelector;
    }

    private static int getPaddedPickerWidth(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = new Month(C15301r.m24856f()).f34239e;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i;
        return ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    private int getThemeResId(Context context) {
        int i = this.overrideThemeResId;
        return i != 0 ? i : getDateSelector().getDefaultThemeResId(context);
    }

    private void initHeaderToggle(Context context) {
        this.headerToggleButton.setTag(TOGGLE_BUTTON_TAG);
        this.headerToggleButton.setImageDrawable(createHeaderToggleDrawable(context));
        this.headerToggleButton.setChecked(this.inputMode != 0);
        C2364y.m5201p(this.headerToggleButton, (C2273a) null);
        updateToggleContentDescription(this.headerToggleButton);
        this.headerToggleButton.setOnClickListener(new C15274d());
    }

    public static boolean isFullscreen(Context context) {
        return readMaterialCalendarStyleBoolean(context, 16843277);
    }

    public static boolean isNestedScrollable(Context context) {
        return readMaterialCalendarStyleBoolean(context, R.attr.nestedScrollable);
    }

    public static <S> MaterialDatePicker<S> newInstance(C15275e<S> eVar) {
        new MaterialDatePicker();
        new Bundle();
        throw null;
    }

    public static boolean readMaterialCalendarStyleBoolean(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C14024b.m21581b(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    public void startPickerFragment() {
        int themeResId = getThemeResId(requireContext());
        this.calendar = MaterialCalendar.newInstance(getDateSelector(), themeResId, this.calendarConstraints);
        this.pickerFragment = this.headerToggleButton.isChecked() ? MaterialTextInputPicker.newInstance(getDateSelector(), themeResId, this.calendarConstraints) : this.calendar;
        updateHeader();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
        c.mo10531h(R.id.mtrl_calendar_frame, this.pickerFragment, (String) null);
        if (!c.f6252i) {
            c.f6253j = false;
            c.f6218s.mo10405y(c, false);
            this.pickerFragment.addOnSelectionChangedListener(new C15273c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public static long thisMonthInUtcMilliseconds() {
        return new Month(C15301r.m24856f()).f34241g;
    }

    public static long todayInUtcMilliseconds() {
        return C15301r.m24856f().getTimeInMillis();
    }

    /* access modifiers changed from: private */
    public void updateHeader() {
        String headerText = getHeaderText();
        this.headerSelectionText.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), new Object[]{headerText}));
        this.headerSelectionText.setText(headerText);
    }

    /* access modifiers changed from: private */
    public void updateToggleContentDescription(CheckableImageButton checkableImageButton) {
        this.headerToggleButton.setContentDescription(this.headerToggleButton.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(C15291i<? super S> iVar) {
        return this.onPositiveButtonClickListeners.add(iVar);
    }

    public void clearOnCancelListeners() {
        this.onCancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.onDismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.onNegativeButtonClickListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.onPositiveButtonClickListeners.clear();
    }

    public String getHeaderText() {
        return getDateSelector().getSelectionDisplayString(getContext());
    }

    public final S getSelection() {
        return getDateSelector().getSelection();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.onCancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID);
        this.dateSelector = (DateSelector) bundle.getParcelable(DATE_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.titleTextResId = bundle.getInt(TITLE_TEXT_RES_ID_KEY);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_KEY);
        this.inputMode = bundle.getInt(INPUT_MODE_KEY);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId(requireContext()));
        Context context = dialog.getContext();
        this.fullscreen = isFullscreen(context);
        int b = C14024b.m21581b(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2132018606);
        this.background = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        this.background.setFillColor(ColorStateList.valueOf(b));
        MaterialShapeDrawable materialShapeDrawable2 = this.background;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        materialShapeDrawable2.setElevation(C2364y.C2373i.m5262i(decorView));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.fullscreen ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.fullscreen) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.headerSelectionText = textView;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2371g.m5249f(textView, 1);
        this.headerToggleButton = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.titleText;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.titleTextResId);
        }
        initHeaderToggle(context);
        this.confirmButton = (Button) inflate.findViewById(R.id.confirm_button);
        if (getDateSelector().isSelectionComplete()) {
            this.confirmButton.setEnabled(true);
        } else {
            this.confirmButton.setEnabled(false);
        }
        this.confirmButton.setTag(CONFIRM_BUTTON_TAG);
        this.confirmButton.setOnClickListener(new C15271a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag(CANCEL_BUTTON_TAG);
        button.setOnClickListener(new C15272b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.onDismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, this.dateSelector);
        CalendarConstraints.C15253b bVar = new CalendarConstraints.C15253b(this.calendarConstraints);
        if (this.calendar.getCurrentMonth() != null) {
            bVar.f34210c = Long.valueOf(this.calendar.getCurrentMonth().f34241g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f34211d);
        Month c = Month.m24824c(bVar.f34208a);
        Month c2 = Month.m24824c(bVar.f34209b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.f34210c;
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, new CalendarConstraints(c, c2, dateValidator, l == null ? null : Month.m24824c(l.longValue()), (CalendarConstraints.C15252a) null));
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, this.titleTextResId);
        bundle.putCharSequence(TITLE_TEXT_KEY, this.titleText);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.fullscreen) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.background);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.background, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        startPickerFragment();
    }

    public void onStop() {
        this.pickerFragment.clearOnSelectionChangedListeners();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(C15291i<? super S> iVar) {
        return this.onPositiveButtonClickListeners.remove(iVar);
    }
}
