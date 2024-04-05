package com.google.firebase.messaging.reporting;

import p687uj.C18595k;

public final class MessagingClientEvent {

    /* renamed from: p */
    public static final /* synthetic */ int f36809p = 0;

    /* renamed from: a */
    public final long f36810a;

    /* renamed from: b */
    public final String f36811b;

    /* renamed from: c */
    public final String f36812c;

    /* renamed from: d */
    public final MessageType f36813d;

    /* renamed from: e */
    public final SDKPlatform f36814e;

    /* renamed from: f */
    public final String f36815f;

    /* renamed from: g */
    public final String f36816g;

    /* renamed from: h */
    public final int f36817h = 0;

    /* renamed from: i */
    public final int f36818i;

    /* renamed from: j */
    public final String f36819j;

    /* renamed from: k */
    public final long f36820k;

    /* renamed from: l */
    public final Event f36821l;

    /* renamed from: m */
    public final String f36822m;

    /* renamed from: n */
    public final long f36823n;

    /* renamed from: o */
    public final String f36824o;

    public enum Event implements C18595k {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private Event(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements C18595k {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private MessageType(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements C18595k {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private SDKPlatform(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        MessageType messageType = MessageType.UNKNOWN;
        SDKPlatform sDKPlatform = SDKPlatform.UNKNOWN_OS;
        Event event = Event.UNKNOWN_EVENT;
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, String str5, Event event, String str6, String str7) {
        this.f36810a = j;
        this.f36811b = str;
        this.f36812c = str2;
        this.f36813d = messageType;
        this.f36814e = sDKPlatform;
        this.f36815f = str3;
        this.f36816g = str4;
        this.f36818i = i;
        this.f36819j = str5;
        this.f36820k = 0;
        this.f36821l = event;
        this.f36822m = str6;
        this.f36823n = 0;
        this.f36824o = str7;
    }
}
