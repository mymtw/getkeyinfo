package com.etsy.android.lib.util;

import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.UserProfile;
import java.text.Collator;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.etsy.android.lib.util.d0 */
public final class C8885d0 {
    /* renamed from: a */
    public static int m17317a(String str, String str2) {
        Collator instance = Collator.getInstance(Locale.getDefault());
        instance.setStrength(0);
        return instance.compare(str, str2);
    }

    /* renamed from: b */
    public static String m17318b(double d) {
        return NumberFormat.getInstance().format(d);
    }

    /* renamed from: c */
    public static String m17319c(UserProfile userProfile) {
        String str;
        String str2 = "";
        if (userProfile == null) {
            return str2;
        }
        if (m17324h(userProfile.getLocation())) {
            return userProfile.getLocation();
        }
        if (m17324h(userProfile.getCity())) {
            StringBuilder h = C0072d.m201h(str2);
            h.append(userProfile.getCity());
            str = h.toString();
        } else {
            str = str2;
        }
        if (userProfile.getCountry() == null || !m17324h(userProfile.getCountry().getName())) {
            return str;
        }
        StringBuilder h2 = C0072d.m201h(str);
        if (!str2.equals(str)) {
            str2 = ", ";
        }
        h2.append(str2);
        h2.append(userProfile.getCountry().getName());
        return h2.toString();
    }

    /* renamed from: d */
    public static String m17320d(User user) {
        String str;
        if (user == null) {
            return "";
        }
        UserProfile profile = user.getProfile();
        if (profile != null) {
            str = m17323g(profile.getFirstName()) ? profile.getFirstName() : "";
            if (m17323g(profile.getLastName())) {
                StringBuilder h = C0072d.m201h(str);
                h.append("".equals(str) ? "" : " ");
                h.append(profile.getLastName());
                str = h.toString();
            }
            if (TextUtils.isEmpty(str) && m17323g(profile.getLoginName())) {
                str = profile.getLoginName();
            }
        } else {
            str = "";
        }
        return "".equals(str) ? user.getLoginName() : str;
    }

    /* renamed from: e */
    public static String m17321e(Date date) {
        return date == null ? "" : DateFormat.getDateInstance().format(date);
    }

    /* renamed from: f */
    public static boolean m17322f(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: g */
    public static boolean m17323g(String str) {
        return str != null && !str.isEmpty() && !"".equals(str.trim());
    }

    /* renamed from: h */
    public static boolean m17324h(String str) {
        return str != null && !str.isEmpty() && !"".equals(str.trim()) && !"null".equals(str.trim());
    }
}
