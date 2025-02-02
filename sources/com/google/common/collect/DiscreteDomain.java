package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.base.C15794l;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public abstract class DiscreteDomain<C extends Comparable> {
    public final boolean supportsFastOffset;

    public static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* renamed from: b */
        public static final BigIntegerDomain f35849b = new BigIntegerDomain();

        /* renamed from: c */
        public static final BigInteger f35850c = BigInteger.valueOf(Long.MIN_VALUE);

        /* renamed from: d */
        public static final BigInteger f35851d = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public BigIntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f35849b;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f35850c).min(f35851d).longValue();
        }

        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        public BigInteger offset(BigInteger bigInteger, long j) {
            C16203o.m26216c(j);
            return bigInteger.add(BigInteger.valueOf(j));
        }

        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* renamed from: b */
        public static final IntegerDomain f35852b = new IntegerDomain();
        private static final long serialVersionUID = 0;

        public IntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f35852b;
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        public Integer maxValue() {
            return Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        public Integer next(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        public Integer offset(Integer num, long j) {
            C16203o.m26216c(j);
            return Integer.valueOf(Ints.m26383a(num.longValue() + j));
        }

        public Integer previous(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }
    }

    public static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* renamed from: b */
        public static final LongDomain f35853b = new LongDomain();
        private static final long serialVersionUID = 0;

        public LongDomain() {
            super(true);
        }

        private Object readResolve() {
            return f35853b;
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        public long distance(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        public Long minValue() {
            return Long.MIN_VALUE;
        }

        public Long next(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        public Long offset(Long l, long j) {
            C16203o.m26216c(j);
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                C15794l.m25614h(l.longValue() < 0, "overflow");
            }
            return Long.valueOf(longValue);
        }

        public Long previous(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.f35849b;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.f35852b;
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.f35853b;
    }

    public abstract long distance(C c, C c2);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c);

    public C offset(C c, long j) {
        C16203o.m26216c(j);
        for (long j2 = 0; j2 < j; j2++) {
            c = next(c);
        }
        return c;
    }

    public abstract C previous(C c);

    public DiscreteDomain() {
        this(false);
    }

    public DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }
}
