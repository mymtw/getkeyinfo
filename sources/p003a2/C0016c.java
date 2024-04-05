package p003a2;

import android.database.Cursor;
import android.util.Log;
import java.util.Arrays;

/* renamed from: a2.c */
public final class C0016c {
    /* renamed from: a */
    public static int m97a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "";
        }
        throw new IllegalArgumentException(C0015b.m90i("column '", str, "' does not exist. Available columns: ", str2));
    }
}
