package p257u8;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.cardinalcommerce.shared.p065cs.utils.CCInitProvider;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* renamed from: u8.e */
public final class C8176e {

    /* renamed from: a */
    public final String f17949a = C8176e.class.getSimpleName();

    /* renamed from: b */
    public Context f17950b = CCInitProvider.m12770a();

    /* renamed from: a */
    public final String mo20805a() {
        BufferedReader bufferedReader;
        String str = "";
        try {
            FileInputStream openFileInput = this.f17950b.openFileInput("cca_logs.txt");
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(openFileInput);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    if (openFileInput != null) {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                            sb.append("\n");
                        }
                        str = sb.toString();
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            } catch (Throwable th2) {
                if (openFileInput != null) {
                    openFileInput.close();
                }
                throw th2;
            }
        } catch (IOException e) {
            String str2 = this.f17949a;
            StringBuilder h = C0072d.m201h("Exception during closing log file. Error: ");
            h.append(e.getLocalizedMessage());
            Log.e(str2, h.toString());
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        return str.trim();
        throw th;
    }

    /* renamed from: b */
    public final void mo20806b(String str) {
        OutputStreamWriter outputStreamWriter;
        try {
            outputStreamWriter = new OutputStreamWriter(this.f17950b.openFileOutput("cca_logs.txt", 0));
            outputStreamWriter.append(str);
            outputStreamWriter.close();
            return;
        } catch (IOException e) {
            String str2 = this.f17949a;
            StringBuilder h = C0072d.m201h("Exception during adding to log file. Error: ");
            h.append(e.getLocalizedMessage());
            Log.e(str2, h.toString());
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
