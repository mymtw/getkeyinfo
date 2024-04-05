package com.google.android.gms.measurement.internal;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.assetpacks.C15665v2;
import com.google.android.play.core.internal.C15702n;
import com.google.android.play.core.internal.C15706r;
import com.google.android.play.core.internal.C15707s;
import com.google.android.play.core.internal.zzbt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19382n;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;
import p469vf.C13788a;
import p469vf.C13789b;
import p673sl.C18528h;

/* renamed from: com.google.android.gms.measurement.internal.a0 */
public final /* synthetic */ class C14921a0 implements C14941c2, FeatureManager.C12256a, C15702n {

    /* renamed from: b */
    public static final /* synthetic */ C14921a0 f33258b = new C14921a0();

    /* renamed from: c */
    public static final C14921a0 f33259c = new C14921a0();

    /* renamed from: a */
    public static void m24234a(ClassLoader classLoader, HashSet hashSet, C15706r rVar) {
        Class<C18528h> cls = C18528h.class;
        if (!hashSet.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.add(((File) it.next()).getParentFile());
            }
            Object c = C15099u.m24632c(classLoader);
            C15665v2 v2Var = new C15665v2(c, C19382n.m32726O0(c, "nativeLibraryDirectories"), List.class);
            synchronized (cls) {
                ArrayList arrayList = new ArrayList((Collection) v2Var.mo55494a());
                hashSet2.removeAll(arrayList);
                arrayList.addAll(hashSet2);
                v2Var.mo55495b(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] b = rVar.mo4157b(c, new ArrayList(hashSet2), arrayList2);
            if (!arrayList2.isEmpty()) {
                zzbt zzbt = new zzbt("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    IOException iOException = (IOException) arrayList2.get(i);
                }
                throw zzbt;
            }
            synchronized (cls) {
                new C15707s(c, Object.class, C19382n.m32726O0(c, "nativeLibraryPathElements")).mo55532d(Arrays.asList(b));
            }
        }
    }

    /* renamed from: b */
    public static boolean m24235b(ClassLoader classLoader, File file, File file2, boolean z) {
        return C15099u.m24634g(classLoader, file, file2, z, new C0114h(), ResponseConstants.ZIP, new C15588c1());
    }

    /* renamed from: d */
    public boolean mo4158d(ClassLoader classLoader, File file, File file2, boolean z) {
        return m24235b(classLoader, file, file2, z);
    }

    /* renamed from: e */
    public void mo4159e(ClassLoader classLoader, HashSet hashSet) {
        m24234a(classLoader, hashSet, new C0761x());
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            String str = C13789b.f30347a;
            Class<C13789b> cls = C13789b.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C13418j.m21108d().execute(C13788a.f30346b);
                } catch (Exception e) {
                    C12869i0.m20550F(C13789b.f30347a, e);
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Integer.valueOf((int) C14720l8.f32933c.zza().zzb());
    }
}
