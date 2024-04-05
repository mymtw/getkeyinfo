package com.google.android.gms.internal.icing;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import p556ej.C17707c;

@ShowFirstParty
@SafeParcelable.Class(creator = "UsageInfoCreator")
@SafeParcelable.Reserved({1000})
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    @SafeParcelable.Field(mo49213id = 1)
    public final zzi zza;
    @SafeParcelable.Field(mo49213id = 2)
    public final long zzb;
    @SafeParcelable.Field(mo49213id = 3)
    public int zzc;
    @SafeParcelable.Field(mo49213id = 4)
    public final String zzd;
    @SafeParcelable.Field(mo49213id = 5)
    public final zzg zze;
    @SafeParcelable.Field(defaultValue = "false", mo49213id = 6)
    public final boolean zzf;
    @SafeParcelable.Field(defaultValue = "-1", mo49213id = 7)
    public int zzg;
    @SafeParcelable.Field(mo49213id = 8)
    public int zzh;
    @SafeParcelable.Field(mo49213id = 9)
    public final String zzi;

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(mo49216id = 1) zzi zzi2, @SafeParcelable.Param(mo49216id = 2) long j, @SafeParcelable.Param(mo49216id = 3) int i, @SafeParcelable.Param(mo49216id = 4) String str, @SafeParcelable.Param(mo49216id = 5) zzg zzg2, @SafeParcelable.Param(mo49216id = 6) boolean z, @SafeParcelable.Param(mo49216id = 7) int i2, @SafeParcelable.Param(mo49216id = 8) int i3, @SafeParcelable.Param(mo49216id = 9) String str2) {
        this.zza = zzi2;
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = zzg2;
        this.zzf = z;
        this.zzg = i2;
        this.zzh = i3;
        this.zzi = str2;
    }

    public static zzi zza(String str, Intent intent) {
        return zzc(str, zze(intent));
    }

    @VisibleForTesting
    public static C14555v1 zzb(Intent intent, String str, Uri uri, String str2, List<C17707c.C17708a> list) {
        String string;
        String str3 = str;
        String str4 = str2;
        List<C17707c.C17708a> list2 = list;
        Class<C14494f> cls = C14494f.class;
        C14555v1 v1Var = new C14555v1();
        if (str3 != null) {
            ArrayList arrayList = new ArrayList();
            zzs zzs = r7;
            zzs zzs2 = new zzs("title", (String) null, false, 1, true, (String) null, (zzm[]) arrayList.toArray(new zzm[arrayList.size()]), "name", (zzu) null);
            v1Var.mo49948a(new zzk(str3, zzs, C14537p2.m23140a("text1"), (byte[]) null));
        }
        if (uri != null) {
            String uri2 = uri.toString();
            ArrayList arrayList2 = new ArrayList();
            zzs zzs3 = r7;
            zzs zzs4 = new zzs("web_url", (String) null, true, 1, false, (String) null, (zzm[]) arrayList2.toArray(new zzm[arrayList2.size()]), "url", (zzu) null);
            v1Var.mo49948a(new zzk(uri2, zzs3, zzk.zza, (byte[]) null));
        }
        if (list2 != null) {
            C14482c i = C14494f.m22989i();
            int size = list.size();
            C14490e[] eVarArr = new C14490e[size];
            boolean z = false;
            if (size <= 0) {
                List asList = Arrays.asList(eVarArr);
                if (i.f32618d) {
                    i.mo49739d();
                    i.f32618d = false;
                }
                C14494f.m22991k((C14494f) i.f32617c, asList);
                C14491e0 f = i.mo49740f();
                byte byteValue = ((Byte) f.mo49756e(1)).byteValue();
                if (byteValue == 1) {
                    z = true;
                } else if (byteValue != 0) {
                    z = C14512j1.f32651c.mo49820a(f.getClass()).mo49762a(f);
                    f.mo49756e(2);
                }
                if (z) {
                    C14494f fVar = (C14494f) f;
                    try {
                        int c = fVar.mo49741c();
                        byte[] bArr = new byte[c];
                        Logger logger = C14541r.f32685b;
                        C14538q qVar = new C14538q(bArr, c);
                        C14524m1<C14494f> a = C14512j1.f32651c.mo49820a(cls);
                        C14544s sVar = qVar.f32687a;
                        if (sVar == null) {
                            sVar = new C14544s(qVar);
                        }
                        a.mo49765d(fVar, sVar);
                        if (c - qVar.f32682f == 0) {
                            ArrayList arrayList3 = new ArrayList();
                            v1Var.mo49948a(new zzk((String) null, new zzs("outlinks", "blob", true, 1, false, (String) null, (zzm[]) arrayList3.toArray(new zzm[arrayList3.size()]), ".private:outLinks", (zzu) null), zzk.zza, bArr));
                        } else {
                            throw new IllegalStateException("Did not write as much data as expected.");
                        }
                    } catch (IOException e) {
                        String name = cls.getName();
                        throw new RuntimeException(C0070b.m184f(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
                    }
                } else {
                    throw new zzfc(f);
                }
            } else {
                C14490e.m22946i();
                list2.get(0).getClass();
                throw null;
            }
        }
        String action = intent.getAction();
        if (action != null) {
            v1Var.mo49948a(zzd("intent_action", action));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            v1Var.mo49948a(zzd("intent_data", dataString));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            v1Var.mo49948a(zzd("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (!(extras == null || (string = extras.getString("intent_extra_data_key")) == null)) {
            v1Var.mo49948a(zzd("intent_extra_data", string));
        }
        if (str4 != null) {
            v1Var.f32717b = str4;
        }
        v1Var.f32718c = true;
        return v1Var;
    }

    private static zzi zzc(String str, String str2) {
        return new zzi(str, "", str2);
    }

    private static zzk zzd(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        return new zzk(str2, new zzs(str, (String) null, true, 1, false, (String) null, (zzm[]) arrayList.toArray(new zzm[arrayList.size()]), (String) null, (zzu) null), C14537p2.m23140a(str), (byte[]) null);
    }

    private static String zze(Intent intent) {
        String uri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes("UTF-8"));
            return Long.toHexString(crc32.getValue());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzh)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzx(java.lang.String r13, android.content.Intent r14, java.lang.String r15, android.net.Uri r16, java.lang.String r17, java.util.List<p556ej.C17707c.C17708a> r18, int r19) {
        /*
            r12 = this;
            java.lang.String r0 = zze(r14)
            r1 = r13
            com.google.android.gms.internal.icing.zzi r2 = zzc(r13, r0)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 0
            r1 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            com.google.android.gms.internal.icing.v1 r1 = zzb(r14, r15, r6, r0, r7)
            r1.getClass()
            com.google.android.gms.internal.icing.zzg r7 = new com.google.android.gms.internal.icing.zzg
            java.lang.String r5 = r1.f32717b
            boolean r6 = r1.f32718c
            java.util.ArrayList r1 = r1.f32716a
            if (r1 == 0) goto L_0x0032
            int r8 = r1.size()
            com.google.android.gms.internal.icing.zzk[] r8 = new com.google.android.gms.internal.icing.zzk[r8]
            java.lang.Object[] r1 = r1.toArray(r8)
            com.google.android.gms.internal.icing.zzk[] r1 = (com.google.android.gms.internal.icing.zzk[]) r1
            goto L_0x0033
        L_0x0032:
            r1 = r0
        L_0x0033:
            r7.<init>((java.lang.String) r5, (boolean) r6, (android.accounts.Account) r0, (com.google.android.gms.internal.icing.zzk[]) r1)
            r8 = 0
            r9 = -1
            r10 = 1
            r11 = 0
            r5 = 0
            r6 = 0
            r1 = r12
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzx.<init>(java.lang.String, android.content.Intent, java.lang.String, android.net.Uri, java.lang.String, java.util.List, int):void");
    }
}
