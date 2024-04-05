package p253u3;

import android.database.sqlite.SQLiteDatabase;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;

/* renamed from: u3.i */
public final class C8144i implements C8151p {

    /* renamed from: a */
    public final /* synthetic */ C8139f f17854a;

    /* renamed from: b */
    public final /* synthetic */ C8139f f17855b;

    public C8144i(C8139f fVar, C8139f fVar2) {
        this.f17855b = fVar;
        this.f17854a = fVar2;
    }

    /* renamed from: a */
    public final void mo20760a(SQLiteDatabase sQLiteDatabase) {
        this.f17855b.f17821c.mo20786x(sQLiteDatabase, "store", EventsNameKt.DEVICE_ID, this.f17854a.f17825g);
        this.f17855b.f17821c.mo20786x(sQLiteDatabase, "store", "user_id", this.f17854a.f17824f);
        this.f17855b.f17821c.mo20786x(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(this.f17854a.f17827i ? 1 : 0));
        this.f17855b.f17821c.mo20786x(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(this.f17854a.f17832n));
        this.f17855b.f17821c.mo20786x(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(this.f17854a.f17836r));
    }
}
