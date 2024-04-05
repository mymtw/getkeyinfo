package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.appsflyer.internal.b */
final class C5030b {
    private static int AFInAppEventParameterName = 0;
    private static long AFInAppEventType = -8381164938660999162L;
    private static long AFKeystoreWrapper = 7346225891104818295L;
    private static int AppsFlyer2dXConversionCallback = 0;
    private static int init = 1;
    private static char valueOf = 0;
    private static char[] values = {24770, 58554, 26665, 60852, 28944, 63129, 31245, 65484, 17263, 51433, 19561, 53723, 21831, 56000, 24142, 41524, 10154, 43882, 12457, 46099, 14723, 48389, 745, 34426, 3044, 36690, 5324, 39011, 7622, 25014, 58672, 27309, 60966, 29574, '0', 'j', 33814, 2200, 36100, 4594, 38458, 6821, 40815, 9164, 43074, 11478, 45433, 13821, 47737, 43847, 12156, 41959, 9838, 47836, 15710, 38412, 4688, 40644, 6985, 34808, 'o', 36080, 2403, 46514, 15896, 47754, 10039, 41899, 11312, 43172, 21721, 53585};

    private static String AFInAppEventType(Context context) {
        int i = AppsFlyer2dXConversionCallback + 55;
        init = i % 128;
        int i2 = i % 2;
        try {
            boolean z = false;
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i3 = AppsFlyer2dXConversionCallback + 111;
            init = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return str;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static boolean valueOf(String str) {
        int i = AppsFlyer2dXConversionCallback + 47;
        init = i % 128;
        if (i % 2 != 0) {
            try {
                Class.forName(str);
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        } else {
            Class.forName(str);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0330  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String values(android.content.Context r28, long r29) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            long r4 = android.widget.ExpandableListView.getPackedPositionForGroup(r3)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r4 = r4 + 24739
            char r4 = (char) r4
            int r5 = android.view.KeyEvent.getMaxKeyCode()
            r8 = 16
            int r5 = r5 >> r8
            int r5 = r5 + 34
            int r9 = android.widget.ExpandableListView.getPackedPositionType(r6)
            java.lang.String r4 = valueOf(r4, r5, r9)
            java.lang.String r4 = r4.intern()
            boolean r4 = valueOf((java.lang.String) r4)
            r5 = 0
            r9 = 1
            java.lang.String r10 = "꽯"
            java.lang.String r11 = "ᙣ⋈唾ߨ"
            java.lang.String r12 = "ဆ쌧Ụ记"
            if (r4 == 0) goto L_0x0056
            r4 = 1025689622(0x3d22c816, float:0.039741598)
            int r13 = android.graphics.Color.rgb(r3, r3, r3)
            int r4 = r4 - r13
            r13 = 59476(0xe854, float:8.3344E-41)
            long r14 = android.os.SystemClock.elapsedRealtime()
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            int r14 = r14 + r13
            char r13 = (char) r14
            java.lang.String r4 = values(r12, r11, r4, r10, r13)
            goto L_0x006f
        L_0x0056:
            int r4 = android.graphics.ImageFormat.getBitsPerPixel(r3)
            int r4 = r4 + r9
            char r4 = (char) r4
            long r13 = android.widget.ExpandableListView.getPackedPositionForChild(r3, r3)
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            int r13 = -r13
            float r14 = android.util.TypedValue.complexToFraction(r3, r5, r5)
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            int r14 = r14 + 34
            java.lang.String r4 = valueOf(r4, r13, r14)
        L_0x006f:
            java.lang.String r4 = r4.intern()
            r1.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = r28.getPackageName()
            java.lang.String r14 = values(r13)
            java.lang.String r15 = ""
            int r16 = android.text.TextUtils.getOffsetAfter(r15, r3)
            r17 = 1042466838(0x3e22c816, float:0.15896639)
            int r5 = r16 + r17
            int r16 = android.text.TextUtils.indexOf(r15, r15)
            r19 = 59477(0xe855, float:8.3345E-41)
            int r9 = r19 - r16
            char r9 = (char) r9
            java.lang.String r5 = values(r12, r11, r5, r10, r9)
            java.lang.String r5 = r5.intern()
            r1.append(r5)
            r4.append(r14)
            java.lang.String r5 = valueOf((android.content.Context) r28)
            r9 = 50
            if (r5 != 0) goto L_0x00b0
            r5 = r9
            goto L_0x00b2
        L_0x00b0:
            r5 = 22
        L_0x00b2:
            r14 = 2
            r8 = 48
            if (r5 == r9) goto L_0x00d3
            int r5 = android.graphics.Color.red(r3)
            int r5 = r17 - r5
            int r9 = android.view.View.MeasureSpec.getSize(r3)
            int r9 = r9 + r19
            char r9 = (char) r9
            java.lang.String r5 = values(r12, r11, r5, r10, r9)
            java.lang.String r5 = r5.intern()
            r1.append(r5)
            r4.append(r13)
            goto L_0x00fc
        L_0x00d3:
            int r5 = AppsFlyer2dXConversionCallback
            int r5 = r5 + 37
            int r9 = r5 % 128
            init = r9
            int r5 = r5 % r14
            int r5 = android.text.TextUtils.getOffsetAfter(r15, r3)
            char r5 = (char) r5
            int r9 = android.text.TextUtils.indexOf(r15, r8, r3)
            int r9 = -r9
            long r22 = android.view.ViewConfiguration.getZoomControlsTimeout()
            int r22 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            int r14 = 35 - r22
            java.lang.String r5 = valueOf(r5, r9, r14)
            java.lang.String r5 = r5.intern()
            r1.append(r5)
            r4.append(r13)
        L_0x00fc:
            java.lang.String r5 = AFInAppEventType(r28)
            if (r5 != 0) goto L_0x0104
            r9 = 1
            goto L_0x0105
        L_0x0104:
            r9 = r3
        L_0x0105:
            if (r9 == 0) goto L_0x012a
            int r5 = android.graphics.Color.argb(r3, r3, r3, r3)
            char r5 = (char) r5
            int r9 = android.text.TextUtils.lastIndexOf(r15, r8, r3, r3)
            int r9 = -r9
            int r14 = android.view.ViewConfiguration.getTapTimeout()
            r21 = 16
            int r14 = r14 >> 16
            int r14 = r14 + 34
            java.lang.String r5 = valueOf(r5, r9, r14)
            java.lang.String r5 = r5.intern()
            r1.append(r5)
            r4.append(r13)
            goto L_0x0149
        L_0x012a:
            int r9 = android.view.View.MeasureSpec.getMode(r3)
            int r9 = r9 + r17
            r13 = 59478(0xe856, float:8.3346E-41)
            long r24 = android.os.SystemClock.uptimeMillis()
            int r14 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            int r13 = r13 - r14
            char r13 = (char) r13
            java.lang.String r9 = values(r12, r11, r9, r10, r13)
            java.lang.String r9 = r9.intern()
            r1.append(r9)
            r4.append(r5)
        L_0x0149:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            android.content.pm.PackageManager r4 = r28.getPackageManager()     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.lang.String r5 = r28.getPackageName()     // Catch:{ NameNotFoundException -> 0x03a8 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x03a8 }
            long r4 = r4.firstInstallTime     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.lang.String r9 = "鮲㴾㿺ࠐ"
            int r13 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ NameNotFoundException -> 0x03a8 }
            r14 = 16
            int r13 = r13 >> r14
            java.lang.String r14 = "덺㰂ࢃᖗ⇷儼䝰绷쨮ꓳ⺇塘?䗡뤘角"
            int r6 = android.graphics.Color.alpha(r3)     // Catch:{ NameNotFoundException -> 0x03a8 }
            int r6 = 4159 - r6
            char r6 = (char) r6     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.lang.String r6 = values(r12, r9, r13, r14, r6)     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.lang.String r6 = r6.intern()     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x03a8 }
            r7.<init>(r6, r9)     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.util.Date r6 = new java.util.Date     // Catch:{ NameNotFoundException -> 0x03a8 }
            r6.<init>(r4)     // Catch:{ NameNotFoundException -> 0x03a8 }
            java.lang.String r4 = r7.format(r6)     // Catch:{ NameNotFoundException -> 0x03a8 }
            r0.append(r4)     // Catch:{ NameNotFoundException -> 0x03a8 }
            r4 = r29
            r0.append(r4)
            r6 = -1711218409(0xffffffff9a00e117, float:-2.6651606E-23)
            int r7 = android.text.TextUtils.indexOf(r15, r8)
            int r7 = r7 + r6
            int r6 = android.text.TextUtils.indexOf(r15, r8)
            int r6 = -1 - r6
            char r6 = (char) r6
            java.lang.String r9 = "ᘛá碚"
            java.lang.String r13 = "⧙?ꥈ왓ี彾氨涉노ᚴ䲗襠怂皹ꛘ잷Ꮘ꾺㴹ﶍ﫣뫠"
            java.lang.String r6 = values(r12, r9, r7, r13, r6)
            java.lang.String r6 = r6.intern()
            boolean r6 = valueOf((java.lang.String) r6)
            r7 = 1042466837(0x3e22c815, float:0.15896638)
            r13 = -1
            if (r6 == 0) goto L_0x01d6
            long r26 = android.view.ViewConfiguration.getZoomControlsTimeout()
            r24 = 0
            int r6 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            int r6 = r6 + r7
            long r26 = android.widget.ExpandableListView.getPackedPositionForGroup(r3)
            int r9 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            int r9 = r9 + r19
            char r9 = (char) r9
            java.lang.String r6 = values(r12, r11, r6, r10, r9)
            goto L_0x01f5
        L_0x01d6:
            long r24 = android.os.SystemClock.currentThreadTimeMillis()
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            int r6 = r6 + -1
            char r6 = (char) r6
            int r9 = android.text.TextUtils.getOffsetAfter(r15, r3)
            r20 = 1
            int r9 = 1 - r9
            float r22 = android.view.ViewConfiguration.getScrollFriction()
            r18 = 0
            int r22 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            int r7 = 35 - r22
            java.lang.String r6 = valueOf(r6, r9, r7)
        L_0x01f5:
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            r6 = -625879646(0xffffffffdab1d5a2, float:-2.50279813E16)
            int r7 = android.view.ViewConfiguration.getEdgeSlop()
            r9 = 16
            int r7 = r7 >> r9
            int r6 = r6 - r7
            int r7 = android.graphics.Color.alpha(r3)
            char r7 = (char) r7
            java.lang.String r9 = "ꊉ뇕쐦"
            java.lang.String r8 = "ᚍ潴氳ዼ쿔槝퉊櫱椮ﺔ滎Ŝⴉ毁뉉쯚ヌ⢹夝潝"
            java.lang.String r6 = values(r12, r9, r6, r8, r7)
            java.lang.String r6 = r6.intern()
            boolean r6 = valueOf((java.lang.String) r6)
            r7 = 25
            if (r6 == 0) goto L_0x0222
            r6 = r7
            goto L_0x0224
        L_0x0222:
            r6 = 62
        L_0x0224:
            if (r6 == r7) goto L_0x0244
            long r6 = android.os.SystemClock.currentThreadTimeMillis()
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            int r6 = r6 + -1
            char r6 = (char) r6
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r8 = 1
            int r9 = 1 - r7
            int r7 = android.os.Process.myPid()
            r8 = 22
            int r7 = r7 >> r8
            int r7 = r7 + 34
            java.lang.String r6 = valueOf(r6, r9, r7)
            goto L_0x026c
        L_0x0244:
            int r6 = init
            int r6 = r6 + 45
            int r7 = r6 % 128
            AppsFlyer2dXConversionCallback = r7
            r7 = 2
            int r6 = r6 % r7
            if (r6 == 0) goto L_0x0252
            r6 = r3
            goto L_0x0253
        L_0x0252:
            r6 = 1
        L_0x0253:
            if (r6 == 0) goto L_0x0271
            int r6 = android.view.ViewConfiguration.getPressedStateDuration()
            r7 = 16
            int r6 = r6 >> r7
            int r6 = r6 + r17
            float r7 = android.media.AudioTrack.getMinVolume()
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            int r7 = r19 - r7
            char r7 = (char) r7
            java.lang.String r6 = values(r12, r11, r6, r10, r7)
        L_0x026c:
            java.lang.String r6 = r6.intern()
            goto L_0x028c
        L_0x0271:
            int r6 = android.view.ViewConfiguration.getPressedStateDuration()
            int r6 = r6 + 127
            int r6 = r17 >> r6
            float r7 = android.media.AudioTrack.getMinVolume()
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            int r7 = r19 - r7
            char r7 = (char) r7
            java.lang.String r6 = values(r12, r11, r6, r10, r7)
            java.lang.String r6 = r6.intern()
        L_0x028c:
            r2.append(r6)
            int r6 = android.view.ViewConfiguration.getTapTimeout()
            r7 = 16
            int r6 = r6 >> r7
            int r7 = android.view.View.resolveSize(r3, r3)
            char r7 = (char) r7
            java.lang.String r8 = "示㨊ꤟ"
            java.lang.String r9 = "빲䬨Ꮹ媙桡㟨⃎?Ⴏ싕譌뮺跽蒉┌䴿븼"
            java.lang.String r6 = values(r12, r8, r6, r9, r7)
            java.lang.String r6 = r6.intern()
            boolean r6 = valueOf((java.lang.String) r6)
            if (r6 == 0) goto L_0x02b0
            r6 = 23
            goto L_0x02b2
        L_0x02b0:
            r6 = 13
        L_0x02b2:
            r7 = 13
            if (r6 == r7) goto L_0x02c8
            int r6 = android.graphics.drawable.Drawable.resolveOpacity(r3, r3)
            int r6 = r6 + r17
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r7 = r19 - r7
            char r7 = (char) r7
            java.lang.String r6 = values(r12, r11, r6, r10, r7)
            goto L_0x02e2
        L_0x02c8:
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            int r7 = android.graphics.Color.rgb(r3, r3, r3)
            int r7 = r7 + r6
            char r6 = (char) r7
            r7 = 48
            char r8 = android.text.AndroidCharacter.getMirror(r7)
            int r8 = r8 + -47
            int r9 = android.text.TextUtils.indexOf(r15, r7, r3)
            int r9 = r9 + 35
            java.lang.String r6 = valueOf(r6, r8, r9)
        L_0x02e2:
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            r6 = 651936655(0x26dbc38f, float:1.5249184E-15)
            int r7 = android.view.View.MeasureSpec.getSize(r3)
            int r7 = r7 + r6
            int r6 = android.view.ViewConfiguration.getDoubleTapTimeout()
            r8 = 16
            int r6 = r6 >> r8
            int r6 = 19611 - r6
            char r6 = (char) r6
            java.lang.String r8 = "迴?鬦蝌"
            java.lang.String r9 = "蠰啅燸梳絝糛垕̿✁?ᔽﴼ鴂蒕鸉"
            java.lang.String r6 = values(r12, r8, r7, r9, r6)
            java.lang.String r6 = r6.intern()
            boolean r6 = valueOf((java.lang.String) r6)
            if (r6 == 0) goto L_0x0330
            int r6 = AppsFlyer2dXConversionCallback
            int r6 = r6 + 79
            int r7 = r6 % 128
            init = r7
            r7 = 2
            int r6 = r6 % r7
            r6 = 48
            int r6 = android.text.TextUtils.indexOf(r15, r6)
            r7 = 1042466837(0x3e22c815, float:0.15896638)
            int r7 = r7 - r6
            int r6 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            r8 = 16
            int r6 = r6 >> r8
            int r6 = r6 + r19
            char r6 = (char) r6
            java.lang.String r6 = values(r12, r11, r7, r10, r6)
            goto L_0x034d
        L_0x0330:
            r6 = 48
            r8 = 16
            int r7 = android.text.TextUtils.indexOf(r15, r6, r3, r3)
            int r7 = -1 - r7
            char r7 = (char) r7
            int r9 = android.view.ViewConfiguration.getPressedStateDuration()
            int r9 = r9 >> r8
            r8 = 1
            int r9 = 1 - r9
            int r6 = android.text.TextUtils.lastIndexOf(r15, r6, r3, r3)
            int r6 = 33 - r6
            java.lang.String r6 = valueOf(r7, r9, r6)
        L_0x034d:
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.appsflyer.internal.C4985af.AFInAppEventType(r0)
            java.lang.String r0 = com.appsflyer.internal.C4985af.valueOf((java.lang.String) r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r0 = 17
            r7 = 2
            int r1 = java.lang.Integer.parseInt(r1, r7)
            r8 = 16
            java.lang.String r1 = java.lang.Integer.toString(r1, r8)
            char r1 = r1.charAt(r3)
            r6.setCharAt(r0, r1)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 27
            int r1 = java.lang.Integer.parseInt(r1, r7)
            java.lang.String r1 = java.lang.Integer.toString(r1, r8)
            char r1 = r1.charAt(r3)
            r2.setCharAt(r0, r1)
            java.lang.String r0 = r2.toString()
            java.lang.Long r1 = java.lang.Long.valueOf(r29)
            java.lang.String r0 = values((java.lang.String) r0, (java.lang.Long) r1)
            return r0
        L_0x03a8:
            int r0 = android.text.TextUtils.getTrimmedLength(r15)
            r1 = 65303(0xff17, float:9.1509E-41)
            r2 = 48
            int r2 = android.text.AndroidCharacter.getEastAsianWidth(r2)
            int r1 = r1 - r2
            char r1 = (char) r1
            java.lang.String r2 = "鿷⭴ጇ⋿"
            java.lang.String r3 = "狟뫦ዥ渖脋┻煑ﺬ툐鼰罼絕䇳甫멪瘖뤐⣒犤내곐呪鋹뭟ࡂ赚ᚦﺎ價"
            java.lang.String r0 = values(r12, r2, r0, r3, r1)
            java.lang.String r0 = r0.intern()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5030b.values(android.content.Context, long):java.lang.String");
    }

    private static String valueOf(Context context) {
        String str = null;
        if (System.getProperties().containsKey(valueOf((char) (-1 - TextUtils.indexOf("", '0')), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 35 - (Process.myTid() >> 22)).intern())) {
            boolean z = true;
            try {
                Matcher matcher = Pattern.compile(values("ဆ쌧Ụ记", "㕇酱嘑瑯", Color.argb(0, 0, 0, 0), "䆷誇န튼鮾⸌䃄፽䶰", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).matcher(context.getCacheDir().getPath().replace(valueOf((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43880), 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 50 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1))).intern(), ""));
                if ((matcher.find() ? RFC1522Codec.SEP : 23) != 23) {
                    str = matcher.group(1);
                }
                int i = init + 29;
                AppsFlyer2dXConversionCallback = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                if (C5002ak.AFInAppEventType == null) {
                    C5002ak.AFInAppEventType = new C5002ak();
                }
                C5002ak akVar = C5002ak.AFInAppEventType;
                String intern = valueOf((char) (Color.rgb(0, 0, 0) + 16815695), 21 - AndroidCharacter.getEastAsianWidth('0'), TextUtils.indexOf("", '0') + 56).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(values("ဆ쌧Ụ记", "䛿࿆馼", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1139816890, "㴭癐䉙꼨ᥩ⅏➹秨䵖팟뵐葠⅔加ꨵŜ䎃ટ㚫㕃䶹㙲컿惥ꑷ蟀帼豜⒁ᩢꩾ麳ᅿ跚捻뢎墕嬓", (char) (TextUtils.indexOf("", "", 0) + 24217)).intern());
                sb.append(e);
                akVar.valueOf((String) null, intern, sb.toString());
                int i3 = init + 119;
                AppsFlyer2dXConversionCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    z = true;
                }
                if (z) {
                    return null;
                }
                throw null;
            }
        }
        return str;
    }

    /* renamed from: com.appsflyer.internal.b$e */
    public static class C5031e extends HashMap<String, Object> {
        private static int AFInAppEventParameterName = 546913058;
        private static int AFKeystoreWrapper = 29;
        private static boolean AFLogger$LogLevel = true;
        private static byte[] AFVersionDeclaration = {3, 12, -19, 1, 14, -8, 4, -11, 21, -7, 5, -10, 13, ByteSourceJsonBootstrapper.UTF8_BOM_1, 16, 0, 0, 0, -45, 1, -6, 5, -6, 6, -8, -4, -53, -15, 69, -26, -52, -1, 6, -11, 4, 11, 2, -21, 19, 69, -72, -12, 11, -14, 87, ByteSourceJsonBootstrapper.UTF8_BOM_2, -16, 9, 11, -21, 86, -70, 1, -6, 75, -71, -7, 5, -11, 19, ByteSourceJsonBootstrapper.UTF8_BOM_1, 13, -9, 9, -2, 71, -68, -1, -7, 3, 8, -5, 7, 1, -2, -52, 53, -8, -43, 52, -4, -1, 5, -53, 4, -4, 3, 1, -1, -13, -3, 1, 19, ByteSourceJsonBootstrapper.UTF8_BOM_1, 13, -11, 3, 8, -15, 82, 77, 74, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        private static short[] AppsFlyer2dXConversionCallback = null;
        private static int getLevel = 12;
        private static char[] init = {'Z', '[', 'k', 'N', '^', 'M', 'P', 'w', 'q', 'r', 'm', 'u', 'x', 'p', ',', 's', 'z', '~', 128, 133, 131, 't', 132, 'o', '|', '{', 'F', 127, 'X', 129, ':', '`', 'Q', 'e', 'O', 'T', 'S', 'D', 'B', 'n', '<', '}', '=', '>', 'y'};
        private static boolean onAttributionFailureNative = true;
        private static int onDeepLinkingNative = 1;
        private static int onInstallConversionDataLoadedNative = 0;
        private static int valueOf = 1687238226;
        private final Context AFInAppEventType;
        private final Map<String, Object> values;

        /* renamed from: com.appsflyer.internal.b$e$a */
        public static class C5032a {
            public Boolean AFInAppEventParameterName;
            public final String AFKeystoreWrapper;
            public final Boolean valueOf;

            public C5032a() {
            }

            public C5032a(String str, Boolean bool) {
                this.AFKeystoreWrapper = str;
                this.valueOf = bool;
            }

            public static byte[] AFInAppEventType(String str) throws Exception {
                return str.getBytes();
            }

            public static byte[] AFKeystoreWrapper(byte[] bArr) throws Exception {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            public static String values(byte[] bArr) throws Exception {
                StringBuilder sb = new StringBuilder();
                for (byte hexString : bArr) {
                    String hexString2 = Integer.toHexString(hexString);
                    if (hexString2.length() == 1) {
                        hexString2 = "0".concat(hexString2);
                    }
                    sb.append(hexString2);
                }
                return sb.toString();
            }
        }

        public C5031e(Map<String, Object> map, Context context) {
            this.values = map;
            this.AFInAppEventType = context;
            put(AFInAppEventParameterName(), valueOf());
        }

        private String AFInAppEventParameterName() {
            int i = onDeepLinkingNative + 99;
            onInstallConversionDataLoadedNative = i % 128;
            int i2 = i % 2;
            boolean z = false;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.values.get(values(-546912961 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) (Color.rgb(0, 0, 0) + 16777216), TextUtils.indexOf("", "", 0, 0) - 17, View.MeasureSpec.makeMeasureSpec(0, 0) - 1687238226).intern()).toString();
                String obj2 = this.values.get(values(-546912960 - Color.blue(0), (short) (Process.myTid() >> 22), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -24 - ExpandableListView.getPackedPositionGroup(0), AndroidCharacter.getMirror('0') - 13943).intern()).toString();
                if (!(obj2 != null)) {
                    int i3 = onDeepLinkingNative + 39;
                    onInstallConversionDataLoadedNative = i3 % 128;
                    obj2 = (i3 % 2 != 0 ? AFKeystoreWrapper("", (int[]) null, (String) null, 32248 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))) : AFKeystoreWrapper("", (int[]) null, (String) null, 128 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)))).intern();
                    int i4 = onInstallConversionDataLoadedNative + 99;
                    onDeepLinkingNative = i4 % 128;
                    int i5 = i4 % 2;
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
                int length = AFKeystoreWrapper2.length();
                if (length > 4) {
                    AFKeystoreWrapper2.delete(4, length);
                } else {
                    while (length < 4) {
                        length++;
                        AFKeystoreWrapper2.append('1');
                    }
                }
                AFKeystoreWrapper2.insert(0, AFKeystoreWrapper("", (int[]) null, (String) null, 127 - ExpandableListView.getPackedPositionGroup(0)).intern());
                String obj3 = AFKeystoreWrapper2.toString();
                int i6 = onDeepLinkingNative + 27;
                onInstallConversionDataLoadedNative = i6 % 128;
                if (i6 % 2 == 0) {
                    z = true;
                }
                if (z) {
                    return obj3;
                }
                throw null;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AFKeystoreWrapper("", (int[]) null, (String) null, 127 - Color.green(0)).intern());
                sb2.append(e);
                AFLogger.AFKeystoreWrapper(sb2.toString());
                return values(Color.blue(0) - 546912951, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (ViewConfiguration.getEdgeSlop() >> 16), -22 - ((Process.getThreadPriority(0) + 20) >> 6), -1687238211 - Color.green(0)).intern();
            }
        }

        private static StringBuilder AFKeystoreWrapper(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < 3) {
                int i2 = onInstallConversionDataLoadedNative + 1;
                onDeepLinkingNative = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
                int i4 = onInstallConversionDataLoadedNative + 121;
                onDeepLinkingNative = i4 % 128;
                int i5 = i4 % 2;
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            while (true) {
                if (!(i6 >= intValue)) {
                    Integer num = null;
                    for (int i7 = 0; i7 < 3; i7++) {
                        char charAt = strArr[i7].charAt(i6);
                        if ((num == null ? 4 : '=') == '=') {
                            charAt ^= num.intValue();
                        }
                        num = Integer.valueOf(charAt);
                    }
                    sb.append(Integer.toHexString(num.intValue()));
                    i6++;
                } else {
                    int i8 = onInstallConversionDataLoadedNative + 121;
                    onDeepLinkingNative = i8 % 128;
                    int i9 = i8 % 2;
                    return sb;
                }
            }
        }

        private String valueOf() {
            String str;
            int i;
            try {
                String obj = this.values.get(values(-546912961 - TextUtils.indexOf("", "", 0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), -17 - (Process.myTid() >> 22), -1687238227 - Process.getGidForName("")).intern()).toString();
                String obj2 = this.values.get(AFKeystoreWrapper("", (int[]) null, (String) null, -16777089 - Color.rgb(0, 0, 0)).intern()).toString();
                String replaceAll = values(-546913000 - AndroidCharacter.getEastAsianWidth('0'), (short) (PhoneNumberUtils.toaFromString("") - 129), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) - 23, Color.red(0) - 1687238205).intern().replaceAll(values(-546913012 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)), (short) Color.green(0), (byte) TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0) - 24, -1687238201 - ExpandableListView.getPackedPositionGroup(0)).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String AFInAppEventType2 = C4985af.AFInAppEventType(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(AFInAppEventType2.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(values(-546912956 - TextUtils.getTrimmedLength(""), (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (AndroidCharacter.getEastAsianWidth('0') - 4), (Process.myPid() >> 22) + 15, (ViewConfiguration.getLongPressTimeout() >> 16) - 1687238197).intern());
                sb3.append(e);
                AFLogger.AFKeystoreWrapper(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(values(-546912960 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) TextUtils.getCapsMode("", 0, 0), -11 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0) - 1687238154).intern());
                str = sb4.toString();
            }
            String str2 = str;
            try {
                Intent registerReceiver = this.AFInAppEventType.registerReceiver((BroadcastReceiver) null, new IntentFilter(AFKeystoreWrapper("¡¥¤£¢¡  ", (int[]) null, (String) null, 127 - KeyEvent.getDeadChar(0, 0)).intern()));
                int i2 = -2700;
                char c = 2;
                if (registerReceiver != null) {
                    int i3 = onInstallConversionDataLoadedNative + 3;
                    onDeepLinkingNative = i3 % 128;
                    int i4 = i3 % 2;
                    i2 = registerReceiver.getIntExtra(values(-546912942 - ((Process.getThreadPriority(0) + 20) >> 6), (short) (ExpandableListView.getPackedPositionChild(0) + 1), (byte) ExpandableListView.getPackedPositionGroup(0), (ViewConfiguration.getPressedStateDuration() >> 16) - 18, -1687238137 - TextUtils.getTrimmedLength("")).intern(), -2700);
                    int i5 = onDeepLinkingNative + 83;
                    onInstallConversionDataLoadedNative = i5 % 128;
                    int i6 = i5 % 2;
                }
                String str3 = this.AFInAppEventType.getApplicationInfo().nativeLibraryDir;
                if (!(str3 == null)) {
                    if (!str3.contains(AFKeystoreWrapper("§¦", (int[]) null, (String) null, 126 - TextUtils.indexOf("", '0')).intern())) {
                        c = '>';
                    }
                    if (c != '>') {
                        i = 1;
                        int size = ((SensorManager) this.AFInAppEventType.getSystemService(AFKeystoreWrapper("", (int[]) null, (String) null, 127 - (Process.myPid() >> 22)).intern())).getSensorList(-1).size();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(AFKeystoreWrapper("¨", (int[]) null, (String) null, TextUtils.indexOf("", '0', 0) + 128).intern());
                        sb5.append(i2);
                        sb5.append(values(View.resolveSize(0, 0) - 546913020, (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ExpandableListView.getPackedPositionChild(0) + 1), Color.argb(0, 0, 0, 0) - 27, TextUtils.indexOf("", '0', 0) - 1687238126).intern());
                        sb5.append(i);
                        sb5.append(values(-546913021 - TextUtils.indexOf("", '0', 0, 0), (short) (AndroidCharacter.getEastAsianWidth('0') - 4), (byte) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1), 102 - PhoneNumberUtils.toaFromString(""), -1687238126 - TextUtils.getCapsMode("", 0, 0)).intern());
                        sb5.append(size);
                        sb5.append(values(-546913020 - ExpandableListView.getPackedPositionType(0), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 27, -1687238125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                        sb5.append(this.values.size());
                        String obj3 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str2);
                        sb6.append(C5032a.values(C5032a.AFKeystoreWrapper(C5032a.AFInAppEventType(obj3))));
                        return sb6.toString();
                    }
                }
                i = 0;
                int size2 = ((SensorManager) this.AFInAppEventType.getSystemService(AFKeystoreWrapper("", (int[]) null, (String) null, 127 - (Process.myPid() >> 22)).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                sb52.append(AFKeystoreWrapper("¨", (int[]) null, (String) null, TextUtils.indexOf("", '0', 0) + 128).intern());
                sb52.append(i2);
                sb52.append(values(View.resolveSize(0, 0) - 546913020, (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ExpandableListView.getPackedPositionChild(0) + 1), Color.argb(0, 0, 0, 0) - 27, TextUtils.indexOf("", '0', 0) - 1687238126).intern());
                sb52.append(i);
                sb52.append(values(-546913021 - TextUtils.indexOf("", '0', 0, 0), (short) (AndroidCharacter.getEastAsianWidth('0') - 4), (byte) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1), 102 - PhoneNumberUtils.toaFromString(""), -1687238126 - TextUtils.getCapsMode("", 0, 0)).intern());
                sb52.append(size2);
                sb52.append(values(-546913020 - ExpandableListView.getPackedPositionType(0), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 27, -1687238125 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                sb52.append(this.values.size());
                String obj32 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str2);
                sb62.append(C5032a.values(C5032a.AFKeystoreWrapper(C5032a.AFInAppEventType(obj32))));
                return sb62.toString();
            } catch (Exception e2) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(values(-563690172 - Color.rgb(0, 0, 0), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) TextUtils.getTrimmedLength(""), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) - 1687238197).intern());
                sb7.append(e2);
                AFLogger.AFKeystoreWrapper(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(AFKeystoreWrapper("­¬¬««ª©ª©", (int[]) null, (String) null, 256 - PhoneNumberUtils.toaFromString("")).intern());
                return sb8.toString();
            }
        }

        private static String values(int i, short s, byte b, int i2, int i3) {
            int i4;
            short s2;
            StringBuilder sb = new StringBuilder();
            int i5 = AFKeystoreWrapper;
            int i6 = i2 + i5;
            int i7 = 0;
            int i8 = 1;
            boolean z = i6 == -1;
            if (z) {
                byte[] bArr = AFVersionDeclaration;
                i6 = (bArr != null ? ']' : 'U') != 'U' ? (byte) (bArr[valueOf + i3] + i5) : (short) (AppsFlyer2dXConversionCallback[valueOf + i3] + i5);
            }
            if (i6 > 0) {
                int i9 = ((i3 + i6) - 2) + valueOf;
                if (z) {
                    int i10 = onDeepLinkingNative + 51;
                    onInstallConversionDataLoadedNative = i10 % 128;
                    int i11 = i10 % 2;
                    i7 = 1;
                }
                int i12 = i9 + i7;
                char c = (char) (i + AFInAppEventParameterName);
                sb.append(c);
                while (i8 < i6) {
                    byte[] bArr2 = AFVersionDeclaration;
                    if ((bArr2 != null ? '#' : 16) != '#') {
                        i4 = i12 - 1;
                        s2 = (short) (AppsFlyer2dXConversionCallback[i12] + s);
                    } else {
                        i4 = i12 - 1;
                        s2 = (byte) (bArr2[i12] + s);
                    }
                    c = (char) (c + (s2 ^ b));
                    i12 = i4;
                    sb.append(c);
                    i8++;
                    int i13 = onInstallConversionDataLoadedNative + 95;
                    onDeepLinkingNative = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            return sb.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: char[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            if (r7 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            r7 = r7.toCharArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7 = (char[]) r7;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r5 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r5 = r5.getBytes("ISO-8859-1");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            r5 = (byte[]) r5;
            r0 = init;
            r2 = getLevel;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (onAttributionFailureNative == false) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            r3 = r5.length;
            r4 = new char[r3];
            r6 = onDeepLinkingNative + 9;
            onInstallConversionDataLoadedNative = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            if (r1 >= r3) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            r7 = '`';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            r7 = '<';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            if (r7 == '`') goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
            r5 = new java.lang.String(r4);
            r6 = onInstallConversionDataLoadedNative + 89;
            onDeepLinkingNative = r6 % 128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
            if ((r6 % 2) == 0) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
            return r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
            r4[r1] = (char) (r0[r5[(r3 - 1) - r1] + r8] - r2);
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
            if (AFLogger$LogLevel == false) goto L_0x00a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
            r5 = r7.length;
            r6 = new char[r5];
            r3 = onDeepLinkingNative + 29;
            onInstallConversionDataLoadedNative = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
            if (r1 >= r5) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
            r4 = '&';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
            r4 = 24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
            if (r4 == 24) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
            r6[r1] = (char) (r0[r7[(r5 - 1) - r1] - r8] - r2);
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
            return new java.lang.String(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
            r5 = r6.length;
            r7 = new char[r5];
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
            if (r3 >= r5) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ac, code lost:
            if (r4 == false) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
            r7[r3] = (char) (r0[r6[(r5 - 1) - r3] - r8] - r2);
            r3 = r3 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
            return new java.lang.String(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if ((r7 != null ? ']' : 'R') != 'R') goto L_0x001f;
         */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String AFKeystoreWrapper(java.lang.String r5, int[] r6, java.lang.String r7, int r8) {
            /*
                int r0 = onInstallConversionDataLoadedNative
                int r0 = r0 + 43
                int r1 = r0 % 128
                onDeepLinkingNative = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 != 0) goto L_0x001d
                r0 = 40
                int r0 = r0 / r1
                r0 = 82
                if (r7 == 0) goto L_0x0017
                r2 = 93
                goto L_0x0018
            L_0x0017:
                r2 = r0
            L_0x0018:
                if (r2 == r0) goto L_0x0023
                goto L_0x001f
            L_0x001b:
                r5 = move-exception
                throw r5
            L_0x001d:
                if (r7 == 0) goto L_0x0023
            L_0x001f:
                char[] r7 = r7.toCharArray()
            L_0x0023:
                char[] r7 = (char[]) r7
                if (r5 == 0) goto L_0x002d
                java.lang.String r0 = "ISO-8859-1"
                byte[] r5 = r5.getBytes(r0)
            L_0x002d:
                byte[] r5 = (byte[]) r5
                char[] r0 = init
                int r2 = getLevel
                boolean r3 = onAttributionFailureNative
                if (r3 == 0) goto L_0x0073
                int r3 = r5.length
                char[] r4 = new char[r3]
                int r6 = onDeepLinkingNative
                int r6 = r6 + 9
                int r7 = r6 % 128
                onInstallConversionDataLoadedNative = r7
                int r6 = r6 % 2
            L_0x0044:
                r6 = 96
                if (r1 >= r3) goto L_0x004a
                r7 = r6
                goto L_0x004c
            L_0x004a:
                r7 = 60
            L_0x004c:
                if (r7 == r6) goto L_0x0064
                java.lang.String r5 = new java.lang.String
                r5.<init>(r4)
                int r6 = onInstallConversionDataLoadedNative
                int r6 = r6 + 89
                int r7 = r6 % 128
                onDeepLinkingNative = r7
                int r6 = r6 % 2
                if (r6 == 0) goto L_0x0060
                return r5
            L_0x0060:
                r5 = 0
                throw r5     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r5 = move-exception
                throw r5
            L_0x0064:
                int r6 = r3 + -1
                int r6 = r6 - r1
                byte r6 = r5[r6]
                int r6 = r6 + r8
                char r6 = r0[r6]
                int r6 = r6 - r2
                char r6 = (char) r6
                r4[r1] = r6
                int r1 = r1 + 1
                goto L_0x0044
            L_0x0073:
                boolean r5 = AFLogger$LogLevel
                if (r5 == 0) goto L_0x00a3
                int r5 = r7.length
                char[] r6 = new char[r5]
                int r3 = onDeepLinkingNative
                int r3 = r3 + 29
                int r4 = r3 % 128
                onInstallConversionDataLoadedNative = r4
                int r3 = r3 % 2
            L_0x0084:
                r3 = 24
                if (r1 >= r5) goto L_0x008b
                r4 = 38
                goto L_0x008c
            L_0x008b:
                r4 = r3
            L_0x008c:
                if (r4 == r3) goto L_0x009d
                int r3 = r5 + -1
                int r3 = r3 - r1
                char r3 = r7[r3]
                int r3 = r3 - r8
                char r3 = r0[r3]
                int r3 = r3 - r2
                char r3 = (char) r3
                r6[r1] = r3
                int r1 = r1 + 1
                goto L_0x0084
            L_0x009d:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r6)
                return r5
            L_0x00a3:
                int r5 = r6.length
                char[] r7 = new char[r5]
                r3 = r1
            L_0x00a7:
                if (r3 >= r5) goto L_0x00ab
                r4 = 1
                goto L_0x00ac
            L_0x00ab:
                r4 = r1
            L_0x00ac:
                if (r4 == 0) goto L_0x00bd
                int r4 = r5 + -1
                int r4 = r4 - r3
                r4 = r6[r4]
                int r4 = r4 - r8
                char r4 = r0[r4]
                int r4 = r4 - r2
                char r4 = (char) r4
                r7[r3] = r4
                int r3 = r3 + 1
                goto L_0x00a7
            L_0x00bd:
                java.lang.String r5 = new java.lang.String
                r5.<init>(r7)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5030b.C5031e.AFKeystoreWrapper(java.lang.String, int[], java.lang.String, int):java.lang.String");
        }
    }

    private static String valueOf(char c, int i, int i2) {
        char[] cArr = new char[i];
        int i3 = 0;
        while (true) {
            if ((i3 < i ? 'A' : 'U') != 'A') {
                return new String(cArr);
            }
            int i4 = AppsFlyer2dXConversionCallback;
            int i5 = i4 + 9;
            init = i5 % 128;
            int i6 = i5 % 2;
            cArr[i3] = (char) ((int) ((((long) values[i2 + i3]) ^ (((long) i3) * AFKeystoreWrapper)) ^ ((long) c)));
            i3++;
            int i7 = i4 + 111;
            init = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static String values(String str, Long l) {
        int i = AppsFlyer2dXConversionCallback;
        int i2 = i + 9;
        init = i2 % 128;
        int i3 = i2 % 2;
        if ((str != null ? 'b' : 'H') != 'H') {
            int i4 = i + 27;
            init = i4 % 128;
            int i5 = i4 % 2;
            if (l != null && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                int i6 = 0;
                for (int i7 = 0; i7 < obj.length(); i7++) {
                    i6 += Character.getNumericValue(obj.charAt(i7));
                }
                String hexString = Integer.toHexString(i6);
                sb.replace(7, hexString.length() + 7, hexString);
                long j = 0;
                int i8 = 0;
                while (true) {
                    if (!(i8 < sb.length())) {
                        break;
                    }
                    int i9 = init + 111;
                    AppsFlyer2dXConversionCallback = i9 % 128;
                    int i10 = i9 % 2;
                    j += (long) Character.getNumericValue(sb.charAt(i8));
                    i8++;
                }
                while (true) {
                    if (j <= 100) {
                        break;
                    }
                    j %= 100;
                }
                sb.insert(23, (int) j);
                if (j < 10) {
                    sb.insert(23, valueOf((char) ExpandableListView.getPackedPositionGroup(0), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - Color.alpha(0)).intern());
                }
                return sb.toString();
            }
        }
        return values("ဆ쌧Ụ记", "鿷⭴ጇ⋿", TextUtils.getOffsetBefore("", 0), "狟뫦ዥ渖脋┻煑ﺬ툐鼰罼絕䇳甫멪瘖뤐⣒犤내곐呪鋹뭟ࡂ赚ᚦﺎ價", (char) (65299 - Color.alpha(0))).intern();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        r14 = r14.split(values("ဆ쌧Ụ记", "ퟺ携ꃸ", (android.os.Process.getThreadPriority(0) + 20) >> 6, "뚘鵳", (char) (63588 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern());
        r0 = r14.length;
        r1 = new java.lang.StringBuilder();
        r0 = r0 - 1;
        r1.append(r14[r0]);
        r1.append(values("ဆ쌧Ụ记", "㸮⾗縜", 472880958 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "ꈵ", (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32126)).intern());
        r2 = AppsFlyer2dXConversionCallback + 109;
        init = r2 % 128;
        r2 = r2 % 2;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b3, code lost:
        if (r2 >= r0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b5, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b7, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b8, code lost:
        if (r9 == true) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ba, code lost:
        r9 = init + 9;
        AppsFlyer2dXConversionCallback = r9 % 128;
        r9 = r9 % 2;
        r1.append(r14[r2]);
        r1.append(values("ဆ쌧Ụ记", "㸮⾗縜", android.view.KeyEvent.getDeadChar(0, 0) + 472880958, "ꈵ", (char) (32127 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)))).intern());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e7, code lost:
        r1.append(r14[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f0, code lost:
        return r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if ((r14.contains(values("ဆ쌧Ụ记", "㸮⾗縜", 472880958 - android.text.TextUtils.getTrimmedLength(""), "ꈵ", (char) (3788 % (android.media.AudioTrack.getMaxVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)))).intern())) != true) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if (r14.contains(values("ဆ쌧Ụ记", "㸮⾗縜", android.text.TextUtils.getTrimmedLength("") + 472880958, "ꈵ", (char) (32127 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern()) == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.lang.String r14) {
        /*
            int r0 = init
            int r0 = r0 + 3
            int r1 = r0 % 128
            AppsFlyer2dXConversionCallback = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = "ꈵ"
            r4 = 472880958(0x1c2f973e, float:5.809812E-22)
            java.lang.String r5 = "㸮⾗縜"
            java.lang.String r6 = "ဆ쌧Ụ记"
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0040
            int r0 = android.text.TextUtils.getTrimmedLength(r1)
            int r0 = r4 - r0
            r1 = 3788(0xecc, float:5.308E-42)
            float r9 = android.media.AudioTrack.getMaxVolume()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            int r1 = r1 % r9
            char r1 = (char) r1
            java.lang.String r0 = values(r6, r5, r0, r3, r1)
            java.lang.String r0 = r0.intern()
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L_0x003c
            r0 = r7
            goto L_0x003d
        L_0x003c:
            r0 = r8
        L_0x003d:
            if (r0 == r8) goto L_0x005d
            goto L_0x005c
        L_0x0040:
            int r0 = android.text.TextUtils.getTrimmedLength(r1)
            int r0 = r0 + r4
            float r1 = android.media.AudioTrack.getMaxVolume()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            int r1 = 32127 - r1
            char r1 = (char) r1
            java.lang.String r0 = values(r6, r5, r0, r3, r1)
            java.lang.String r0 = r0.intern()
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            return r14
        L_0x005d:
            int r0 = android.os.Process.getThreadPriority(r7)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            r1 = 63588(0xf864, float:8.9106E-41)
            float r9 = android.media.AudioTrack.getMinVolume()
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            int r1 = r1 - r9
            char r1 = (char) r1
            java.lang.String r9 = "ퟺ携ꃸ"
            java.lang.String r10 = "뚘鵳"
            java.lang.String r0 = values(r6, r9, r0, r10, r1)
            java.lang.String r0 = r0.intern()
            java.lang.String[] r14 = r14.split(r0)
            int r0 = r14.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r0 - r8
            r9 = r14[r0]
            r1.append(r9)
            int r9 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r9 = r9 >> 16
            int r9 = r4 - r9
            float r10 = android.media.AudioTrack.getMinVolume()
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            int r2 = r2 + 32126
            char r2 = (char) r2
            java.lang.String r2 = values(r6, r5, r9, r3, r2)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            int r2 = AppsFlyer2dXConversionCallback
            int r2 = r2 + 109
            int r9 = r2 % 128
            init = r9
            int r2 = r2 % 2
            r2 = r8
        L_0x00b3:
            if (r2 >= r0) goto L_0x00b7
            r9 = r7
            goto L_0x00b8
        L_0x00b7:
            r9 = r8
        L_0x00b8:
            if (r9 == r8) goto L_0x00e7
            int r9 = init
            int r9 = r9 + 9
            int r10 = r9 % 128
            AppsFlyer2dXConversionCallback = r10
            int r9 = r9 % 2
            r9 = r14[r2]
            r1.append(r9)
            int r9 = android.view.KeyEvent.getDeadChar(r7, r7)
            int r9 = r9 + r4
            long r10 = android.os.Process.getElapsedCpuTime()
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            int r10 = 32127 - r10
            char r10 = (char) r10
            java.lang.String r9 = values(r6, r5, r9, r3, r10)
            java.lang.String r9 = r9.intern()
            r1.append(r9)
            int r2 = r2 + 1
            goto L_0x00b3
        L_0x00e7:
            r14 = r14[r7]
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5030b.values(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, char r9) {
        /*
            int r0 = AppsFlyer2dXConversionCallback
            int r0 = r0 + 61
            int r1 = r0 % 128
            init = r1
            r2 = 2
            int r0 = r0 % r2
            r0 = 17
            if (r8 == 0) goto L_0x0011
            r3 = 64
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            r4 = 0
            if (r3 == r0) goto L_0x002c
            int r1 = r1 + 3
            int r0 = r1 % 128
            AppsFlyer2dXConversionCallback = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L_0x0028
            char[] r8 = r8.toCharArray()
            r0 = 22
            int r0 = r0 / r4
            goto L_0x002c
        L_0x0026:
            r5 = move-exception
            throw r5
        L_0x0028:
            char[] r8 = r8.toCharArray()
        L_0x002c:
            char[] r8 = (char[]) r8
            r0 = 1
            if (r6 == 0) goto L_0x0033
            r1 = r4
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 == r0) goto L_0x003a
            char[] r6 = r6.toCharArray()
        L_0x003a:
            char[] r6 = (char[]) r6
            if (r5 == 0) goto L_0x005d
            int r0 = init
            int r0 = r0 + 59
            int r1 = r0 % 128
            AppsFlyer2dXConversionCallback = r1
            int r0 = r0 % r2
            r1 = 34
            if (r0 == 0) goto L_0x004d
            r0 = r1
            goto L_0x004f
        L_0x004d:
            r0 = 46
        L_0x004f:
            if (r0 == r1) goto L_0x0056
            char[] r5 = r5.toCharArray()
            goto L_0x005d
        L_0x0056:
            r5.toCharArray()
            r5 = 0
            throw r5     // Catch:{ all -> 0x005b }
        L_0x005b:
            r5 = move-exception
            throw r5
        L_0x005d:
            char[] r5 = (char[]) r5
            java.lang.Object r6 = r6.clone()
            char[] r6 = (char[]) r6
            java.lang.Object r5 = r5.clone()
            char[] r5 = (char[]) r5
            char r0 = r6[r4]
            r9 = r9 ^ r0
            char r9 = (char) r9
            r6[r4] = r9
            char r9 = r5[r2]
            char r7 = (char) r7
            int r9 = r9 + r7
            char r7 = (char) r9
            r5[r2] = r7
            int r7 = r8.length
            char[] r9 = new char[r7]
        L_0x007b:
            if (r4 >= r7) goto L_0x009c
            com.appsflyer.internal.C5084ct.AFInAppEventParameterName(r6, r5, r4)
            char r0 = r8[r4]
            int r1 = r4 + 3
            int r1 = r1 % 4
            char r1 = r6[r1]
            r0 = r0 ^ r1
            long r0 = (long) r0
            long r2 = AFInAppEventType
            long r0 = r0 ^ r2
            int r2 = AFInAppEventParameterName
            long r2 = (long) r2
            long r0 = r0 ^ r2
            char r2 = valueOf
            long r2 = (long) r2
            long r0 = r0 ^ r2
            int r0 = (int) r0
            char r0 = (char) r0
            r9[r4] = r0
            int r4 = r4 + 1
            goto L_0x007b
        L_0x009c:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C5030b.values(java.lang.String, java.lang.String, int, java.lang.String, char):java.lang.String");
    }
}
