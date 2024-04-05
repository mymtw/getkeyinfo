package com.etsy.android.uikit.pageindicator;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class ScalingPageIndicatorLogic {

    /* renamed from: a */
    public final int f26411a;

    public enum CircleSize {
        INVISIBLE,
        SMALL,
        MEDIUM,
        FULL
    }

    public enum Direction {
        RIGHT,
        LEFT,
        NONE
    }

    /* renamed from: com.etsy.android.uikit.pageindicator.ScalingPageIndicatorLogic$a */
    public /* synthetic */ class C11874a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26412a;

        static {
            int[] iArr = new int[Direction.values().length];
            iArr[Direction.RIGHT.ordinal()] = 1;
            iArr[Direction.LEFT.ordinal()] = 2;
            iArr[Direction.NONE.ordinal()] = 3;
            f26412a = iArr;
        }
    }

    public ScalingPageIndicatorLogic(int i) {
        this.f26411a = i;
    }

    /* renamed from: a */
    public final List<CircleSize> mo38362a(int i, List<? extends CircleSize> list, Direction direction) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C19383o.m32797g(list, "currentCircles");
        C19383o.m32797g(direction, "direction");
        int i7 = C11874a.f26412a[direction.ordinal()];
        int i8 = 0;
        if (i7 == 1) {
            i2 = i + 1;
        } else if (i7 == 2) {
            i2 = i - 1;
        } else if (i7 == 3) {
            i2 = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if ((!list.isEmpty()) && i2 > 0 && i2 < list.size() && ((CircleSize) list.get(i2)) == CircleSize.FULL) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = this.f26411a;
        if (i9 <= 5) {
            while (i8 < i9) {
                arrayList.add(CircleSize.FULL);
                i8++;
            }
            return arrayList;
        }
        if (direction == Direction.NONE || direction == Direction.RIGHT) {
            int i10 = i2 - 3;
            i5 = Math.max((i10 - 2) + 1, 0);
            int min = Math.min(Math.max(i10 + 1, 0), 2);
            i6 = Math.min((this.f26411a - i2) - 1, 2);
            int i11 = min;
            i3 = (((this.f26411a - i5) - min) - 3) - i6;
            i4 = i11;
        } else if (direction == Direction.LEFT) {
            i3 = Math.max(((i9 - i2) - 3) - 2, 0);
            i6 = Math.min(Math.max((this.f26411a - i2) - 3, 0), 2);
            i4 = Math.min(i2, 2);
            i5 = (((this.f26411a - i3) - i4) - 3) - i6;
        } else {
            i4 = 0;
            i3 = 0;
            i6 = 0;
            i5 = 0;
        }
        for (int i12 = 0; i12 < i5; i12++) {
            arrayList.add(CircleSize.INVISIBLE);
        }
        if (i4 == 1) {
            arrayList.add(CircleSize.MEDIUM);
        } else if (i4 == 2) {
            arrayList.add(CircleSize.SMALL);
            arrayList.add(CircleSize.MEDIUM);
        }
        for (int i13 = 0; i13 < 3; i13++) {
            arrayList.add(CircleSize.FULL);
        }
        if (i6 == 1) {
            arrayList.add(CircleSize.MEDIUM);
        } else if (i6 == 2) {
            arrayList.add(CircleSize.MEDIUM);
            arrayList.add(CircleSize.SMALL);
        }
        while (i8 < i3) {
            arrayList.add(CircleSize.INVISIBLE);
            i8++;
        }
        return arrayList;
    }
}
