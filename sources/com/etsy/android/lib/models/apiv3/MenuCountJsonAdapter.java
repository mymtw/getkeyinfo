package com.etsy.android.lib.models.apiv3;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class MenuCountJsonAdapter extends JsonAdapter<MenuCount> {
    public static final int $stable = 8;
    private volatile Constructor<MenuCount> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Map<String, ApiGiftCardBalance>> nullableMapOfStringApiGiftCardBalanceAdapter;
    private final JsonAdapter<NotificationTooltip> nullableNotificationTooltipAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("giftcard_balances", "open_reviews", "unviewed_reviews", "new_activity_count", "new_convo_count", "notifications_tooltip");

    public MenuCountJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(Map.class, String.class, ApiGiftCardBalance.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableMapOfStringApiGiftCardBalanceAdapter = yVar.mo68558c(d, emptySet, "giftCardBalances");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "openReviewCount");
        this.nullableNotificationTooltipAdapter = yVar.mo68558c(NotificationTooltip.class, emptySet, "notificationsTooltip");
    }

    public String toString() {
        return "GeneratedJsonAdapter(MenuCount)";
    }

    public MenuCount fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Map map = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        NotificationTooltip notificationTooltip = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    map = this.nullableMapOfStringApiGiftCardBalanceAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    notificationTooltip = this.nullableNotificationTooltipAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -33) {
            return new MenuCount(map, num, num2, num3, num4, notificationTooltip);
        }
        Constructor<MenuCount> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MenuCount.class.getDeclaredConstructor(new Class[]{Map.class, cls, cls, cls, cls, NotificationTooltip.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "MenuCount::class.java.ge…his.constructorRef = it }");
        }
        MenuCount newInstance = constructor.newInstance(new Object[]{map, num, num2, num3, num4, notificationTooltip, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, MenuCount menuCount) {
        C19383o.m32797g(wVar, "writer");
        if (menuCount != null) {
            wVar.mo68522b();
            wVar.mo68529h("giftcard_balances");
            this.nullableMapOfStringApiGiftCardBalanceAdapter.toJson(wVar, menuCount.getGiftCardBalances());
            wVar.mo68529h("open_reviews");
            this.nullableIntAdapter.toJson(wVar, menuCount.getOpenReviewCount());
            wVar.mo68529h("unviewed_reviews");
            this.nullableIntAdapter.toJson(wVar, menuCount.getUnviewedReviewCount());
            wVar.mo68529h("new_activity_count");
            this.nullableIntAdapter.toJson(wVar, menuCount.getNotificationCount());
            wVar.mo68529h("new_convo_count");
            this.nullableIntAdapter.toJson(wVar, menuCount.getUnreadConversationCount());
            wVar.mo68529h("notifications_tooltip");
            this.nullableNotificationTooltipAdapter.toJson(wVar, menuCount.getNotificationsTooltip());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
