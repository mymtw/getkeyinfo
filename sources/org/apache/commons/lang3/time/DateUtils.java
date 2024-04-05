package org.apache.commons.lang3.time;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DateUtils {
    public static final long MILLIS_PER_DAY = 86400000;
    public static final long MILLIS_PER_HOUR = 3600000;
    public static final long MILLIS_PER_MINUTE = 60000;
    public static final long MILLIS_PER_SECOND = 1000;
    private static final int MODIFY_CEILING = 2;
    private static final int MODIFY_ROUND = 1;
    private static final int MODIFY_TRUNCATE = 0;
    public static final int RANGE_MONTH_MONDAY = 6;
    public static final int RANGE_MONTH_SUNDAY = 5;
    public static final int RANGE_WEEK_CENTER = 4;
    public static final int RANGE_WEEK_MONDAY = 2;
    public static final int RANGE_WEEK_RELATIVE = 3;
    public static final int RANGE_WEEK_SUNDAY = 1;
    public static final int SEMI_MONTH = 1001;
    private static final int[][] fields = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, SEMI_MONTH}, new int[]{1}, new int[]{0}};

    public static class DateIterator implements Iterator<Calendar> {
        private final Calendar endFinal;
        private final Calendar spot;

        public DateIterator(Calendar calendar, Calendar calendar2) {
            this.endFinal = calendar2;
            this.spot = calendar;
            calendar.add(5, -1);
        }

        public boolean hasNext() {
            return this.spot.before(this.endFinal);
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Calendar next() {
            if (!this.spot.equals(this.endFinal)) {
                this.spot.add(5, 1);
                return (Calendar) this.spot.clone();
            }
            throw new NoSuchElementException();
        }
    }

    private static Date add(Date date, int i, int i2) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.add(i, i2);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Date addDays(Date date, int i) {
        return add(date, 5, i);
    }

    public static Date addHours(Date date, int i) {
        return add(date, 11, i);
    }

    public static Date addMilliseconds(Date date, int i) {
        return add(date, 14, i);
    }

    public static Date addMinutes(Date date, int i) {
        return add(date, 12, i);
    }

    public static Date addMonths(Date date, int i) {
        return add(date, 2, i);
    }

    public static Date addSeconds(Date date, int i) {
        return add(date, 13, i);
    }

    public static Date addWeeks(Date date, int i) {
        return add(date, 3, i);
    }

    public static Date addYears(Date date, int i) {
        return add(date, 1, i);
    }

    public static Date ceiling(Date date, int i) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            modify(instance, i, 2);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    private static long getFragment(Date date, int i, int i2) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            return getFragment(instance, i, i2);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static long getFragmentInDays(Date date, int i) {
        return getFragment(date, i, 6);
    }

    public static long getFragmentInHours(Date date, int i) {
        return getFragment(date, i, 11);
    }

    public static long getFragmentInMilliseconds(Date date, int i) {
        return getFragment(date, i, 14);
    }

    public static long getFragmentInMinutes(Date date, int i) {
        return getFragment(date, i, 12);
    }

    public static long getFragmentInSeconds(Date date, int i) {
        return getFragment(date, i, 13);
    }

    private static long getMillisPerUnit(int i) {
        if (i == 5 || i == 6) {
            return MILLIS_PER_DAY;
        }
        switch (i) {
            case 11:
                return MILLIS_PER_HOUR;
            case 12:
                return MILLIS_PER_MINUTE;
            case 13:
                return 1000;
            case 14:
                return 1;
            default:
                throw new IllegalArgumentException(C0069a.m175f("The unit ", i, " cannot be represented is milleseconds"));
        }
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        return isSameDay(instance, instance2);
    }

    public static boolean isSameInstant(Date date, Date date2) {
        if (date != null && date2 != null) {
            return date.getTime() == date2.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static boolean isSameLocalTime(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == calendar2.get(11) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Iterator<Calendar> iterator(Date date, int i) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            return iterator(instance, i);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d1, code lost:
        if (r7 > 7) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e5, code lost:
        if (r7 >= 6) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e9, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0120 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void modify(java.util.Calendar r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 1
            int r4 = r0.get(r3)
            r5 = 280000000(0x10b07600, float:6.960157E-29)
            if (r4 > r5) goto L_0x0133
            r4 = 14
            if (r1 != r4) goto L_0x0015
            return
        L_0x0015:
            java.util.Date r5 = r17.getTime()
            long r6 = r5.getTime()
            int r4 = r0.get(r4)
            if (r2 == 0) goto L_0x0027
            r8 = 500(0x1f4, float:7.0E-43)
            if (r4 >= r8) goto L_0x0029
        L_0x0027:
            long r8 = (long) r4
            long r6 = r6 - r8
        L_0x0029:
            r4 = 13
            if (r1 != r4) goto L_0x002f
            r8 = r3
            goto L_0x0030
        L_0x002f:
            r8 = 0
        L_0x0030:
            int r4 = r0.get(r4)
            r9 = 30
            if (r8 != 0) goto L_0x0041
            if (r2 == 0) goto L_0x003c
            if (r4 >= r9) goto L_0x0041
        L_0x003c:
            long r10 = (long) r4
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            long r6 = r6 - r10
        L_0x0041:
            r4 = 12
            if (r1 != r4) goto L_0x0046
            r8 = r3
        L_0x0046:
            int r4 = r0.get(r4)
            if (r8 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0050
            if (r4 >= r9) goto L_0x0056
        L_0x0050:
            long r8 = (long) r4
            r10 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 * r10
            long r6 = r6 - r8
        L_0x0056:
            long r8 = r5.getTime()
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
            r5.setTime(r6)
            r0.setTime(r5)
        L_0x0064:
            int[][] r4 = fields
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x0069:
            if (r6 >= r5) goto L_0x0125
            r8 = r4[r6]
            int r9 = r8.length
            r10 = 0
        L_0x006f:
            r11 = 15
            r12 = 1001(0x3e9, float:1.403E-42)
            r13 = 2
            r14 = 5
            if (r10 >= r9) goto L_0x00bb
            r15 = r8[r10]
            if (r15 != r1) goto L_0x00b8
            if (r2 == r13) goto L_0x0081
            if (r2 != r3) goto L_0x00b7
            if (r7 == 0) goto L_0x00b7
        L_0x0081:
            if (r1 != r12) goto L_0x0096
            int r1 = r0.get(r14)
            if (r1 != r3) goto L_0x008d
            r0.add(r14, r11)
            goto L_0x00b7
        L_0x008d:
            r1 = -15
            r0.add(r14, r1)
            r0.add(r13, r3)
            goto L_0x00b7
        L_0x0096:
            r2 = 9
            if (r1 != r2) goto L_0x00b1
            r1 = 11
            int r2 = r0.get(r1)
            if (r2 != 0) goto L_0x00a8
            r2 = 12
            r0.add(r1, r2)
            goto L_0x00b7
        L_0x00a8:
            r2 = -12
            r0.add(r1, r2)
            r0.add(r14, r3)
            goto L_0x00b7
        L_0x00b1:
            r1 = 0
            r1 = r8[r1]
            r0.add(r1, r3)
        L_0x00b7:
            return
        L_0x00b8:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x00bb:
            r9 = 0
            r10 = 9
            if (r1 == r10) goto L_0x00d4
            if (r1 == r12) goto L_0x00c3
            goto L_0x00ec
        L_0x00c3:
            r9 = r8[r9]
            if (r9 != r14) goto L_0x00ec
            int r7 = r0.get(r14)
            int r7 = r7 - r3
            if (r7 < r11) goto L_0x00d0
            int r7 = r7 + -15
        L_0x00d0:
            r9 = 7
            if (r7 <= r9) goto L_0x00e9
            goto L_0x00e7
        L_0x00d4:
            r9 = r8[r9]
            r10 = 11
            if (r9 != r10) goto L_0x00ec
            int r7 = r0.get(r10)
            r9 = 12
            if (r7 < r9) goto L_0x00e4
            int r7 = r7 + -12
        L_0x00e4:
            r9 = 6
            if (r7 < r9) goto L_0x00e9
        L_0x00e7:
            r9 = r3
            goto L_0x00ea
        L_0x00e9:
            r9 = 0
        L_0x00ea:
            r10 = r3
            goto L_0x00f3
        L_0x00ec:
            r9 = 0
            r10 = 0
            r16 = r9
            r9 = r7
            r7 = r16
        L_0x00f3:
            if (r10 != 0) goto L_0x0113
            r7 = 0
            r9 = r8[r7]
            int r9 = r0.getActualMinimum(r9)
            r10 = r8[r7]
            int r10 = r0.getActualMaximum(r10)
            r11 = r8[r7]
            int r11 = r0.get(r11)
            int r11 = r11 - r9
            int r10 = r10 - r9
            int r10 = r10 / r13
            if (r11 <= r10) goto L_0x010f
            r9 = r3
            goto L_0x0110
        L_0x010f:
            r9 = r7
        L_0x0110:
            r10 = r7
            r7 = r11
            goto L_0x0114
        L_0x0113:
            r10 = 0
        L_0x0114:
            if (r7 == 0) goto L_0x0120
            r8 = r8[r10]
            int r10 = r0.get(r8)
            int r10 = r10 - r7
            r0.set(r8, r10)
        L_0x0120:
            int r6 = r6 + 1
            r7 = r9
            goto L_0x0069
        L_0x0125:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The field "
            java.lang.String r3 = " is not supported"
            java.lang.String r1 = android.support.p013v4.media.C0069a.m175f(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x0133:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Calendar value too large for accurate calculations"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.DateUtils.modify(java.util.Calendar, int, int):void");
    }

    public static Date parseDate(String str, String... strArr) throws ParseException {
        return parseDateWithLeniency(str, strArr, true);
    }

    public static Date parseDateStrictly(String str, String... strArr) throws ParseException {
        return parseDateWithLeniency(str, strArr, false);
    }

    private static Date parseDateWithLeniency(String str, String[] strArr, boolean z) throws ParseException {
        if (str == null || strArr == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.setLenient(z);
        ParsePosition parsePosition = new ParsePosition(0);
        for (String str2 : strArr) {
            simpleDateFormat.applyPattern(str2.endsWith("ZZ") ? str2.substring(0, str2.length() - 1) : str2);
            parsePosition.setIndex(0);
            String replaceAll = str2.endsWith("ZZ") ? str.replaceAll("([-+][0-9][0-9]):([0-9][0-9])$", "$1$2") : str;
            Date parse = simpleDateFormat.parse(replaceAll, parsePosition);
            if (parse != null && parsePosition.getIndex() == replaceAll.length()) {
                return parse;
            }
        }
        throw new ParseException(C0326j.m864i("Unable to parse the date: ", str), -1);
    }

    public static Date round(Date date, int i) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            modify(instance, i, 1);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    private static Date set(Date date, int i, int i2) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setLenient(false);
            instance.setTime(date);
            instance.set(i, i2);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Date setDays(Date date, int i) {
        return set(date, 5, i);
    }

    public static Date setHours(Date date, int i) {
        return set(date, 11, i);
    }

    public static Date setMilliseconds(Date date, int i) {
        return set(date, 14, i);
    }

    public static Date setMinutes(Date date, int i) {
        return set(date, 12, i);
    }

    public static Date setMonths(Date date, int i) {
        return set(date, 2, i);
    }

    public static Date setSeconds(Date date, int i) {
        return set(date, 13, i);
    }

    public static Date setYears(Date date, int i) {
        return set(date, 1, i);
    }

    public static Calendar toCalendar(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance;
    }

    public static Date truncate(Date date, int i) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            modify(instance, i, 0);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static int truncatedCompareTo(Calendar calendar, Calendar calendar2, int i) {
        return truncate(calendar, i).compareTo(truncate(calendar2, i));
    }

    public static boolean truncatedEquals(Calendar calendar, Calendar calendar2, int i) {
        return truncatedCompareTo(calendar, calendar2, i) == 0;
    }

    public static long getFragmentInDays(Calendar calendar, int i) {
        return getFragment(calendar, i, 6);
    }

    public static long getFragmentInHours(Calendar calendar, int i) {
        return getFragment(calendar, i, 11);
    }

    public static long getFragmentInMilliseconds(Calendar calendar, int i) {
        return getFragment(calendar, i, 14);
    }

    public static long getFragmentInMinutes(Calendar calendar, int i) {
        return getFragment(calendar, i, 12);
    }

    public static long getFragmentInSeconds(Calendar calendar, int i) {
        return getFragment(calendar, i, 13);
    }

    public static boolean truncatedEquals(Date date, Date date2, int i) {
        return truncatedCompareTo(date, date2, i) == 0;
    }

    public static boolean isSameInstant(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            return calendar.getTime().getTime() == calendar2.getTime().getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static int truncatedCompareTo(Date date, Date date2, int i) {
        return truncate(date, i).compareTo(truncate(date2, i));
    }

    private static long getFragment(Calendar calendar, int i, int i2) {
        long j;
        if (calendar != null) {
            long millisPerUnit = getMillisPerUnit(i2);
            long j2 = 0;
            if (i != 1) {
                if (i == 2) {
                    j = (((long) calendar.get(5)) * MILLIS_PER_DAY) / millisPerUnit;
                }
                if (i != 1 || i == 2 || i == 5 || i == 6) {
                    j2 += (((long) calendar.get(11)) * MILLIS_PER_HOUR) / millisPerUnit;
                } else {
                    switch (i) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        case 14:
                            return j2;
                        default:
                            throw new IllegalArgumentException(C0069a.m175f("The fragment ", i, " is not supported"));
                    }
                }
                j2 += (((long) calendar.get(12)) * MILLIS_PER_MINUTE) / millisPerUnit;
                j2 += (((long) calendar.get(13)) * 1000) / millisPerUnit;
                return j2 + (((long) (calendar.get(14) * 1)) / millisPerUnit);
            }
            j = (((long) calendar.get(6)) * MILLIS_PER_DAY) / millisPerUnit;
            j2 = 0 + j;
            if (i != 1) {
            }
            j2 += (((long) calendar.get(11)) * MILLIS_PER_HOUR) / millisPerUnit;
            j2 += (((long) calendar.get(12)) * MILLIS_PER_MINUTE) / millisPerUnit;
            j2 += (((long) calendar.get(13)) * 1000) / millisPerUnit;
            return j2 + (((long) (calendar.get(14) * 1)) / millisPerUnit);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1 = 1;
        r6 = r5;
        r5 = r8;
        r8 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r6 = r5;
        r5 = r8;
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r1 >= 1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r1 = r1 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r1 <= 7) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r1 = r1 - 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r8 >= 1) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r8 = r8 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r8 <= 7) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r8 = r8 - 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r5.get(7) == r1) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r5.add(5, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r6.get(7) == r8) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r6.add(5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        return new org.apache.commons.lang3.time.DateUtils.DateIterator(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r9 == 6) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar r8, int r9) {
        /*
            if (r8 == 0) goto L_0x0085
            r0 = -1
            r1 = 2
            r2 = 5
            r3 = 1
            r4 = 7
            switch(r9) {
                case 1: goto L_0x002c;
                case 2: goto L_0x002c;
                case 3: goto L_0x002c;
                case 4: goto L_0x002c;
                case 5: goto L_0x0018;
                case 6: goto L_0x0018;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The range style "
            java.lang.String r1 = " is not valid."
            java.lang.String r9 = android.support.p013v4.media.C0069a.m175f(r0, r9, r1)
            r8.<init>(r9)
            throw r8
        L_0x0018:
            java.util.Calendar r8 = truncate((java.util.Calendar) r8, (int) r1)
            java.lang.Object r5 = r8.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            r5.add(r1, r3)
            r5.add(r2, r0)
            r6 = 6
            if (r9 != r6) goto L_0x003e
            goto L_0x0058
        L_0x002c:
            java.util.Calendar r5 = truncate((java.util.Calendar) r8, (int) r2)
            java.util.Calendar r6 = truncate((java.util.Calendar) r8, (int) r2)
            if (r9 == r1) goto L_0x0056
            r1 = 3
            if (r9 == r1) goto L_0x004f
            r7 = 4
            if (r9 == r7) goto L_0x0043
            r8 = r5
            r5 = r6
        L_0x003e:
            r1 = r3
            r6 = r5
            r5 = r8
            r8 = r4
            goto L_0x005b
        L_0x0043:
            int r9 = r8.get(r4)
            int r9 = r9 - r1
            int r8 = r8.get(r4)
            int r8 = r8 + r1
            r1 = r9
            goto L_0x005b
        L_0x004f:
            int r1 = r8.get(r4)
            int r8 = r1 + -1
            goto L_0x005b
        L_0x0056:
            r8 = r5
            r5 = r6
        L_0x0058:
            r6 = r5
            r5 = r8
            r8 = r3
        L_0x005b:
            if (r1 >= r3) goto L_0x005f
            int r1 = r1 + 7
        L_0x005f:
            if (r1 <= r4) goto L_0x0063
            int r1 = r1 + -7
        L_0x0063:
            if (r8 >= r3) goto L_0x0067
            int r8 = r8 + 7
        L_0x0067:
            if (r8 <= r4) goto L_0x006b
            int r8 = r8 + -7
        L_0x006b:
            int r9 = r5.get(r4)
            if (r9 == r1) goto L_0x0075
            r5.add(r2, r0)
            goto L_0x006b
        L_0x0075:
            int r9 = r6.get(r4)
            if (r9 == r8) goto L_0x007f
            r6.add(r2, r3)
            goto L_0x0075
        L_0x007f:
            org.apache.commons.lang3.time.DateUtils$DateIterator r8 = new org.apache.commons.lang3.time.DateUtils$DateIterator
            r8.<init>(r5, r6)
            return r8
        L_0x0085:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The date must not be null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar, int):java.util.Iterator");
    }

    public static Calendar ceiling(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i, 2);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar round(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i, 1);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar truncate(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i, 0);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Date ceiling(Object obj, int i) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (obj instanceof Date) {
            return ceiling((Date) obj, i);
        } else {
            if (obj instanceof Calendar) {
                return ceiling((Calendar) obj, i).getTime();
            }
            StringBuilder h = C0072d.m201h("Could not find ceiling of for type: ");
            h.append(obj.getClass());
            throw new ClassCastException(h.toString());
        }
    }

    public static Date round(Object obj, int i) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (obj instanceof Date) {
            return round((Date) obj, i);
        } else {
            if (obj instanceof Calendar) {
                return round((Calendar) obj, i).getTime();
            }
            throw new ClassCastException("Could not round " + obj);
        }
    }

    public static Date truncate(Object obj, int i) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (obj instanceof Date) {
            return truncate((Date) obj, i);
        } else {
            if (obj instanceof Calendar) {
                return truncate((Calendar) obj, i).getTime();
            }
            throw new ClassCastException("Could not truncate " + obj);
        }
    }

    public static Iterator<?> iterator(Object obj, int i) {
        if (obj == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (obj instanceof Date) {
            return iterator((Date) obj, i);
        } else {
            if (obj instanceof Calendar) {
                return iterator((Calendar) obj, i);
            }
            throw new ClassCastException("Could not iterate based on " + obj);
        }
    }
}
