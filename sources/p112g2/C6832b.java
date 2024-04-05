package p112g2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import p124h2.C6920a;

/* renamed from: g2.b */
public interface C6832b extends Closeable {

    /* renamed from: g2.b$a */
    public static abstract class C6833a {

        /* renamed from: a */
        public final int f15035a;

        public C6833a(int i) {
            this.f15035a = i;
        }

        /* renamed from: a */
        public static void m13238a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }

        /* renamed from: b */
        public abstract void mo11998b();

        /* renamed from: c */
        public abstract void mo11999c(C6920a aVar);

        /* renamed from: d */
        public abstract void mo12000d(C6920a aVar, int i, int i2);

        /* renamed from: e */
        public abstract void mo12001e(C6920a aVar);

        /* renamed from: f */
        public abstract void mo12002f(C6920a aVar, int i, int i2);
    }

    /* renamed from: g2.b$b */
    public static class C6834b {

        /* renamed from: a */
        public final Context f15036a;

        /* renamed from: b */
        public final String f15037b;

        /* renamed from: c */
        public final C6833a f15038c;

        /* renamed from: d */
        public final boolean f15039d;

        public C6834b(Context context, String str, C6833a aVar, boolean z) {
            this.f15036a = context;
            this.f15037b = str;
            this.f15038c = aVar;
            this.f15039d = z;
        }
    }

    /* renamed from: g2.b$c */
    public interface C6835c {
        /* renamed from: a */
        C6832b mo18970a(C6834b bVar);
    }

    void close();

    String getDatabaseName();

    /* renamed from: j0 */
    C6831a mo12025j0();

    void setWriteAheadLoggingEnabled(boolean z);
}
