package p291y3;

import android.content.Context;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.google.android.play.core.assetpacks.C15631n0;
import p291y3.C8371b;
import p291y3.C8375d;

/* renamed from: y3.e */
public final class C8380e extends C8381f {

    /* renamed from: c */
    public final /* synthetic */ C8371b.C8372a f18369c;

    /* renamed from: d */
    public final /* synthetic */ String f18370d;

    /* renamed from: e */
    public final /* synthetic */ String f18371e;

    /* renamed from: f */
    public final /* synthetic */ C8375d.C8379b f18372f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8380e(Uri uri, C8371b.C8372a aVar, C8375d.C8376a.C8378b bVar, String str, String str2) {
        super(uri);
        this.f18369c = aVar;
        this.f18370d = str;
        this.f18371e = str2;
        this.f18372f = bVar;
    }

    /* renamed from: a */
    public final void mo20964a(Exception exc) {
        StringBuilder h = C0072d.m201h("Bitly SDK failed to parse JSON: ");
        h.append(exc.getMessage());
        Log.d("BitlySDK", h.toString());
        C8371b.C8372a aVar = this.f18369c;
        if (aVar != null) {
            aVar.mo18909b(new C15631n0(exc.getMessage(), exc, this.f18370d, this.f18371e, 2));
        }
    }

    public final void onPostExecute(Object obj) {
        C8375d.C8376a aVar;
        boolean z;
        super.onPostExecute((Void) obj);
        C8375d.C8379b bVar = this.f18372f;
        if (bVar != null && !this.f18374b && (z = aVar.f18364c)) {
            Context context = (aVar = C8375d.C8376a.this).f18365d;
            int i = aVar.f18366e;
            C8375d.m16722a(context, i == 0 ? 1000 : i + i, z);
        }
    }
}
