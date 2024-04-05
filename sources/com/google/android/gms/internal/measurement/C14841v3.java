package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
public final class C14841v3 {

    /* renamed from: a */
    public static final Uri f33120a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f33121b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c */
    public static final Pattern f33122c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d */
    public static final AtomicBoolean f33123d = new AtomicBoolean();

    /* renamed from: e */
    public static HashMap<String, String> f33124e;

    /* renamed from: f */
    public static final HashMap<String, Boolean> f33125f = new HashMap<>();

    /* renamed from: g */
    public static final HashMap<String, Integer> f33126g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Long> f33127h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Float> f33128i = new HashMap<>();

    /* renamed from: j */
    public static Object f33129j;

    /* renamed from: k */
    public static final String[] f33130k = new String[0];

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
    }
}
