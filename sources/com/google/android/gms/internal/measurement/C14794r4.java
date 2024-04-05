package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
public final class C14794r4 {

    /* renamed from: a */
    public static final C14641f7 f33068a = new C14641f7();

    /* renamed from: b */
    public static final C14654g7 f33069b = new C14654g7();

    /* renamed from: a */
    public static C14768p4 m23909a(C14768p4 p4Var) {
        return ((p4Var instanceof C14781q4) || (p4Var instanceof zzic)) ? p4Var : p4Var instanceof Serializable ? new zzic(p4Var) : new C14781q4(p4Var);
    }

    /* renamed from: b */
    public static String m23910b(zzix zzix) {
        StringBuilder sb = new StringBuilder(zzix.zzd());
        for (int i = 0; i < zzix.zzd(); i++) {
            byte zza = zzix.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zza >= 32 && zza <= 126) {
                            sb.append((char) zza);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
