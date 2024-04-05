package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.etsy.android.R;
import com.google.android.material.internal.C15368h;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import kotlin.reflect.C19421p;
import p077d1.C6619c;
import p507al.C14024b;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C15282b();
    /* access modifiers changed from: private */
    public Long selectedItem;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    public class C15281a extends C15287e {

        /* renamed from: h */
        public final /* synthetic */ C15296m f34251h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15281a(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C15296m mVar) {
            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
            this.f34251h = mVar;
        }

        /* renamed from: a */
        public final void mo53845a() {
            this.f34251h.mo53828a();
        }

        /* renamed from: b */
        public final void mo53846b(Long l) {
            if (l == null) {
                SingleDateSelector.this.clearSelection();
            } else {
                SingleDateSelector.this.select(l.longValue());
            }
            this.f34251h.mo53829b(SingleDateSelector.this.getSelection());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    public static class C15282b implements Parcelable.Creator<SingleDateSelector> {
        public final Object createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        public final Object[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    public int describeContents() {
        return 0;
    }

    public int getDefaultThemeResId(Context context) {
        return C14024b.m21581b(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_date_header_title;
    }

    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    public Collection<C6619c<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, new Object[]{C15288f.m24840c(l.longValue(), Locale.getDefault())});
    }

    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C15296m<Long> mVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C19421p.m32927Q()) {
            editText.setInputType(17);
        }
        SimpleDateFormat d = C15301r.m24854d();
        String e = C15301r.m24855e(inflate.getResources(), d);
        textInputLayout.setPlaceholderText(e);
        Long l = this.selectedItem;
        if (l != null) {
            editText.setText(d.format(l));
        }
        editText.addTextChangedListener(new C15281a(e, d, textInputLayout, calendarConstraints, mVar));
        editText.requestFocus();
        editText.post(new C15368h(editText));
        return inflate;
    }

    public void select(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }

    public Long getSelection() {
        return this.selectedItem;
    }

    public void setSelection(Long l) {
        this.selectedItem = l == null ? null : Long.valueOf(C15301r.m24851a(l.longValue()));
    }
}
