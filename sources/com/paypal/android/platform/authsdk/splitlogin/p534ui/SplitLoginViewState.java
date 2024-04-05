package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewState */
public abstract class SplitLoginViewState {

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewState$EmailAPIErrorState */
    public static final class EmailAPIErrorState extends SplitLoginViewState {
        public static final EmailAPIErrorState INSTANCE = new EmailAPIErrorState();

        private EmailAPIErrorState() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewState$EmailAcceptedState */
    public static final class EmailAcceptedState extends SplitLoginViewState {
        public static final EmailAcceptedState INSTANCE = new EmailAcceptedState();

        private EmailAcceptedState() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewState$EmailEntryState */
    public static final class EmailEntryState extends SplitLoginViewState {
        public static final EmailEntryState INSTANCE = new EmailEntryState();

        private EmailEntryState() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewState$EmailErrorState */
    public static final class EmailErrorState extends SplitLoginViewState {
        public static final EmailErrorState INSTANCE = new EmailErrorState();

        private EmailErrorState() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewState$LoadingState */
    public static final class LoadingState extends SplitLoginViewState {
        public static final LoadingState INSTANCE = new LoadingState();

        private LoadingState() {
            super((DefaultConstructorMarker) null);
        }
    }

    private SplitLoginViewState() {
    }

    public /* synthetic */ SplitLoginViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
