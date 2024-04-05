package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@KeepForSdk
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {
        private final List<String> zza = new ArrayList();
        private final Object zzb;

        public /* synthetic */ ToStringHelper(Object obj, zzah zzah) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
        }

        @KeepForSdk
        public ToStringHelper add(String str, Object obj) {
            List<String> list = this.zza;
            Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            int size = this.zza.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.zza.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String next : keySet) {
            if (!equal(bundle.get(next), bundle2.get(next))) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj, (zzah) null);
    }
}
