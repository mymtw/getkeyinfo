package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import android.text.TextUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.push.CartRefreshDelegate;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14779q2;
import com.google.android.gms.internal.measurement.C14811s9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C14983h extends C14928a7 {

    /* renamed from: g */
    public static final String[] f33539g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: h */
    public static final String[] f33540h = {CartRefreshDelegate.ARG_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i */
    public static final String[] f33541i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", ResponseConstants.DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: j */
    public static final String[] f33542j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k */
    public static final String[] f33543k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l */
    public static final String[] f33544l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f33545m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n */
    public static final String[] f33546n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: e */
    public final C14974g f33547e;

    /* renamed from: f */
    public final C15122w6 f33548f = new C15122w6(((C15103u3) this.f33681b).f33885o);

    public C14983h(C14973f7 f7Var) {
        super(f7Var);
        ((C15103u3) this.f33681b).getClass();
        this.f33547e = new C14974g(this, ((C15103u3) this.f33681b).f33872b);
    }

    /* renamed from: v */
    public static final void m24335v(ContentValues contentValues, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: A */
    public final long mo52051A(String str) {
        Preconditions.checkNotEmpty(str);
        return mo52082y(0, "select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str});
    }

    @VisibleForTesting
    /* renamed from: B */
    public final SQLiteDatabase mo52052B() {
        mo51995g();
        try {
            return this.f33547e.getWritableDatabase();
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(e, "Error opening database");
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010d A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012e A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014d A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0173 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0175 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0183 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0187 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01af A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b1 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ce A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01d0 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ef A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0208 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0221 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0222 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0239 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x023a A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0249 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x026c A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0286 A[Catch:{ SQLiteException -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02c0  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C15143z3 mo52053C(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r34)
            r33.mo51995g()
            r33.mo51942h()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.mo52052B()     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029f }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029f }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029f }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029f }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029f }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x029d }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            com.google.android.gms.measurement.internal.z3 r5 = new com.google.android.gms.measurement.internal.z3     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.f7 r6 = r1.f34048c     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r6 = r6.f33497m     // Catch:{ SQLiteException -> 0x029d }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x029d }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52378c(r6)     // Catch:{ SQLiteException -> 0x029d }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52387l(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52394s(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52391p(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52392q(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52390o(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52380e(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52379d(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52388m(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52383h(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r7 != 0) goto L_0x00d3
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = r12
            goto L_0x00d4
        L_0x00d3:
            r6 = r0
        L_0x00d4:
            r5.mo52393r(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34037w     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00f0
            r9 = r0
            goto L_0x00f1
        L_0x00f0:
            r9 = r12
        L_0x00f1:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34037w = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34038x     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x010f
            r9 = r0
            goto L_0x0110
        L_0x010f:
            r9 = r12
        L_0x0110:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34038x = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34039y     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x012e
            r9 = r0
            goto L_0x012f
        L_0x012e:
            r9 = r12
        L_0x012f:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34039y = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34040z     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x014d
            r9 = r0
            goto L_0x014e
        L_0x014d:
            r9 = r12
        L_0x014e:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34040z = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52382g(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34014F     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0175
            r9 = r0
            goto L_0x0176
        L_0x0175:
            r9 = r12
        L_0x0176:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34014F = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r7 == 0) goto L_0x0187
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x018c
        L_0x0187:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x029d }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x029d }
        L_0x018c:
            r5.mo52381f(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52385j(r6)     // Catch:{ SQLiteException -> 0x029d }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34009A     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01b1
            r9 = r0
            goto L_0x01b2
        L_0x01b1:
            r9 = r12
        L_0x01b2:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34009A = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r8 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r8.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r8 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            long r9 = r5.f34010B     // Catch:{ SQLiteException -> 0x029d }
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x01d0
            r9 = r0
            goto L_0x01d1
        L_0x01d0:
            r9 = r12
        L_0x01d1:
            r8 = r8 | r9
            r5.f34012D = r8     // Catch:{ SQLiteException -> 0x029d }
            r5.f34010B = r6     // Catch:{ SQLiteException -> 0x029d }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52389n(r6)     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.o4 r6 = r1.f33681b     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.d r6 = r6.f33878h     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C14959e2.f33416l0     // Catch:{ SQLiteException -> 0x029d }
            boolean r6 = r6.mo51973p(r3, r7)     // Catch:{ SQLiteException -> 0x029d }
            r7 = 0
            if (r6 != 0) goto L_0x0200
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r9 == 0) goto L_0x01f9
            r9 = r7
            goto L_0x01fd
        L_0x01f9:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x029d }
        L_0x01fd:
            r5.mo52377b(r9)     // Catch:{ SQLiteException -> 0x029d }
        L_0x0200:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r9 != 0) goto L_0x0211
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r6 == 0) goto L_0x020f
            goto L_0x0211
        L_0x020f:
            r6 = r12
            goto L_0x0212
        L_0x0211:
            r6 = r0
        L_0x0212:
            com.google.android.gms.measurement.internal.u3 r9 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r9.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            boolean r9 = r5.f34012D     // Catch:{ SQLiteException -> 0x029d }
            boolean r10 = r5.f34031q     // Catch:{ SQLiteException -> 0x029d }
            if (r10 == r6) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            r0 = r12
        L_0x0223:
            r0 = r0 | r9
            r5.f34012D = r0     // Catch:{ SQLiteException -> 0x029d }
            r5.f34031q = r6     // Catch:{ SQLiteException -> 0x029d }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52376a(r0)     // Catch:{ SQLiteException -> 0x029d }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x029d }
            if (r6 == 0) goto L_0x023a
            goto L_0x023e
        L_0x023a:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x029d }
        L_0x023e:
            r5.mo52384i(r7)     // Catch:{ SQLiteException -> 0x029d }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x029d }
            if (r6 != 0) goto L_0x025b
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x029d }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x029d }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52395t(r0)     // Catch:{ SQLiteException -> 0x029d }
        L_0x025b:
            com.google.android.gms.internal.measurement.C14811s9.m23933a()     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C14959e2.f33398c0     // Catch:{ SQLiteException -> 0x029d }
            boolean r0 = r0.mo51973p(r2, r6)     // Catch:{ SQLiteException -> 0x029d }
            if (r0 == 0) goto L_0x0275
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x029d }
            r5.mo52386k(r0)     // Catch:{ SQLiteException -> 0x029d }
        L_0x0275:
            com.google.android.gms.measurement.internal.u3 r0 = r5.f34015a     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo52015a()     // Catch:{ SQLiteException -> 0x029d }
            r0.mo51995g()     // Catch:{ SQLiteException -> 0x029d }
            r5.f34012D = r12     // Catch:{ SQLiteException -> 0x029d }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x029d }
            if (r0 == 0) goto L_0x0299
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteException -> 0x029d }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r34)     // Catch:{ SQLiteException -> 0x029d }
            r0.mo52238b(r7, r6)     // Catch:{ SQLiteException -> 0x029d }
        L_0x0299:
            r4.close()
            return r5
        L_0x029d:
            r0 = move-exception
            goto L_0x02a3
        L_0x029f:
            r0 = move-exception
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r4 = r3
        L_0x02a3:
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Error querying app. appId"
            com.google.android.gms.measurement.internal.n2 r2 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r34)     // Catch:{ all -> 0x02bc }
            r5.mo52239c(r2, r6, r0)     // Catch:{ all -> 0x02bc }
            if (r4 == 0) goto L_0x02bb
            r4.close()
        L_0x02bb:
            return r3
        L_0x02bc:
            r0 = move-exception
            r3 = r4
        L_0x02be:
            if (r3 == 0) goto L_0x02c3
            r3.close()
        L_0x02c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52053C(java.lang.String):com.google.android.gms.measurement.internal.z3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0129  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzab mo52054D(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r32)
            r30.mo51995g()
            r30.mo51942h()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo52052B()     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fe }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fe }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fe }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fe }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fe }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0100, all -> 0x00fe }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00fc }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00fc }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo52059I(r10, r3)     // Catch:{ SQLiteException -> 0x00fc }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00fc }
            if (r0 == 0) goto L_0x0066
            r21 = r3
            goto L_0x0068
        L_0x0066:
            r21 = r2
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00fc }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.f7 r0 = r1.f34048c     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.h7 r0 = r0.f33492h     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)     // Catch:{ SQLiteException -> 0x00fc }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00fc }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzat> r3 = com.google.android.gms.measurement.internal.zzat.CREATOR     // Catch:{ SQLiteException -> 0x00fc }
            android.os.Parcelable r0 = r0.mo52116x(r2, r3)     // Catch:{ SQLiteException -> 0x00fc }
            r23 = r0
            com.google.android.gms.measurement.internal.zzat r23 = (com.google.android.gms.measurement.internal.zzat) r23     // Catch:{ SQLiteException -> 0x00fc }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.f7 r0 = r1.f34048c     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.h7 r0 = r0.f33492h     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)     // Catch:{ SQLiteException -> 0x00fc }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00fc }
            android.os.Parcelable r0 = r0.mo52116x(r2, r3)     // Catch:{ SQLiteException -> 0x00fc }
            r26 = r0
            com.google.android.gms.measurement.internal.zzat r26 = (com.google.android.gms.measurement.internal.zzat) r26     // Catch:{ SQLiteException -> 0x00fc }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00fc }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.f7 r0 = r1.f34048c     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.h7 r0 = r0.f33492h     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)     // Catch:{ SQLiteException -> 0x00fc }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00fc }
            android.os.Parcelable r0 = r0.mo52116x(r2, r3)     // Catch:{ SQLiteException -> 0x00fc }
            r29 = r0
            com.google.android.gms.measurement.internal.zzat r29 = (com.google.android.gms.measurement.internal.zzat) r29     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.zzkv r18 = new com.google.android.gms.measurement.internal.zzkv     // Catch:{ SQLiteException -> 0x00fc }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.zzab r0 = new com.google.android.gms.measurement.internal.zzab     // Catch:{ SQLiteException -> 0x00fc }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00fc }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00fc }
            if (r2 == 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ SQLiteException -> 0x00fc }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r31)     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ SQLiteException -> 0x00fc }
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n     // Catch:{ SQLiteException -> 0x00fc }
            java.lang.String r5 = r5.mo52144f(r8)     // Catch:{ SQLiteException -> 0x00fc }
            r2.mo52239c(r4, r3, r5)     // Catch:{ SQLiteException -> 0x00fc }
        L_0x00f8:
            r10.close()
            return r0
        L_0x00fc:
            r0 = move-exception
            goto L_0x0102
        L_0x00fe:
            r0 = move-exception
            goto L_0x0127
        L_0x0100:
            r0 = move-exception
            r10 = r9
        L_0x0102:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "Error querying conditional property"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r31)     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = r5.mo52144f(r8)     // Catch:{ all -> 0x0125 }
            r2.mo52240d(r4, r5, r0, r3)     // Catch:{ all -> 0x0125 }
            if (r10 == 0) goto L_0x0124
            r10.close()
        L_0x0124:
            return r9
        L_0x0125:
            r0 = move-exception
            r9 = r10
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()
        L_0x012c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52054D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    /* renamed from: E */
    public final C14965f mo52055E(long j, String str, boolean z, boolean z2) {
        return mo52056F(j, str, 1, false, false, z, false, z2);
    }

    /* renamed from: F */
    public final C14965f mo52056F(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        mo51995g();
        mo51942h();
        String[] strArr = {str};
        C14965f fVar = new C14965f();
        Cursor cursor = null;
        try {
            SQLiteDatabase B = mo52052B();
            cursor = B.query("apps", new String[]{ResponseConstants.DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(C15049o2.m24575p(str), "Not updating daily counts, app is not known. appId");
                cursor.close();
                return fVar;
            }
            if (cursor.getLong(0) == j) {
                fVar.f33463b = cursor.getLong(1);
                fVar.f33462a = cursor.getLong(2);
                fVar.f33464c = cursor.getLong(3);
                fVar.f33465d = cursor.getLong(4);
                fVar.f33466e = cursor.getLong(5);
            }
            if (z) {
                fVar.f33463b += j2;
            }
            if (z2) {
                fVar.f33462a += j2;
            }
            if (z3) {
                fVar.f33464c += j2;
            }
            if (z4) {
                fVar.f33465d += j2;
            }
            if (z5) {
                fVar.f33466e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(ResponseConstants.DAY, Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(fVar.f33462a));
            contentValues.put("daily_events_count", Long.valueOf(fVar.f33463b));
            contentValues.put("daily_conversions_count", Long.valueOf(fVar.f33464c));
            contentValues.put("daily_error_events_count", Long.valueOf(fVar.f33465d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(fVar.f33466e));
            B.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return fVar;
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error updating daily counts. appId", e);
            if (cursor != null) {
                cursor.close();
            }
            return fVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C15037n mo52057G(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r29)
            r27.mo51995g()
            r27.mo51942h()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo52052B()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.n r24 = new com.google.android.gms.measurement.internal.n     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo52238b(r3, r2)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo52142d(r6)     // Catch:{ all -> 0x014b }
            r2.mo52240d(r4, r5, r0, r3)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52057G(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C15000i7 mo52058H(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.mo51995g()
            r19.mo51942h()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo52052B()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo52059I(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.i7 r0 = new com.google.android.gms.measurement.internal.i7     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo52238b(r4, r3)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo52144f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo52240d(r4, r5, r0, r3)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52058H(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.i7");
    }

    @VisibleForTesting
    /* renamed from: I */
    public final Object mo52059I(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                return null;
            }
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo52060J() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo52052B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.o4 r3 = r6.f33681b     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo52238b(r2, r4)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52060J():java.lang.String");
    }

    /* renamed from: K */
    public final List<zzab> mo52061K(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo51995g();
        mo51942h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo52062L(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: L */
    public final List<zzab> mo52062L(String str, String[] strArr) {
        mo51995g();
        mo51942h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase B = mo52052B();
            String[] strArr2 = {"app_id", CartRefreshDelegate.ARG_ORIGIN, "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            ((C15103u3) this.f33681b).getClass();
            Cursor query = B.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    ((C15103u3) this.f33681b).getClass();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object I = mo52059I(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C14991h7 h7Var = this.f34048c.f33492h;
                        C14973f7.m24287I(h7Var);
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator creator = zzat.CREATOR;
                        long j2 = query.getLong(8);
                        C14991h7 h7Var2 = this.f34048c.f33492h;
                        C14973f7.m24287I(h7Var2);
                        long j3 = query.getLong(10);
                        long j4 = query.getLong(11);
                        C14991h7 h7Var3 = this.f34048c.f33492h;
                        C14973f7.m24287I(h7Var3);
                        arrayList.add(new zzab(string, string2, new zzkv(string3, j3, I, string2), j2, z, string4, (zzat) h7Var.mo52116x(blob, creator), j, (zzat) h7Var2.mo52116x(query.getBlob(9), creator), j4, (zzat) h7Var3.mo52116x(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C15031m2 m2Var = ((C15103u3) this.f33681b).mo52016b().f33724g;
                        ((C15103u3) this.f33681b).getClass();
                        m2Var.mo52238b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Error querying conditional user property value");
            List<zzab> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: M */
    public final List<C15000i7> mo52063M(String str) {
        Preconditions.checkNotEmpty(str);
        mo51995g();
        mo51942h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            ((C15103u3) this.f33681b).getClass();
            Cursor query = mo52052B().query("user_attributes", new String[]{"name", CartRefreshDelegate.ARG_ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object I = mo52059I(query, 3);
                    if (I == null) {
                        ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C15000i7(str, str2, string, j, I));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error querying user properties. appId", e);
            List<C15000i7> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124 A[DONT_GENERATE] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C15000i7> mo52064N(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)
            r16.mo51995g()
            r16.mo51942h()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0107 }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x0107 }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x0101 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0101 }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x0101 }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x0101 }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00ff }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00ff }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00ff }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00ff }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00ff }
            android.database.sqlite.SQLiteDatabase r2 = r16.mo52052B()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r9 = "rowid"
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ SQLiteException -> 0x00ff }
            r3.getClass()     // Catch:{ SQLiteException -> 0x00ff }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00ff }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00ff }
            if (r2 != 0) goto L_0x0091
            r11.close()
            return r0
        L_0x0091:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.o4 r3 = r1.f33681b     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ SQLiteException -> 0x00ff }
            r3.getClass()     // Catch:{ SQLiteException -> 0x00ff }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x00bb
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ SQLiteException -> 0x00ff }
            r5.getClass()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x00ff }
            r2.mo52238b(r3, r4)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x00fb
        L_0x00bb:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00ff }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00ff }
            r2 = 2
            java.lang.Object r9 = r1.mo52059I(r11, r2)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00ff }
            if (r9 != 0) goto L_0x00e6
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r17)     // Catch:{ SQLiteException -> 0x00ff }
            r10 = r19
            r2.mo52240d(r4, r14, r10, r3)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x00f4
        L_0x00e6:
            r10 = r19
            com.google.android.gms.measurement.internal.i7 r2 = new com.google.android.gms.measurement.internal.i7     // Catch:{ SQLiteException -> 0x00ff }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00ff }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00ff }
        L_0x00f4:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00ff }
            if (r2 == 0) goto L_0x00fb
            goto L_0x0091
        L_0x00fb:
            r11.close()
            return r0
        L_0x00ff:
            r0 = move-exception
            goto L_0x010b
        L_0x0101:
            r0 = move-exception
        L_0x0102:
            r14 = r18
            goto L_0x010b
        L_0x0105:
            r0 = move-exception
            goto L_0x0128
        L_0x0107:
            r0 = move-exception
            r13 = r17
            goto L_0x0102
        L_0x010b:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x0105 }
            java.lang.String r3 = "(2)Error querying user properties"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r17)     // Catch:{ all -> 0x0105 }
            r2.mo52240d(r4, r14, r0, r3)     // Catch:{ all -> 0x0105 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0105 }
            if (r11 == 0) goto L_0x0127
            r11.close()
        L_0x0127:
            return r0
        L_0x0128:
            if (r11 == 0) goto L_0x012d
            r11.close()
        L_0x012d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52064N(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: O */
    public final void mo52065O() {
        mo51942h();
        mo52052B().beginTransaction();
    }

    /* renamed from: P */
    public final void mo52066P(ArrayList arrayList) {
        Preconditions.checkNotNull(arrayList);
        mo51995g();
        mo51942h();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) arrayList.get(i)).longValue());
        }
        sb.append(")");
        int delete = mo52052B().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != arrayList.size()) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(Integer.valueOf(delete), "Deleted fewer rows from raw events table than expected", Integer.valueOf(arrayList.size()));
        }
    }

    /* renamed from: Q */
    public final void mo52067Q() {
        mo51942h();
        mo52052B().endTransaction();
    }

    @VisibleForTesting
    /* renamed from: R */
    public final void mo52068R(List<Long> list) {
        mo51995g();
        mo51942h();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (mo52075q()) {
            String join = TextUtils.join(",", list);
            String f = C0070b.m184f(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (mo52081x(C0070b.m184f(new StringBuilder(f.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", f, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52237a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase B = mo52052B();
                StringBuilder sb = new StringBuilder(f.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(f);
                sb.append(" AND (retry_count IS NULL OR retry_count < ");
                sb.append(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                sb.append(")");
                B.execSQL(sb.toString());
            } catch (SQLiteException e) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: j */
    public final void mo51944j() {
    }

    /* renamed from: k */
    public final void mo52069k() {
        mo51995g();
        mo51942h();
        if (mo52075q()) {
            long a = this.f34048c.f33494j.f33615h.mo52363a();
            long elapsedRealtime = ((C15103u3) this.f33681b).f33885o.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            ((C15103u3) this.f33681b).getClass();
            if (abs > C14959e2.f33441y.mo51978a(null).longValue()) {
                this.f34048c.f33494j.f33615h.mo52364b(elapsedRealtime);
                mo51995g();
                mo51942h();
                if (mo52075q()) {
                    SQLiteDatabase B = mo52052B();
                    ((C15103u3) this.f33681b).getClass();
                    int delete = B.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(((C15103u3) this.f33681b).f33885o.currentTimeMillis()), String.valueOf(C14959e2.f33370D.mo51978a(null).longValue())});
                    if (delete > 0) {
                        ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo52070l(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo51995g();
        mo51942h();
        try {
            mo52052B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52240d(C15049o2.m24575p(str), ((C15103u3) this.f33681b).f33884n.mo52144f(str2), e, "Error deleting user property. appId");
        }
    }

    /* renamed from: m */
    public final void mo52071m() {
        mo51942h();
        mo52052B().setTransactionSuccessful();
    }

    /* renamed from: n */
    public final void mo52072n(C15143z3 z3Var) {
        Preconditions.checkNotNull(z3Var);
        mo51995g();
        mo51942h();
        String x = z3Var.mo52399x();
        Preconditions.checkNotNull(x);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", x);
        contentValues.put("app_instance_id", z3Var.mo52400y());
        contentValues.put("gmp_app_id", z3Var.mo52375C());
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("resettable_device_id_hash", z3Var.f34019e);
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("last_bundle_index", Long.valueOf(z3Var.f34021g));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(z3Var.f34022h));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(z3Var.f34023i));
        contentValues.put("app_version", z3Var.mo52401z());
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("app_store", z3Var.f34026l);
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("gmp_version", Long.valueOf(z3Var.f34027m));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("dev_cert_hash", Long.valueOf(z3Var.f34028n));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("measurement_enabled", Boolean.valueOf(z3Var.f34029o));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put(ResponseConstants.DAY, Long.valueOf(z3Var.f34037w));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("daily_public_events_count", Long.valueOf(z3Var.f34038x));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("daily_events_count", Long.valueOf(z3Var.f34039y));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("daily_conversions_count", Long.valueOf(z3Var.f34040z));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("config_fetched_time", Long.valueOf(z3Var.f34013E));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(z3Var.f34014F));
        contentValues.put("app_version_int", Long.valueOf(z3Var.mo52396u()));
        contentValues.put("firebase_instance_id", z3Var.mo52373A());
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("daily_error_events_count", Long.valueOf(z3Var.f34009A));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(z3Var.f34010B));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("health_monitor_sample", z3Var.f34011C);
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("android_id", Long.valueOf(z3Var.f34030p));
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(z3Var.f34031q));
        contentValues.put("admob_app_id", z3Var.mo52397v());
        z3Var.f34015a.mo52015a().mo51995g();
        contentValues.put("dynamite_version", Long.valueOf(z3Var.f34034t));
        z3Var.f34015a.mo52015a().mo51995g();
        ArrayList arrayList = z3Var.f34035u;
        if (arrayList != null) {
            if (arrayList.size() == 0) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52238b(x, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        C14811s9.m23933a();
        if (((C15103u3) this.f33681b).f33878h.mo51973p(x, C14959e2.f33398c0)) {
            contentValues.put("ga_app_id", z3Var.mo52374B());
        }
        try {
            SQLiteDatabase B = mo52052B();
            if (((long) B.update("apps", contentValues, "app_id = ?", new String[]{x})) == 0 && B.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(x), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(x), "Error storing app. appId", e);
        }
    }

    /* renamed from: o */
    public final void mo52073o(C15037n nVar) {
        Preconditions.checkNotNull(nVar);
        mo51995g();
        mo51942h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", nVar.f33686a);
        contentValues.put("name", nVar.f33687b);
        contentValues.put("lifetime_count", Long.valueOf(nVar.f33688c));
        contentValues.put("current_bundle_count", Long.valueOf(nVar.f33689d));
        contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f33691f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f33692g));
        contentValues.put("last_bundled_day", nVar.f33693h);
        contentValues.put("last_sampled_complex_event_id", nVar.f33694i);
        contentValues.put("last_sampling_rate", nVar.f33695j);
        contentValues.put("current_session_count", Long.valueOf(nVar.f33690e));
        Boolean bool = nVar.f33696k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo52052B().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(nVar.f33686a), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(nVar.f33686a), "Error storing event aggregates. appId", e);
        }
    }

    /* renamed from: p */
    public final void mo52074p(String str, byte[] bArr, String str2) {
        Preconditions.checkNotEmpty(str);
        mo51995g();
        mo51942h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) mo52052B().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Failed to update remote config (got 0). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error storing remote config. appId", e);
        }
    }

    @VisibleForTesting
    /* renamed from: q */
    public final boolean mo52075q() {
        C15051o4 o4Var = this.f33681b;
        Context context = ((C15103u3) o4Var).f33872b;
        ((C15103u3) o4Var).getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: r */
    public final void mo52076r(String str, Long l, long j, C14779q2 q2Var) {
        mo51995g();
        mo51942h();
        Preconditions.checkNotNull(q2Var);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] i = q2Var.mo50868i();
        ((C15103u3) this.f33681b).mo52016b().f33732o.mo52239c(((C15103u3) this.f33681b).f33884n.mo52142d(str), "Saving complex main event, appId, data size", Integer.valueOf(i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", i);
        try {
            if (mo52052B().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) == -1) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error storing complex main event. appId", e);
        }
    }

    /* renamed from: s */
    public final boolean mo52077s(zzab zzab) {
        Preconditions.checkNotNull(zzab);
        mo51995g();
        mo51942h();
        String str = zzab.zza;
        Preconditions.checkNotNull(str);
        if (mo52058H(str, zzab.zzc.zzb) == null) {
            long x = mo52081x("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((C15103u3) this.f33681b).getClass();
            if (x >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(CartRefreshDelegate.ARG_ORIGIN, zzab.zzb);
        contentValues.put("name", zzab.zzc.zzb);
        m24335v(contentValues, Preconditions.checkNotNull(zzab.zzc.zza()));
        contentValues.put("active", Boolean.valueOf(zzab.zze));
        contentValues.put("trigger_event_name", zzab.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzab.zzh));
        C15018k7 w = ((C15103u3) this.f33681b).mo52335w();
        zzat zzat = zzab.zzg;
        w.getClass();
        contentValues.put("timed_out_event", C15018k7.m24474W(zzat));
        contentValues.put("creation_timestamp", Long.valueOf(zzab.zzd));
        C15018k7 w2 = ((C15103u3) this.f33681b).mo52335w();
        zzat zzat2 = zzab.zzi;
        w2.getClass();
        contentValues.put("triggered_event", C15018k7.m24474W(zzat2));
        contentValues.put("triggered_timestamp", Long.valueOf(zzab.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(zzab.zzj));
        C15018k7 w3 = ((C15103u3) this.f33681b).mo52335w();
        zzat zzat3 = zzab.zzk;
        w3.getClass();
        contentValues.put("expired_event", C15018k7.m24474W(zzat3));
        try {
            if (mo52052B().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Error storing conditional user property", e);
        }
        return true;
    }

    /* renamed from: t */
    public final boolean mo52078t(C15000i7 i7Var) {
        Preconditions.checkNotNull(i7Var);
        mo51995g();
        mo51942h();
        if (mo52058H(i7Var.f33580a, i7Var.f33582c) == null) {
            if (C15018k7.m24470S(i7Var.f33582c)) {
                if (mo52081x("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{i7Var.f33580a}) >= ((long) Math.max(Math.min(((C15103u3) this.f33681b).f33878h.mo51968k(i7Var.f33580a, C14959e2.f33373G), 100), 25))) {
                    return false;
                }
            } else if (!"_npa".equals(i7Var.f33582c)) {
                long x = mo52081x("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{i7Var.f33580a, i7Var.f33581b});
                ((C15103u3) this.f33681b).getClass();
                if (x >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", i7Var.f33580a);
        contentValues.put(CartRefreshDelegate.ARG_ORIGIN, i7Var.f33581b);
        contentValues.put("name", i7Var.f33582c);
        contentValues.put("set_timestamp", Long.valueOf(i7Var.f33583d));
        m24335v(contentValues, i7Var.f33584e);
        try {
            if (mo52052B().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(C15049o2.m24575p(i7Var.f33580a), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(i7Var.f33580a), "Error storing user property. appId", e);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022c, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019e, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0224, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019d A[Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }, ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v7 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String), (r3v23 java.lang.String), (r3v25 java.lang.String), (r3v27 java.lang.String), (r3v29 java.lang.String), (r3v31 java.lang.String), (r3v33 java.lang.String) binds: [B:1:0x000e, B:28:0x008b, B:23:0x0078, B:12:0x003e, B:7:0x0023, B:38:0x00c3, B:44:0x00fd, B:85:0x01f0, B:86:?, B:48:0x0111, B:79:0x01d6, B:80:?, B:73:0x01b9, B:61:0x0187] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0224  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x008b=Splitter:B:28:0x008b, B:12:0x003e=Splitter:B:12:0x003e} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52079u(long r21, long r23, com.google.android.gms.measurement.internal.C14964e7 r25) {
        /*
            r20 = this;
            r1 = r20
            r2 = r25
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            r20.mo51995g()
            r20.mo51942h()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo52052B()     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L_0x0074
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r7 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020b }
            if (r5 != 0) goto L_0x0068
            r4.close()
            return
        L_0x0068:
            java.lang.String r3 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x020b }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x020b }
            r4.close()     // Catch:{ SQLiteException -> 0x020b }
            goto L_0x00bc
        L_0x0074:
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0083
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r7 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            goto L_0x0087
        L_0x0083:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            java.lang.String r5 = " and rowid <= ?"
        L_0x008b:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x020d, all -> 0x019d }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x020b }
            if (r5 != 0) goto L_0x00b5
            r4.close()
            return
        L_0x00b5:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x020b }
            r4.close()     // Catch:{ SQLiteException -> 0x020b }
        L_0x00bc:
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r8[r15] = r16     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            if (r4 != 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r16)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r0.mo52238b(r4, r2)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r3.close()
            return
        L_0x00fd:
            byte[] r4 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.internal.measurement.z2 r5 = com.google.android.gms.internal.measurement.C14572a3.m23303y1()     // Catch:{ IOException -> 0x01ef }
            com.google.android.gms.internal.measurement.q5 r4 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r5, r4)     // Catch:{ IOException -> 0x01ef }
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C14888z2) r4     // Catch:{ IOException -> 0x01ef }
            com.google.android.gms.internal.measurement.t5 r4 = r4.mo50807h()     // Catch:{ IOException -> 0x01ef }
            com.google.android.gms.internal.measurement.a3 r4 = (com.google.android.gms.internal.measurement.C14572a3) r4     // Catch:{ IOException -> 0x01ef }
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            if (r5 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.o4 r5 = r1.f33681b     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33727j     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r16)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r5.mo52238b(r7, r6)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
        L_0x012a:
            r3.close()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r2.f33457a = r4     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            int r4 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x0148
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r6 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r12 = 2
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            goto L_0x0152
        L_0x0148:
            r12 = 2
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
        L_0x0152:
            r7 = r4
            r8 = r5
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            if (r0 == 0) goto L_0x01d6
        L_0x0175:
            long r4 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            byte[] r0 = r3.getBlob(r13)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.internal.measurement.p2 r6 = com.google.android.gms.internal.measurement.C14779q2.m23880v()     // Catch:{ IOException -> 0x01b7 }
            com.google.android.gms.internal.measurement.q5 r0 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r6, r0)     // Catch:{ IOException -> 0x01b7 }
            com.google.android.gms.internal.measurement.p2 r0 = (com.google.android.gms.internal.measurement.C14766p2) r0     // Catch:{ IOException -> 0x01b7 }
            java.lang.String r6 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r0.mo50770s(r6)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            boolean r9 = r0.f33059d     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            if (r9 == 0) goto L_0x01a0
            r0.mo50809j()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r0.f33059d = r15     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            goto L_0x01a0
        L_0x019d:
            r0 = move-exception
            goto L_0x022a
        L_0x01a0:
            MessageType r9 = r0.f33058c     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.internal.measurement.q2 r9 = (com.google.android.gms.internal.measurement.C14779q2) r9     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.internal.measurement.C14779q2.m23878G(r7, r9)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.internal.measurement.t5 r0 = r0.mo50807h()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.internal.measurement.q2 r0 = (com.google.android.gms.internal.measurement.C14779q2) r0     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            boolean r0 = r2.mo51994a(r4, r0)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            if (r0 != 0) goto L_0x01cc
            r3.close()
            return
        L_0x01b7:
            r0 = move-exception
            r6 = 2
            com.google.android.gms.measurement.internal.o4 r4 = r1.f33681b     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33724g     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r16)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r4.mo52239c(r7, r5, r0)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
        L_0x01cc:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            if (r0 != 0) goto L_0x0175
            r3.close()
            return
        L_0x01d6:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            com.google.android.gms.measurement.internal.n2 r4 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r16)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r0.mo52238b(r4, r2)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r3.close()
            return
        L_0x01ed:
            r0 = move-exception
            goto L_0x0207
        L_0x01ef:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r16)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r2.mo52239c(r5, r4, r0)     // Catch:{ SQLiteException -> 0x01ed, all -> 0x019d }
            r3.close()
            return
        L_0x0207:
            r4 = r3
            r3 = r16
            goto L_0x020f
        L_0x020b:
            r0 = move-exception
            goto L_0x020f
        L_0x020d:
            r0 = move-exception
            r4 = r3
        L_0x020f:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ all -> 0x0228 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x0228 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x0228 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x0228 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            com.google.android.gms.measurement.internal.n2 r3 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r3)     // Catch:{ all -> 0x0228 }
            r2.mo52239c(r3, r5, r0)     // Catch:{ all -> 0x0228 }
            if (r4 == 0) goto L_0x0227
            r4.close()
        L_0x0227:
            return
        L_0x0228:
            r0 = move-exception
            r3 = r4
        L_0x022a:
            if (r3 == 0) goto L_0x022f
            r3.close()
        L_0x022f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14983h.mo52079u(long, long, com.google.android.gms.measurement.internal.e7):void");
    }

    /* renamed from: w */
    public final void mo52080w(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo51995g();
        mo51942h();
        try {
            mo52052B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52240d(C15049o2.m24575p(str), ((C15103u3) this.f33681b).f33884n.mo52144f(str2), e, "Error deleting conditional property");
        }
    }

    /* renamed from: x */
    public final long mo52081x(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo52052B().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(str, "Database error", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: y */
    public final long mo52082y(long j, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo52052B().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(str, "Database error", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @VisibleForTesting
    /* renamed from: z */
    public final long mo52083z(String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        mo51995g();
        mo51942h();
        SQLiteDatabase B = mo52052B();
        B.beginTransaction();
        long j = 0;
        try {
            long y = mo52082y(-1, "select first_open_count from app2 where app_id=?", new String[]{str});
            if (y == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (B.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Failed to insert column (got -1). appId", "first_open_count");
                    B.endTransaction();
                    return -1;
                }
                y = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + y));
                if (((long) B.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    ((C15103u3) this.f33681b).mo52016b().f33724g.mo52239c(C15049o2.m24575p(str), "Failed to update column (got 0). appId", "first_open_count");
                    B.endTransaction();
                    return -1;
                }
                B.setTransactionSuccessful();
                B.endTransaction();
                return y;
            } catch (SQLiteException e) {
                e = e;
                j = y;
                try {
                    ((C15103u3) this.f33681b).mo52016b().f33724g.mo52240d(C15049o2.m24575p(str), "first_open_count", e, "Error inserting column. appId");
                    B.endTransaction();
                    return j;
                } catch (Throwable th) {
                    B.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52240d(C15049o2.m24575p(str), "first_open_count", e, "Error inserting column. appId");
            B.endTransaction();
            return j;
        }
    }
}
