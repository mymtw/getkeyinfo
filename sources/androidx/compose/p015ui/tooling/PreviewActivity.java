package androidx.compose.p015ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.C0109c;
import kotlin.text.C19459m;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.tooling.PreviewActivity */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 0;
    private final String TAG = "PreviewActivity";

    private final void setComposableContent(String str) {
        String str2 = this.TAG;
        Log.d(str2, "PreviewActivity has composable " + str);
        String G1 = C19459m.m33034G1(str);
        String D1 = C19459m.m33031D1(str, str);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(G1, D1, stringExtra);
            return;
        }
        String str3 = this.TAG;
        Log.d(str3, "Previewing '" + D1 + "' without a parameter provider.");
        C0109c.m264a(this, C18263b.m30807B(new PreviewActivity$setComposableContent$2(G1, D1), -161032931, true));
    }

    private final void setParameterizedContent(String str, String str2, String str3) {
        String str4 = this.TAG;
        Log.d(str4, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        Object[] V = C18263b.m30827V(getIntent().getIntExtra("parameterProviderIndex", -1), C18263b.m30862q(str3));
        if (V.length > 1) {
            C0109c.m264a(this, C18263b.m30807B(new PreviewActivity$setParameterizedContent$1(V, str, str2), -1735847170, true));
        } else {
            C0109c.m264a(this, C18263b.m30807B(new PreviewActivity$setParameterizedContent$2(str, str2, V), 1507674311, true));
        }
    }

    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("composable")) != null) {
            setComposableContent(stringExtra);
        }
    }
}
