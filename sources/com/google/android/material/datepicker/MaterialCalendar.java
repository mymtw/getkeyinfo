package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.p013v4.media.C0069a;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.C2273a;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.C3132c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p077d1.C6619c;
import p088e1.C6689b;

public final class MaterialCalendar<S> extends C15297n<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    public static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    public static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    public static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    public static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    /* access modifiers changed from: private */
    public CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    /* access modifiers changed from: private */
    public C15284b calendarStyle;
    /* access modifiers changed from: private */
    public Month current;
    /* access modifiers changed from: private */
    public DateSelector<S> dateSelector;
    /* access modifiers changed from: private */
    public View dayFrame;
    /* access modifiers changed from: private */
    public RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    /* access modifiers changed from: private */
    public RecyclerView yearSelector;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    public class C15260a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f34212b;

        public C15260a(int i) {
            this.f34212b = i;
        }

        public final void run() {
            MaterialCalendar.this.recyclerView.smoothScrollToPosition(this.f34212b);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    public class C15261b extends C2273a {
        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18868r((C6689b.C6691b) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    public class C15262c extends C15299p {

        /* renamed from: E */
        public final /* synthetic */ int f34214E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15262c(int i, int i2) {
            super(i);
            this.f34214E = i2;
        }

        /* renamed from: H0 */
        public final void mo11271H0(RecyclerView.C3117y yVar, int[] iArr) {
            if (this.f34214E == 0) {
                iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
            iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    public class C15263d implements C15270k {
        public C15263d() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    public class C15264e extends RecyclerView.C3099n {

        /* renamed from: a */
        public final Calendar f34217a = C15301r.m24857g((Calendar) null);

        /* renamed from: b */
        public final Calendar f34218b = C15301r.m24857g((Calendar) null);

        public C15264e() {
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
            int i;
            int i2;
            if ((recyclerView.getAdapter() instanceof C15303t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C15303t tVar = (C15303t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C6619c next : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                    F f = next.f14606a;
                    if (!(f == null || next.f14607b == null)) {
                        this.f34217a.setTimeInMillis(((Long) f).longValue());
                        this.f34218b.setTimeInMillis(((Long) next.f14607b).longValue());
                        int i3 = this.f34217a.get(1) - tVar.f34301b.getCalendarConstraints().getStart().f34238d;
                        int i4 = this.f34218b.get(1) - tVar.f34301b.getCalendarConstraints().getStart().f34238d;
                        View s = gridLayoutManager.mo11314s(i3);
                        View s2 = gridLayoutManager.mo11314s(i4);
                        int i5 = gridLayoutManager.f7003F;
                        int i6 = i3 / i5;
                        int i7 = i4 / i5;
                        for (int i8 = i6; i8 <= i7; i8++) {
                            View s3 = gridLayoutManager.mo11314s(gridLayoutManager.f7003F * i8);
                            if (s3 != null) {
                                int top = s3.getTop() + MaterialCalendar.this.calendarStyle.f34262d.f34253a.top;
                                int bottom = s3.getBottom() - MaterialCalendar.this.calendarStyle.f34262d.f34253a.bottom;
                                if (i8 == i6) {
                                    i = (s.getWidth() / 2) + s.getLeft();
                                } else {
                                    i = 0;
                                }
                                if (i8 == i7) {
                                    i2 = (s2.getWidth() / 2) + s2.getLeft();
                                } else {
                                    i2 = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, MaterialCalendar.this.calendarStyle.f34266h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    public class C15265f extends C2273a {
        public C15265f() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.f14759a.setHintText(MaterialCalendar.this.dayFrame.getVisibility() == 0 ? MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    public class C15266g extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ C15294l f34221b;

        /* renamed from: c */
        public final /* synthetic */ MaterialButton f34222c;

        public C15266g(C15294l lVar, MaterialButton materialButton) {
            this.f34221b = lVar;
            this.f34222c = materialButton;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f34222c.getText());
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int S0 = i < 0 ? MaterialCalendar.this.getLayoutManager().mo11282S0() : MaterialCalendar.this.getLayoutManager().mo11284U0();
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            Calendar c = C15301r.m24853c(this.f34221b.f34289c.getStart().f34236b);
            c.add(2, S0);
            Month unused = materialCalendar.current = new Month(c);
            MaterialButton materialButton = this.f34222c;
            C15294l lVar = this.f34221b;
            Calendar c2 = C15301r.m24853c(lVar.f34289c.getStart().f34236b);
            c2.add(2, S0);
            materialButton.setText(new Month(c2).mo53837g(lVar.f34288b));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    public class C15267h implements View.OnClickListener {
        public C15267h() {
        }

        public final void onClick(View view) {
            MaterialCalendar.this.toggleVisibleSelector();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    public class C15268i implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C15294l f34225b;

        public C15268i(C15294l lVar) {
            this.f34225b = lVar;
        }

        public final void onClick(View view) {
            int S0 = MaterialCalendar.this.getLayoutManager().mo11282S0() + 1;
            if (S0 < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                Calendar c = C15301r.m24853c(this.f34225b.f34289c.getStart().f34236b);
                c.add(2, S0);
                materialCalendar.setCurrentMonth(new Month(c));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    public class C15269j implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C15294l f34227b;

        public C15269j(C15294l lVar) {
            this.f34227b = lVar;
        }

        public final void onClick(View view) {
            int U0 = MaterialCalendar.this.getLayoutManager().mo11284U0() - 1;
            if (U0 >= 0) {
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                Calendar c = C15301r.m24853c(this.f34227b.f34289c.getStart().f34236b);
                c.add(2, U0);
                materialCalendar.setCurrentMonth(new Month(c));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    public interface C15270k {
    }

    private void addActionsToMonthNavigation(View view, C15294l lVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        C2364y.m5201p(materialButton, new C15265f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.month_navigation_previous);
        materialButton2.setTag(NAVIGATION_PREV_TAG);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.month_navigation_next);
        materialButton3.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.mo53837g(view.getContext()));
        this.recyclerView.addOnScrollListener(new C15266g(lVar, materialButton));
        materialButton.setOnClickListener(new C15267h());
        materialButton3.setOnClickListener(new C15268i(lVar));
        materialButton2.setOnClickListener(new C15269j(lVar));
    }

    private RecyclerView.C3099n createItemDecoration() {
        return new C15264e();
    }

    public static int getDayHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private static int getDialogPickerHeight(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i = C15292j.f34280g;
        return C0069a.m171b(dimensionPixelOffset, dimensionPixelSize, (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i), resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector2, int i, CalendarConstraints calendarConstraints2) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector2);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints2);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints2.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void postSmoothRecyclerViewScroll(int i) {
        this.recyclerView.post(new C15260a(i));
    }

    public boolean addOnSelectionChangedListener(C15296m<S> mVar) {
        return super.addOnSelectionChangedListener(mVar);
    }

    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public C15284b getCalendarStyle() {
        return this.calendarStyle;
    }

    public Month getCurrentMonth() {
        return this.current;
    }

    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new C15284b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        C2364y.m5201p(gridView, new C15261b());
        gridView.setAdapter(new C15289g());
        gridView.setNumColumns(start.f34239e);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.recyclerView.setLayoutManager(new C15262c(i, i));
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        C15294l lVar = new C15294l(contextThemeWrapper, this.dateSelector, this.calendarConstraints, new C15263d());
        this.recyclerView.setAdapter(lVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager(integer, 1));
            this.yearSelector.setAdapter(new C15303t(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(inflate, lVar);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new C3132c0().mo11867a(this.recyclerView);
        }
        RecyclerView recyclerView3 = this.recyclerView;
        Month month = this.current;
        Month start2 = lVar.f34289c.getStart();
        if (start2.f34236b instanceof GregorianCalendar) {
            recyclerView3.scrollToPosition((month.f34237c - start2.f34237c) + ((month.f34238d - start2.f34238d) * 12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void setCurrentMonth(Month month) {
        C15294l lVar = (C15294l) this.recyclerView.getAdapter();
        Month start = lVar.f34289c.getStart();
        if (start.f34236b instanceof GregorianCalendar) {
            int i = (month.f34237c - start.f34237c) + ((month.f34238d - start.f34238d) * 12);
            Month month2 = this.current;
            Month start2 = lVar.f34289c.getStart();
            if (start2.f34236b instanceof GregorianCalendar) {
                int i2 = i - ((month2.f34237c - start2.f34237c) + ((month2.f34238d - start2.f34238d) * 12));
                boolean z = true;
                boolean z2 = Math.abs(i2) > 3;
                if (i2 <= 0) {
                    z = false;
                }
                this.current = month;
                if (z2 && z) {
                    this.recyclerView.scrollToPosition(i - 3);
                    postSmoothRecyclerViewScroll(i);
                } else if (z2) {
                    this.recyclerView.scrollToPosition(i + 3);
                    postSmoothRecyclerViewScroll(i);
                } else {
                    postSmoothRecyclerViewScroll(i);
                }
            } else {
                throw new IllegalArgumentException("Only Gregorian calendars are supported.");
            }
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public void setSelector(CalendarSelector calendarSelector2) {
        this.calendarSelector = calendarSelector2;
        if (calendarSelector2 == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().mo11315u0(this.current.f34238d - ((C15303t) this.yearSelector.getAdapter()).f34301b.getCalendarConstraints().getStart().f34238d);
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
        } else if (calendarSelector2 == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector2 = this.calendarSelector;
        CalendarSelector calendarSelector3 = CalendarSelector.YEAR;
        if (calendarSelector2 == calendarSelector3) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector2 == CalendarSelector.DAY) {
            setSelector(calendarSelector3);
        }
    }
}
