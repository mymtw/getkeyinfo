package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;

/* renamed from: androidx.room.y */
public final class C3259y {
    /* renamed from: a */
    public static <T extends RoomDatabase> RoomDatabase.C3213a<T> m7913a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new RoomDatabase.C3213a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
