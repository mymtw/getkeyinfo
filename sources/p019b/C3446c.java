package p019b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p019b.C3443a;
import p193o.C7494b;
import p260v0.C8184a;

/* renamed from: b.c */
public final class C3446c extends C3443a<String[], Map<String, Boolean>> {
    /* renamed from: a */
    public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    /* renamed from: b */
    public final C3443a.C3444a mo12969b(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return new C3443a.C3444a(Collections.emptyMap());
        }
        C7494b bVar = new C7494b();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = C8184a.m16458a(componentActivity, str) == 0;
            bVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new C3443a.C3444a(bVar);
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo1147c(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return hashMap;
    }
}
