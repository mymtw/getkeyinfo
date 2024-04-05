package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.etsy.android.R;
import com.google.android.material.internal.C15368h;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;
import kotlin.reflect.C19421p;
import p077d1.C6619c;
import p507al.C14024b;

public class RangeDateSelector implements DateSelector<C6619c<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C15280c();
    private final String invalidRangeEndError = " ";
    private String invalidRangeStartError;
    /* access modifiers changed from: private */
    public Long proposedTextEnd = null;
    /* access modifiers changed from: private */
    public Long proposedTextStart = null;
    /* access modifiers changed from: private */
    public Long selectedEndItem = null;
    /* access modifiers changed from: private */
    public Long selectedStartItem = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    public class C15278a extends C15287e {

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f34243h;

        /* renamed from: i */
        public final /* synthetic */ TextInputLayout f34244i;

        /* renamed from: j */
        public final /* synthetic */ C15296m f34245j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15278a(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C15296m mVar) {
            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
            this.f34243h = textInputLayout2;
            this.f34244i = textInputLayout3;
            this.f34245j = mVar;
        }

        /* renamed from: a */
        public final void mo53845a() {
            Long unused = RangeDateSelector.this.proposedTextStart = null;
            RangeDateSelector.this.updateIfValidTextProposal(this.f34243h, this.f34244i, this.f34245j);
        }

        /* renamed from: b */
        public final void mo53846b(Long l) {
            Long unused = RangeDateSelector.this.proposedTextStart = l;
            RangeDateSelector.this.updateIfValidTextProposal(this.f34243h, this.f34244i, this.f34245j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    public class C15279b extends C15287e {

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f34247h;

        /* renamed from: i */
        public final /* synthetic */ TextInputLayout f34248i;

        /* renamed from: j */
        public final /* synthetic */ C15296m f34249j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15279b(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C15296m mVar) {
            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
            this.f34247h = textInputLayout2;
            this.f34248i = textInputLayout3;
            this.f34249j = mVar;
        }

        /* renamed from: a */
        public final void mo53845a() {
            Long unused = RangeDateSelector.this.proposedTextEnd = null;
            RangeDateSelector.this.updateIfValidTextProposal(this.f34247h, this.f34248i, this.f34249j);
        }

        /* renamed from: b */
        public final void mo53846b(Long l) {
            Long unused = RangeDateSelector.this.proposedTextEnd = l;
            RangeDateSelector.this.updateIfValidTextProposal(this.f34247h, this.f34248i, this.f34249j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    public static class C15280c implements Parcelable.Creator<RangeDateSelector> {
        public final Object createFromParcel(Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.selectedStartItem = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.selectedEndItem = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        public final Object[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    private void clearInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    private boolean isValidRange(long j, long j2) {
        return j <= j2;
    }

    private void setInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    /* access modifiers changed from: private */
    public void updateIfValidTextProposal(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C15296m<C6619c<Long, Long>> mVar) {
        Long l = this.proposedTextStart;
        if (l == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            mVar.mo53828a();
        } else if (isValidRange(l.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            mVar.mo53829b(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            mVar.mo53828a();
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getDefaultThemeResId(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return C14024b.m21581b(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedStartItem;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public Collection<C6619c<Long, Long>> getSelectedRanges() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6619c(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedStartItem;
        if (l == null && this.selectedEndItem == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.selectedEndItem;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, new Object[]{C15288f.m24838a(l.longValue())});
        } else if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, new Object[]{C15288f.m24838a(l2.longValue())});
        } else {
            Calendar f = C15301r.m24856f();
            Calendar g = C15301r.m24857g((Calendar) null);
            g.setTimeInMillis(l.longValue());
            Calendar g2 = C15301r.m24857g((Calendar) null);
            g2.setTimeInMillis(l2.longValue());
            C6619c cVar = g.get(1) == g2.get(1) ? g.get(1) == f.get(1) ? new C6619c(C15288f.m24839b(l.longValue(), Locale.getDefault()), C15288f.m24839b(l2.longValue(), Locale.getDefault())) : new C6619c(C15288f.m24839b(l.longValue(), Locale.getDefault()), C15288f.m24840c(l2.longValue(), Locale.getDefault())) : new C6619c(C15288f.m24840c(l.longValue(), Locale.getDefault()), C15288f.m24840c(l2.longValue(), Locale.getDefault()));
            return resources.getString(R.string.mtrl_picker_range_header_selected, new Object[]{cVar.f14606a, cVar.f14607b});
        }
    }

    public boolean isSelectionComplete() {
        Long l = this.selectedStartItem;
        return (l == null || this.selectedEndItem == null || !isValidRange(l.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C15296m<C6619c<Long, Long>> mVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C19421p.m32927Q()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat d = C15301r.m24854d();
        Long l = this.selectedStartItem;
        if (l != null) {
            editText.setText(d.format(l));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            editText2.setText(d.format(l2));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String e = C15301r.m24855e(inflate.getResources(), d);
        textInputLayout.setPlaceholderText(e);
        textInputLayout2.setPlaceholderText(e);
        SimpleDateFormat simpleDateFormat = d;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        C15278a aVar = r0;
        TextInputLayout textInputLayout4 = textInputLayout2;
        String str = e;
        C15296m<C6619c<Long, Long>> mVar2 = mVar;
        C15278a aVar2 = new C15278a(e, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, mVar2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(new C15279b(str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, mVar2));
        editText.requestFocus();
        editText.post(new C15368h(editText));
        return inflate;
    }

    public void select(long j) {
        Long l = this.selectedStartItem;
        if (l == null) {
            this.selectedStartItem = Long.valueOf(j);
        } else if (this.selectedEndItem != null || !isValidRange(l.longValue(), j)) {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j);
        } else {
            this.selectedEndItem = Long.valueOf(j);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    public C6619c<Long, Long> getSelection() {
        return new C6619c<>(this.selectedStartItem, this.selectedEndItem);
    }

    public void setSelection(C6619c<Long, Long> cVar) {
        Long l;
        F f = cVar.f14606a;
        if (f == null || cVar.f14607b == null || isValidRange(((Long) f).longValue(), ((Long) cVar.f14607b).longValue())) {
            F f2 = cVar.f14606a;
            Long l2 = null;
            if (f2 == null) {
                l = null;
            } else {
                l = Long.valueOf(C15301r.m24851a(((Long) f2).longValue()));
            }
            this.selectedStartItem = l;
            S s = cVar.f14607b;
            if (s != null) {
                l2 = Long.valueOf(C15301r.m24851a(((Long) s).longValue()));
            }
            this.selectedEndItem = l2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
