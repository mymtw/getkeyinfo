package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p112g2.C6832b;
import p299z1.C8420a;

/* renamed from: androidx.room.i */
public final class C3237i {

    /* renamed from: a */
    public final C6832b.C6835c f7520a;

    /* renamed from: b */
    public final Context f7521b;

    /* renamed from: c */
    public final String f7522c;

    /* renamed from: d */
    public final RoomDatabase.C3215c f7523d;

    /* renamed from: e */
    public final List<RoomDatabase.C3214b> f7524e;

    /* renamed from: f */
    public final List<Object> f7525f;

    /* renamed from: g */
    public final List<C8420a> f7526g;

    /* renamed from: h */
    public final boolean f7527h;

    /* renamed from: i */
    public final RoomDatabase.JournalMode f7528i;

    /* renamed from: j */
    public final Executor f7529j;

    /* renamed from: k */
    public final Executor f7530k;

    /* renamed from: l */
    public final boolean f7531l = false;

    /* renamed from: m */
    public final boolean f7532m;

    /* renamed from: n */
    public final boolean f7533n;

    @SuppressLint({"LambdaLast"})
    public C3237i(Context context, String str, C6832b.C6835c cVar, RoomDatabase.C3215c cVar2, ArrayList arrayList, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.f7520a = cVar;
        this.f7521b = context;
        this.f7522c = str;
        this.f7523d = cVar2;
        this.f7524e = arrayList;
        this.f7527h = z;
        this.f7528i = journalMode;
        this.f7529j = executor;
        this.f7530k = executor2;
        this.f7532m = z2;
        this.f7533n = z3;
        this.f7525f = Collections.emptyList();
        this.f7526g = Collections.emptyList();
    }

    /* renamed from: a */
    public final boolean mo12031a(int i, int i2) {
        if (!(i > i2) || !this.f7533n) {
            return this.f7532m;
        }
        return false;
    }
}
