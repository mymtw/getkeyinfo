package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.internal.measurement.C14683ia;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.assetpacks.C15665v2;
import com.google.android.play.core.internal.C15702n;
import com.google.android.play.core.internal.C15704p;
import com.google.android.play.core.internal.C15705q;
import com.google.android.play.core.internal.C15707s;
import com.google.android.play.core.internal.zzbt;
import com.google.android.play.core.internal.zzbx;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19382n;
import p036c5.C4410a;
import p150j4.C7114e;
import p150j4.C7116g;
import p568fn.C17782b;
import p673sl.C18528h;

/* renamed from: com.google.android.gms.measurement.internal.u */
public final /* synthetic */ class C15099u implements C14941c2, C7116g, C15702n {

    /* renamed from: b */
    public static final /* synthetic */ C15099u f33859b = new C15099u();

    /* renamed from: c */
    public static Object m24632c(ClassLoader classLoader) {
        Class<Object> cls = Object.class;
        Field O0 = C19382n.m32726O0(classLoader, "pathList");
        try {
            return cls.cast(O0.get(classLoader));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{O0.getName(), classLoader.getClass().getName(), cls.getName()}), e);
        }
    }

    /* renamed from: f */
    public static void m24633f(ClassLoader classLoader, HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                Log.d("Splitcompat", valueOf.length() != 0 ? "Adding native library parent directory: ".concat(valueOf) : new String("Adding native library parent directory: "));
                hashSet2.add(file.getParentFile());
            }
            Object c = m24632c(classLoader);
            C15707s sVar = new C15707s(c, File.class, C19382n.m32726O0(c, "nativeLibraryDirectories"));
            hashSet2.removeAll(Arrays.asList((File[]) sVar.mo55494a()));
            synchronized (C18528h.class) {
                int size = hashSet2.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                Log.d("Splitcompat", sb.toString());
                sVar.mo55532d(hashSet2);
            }
        }
    }

    /* renamed from: g */
    public static boolean m24634g(ClassLoader classLoader, File file, File file2, boolean z, C15705q qVar, String str, C15704p pVar) {
        ArrayList arrayList = new ArrayList();
        Object c = m24632c(classLoader);
        C15707s sVar = new C15707s(c, Object.class, C19382n.m32726O0(c, "dexElements"));
        List asList = Arrays.asList((Object[]) sVar.mo55494a());
        ArrayList arrayList2 = new ArrayList();
        for (Object next : asList) {
            arrayList2.add((File) new C15665v2(next, C19382n.m32726O0(next, str), File.class).mo55494a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || pVar.mo7680g(c, file2, file)) {
            sVar.mo55531c(Arrays.asList(qVar.mo1130e(c, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            zzbt zzbt = new zzbt("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", (IOException) arrayList.get(i));
            }
            new C15707s(c, IOException.class, C19382n.m32726O0(c, "dexElementsSuppressedExceptions")).mo55531c(arrayList);
            throw zzbt;
        }
        String valueOf = String.valueOf(file2.getPath());
        Log.w("SplitCompat", valueOf.length() != 0 ? "Should be optimized ".concat(valueOf) : new String("Should be optimized "));
        return false;
    }

    /* renamed from: a */
    public boolean mo5754a(Object obj, File file, C7114e eVar) {
        try {
            C4410a.m10113c(((GifDrawable) ((C6051s) obj).get()).getBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    /* renamed from: b */
    public EncodeStrategy mo17027b(C7114e eVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: d */
    public boolean mo4158d(ClassLoader classLoader, File file, File file2, boolean z) {
        return m24634g(classLoader, file, file2, z, new C17782b(), ResponseConstants.ZIP, new C15588c1());
    }

    /* renamed from: e */
    public void mo4159e(ClassLoader classLoader, HashSet hashSet) {
        m24633f(classLoader, hashSet);
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Boolean.valueOf(C14683ia.f32888c.zza().zze());
    }
}
