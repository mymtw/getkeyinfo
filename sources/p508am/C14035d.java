package p508am;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.compose.foundation.layout.C0761x;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: am.d */
public final class C14035d {

    /* renamed from: a */
    public final SharedPreferences f30891a;

    /* renamed from: b */
    public final String f30892b;

    public C14035d(Context context, String str, String str2) throws IOException {
        this.f30892b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f30891a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f30891a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    /* renamed from: a */
    public final byte[] mo46860a() throws IOException {
        try {
            String string = this.f30891a.getString(this.f30892b, (String) null);
            if (string != null) {
                return C0761x.m1683O(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f30892b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f30892b}));
        }
    }
}
