package com.paypal.pyplcheckout.utils;

import android.annotation.SuppressLint;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.Regex;
import p764pq.C20057i;

public final class CardValidationUtilKt {
    private static final Set<Integer> amexBin = C19382n.m32704D0(34, 37);
    private static final Set<Integer> chinaUnionPayBin = C19327t.m32665u1(C19327t.m32665u1(C19327t.m32665u1(C19327t.m32664t1(new C20057i(622126, 622925)), new C20057i(624000, 626999)), new C20057i(628200, 628899)), new C20057i(810000, 817199));
    private static final Set<Integer> dinersSecondCharSet = C19382n.m32704D0(30, 36, 38);
    private static final Set<Integer> discoverBin = C19327t.m32665u1(C19382n.m32702C0(601), C19327t.m32664t1(new C20057i(644, 659)));
    private static final Set<Integer> mastercardFiveSeriesBin = C19327t.m32664t1(new C20057i(51, 55));
    private static final Set<Integer> mastercardTwoSeriesBin = C19327t.m32664t1(new C20057i(2221, 2720));

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentProcessors.values().length];
            iArr[PaymentProcessors.AMEX.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean cscValidator(PaymentProcessors paymentProcessors, String str) {
        C19383o.m32797g(paymentProcessors, "paymentProcessor");
        C19383o.m32797g(str, "csc");
        if (WhenMappings.$EnumSwitchMapping$0[paymentProcessors.ordinal()] == 1) {
            if (str.length() != 4) {
                return false;
            }
        } else if (str.length() != 3) {
            return false;
        }
        return true;
    }

    @SuppressLint({"SimpleDateFormat"})
    public static final boolean expDateValidator(String str) {
        C19383o.m32797g(str, "expDate");
        if (!new Regex("\\d{2}/\\d{2}").matches(str)) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        try {
            Date parse = simpleDateFormat.parse(str);
            C19383o.m32794d(parse);
            return parse.after(new Date());
        } catch (ParseException e) {
            ParseException parseException = e;
            PLog pLog = PLog.INSTANCE;
            PEnums.ErrorType errorType = PEnums.ErrorType.WARNING;
            PEnums.EventCode eventCode = PEnums.EventCode.E618;
            String message = parseException.getMessage();
            if (message == null) {
                message = "Invalid exp date format";
            }
            PLog.error$default(errorType, eventCode, message, (String) null, parseException, PEnums.TransitionName.NATIVE_ADD_CARD, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1928, (Object) null);
            return false;
        }
    }

    public static final boolean luhnAlgo(String str) {
        int i;
        C19383o.m32797g(str, "cardNumber");
        String a1 = C19457k.m33023a1(str, " ", "", false);
        int length = a1.length() - 1;
        if (length >= 0) {
            boolean z = false;
            i = 0;
            while (true) {
                int i2 = length - 1;
                int charAt = a1.charAt(length) - '0';
                if (z) {
                    charAt *= 2;
                }
                i = (charAt % 10) + (charAt / 10) + i;
                z = !z;
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        } else {
            i = 0;
        }
        return i % 10 == 0;
    }

    public static final PaymentProcessors paymentProcessorIdentifier(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            return PaymentProcessors.NOTFOUND;
        }
        String str2 = "";
        char[] charArray = new Regex("\\s").replace((CharSequence) str, str2).toCharArray();
        C19383o.m32796f(charArray, "this as java.lang.String).toCharArray()");
        char c = charArray[0];
        if (c == '4') {
            return PaymentProcessors.VISA;
        }
        if (c == '2' || c == '5') {
            if (c == '5' && charArray.length > 1) {
                char c2 = charArray[1];
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(c2);
                if (mastercardFiveSeriesBin.contains(Integer.valueOf(Integer.parseInt(sb.toString())))) {
                    return PaymentProcessors.MASTERCARD;
                }
            } else if (c == '2' && charArray.length > 3) {
                while (i < 4) {
                    int i2 = i + 1;
                    str2 = str2 + charArray[i];
                    i = i2;
                }
                if (mastercardTwoSeriesBin.contains(Integer.valueOf(Integer.parseInt(str2)))) {
                    return PaymentProcessors.MASTERCARD;
                }
            }
        } else if (c == '3') {
            if (charArray.length > 1) {
                char c3 = charArray[1];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c);
                sb2.append(c3);
                String sb3 = sb2.toString();
                if (amexBin.contains(Integer.valueOf(Integer.parseInt(sb3)))) {
                    return PaymentProcessors.AMEX;
                }
                if (dinersSecondCharSet.contains(Integer.valueOf(Integer.parseInt(sb3)))) {
                    return PaymentProcessors.DINERSCLUB;
                }
            }
        } else if (c == '6' && charArray.length > 2) {
            char c4 = charArray[1];
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c);
            sb4.append(c4);
            String sb5 = sb4.toString();
            String str3 = sb5 + charArray[2];
            Set<Integer> set = discoverBin;
            if (set.contains(Integer.valueOf(Integer.parseInt(sb5))) || set.contains(Integer.valueOf(Integer.parseInt(str3)))) {
                return PaymentProcessors.DISCOVER;
            }
            if (charArray.length >= 6) {
                while (i < 6) {
                    int i3 = i + 1;
                    str2 = str2 + charArray[i];
                    i = i3;
                }
                if (chinaUnionPayBin.contains(Integer.valueOf(Integer.parseInt(str2)))) {
                    return PaymentProcessors.CHINAUNIONPAY;
                }
            }
        }
        return PaymentProcessors.NOTFOUND;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair<java.lang.String, java.lang.String> splitExpiration(java.lang.String r5) {
        /*
            java.lang.String r0 = "expirationDate"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 47
            r1[r2] = r3
            r3 = 6
            java.util.List r5 = kotlin.text.C19459m.m33055x1(r5, r1, r2, r3)
            int r1 = r5.size()
            r3 = 2
            if (r1 != r3) goto L_0x0074
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0020
            goto L_0x003d
        L_0x0020:
            java.util.Iterator r1 = r5.iterator()
        L_0x0024:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != r3) goto L_0x0038
            r4 = r0
            goto L_0x0039
        L_0x0038:
            r4 = r2
        L_0x0039:
            if (r4 != 0) goto L_0x0024
            r1 = r2
            goto L_0x003e
        L_0x003d:
            r1 = r0
        L_0x003e:
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r5.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            int r4 = r4.get(r0)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.lang.Object r5 = r5.get(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r5)
            goto L_0x007b
        L_0x0074:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r5 = ""
            r0.<init>(r5, r5)
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.utils.CardValidationUtilKt.splitExpiration(java.lang.String):kotlin.Pair");
    }
}
