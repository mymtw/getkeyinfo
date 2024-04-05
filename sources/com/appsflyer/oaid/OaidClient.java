package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OaidClient {
    /* access modifiers changed from: private */
    public final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    public OaidClient(Context context2, long j, TimeUnit timeUnit) {
        Logger logger2 = Logger.getLogger("AppsFlyerOaid6.2.4");
        this.logger = logger2;
        this.context = context2;
        this.timeout = j;
        this.unit = timeUnit;
        logger2.setLevel(Level.OFF);
    }

    private Info fetchHuawei() {
        try {
            FutureTask futureTask = new FutureTask(new Callable<Info>() {
                public Info call() {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(OaidClient.this.context);
                    if (advertisingIdInfo == null) {
                        return null;
                    }
                    return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                }
            });
            new Thread(futureTask).start();
            return (Info) futureTask.get(this.timeout, this.unit);
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    private static boolean isHuawei() {
        try {
            return Build.BRAND.equalsIgnoreCase("huawei") || ((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get((Object) null)).intValue() > 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        Class<IIdentifierListener> cls = IIdentifierListener.class;
        return true;
    }

    public Info fetch() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Info fetchHuawei = isHuawei() ? fetchHuawei() : isMsaAvailableAtRuntime() ? OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit) : null;
            Logger logger2 = this.logger;
            logger2.info("Fetch " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return fetchHuawei;
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    public void setLogging(boolean z) {
        this.logger.setLevel(z ? null : Level.OFF);
    }

    public static class Info {

        /* renamed from: id */
        private final String f11168id;
        private final Boolean lat;

        public Info(String str, Boolean bool) {
            this.f11168id = str;
            this.lat = bool;
        }

        public String getId() {
            return this.f11168id;
        }

        public Boolean getLat() {
            return this.lat;
        }

        public Info(String str) {
            this(str, (Boolean) null);
        }
    }

    public OaidClient(Context context2) {
        this(context2, 1, TimeUnit.SECONDS);
    }
}
