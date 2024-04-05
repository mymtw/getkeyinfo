package p281x1;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import com.paypal.pyplcheckout.utils.BitmapColorUtils;
import com.paypal.pyplcheckout.utils.C17281a;
import p281x1.C8304b;

/* renamed from: x1.c */
public final class C8310c extends AsyncTask<Bitmap, Void, C8304b> {

    /* renamed from: a */
    public final /* synthetic */ C8304b.C8308d f18235a;

    /* renamed from: b */
    public final /* synthetic */ C8304b.C8306b f18236b;

    public C8310c(C8304b.C8306b bVar, C17281a aVar) {
        this.f18236b = bVar;
        this.f18235a = aVar;
    }

    public final Object doInBackground(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        try {
            return this.f18236b.mo20900a();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    public final void onPostExecute(Object obj) {
        C17281a aVar = (C17281a) this.f18235a;
        BitmapColorUtils.m35462getBestTextContrastingColor$lambda2(aVar.f37800a, aVar.f37801b, aVar.f37802c, aVar.f37803d, (C8304b) obj);
    }
}
