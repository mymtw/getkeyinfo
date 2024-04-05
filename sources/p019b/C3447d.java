package p019b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import p019b.C3443a;
import p260v0.C8184a;

/* renamed from: b.d */
public final class C3447d extends C3443a<String, Boolean> {
    /* renamed from: a */
    public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
    }

    /* renamed from: b */
    public final C3443a.C3444a mo12969b(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        if (str == null) {
            return new C3443a.C3444a(Boolean.FALSE);
        }
        if (C8184a.m16458a(componentActivity, str) == 0) {
            return new C3443a.C3444a(Boolean.TRUE);
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo1147c(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || intArrayExtra.length == 0) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (intArrayExtra[0] == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
