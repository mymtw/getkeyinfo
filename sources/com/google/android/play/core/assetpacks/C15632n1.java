package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.measurement.internal.C14944c5;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.C15714z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p568fn.C17782b;
import p689ul.C18614l;
import p689ul.C18617o;

/* renamed from: com.google.android.play.core.assetpacks.n1 */
public final class C15632n1 implements C15677y2 {

    /* renamed from: i */
    public static final C15032m3 f35252i = new C15032m3("FakeAssetPackService");

    /* renamed from: a */
    public final String f35253a;

    /* renamed from: b */
    public final C15674y f35254b;

    /* renamed from: c */
    public final C15671x0 f35255c;

    /* renamed from: d */
    public final Context f35256d;

    /* renamed from: e */
    public final C15589c2 f35257e;

    /* renamed from: f */
    public final C15714z f35258f;

    /* renamed from: g */
    public final C15581a2 f35259g;

    /* renamed from: h */
    public final Handler f35260h = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public C15632n1(File file, C15674y yVar, C15671x0 x0Var, Context context, C15589c2 c2Var, C15714z zVar, C15581a2 a2Var) {
        this.f35253a = file.getAbsolutePath();
        this.f35254b = yVar;
        this.f35255c = x0Var;
        this.f35256d = context;
        this.f35257e = c2Var;
        this.f35258f = zVar;
        this.f35259g = a2Var;
    }

    /* renamed from: h */
    public static long m25436h(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo55464a(int i, String str) {
        f35252i.mo52245e("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f35258f.zza()).execute(new C15624l1(this, i, str));
    }

    /* renamed from: b */
    public final void mo55465b(int i) {
        f35252i.mo52245e("notifySessionFailed", new Object[0]);
    }

    /* renamed from: c */
    public final void mo55466c(String str, int i, int i2, String str2) {
        f35252i.mo52245e("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: d */
    public final C18617o mo55467d(List list, C15676y1 y1Var, HashMap hashMap) {
        f35252i.mo52245e("getPackStates(%s)", list);
        C18614l lVar = new C18614l();
        ((Executor) this.f35258f.zza()).execute(new C15628m1(this, list, y1Var, lVar));
        return lVar.f41104a;
    }

    /* renamed from: e */
    public final void mo55468e(List list) {
        f35252i.mo52245e("cancelDownload(%s)", list);
    }

    /* renamed from: f */
    public final C18617o mo55469f(HashMap hashMap) {
        f35252i.mo52245e("syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C18617o oVar = new C18617o();
        synchronized (oVar.f41106a) {
            if (!oVar.f41108c) {
                oVar.f41108c = true;
                oVar.f41109d = arrayList;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        oVar.f41107b.mo70124b(oVar);
        return oVar;
    }

    /* renamed from: g */
    public final C18617o mo55470g(String str, int i, int i2, String str2) {
        f35252i.mo52245e("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C18614l lVar = new C18614l();
        try {
            for (File file : mo55473k(str)) {
                if (C17782b.m29899z0(file).equals(str2)) {
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                    C18617o oVar = lVar.f41104a;
                    synchronized (oVar.f41106a) {
                        if (!oVar.f41108c) {
                            oVar.f41108c = true;
                            oVar.f41109d = open;
                        } else {
                            throw new IllegalStateException("Task is already complete");
                        }
                    }
                    oVar.f41107b.mo70124b(oVar);
                    return lVar.f41104a;
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f35252i.mo52246f("getChunkFileDescriptor failed", e);
            LocalTestingException localTestingException = new LocalTestingException("Asset Slice file not found.", e);
            C18617o oVar2 = lVar.f41104a;
            synchronized (oVar2.f41106a) {
                if (!oVar2.f41108c) {
                    oVar2.f41108c = true;
                    oVar2.f41110e = localTestingException;
                    oVar2.f41107b.mo70124b(oVar2);
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
        } catch (LocalTestingException e2) {
            f35252i.mo52246f("getChunkFileDescriptor failed", e2);
            C18617o oVar3 = lVar.f41104a;
            synchronized (oVar3.f41106a) {
                if (!oVar3.f41108c) {
                    oVar3.f41108c = true;
                    oVar3.f41110e = e2;
                    oVar3.f41107b.mo70124b(oVar3);
                } else {
                    throw new IllegalStateException("Task is already complete");
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo55471i(int i, int i2, String str) throws LocalTestingException {
        int i3 = i2;
        String str2 = str;
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f35257e.mo55388a());
        bundle.putInt("session_id", i);
        File[] k = mo55473k(str2);
        ArrayList arrayList = new ArrayList();
        int length = k.length;
        long j = 0;
        int i4 = 0;
        while (true) {
            Intent intent = null;
            if (i4 < length) {
                File file = k[i4];
                j += file.length();
                ArrayList arrayList2 = new ArrayList();
                if (i3 == 3) {
                    intent = new Intent().setData(Uri.EMPTY);
                }
                arrayList2.add(intent);
                String z0 = C17782b.m29899z0(file);
                bundle.putParcelableArrayList(C15562d.m25190a0("chunk_intents", str2, z0), arrayList2);
                try {
                    bundle.putString(C15562d.m25190a0("uncompressed_hash_sha256", str2, z0), C15640p1.m25455a(Arrays.asList(new File[]{file})));
                    bundle.putLong(C15562d.m25190a0("uncompressed_size", str2, z0), file.length());
                    arrayList.add(z0);
                    i4++;
                } catch (NoSuchAlgorithmException e) {
                    throw new LocalTestingException("SHA256 algorithm not supported.", e);
                } catch (IOException e2) {
                    throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
                }
            } else {
                bundle.putStringArrayList(C15562d.m25188Z("slice_ids", str2), arrayList);
                bundle.putLong(C15562d.m25188Z("pack_version", str2), (long) this.f35257e.mo55388a());
                bundle.putInt(C15562d.m25188Z(ResponseConstants.STATUS, str2), i3);
                bundle.putInt(C15562d.m25188Z("error_code", str2), 0);
                bundle.putLong(C15562d.m25188Z("bytes_downloaded", str2), m25436h(i3, j));
                bundle.putLong(C15562d.m25188Z("total_bytes_to_download", str2), j);
                bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str2})));
                bundle.putLong("bytes_downloaded", m25436h(i3, j));
                bundle.putLong("total_bytes_to_download", j);
                this.f35260h.post(new C14944c5((Object) this, (Object) new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle), 3));
                return;
            }
        }
    }

    /* renamed from: j */
    public final C15603g0 mo55472j(int i, String str) throws LocalTestingException {
        double doubleValue;
        String str2 = str;
        long j = 0;
        for (File length : mo55473k(str2)) {
            j += length.length();
        }
        int i2 = i;
        long h = m25436h(i, j);
        C15671x0 x0Var = this.f35255c;
        synchronized (x0Var) {
            Double d = (Double) x0Var.f35400a.get(str2);
            doubleValue = d == null ? ShadowDrawableWrapper.COS_45 : d.doubleValue();
        }
        return AssetPackState.m25234h(str, i, 0, h, j, doubleValue, 1, String.valueOf(this.f35257e.mo55388a()), this.f35259g.mo55371a(str2));
    }

    /* renamed from: k */
    public final File[] mo55473k(String str) throws LocalTestingException {
        File file = new File(this.f35253a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C15620k1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File z0 : listFiles) {
                        if (C17782b.m29899z0(z0).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No main slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final void zzf() {
        f35252i.mo52245e("keepAlive", new Object[0]);
    }
}
