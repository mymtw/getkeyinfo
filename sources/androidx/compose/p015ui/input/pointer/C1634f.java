package androidx.compose.p015ui.input.pointer;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.C1734c;
import androidx.compose.p015ui.node.C1737d;
import androidx.work.C3436p;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.internal.measurement.C14599c4;
import com.google.android.gms.internal.measurement.C14829u3;
import com.google.android.gms.internal.measurement.C14841v3;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15596e1;
import com.google.android.play.core.assetpacks.C15604g1;
import com.google.android.play.core.assetpacks.C15608h1;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p112g2.C6836c;
import p112g2.C6837d;
import p219r.C7734e;

/* renamed from: androidx.compose.ui.input.pointer.f */
public class C1634f implements C6837d, C15604g1 {

    /* renamed from: b */
    public final /* synthetic */ int f3629b;

    /* renamed from: c */
    public Object f3630c;

    /* renamed from: d */
    public Object f3631d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1634f(int i) {
        this(3, (Object) null, (Object) null);
        this.f3629b = i;
        if (i == 3) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[SYNTHETIC, Splitter:B:15:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC, Splitter:B:19:0x0046] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.compose.p015ui.input.pointer.C1634f m3493c(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0034, Error -> 0x0032, OverlappingFileLockException -> 0x0030 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0034, Error -> 0x0032, OverlappingFileLockException -> 0x0030 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0034, Error -> 0x0032, OverlappingFileLockException -> 0x0030 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034, Error -> 0x0032, OverlappingFileLockException -> 0x0030 }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0034, Error -> 0x0032, OverlappingFileLockException -> 0x0030 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0034, Error -> 0x0032, OverlappingFileLockException -> 0x0030 }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002c, Error -> 0x002a, OverlappingFileLockException -> 0x0028 }
            androidx.compose.ui.input.pointer.f r2 = new androidx.compose.ui.input.pointer.f     // Catch:{ IOException -> 0x0026, Error -> 0x0024, OverlappingFileLockException -> 0x0022 }
            r3 = 6
            r2.<init>(r3, r5, r0)     // Catch:{ IOException -> 0x0026, Error -> 0x0024, OverlappingFileLockException -> 0x0022 }
            return r2
        L_0x0022:
            r2 = move-exception
            goto L_0x0038
        L_0x0024:
            r2 = move-exception
            goto L_0x0038
        L_0x0026:
            r2 = move-exception
            goto L_0x0038
        L_0x0028:
            r0 = move-exception
            goto L_0x002d
        L_0x002a:
            r0 = move-exception
            goto L_0x002d
        L_0x002c:
            r0 = move-exception
        L_0x002d:
            r2 = r0
            r0 = r1
            goto L_0x0038
        L_0x0030:
            r5 = move-exception
            goto L_0x0035
        L_0x0032:
            r5 = move-exception
            goto L_0x0035
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            r2 = r5
            r5 = r1
            r0 = r5
        L_0x0038:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0044
            r0.release()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            r5.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.C1634f.m3493c(android.content.Context):androidx.compose.ui.input.pointer.f");
    }

    /* renamed from: a */
    public final String mo6592a() {
        return (String) this.f3630c;
    }

    /* renamed from: b */
    public final void mo6593b(C6836c cVar) {
        Object[] objArr = (Object[]) this.f3631d;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    cVar.mo12015p0(i);
                } else if (obj instanceof byte[]) {
                    cVar.mo12014i0(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    cVar.mo12017v(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    cVar.mo12017v(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    cVar.mo12013h0(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    cVar.mo12013h0(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    cVar.mo12013h0(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    cVar.mo12013h0(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    cVar.mo12011Y(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    cVar.mo12013h0(i, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo6594d(long j, C1734c cVar) {
        T t;
        C19383o.m32797g(cVar, "pointerInputFilters");
        C1639k kVar = (C1639k) this.f3631d;
        int i = cVar.f3894e;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C1650u uVar = (C1650u) cVar.f3891b[i2];
            if (z) {
                C7734e<C1638j> eVar = kVar.f3650a;
                int i3 = eVar.f17157d;
                if (i3 > 0) {
                    T[] tArr = eVar.f17155b;
                    int i4 = 0;
                    while (true) {
                        t = tArr[i4];
                        if (C19383o.m32792b(((C1638j) t).f3642b, uVar)) {
                            break;
                        }
                        i4++;
                        if (i4 >= i3) {
                            break;
                        }
                    }
                } else {
                    t = null;
                }
                C1638j jVar = (C1638j) t;
                if (jVar != null) {
                    jVar.f3648h = true;
                    if (!jVar.f3643c.mo20236j(new C1643o(j))) {
                        jVar.f3643c.mo20232c(new C1643o(j));
                    }
                    kVar = jVar;
                } else {
                    z = false;
                }
            }
            C1638j jVar2 = new C1638j(uVar);
            jVar2.f3643c.mo20232c(new C1643o(j));
            kVar.f3650a.mo20232c(jVar2);
            kVar = jVar2;
        }
    }

    /* renamed from: e */
    public final void mo6595e(byte[] bArr) {
        byte[] bArr2 = bArr;
        long[] jArr = ((long[][]) this.f3631d)[bArr2[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = ((long[][]) this.f3631d)[bArr2[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        C3436p.m8246h(j, bArr2, 0);
        C3436p.m8246h(j2, bArr2, 8);
    }

    /* renamed from: f */
    public final boolean mo6596f(C1635g gVar, boolean z) {
        if (!((C1639k) this.f3631d).mo6602a(gVar.f3632a, (C1689j) this.f3630c, gVar, z)) {
            return false;
        }
        return ((C1639k) this.f3631d).mo6605d(gVar) || ((C1639k) this.f3631d).mo6606e(gVar.f3632a, (C1689j) this.f3630c, gVar, z);
    }

    /* renamed from: g */
    public final void mo6597g() {
        try {
            ((FileLock) this.f3631d).release();
            ((FileChannel) this.f3630c).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public final Object zza() {
        String str;
        Class<C14841v3> cls = C14841v3.class;
        switch (this.f3629b) {
            case 4:
                String str2 = (String) this.f3631d;
                ContentResolver contentResolver = ((C14599c4) this.f3630c).f32783a.getContentResolver();
                Uri uri = C14841v3.f33120a;
                synchronized (cls) {
                    str = null;
                    if (C14841v3.f33124e == null) {
                        C14841v3.f33123d.set(false);
                        C14841v3.f33124e = new HashMap<>();
                        C14841v3.f33129j = new Object();
                        contentResolver.registerContentObserver(C14841v3.f33120a, true, new C14829u3());
                    } else if (C14841v3.f33123d.getAndSet(false)) {
                        C14841v3.f33124e.clear();
                        C14841v3.f33125f.clear();
                        C14841v3.f33126g.clear();
                        C14841v3.f33127h.clear();
                        C14841v3.f33128i.clear();
                        C14841v3.f33129j = new Object();
                    }
                    Object obj = C14841v3.f33129j;
                    if (C14841v3.f33124e.containsKey(str2)) {
                        String str3 = C14841v3.f33124e.get(str2);
                        if (str3 != null) {
                            str = str3;
                        }
                    } else {
                        int length = C14841v3.f33130k.length;
                        Cursor query = contentResolver.query(C14841v3.f33120a, (String[]) null, (String) null, new String[]{str2}, (String) null);
                        if (query != null) {
                            try {
                                if (!query.moveToFirst()) {
                                    synchronized (cls) {
                                        if (obj == C14841v3.f33129j) {
                                            C14841v3.f33124e.put(str2, (Object) null);
                                        }
                                    }
                                } else {
                                    String string = query.getString(1);
                                    if (string != null && string.equals((Object) null)) {
                                        string = null;
                                    }
                                    synchronized (cls) {
                                        if (obj == C14841v3.f33129j) {
                                            C14841v3.f33124e.put(str2, string);
                                        }
                                    }
                                    if (string != null) {
                                        str = string;
                                    }
                                }
                                query.close();
                            } catch (Throwable th) {
                                query.close();
                                throw th;
                            }
                        }
                    }
                }
                return str;
            default:
                C15608h1 h1Var = (C15608h1) this.f3630c;
                Bundle bundle = (Bundle) this.f3631d;
                h1Var.getClass();
                int i = bundle.getInt("session_id");
                if (i == 0) {
                    return Boolean.TRUE;
                }
                HashMap hashMap = h1Var.f35174e;
                Integer valueOf = Integer.valueOf(i);
                if (!hashMap.containsKey(valueOf)) {
                    return Boolean.TRUE;
                }
                C15596e1 e1Var = (C15596e1) h1Var.f35174e.get(valueOf);
                if (e1Var.f35123c.f35106d == 6) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!C19543e0.m33343x0(e1Var.f35123c.f35106d, bundle.getInt(C15562d.m25188Z(ResponseConstants.STATUS, C15608h1.m25395e(bundle)))));
        }
    }

    public /* synthetic */ C1634f(int i, Object obj, Object obj2) {
        this.f3629b = i;
        this.f3630c = obj;
        this.f3631d = obj2;
    }

    public C1634f(C1737d dVar) {
        this.f3629b = 0;
        C19383o.m32797g(dVar, "rootCoordinates");
        this.f3630c = dVar;
        this.f3631d = new C1639k();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1634f(String str) {
        this(1, str, (Object) null);
        this.f3629b = 1;
    }
}
