package p021b1;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.appcompat.widget.C0326j;
import androidx.core.provider.FontsContractCompat$Columns;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p003a2.C0023f;
import p280x0.C8286d;

/* renamed from: b1.d */
public final class C3454d {

    /* renamed from: a */
    public static final C3455a f8055a = new C3455a();

    /* renamed from: b1.d$a */
    public class C3455a implements Comparator<byte[]> {
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [b1.l[], android.database.Cursor] */
    /* renamed from: a */
    public static C3463k m8291a(Context context, C3456e eVar) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        boolean z;
        C3456e eVar2 = eVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar2.f8056a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C0326j.m864i("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(eVar2.f8057b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, f8055a);
            List<List<byte[]>> list = eVar2.f8059d;
            if (list == null) {
                list = C8286d.m16580b(resources, 0);
            }
            int i = 0;
            while (true) {
                cursor = 0;
                if (i >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, f8055a);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return new C3463k(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme(ResponseConstants.CONTENT).authority(str2).build();
            Uri build2 = new Uri.Builder().scheme(ResponseConstants.CONTENT).authority(str2).appendPath(ResponseConstants.FILE).build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{AnalyticsLogDatabaseHelper.f19040ID, FontsContractCompat$Columns.FILE_ID, FontsContractCompat$Columns.TTC_INDEX, FontsContractCompat$Columns.VARIATION_SETTINGS, FontsContractCompat$Columns.WEIGHT, FontsContractCompat$Columns.ITALIC, FontsContractCompat$Columns.RESULT_CODE}, "query = ?", new String[]{eVar2.f8058c}, (String) null, (CancellationSignal) null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex(FontsContractCompat$Columns.RESULT_CODE);
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex(AnalyticsLogDatabaseHelper.f19040ID);
                    int columnIndex3 = cursor.getColumnIndex(FontsContractCompat$Columns.FILE_ID);
                    int columnIndex4 = cursor.getColumnIndex(FontsContractCompat$Columns.TTC_INDEX);
                    int columnIndex5 = cursor.getColumnIndex(FontsContractCompat$Columns.WEIGHT);
                    int columnIndex6 = cursor.getColumnIndex(FontsContractCompat$Columns.ITALIC);
                    while (cursor.moveToNext()) {
                        arrayList3.add(new C3464l(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : LogSeverity.WARNING_VALUE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                    }
                }
                return new C3463k(0, (C3464l[]) arrayList3.toArray(new C3464l[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            StringBuilder l = C0023f.m111l("Found content provider ", str, ", but package was not ");
            l.append(eVar2.f8057b);
            throw new PackageManager.NameNotFoundException(l.toString());
        }
    }
}
