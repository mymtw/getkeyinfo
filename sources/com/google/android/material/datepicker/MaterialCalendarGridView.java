package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.internal.C15370j;
import java.util.Calendar;
import java.util.Iterator;
import p077d1.C6619c;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f34229b = C15301r.m24857g((Calendar) null);

    /* renamed from: c */
    public final boolean f34230c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f34230c = MaterialDatePicker.isNestedScrollable(getContext());
        C2364y.m5201p(this, new C15290h());
    }

    /* renamed from: a */
    public final C15292j getAdapter() {
        return (C15292j) super.getAdapter();
    }

    /* renamed from: b */
    public final View mo53802b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C15292j a = getAdapter();
        DateSelector<?> dateSelector = a.f34282c;
        C15284b bVar = a.f34284e;
        int max = Math.max(a.mo53863a(), getFirstVisiblePosition());
        int min = Math.min(a.mo53865c(), getLastVisiblePosition());
        Long b = a.getItem(max);
        Long b2 = a.getItem(min);
        Iterator<C6619c<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            C6619c next = it.next();
            F f = next.f14606a;
            if (f == null) {
                materialCalendarGridView = this;
            } else if (next.f14607b != null) {
                long longValue = ((Long) f).longValue();
                long longValue2 = ((Long) next.f14607b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(b == null || b2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > b2.longValue() || valueOf2.longValue() < b.longValue())) {
                    boolean d = C15370j.m24963d(this);
                    if (longValue < b.longValue()) {
                        i2 = max % a.f34281b.f34239e == 0 ? 0 : !d ? materialCalendarGridView.mo53802b(max - 1).getRight() : materialCalendarGridView.mo53802b(max - 1).getLeft();
                        i = max;
                    } else {
                        materialCalendarGridView.f34229b.setTimeInMillis(longValue);
                        i = a.mo53863a() + (materialCalendarGridView.f34229b.get(5) - 1);
                        View b3 = materialCalendarGridView.mo53802b(i);
                        i2 = (b3.getWidth() / 2) + b3.getLeft();
                    }
                    if (longValue2 > b2.longValue()) {
                        i4 = (min + 1) % a.f34281b.f34239e == 0 ? getWidth() : !d ? materialCalendarGridView.mo53802b(min).getRight() : materialCalendarGridView.mo53802b(min).getLeft();
                        i3 = min;
                    } else {
                        materialCalendarGridView.f34229b.setTimeInMillis(longValue2);
                        i3 = a.mo53863a() + (materialCalendarGridView.f34229b.get(5) - 1);
                        View b4 = materialCalendarGridView.mo53802b(i3);
                        i4 = (b4.getWidth() / 2) + b4.getLeft();
                    }
                    int itemId = (int) a.getItemId(i);
                    int i7 = max;
                    int i8 = min;
                    int itemId2 = (int) a.getItemId(i3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b5 = materialCalendarGridView.mo53802b(numColumns);
                        int top = b5.getTop() + bVar.f34259a.f34253a.top;
                        C15292j jVar = a;
                        int bottom = b5.getBottom() - bVar.f34259a.f34253a.bottom;
                        if (!d) {
                            i6 = numColumns > i ? 0 : i2;
                            i5 = i3 > numColumns2 ? getWidth() : i4;
                        } else {
                            int i9 = i3 > numColumns2 ? 0 : i4;
                            i5 = numColumns > i ? getWidth() : i2;
                            i6 = i9;
                        }
                        canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.f34266h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        a = jVar;
                    }
                    materialCalendarGridView = this;
                    max = i7;
                    min = i8;
                }
            }
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().mo53865c());
        } else if (i == 130) {
            setSelection(getAdapter().mo53863a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo53863a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo53863a());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f34230c) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setSelection(int i) {
        if (i < getAdapter().mo53863a()) {
            super.setSelection(getAdapter().mo53863a());
        } else {
            super.setSelection(i);
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C15292j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C15292j.class.getCanonicalName()}));
        }
    }
}
