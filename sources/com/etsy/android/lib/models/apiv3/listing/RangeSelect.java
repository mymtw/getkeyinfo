package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p764pq.C20055g;

@C17403o(generateAdapter = true)
public final class RangeSelect {
    public static final int $stable = 0;
    private final Boolean enabled;
    private final String label;
    private final int max;
    private final int min;
    private final Integer selected;
    private final int step;

    public RangeSelect(@C17402n(name = "enabled") Boolean bool, @C17402n(name = "label") String str, @C17402n(name = "max") int i, @C17402n(name = "min") int i2, @C17402n(name = "selected") Integer num, @C17402n(name = "step") int i3) {
        this.enabled = bool;
        this.label = str;
        this.max = i;
        this.min = i2;
        this.selected = num;
        this.step = i3;
    }

    public static /* synthetic */ RangeSelect copy$default(RangeSelect rangeSelect, Boolean bool, String str, int i, int i2, Integer num, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = rangeSelect.enabled;
        }
        if ((i4 & 2) != 0) {
            str = rangeSelect.label;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            i = rangeSelect.max;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = rangeSelect.min;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            num = rangeSelect.selected;
        }
        Integer num2 = num;
        if ((i4 & 32) != 0) {
            i3 = rangeSelect.step;
        }
        return rangeSelect.copy(bool, str2, i5, i6, num2, i3);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.max;
    }

    public final int component4() {
        return this.min;
    }

    public final Integer component5() {
        return this.selected;
    }

    public final int component6() {
        return this.step;
    }

    public final RangeSelect copy(@C17402n(name = "enabled") Boolean bool, @C17402n(name = "label") String str, @C17402n(name = "max") int i, @C17402n(name = "min") int i2, @C17402n(name = "selected") Integer num, @C17402n(name = "step") int i3) {
        return new RangeSelect(bool, str, i, i2, num, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangeSelect)) {
            return false;
        }
        RangeSelect rangeSelect = (RangeSelect) obj;
        return C19383o.m32792b(this.enabled, rangeSelect.enabled) && C19383o.m32792b(this.label, rangeSelect.label) && this.max == rangeSelect.max && this.min == rangeSelect.min && C19383o.m32792b(this.selected, rangeSelect.selected) && this.step == rangeSelect.step;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final Integer getSelected() {
        return this.selected;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.label;
        int a = C0069a.m170a(this.min, C0069a.m170a(this.max, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.selected;
        if (num != null) {
            i = num.hashCode();
        }
        return Integer.hashCode(this.step) + ((a + i) * 31);
    }

    public final Integer[] integerSequence() {
        ArrayList arrayList = new ArrayList();
        int i = this.min;
        int i2 = this.max;
        if (i > i2) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        boolean z = i > 0 && i == i2;
        int i4 = this.step;
        if (i4 >= 0 && (i4 > 0 || z)) {
            if (i4 > 0) {
                C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(i, i2), this.step);
                int i5 = B0.f44414b;
                int i6 = B0.f44415c;
                int i7 = B0.f44416d;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        arrayList.add(Integer.valueOf(i5));
                        if (i5 == i6) {
                            break;
                        }
                        i5 += i7;
                    }
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Integer[]) array;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("RangeSelect(enabled=");
        h.append(this.enabled);
        h.append(", label=");
        h.append(this.label);
        h.append(", max=");
        h.append(this.max);
        h.append(", min=");
        h.append(this.min);
        h.append(", selected=");
        h.append(this.selected);
        h.append(", step=");
        return C0073e.m208h(h, this.step, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RangeSelect(Boolean bool, String str, int i, int i2, Integer num, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, num, (i4 & 32) != 0 ? 0 : i3);
    }
}
