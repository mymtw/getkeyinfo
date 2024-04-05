package p099f1;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.C2282c;
import androidx.core.view.C2364y;
import p099f1.C6772e;

/* renamed from: f1.b */
public final class C6769b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C6771d f14904a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6769b(InputConnection inputConnection, C6770c cVar) {
        super(inputConnection, false);
        this.f14904a = cVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        C6771d dVar = this.f14904a;
        C6772e eVar = inputContentInfo == null ? null : new C6772e(new C6772e.C6773a(inputContentInfo));
        C6770c cVar = (C6770c) dVar;
        cVar.getClass();
        boolean z = false;
        if ((i & 1) != 0) {
            try {
                ((C6772e.C6773a) eVar.f14906a).mo18914b();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C6772e.C6773a) eVar.f14906a).mo18913a();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipData clipData = new ClipData(((C6772e.C6773a) eVar.f14906a).f14907a.getDescription(), new ClipData.Item(((C6772e.C6773a) eVar.f14906a).f14907a.getContentUri()));
        C2282c.C2284b aVar = Build.VERSION.SDK_INT >= 31 ? new C2282c.C2283a(clipData, 2) : new C2282c.C2285c(clipData, 2);
        aVar.mo8876a(((C6772e.C6773a) eVar.f14906a).f14907a.getLinkUri());
        aVar.setExtras(bundle2);
        if (C2364y.m5197l(cVar.f14905a, aVar.build()) == null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
