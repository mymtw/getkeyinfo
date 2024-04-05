package com.appboy.enums;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    
    public static final Companion Companion = null;
    private final int value;

    public static final class Companion {

        /* renamed from: com.appboy.enums.Month$Companion$a */
        public static final class C4906a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ int f11098b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4906a(int i) {
                super(0);
                this.f11098b = i;
            }

            /* renamed from: a */
            public final String invoke() {
                return C0071c.m191c(C0072d.m201h("No month with value "), this.f11098b, ", value must be in (0,11)");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Month getMonth(int i) {
            Month month;
            boolean z;
            Month[] values = Month.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    month = null;
                    break;
                }
                month = values[i2];
                i2++;
                if (month.getValue() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (month != null) {
                return month;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4906a(i), 6);
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Month(int i) {
        this.value = i;
    }

    public static final Month getMonth(int i) {
        return Companion.getMonth(i);
    }

    public final int getValue() {
        return this.value;
    }
}
