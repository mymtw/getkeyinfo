package android.support.p013v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p013v4.media.session.IMediaSession;
import android.support.p013v4.media.session.MediaSessionCompat;
import android.support.p013v4.p014os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.C19421p;
import p003a2.C0015b;
import p003a2.C0023f;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final boolean DEBUG = Log.isLoggable(TAG, 3);
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    public static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl mImpl;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CallbackHandler */
    public static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;
            if (weakReference != null && weakReference.get() != null && this.mCallbackImplRef.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();
                Messenger messenger = this.mCallbacksMessengerRef.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.ensureClassLoader(bundle);
                        mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                    } else if (i != 3) {
                        Log.w(MediaBrowserCompat.TAG, "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(MediaBrowserCompat.TAG, "Could not unparcel the data.");
                    if (message.what == 1) {
                        mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                    }
                }
            }
        }

        public void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback */
    public static class ConnectionCallback {
        public final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();
        public ConnectionCallbackInternal mConnectionCallbackInternal;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21 */
        public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            public ConnectionCallbackApi21() {
            }

            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }

            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal */
        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionCallback */
    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final CustomActionCallback mCallback;
        private final Bundle mExtras;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.mAction = str;
            this.mExtras = bundle;
            this.mCallback = customActionCallback;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            if (this.mCallback != null) {
                MediaSessionCompat.ensureClassLoader(bundle);
                if (i == -1) {
                    this.mCallback.onError(this.mAction, this.mExtras, bundle);
                } else if (i == 0) {
                    this.mCallback.onResult(this.mAction, this.mExtras, bundle);
                } else if (i != 1) {
                    StringBuilder h = C0069a.m177h("Unknown result code: ", i, " (extras=");
                    h.append(this.mExtras);
                    h.append(", resultData=");
                    h.append(bundle);
                    h.append(")");
                    Log.w(MediaBrowserCompat.TAG, h.toString());
                } else {
                    this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback */
    public static abstract class ItemCallback {
        public final MediaBrowser.ItemCallback mItemCallbackFwk = new ItemCallbackApi23();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback$ItemCallbackApi23 */
        public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
            public ItemCallbackApi23() {
            }

            public void onError(String str) {
                ItemCallback.this.onError(str);
            }

            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                ItemCallback.this.onItemLoaded(MediaItem.fromMediaItem(mediaItem));
            }
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl */
    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21 */
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        public final MediaBrowser mBrowserFwk;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        public final CallbackHandler mHandler = new CallbackHandler(this);
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public int mServiceVersion;
        private final C7494b<String, Subscription> mSubscriptions = new C7494b<>();

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            Bundle bundle2;
            this.mContext = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.mRootHints = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserFwk = new MediaBrowser(context, componentName, connectionCallback.mConnectionCallbackFwk, bundle2);
        }

        public void connect() {
            this.mBrowserFwk.connect();
        }

        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (!(serviceBinderWrapper == null || (messenger = this.mCallbacksMessenger) == null)) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error unregistering client messenger.");
                }
            }
            this.mBrowserFwk.disconnect();
        }

        public Bundle getExtras() {
            return this.mBrowserFwk.getExtras();
        }

        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!this.mBrowserFwk.isConnected()) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else if (this.mServiceBinderWrapper == null) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        public String getRoot() {
            return this.mBrowserFwk.getRoot();
        }

        public ComponentName getServiceComponent() {
            return this.mBrowserFwk.getServiceComponent();
        }

        public MediaSessionCompat.Token getSessionToken() {
            if (this.mMediaSessionToken == null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken());
            }
            return this.mMediaSessionToken;
        }

        public boolean isConnected() {
            return this.mBrowserFwk.isConnected();
        }

        public void onConnected() {
            try {
                Bundle extras = this.mBrowserFwk.getExtras();
                if (extras != null) {
                    this.mServiceVersion = extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        this.mServiceBinderWrapper = new ServiceBinderWrapper(binder, this.mRootHints);
                        Messenger messenger = new Messenger(this.mHandler);
                        this.mCallbacksMessenger = messenger;
                        this.mHandler.setCallbacksMessenger(messenger);
                        try {
                            this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                            Log.i(MediaBrowserCompat.TAG, "Remote error registering client messenger.");
                        }
                    }
                    IMediaSession asInterface = IMediaSession.Stub.asInterface(extras.getBinder("extra_session_binder"));
                    if (asInterface != null) {
                        this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken(), asInterface);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e(MediaBrowserCompat.TAG, "Unexpected IllegalStateException", e);
            }
        }

        public void onConnectionFailed() {
        }

        public void onConnectionFailed(Messenger messenger) {
        }

        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mMediaSessionToken = null;
            this.mHandler.setCallbacksMessenger((Messenger) null);
        }

        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.mCallbacksMessenger == messenger) {
                Subscription orDefault = this.mSubscriptions.getOrDefault(str, null);
                if (orDefault != null) {
                    SubscriptionCallback callback = orDefault.getCallback(bundle);
                    if (callback == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.mNotifyChildrenChangedOptions = null;
                    } else if (list == null) {
                        callback.onError(str, bundle);
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list, bundle);
                        this.mNotifyChildrenChangedOptions = null;
                    }
                } else if (MediaBrowserCompat.DEBUG) {
                    C0070b.m187j("onLoadChildren for id that isn't subscribed id=", str, MediaBrowserCompat.TAG);
                }
            }
        }

        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.mServiceBinderWrapper == null) {
                Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support search.");
                this.mHandler.post(new Runnable() {
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e);
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            }
        }

        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (isConnected()) {
                if (this.mServiceBinderWrapper == null) {
                    Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support sendCustomAction.");
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            public void run() {
                                customActionCallback.onError(str, bundle, (Bundle) null);
                            }
                        });
                    }
                }
                try {
                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            public void run() {
                                customActionCallback.onError(str, bundle, (Bundle) null);
                            }
                        });
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Bundle bundle2 = null;
            Subscription orDefault = this.mSubscriptions.getOrDefault(str, null);
            if (orDefault == null) {
                orDefault = new Subscription();
                this.mSubscriptions.put(str, orDefault);
            }
            subscriptionCallback.setSubscription(orDefault);
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            }
            orDefault.putCallback(bundle2, subscriptionCallback);
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (serviceBinderWrapper == null) {
                this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
                return;
            }
            try {
                serviceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.TAG, "Remote error subscribing media item: " + str);
            }
        }

        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription orDefault = this.mSubscriptions.getOrDefault(str, null);
            if (orDefault != null) {
                ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
                if (serviceBinderWrapper != null) {
                    if (subscriptionCallback != null) {
                        List<SubscriptionCallback> callbacks = orDefault.getCallbacks();
                        List<Bundle> optionsList = orDefault.getOptionsList();
                        int size = callbacks.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            } else if (callbacks.get(size) == subscriptionCallback) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                    } else {
                        try {
                            serviceBinderWrapper.removeSubscription(str, (IBinder) null, this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                            C0070b.m187j("removeSubscription failed with RemoteException parentId=", str, MediaBrowserCompat.TAG);
                        }
                    }
                } else if (subscriptionCallback == null) {
                    this.mBrowserFwk.unsubscribe(str);
                } else {
                    List<SubscriptionCallback> callbacks2 = orDefault.getCallbacks();
                    List<Bundle> optionsList2 = orDefault.getOptionsList();
                    int size2 = callbacks2.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else if (callbacks2.get(size2) == subscriptionCallback) {
                            callbacks2.remove(size2);
                            optionsList2.remove(size2);
                        }
                    }
                    if (callbacks2.size() == 0) {
                        this.mBrowserFwk.unsubscribe(str);
                    }
                }
                if (orDefault.isEmpty() || subscriptionCallback == null) {
                    this.mSubscriptions.remove(str);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23 */
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        public void getItem(String str, ItemCallback itemCallback) {
            if (this.mServiceBinderWrapper == null) {
                this.mBrowserFwk.getItem(str, itemCallback.mItemCallbackFwk);
            } else {
                super.getItem(str, itemCallback);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26 */
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
            } else {
                this.mBrowserFwk.subscribe(str, bundle, subscriptionCallback.mSubscriptionCallbackFwk);
            }
        }

        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                this.mBrowserFwk.unsubscribe(str);
            } else {
                this.mBrowserFwk.unsubscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase */
    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        public static final int CONNECT_STATE_CONNECTED = 3;
        public static final int CONNECT_STATE_CONNECTING = 2;
        public static final int CONNECT_STATE_DISCONNECTED = 1;
        public static final int CONNECT_STATE_DISCONNECTING = 0;
        public static final int CONNECT_STATE_SUSPENDED = 4;
        public final ConnectionCallback mCallback;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        private Bundle mExtras;
        public final CallbackHandler mHandler = new CallbackHandler(this);
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        private String mRootId;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public final ComponentName mServiceComponent;
        public MediaServiceConnection mServiceConnection;
        public int mState = 1;
        private final C7494b<String, Subscription> mSubscriptions = new C7494b<>();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection */
        public class MediaServiceConnection implements ServiceConnection {
            public MediaServiceConnection() {
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.mHandler.post(runnable);
                }
            }

            public boolean isCurrent(String str) {
                int i;
                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                if (mediaBrowserImplBase.mServiceConnection == this && (i = mediaBrowserImplBase.mState) != 0 && i != 1) {
                    return true;
                }
                int i2 = mediaBrowserImplBase.mState;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                StringBuilder k = C0073e.m211k(str, " for ");
                k.append(MediaBrowserImplBase.this.mServiceComponent);
                k.append(" with mServiceConnection=");
                k.append(MediaBrowserImplBase.this.mServiceConnection);
                k.append(" this=");
                k.append(this);
                Log.i(MediaBrowserCompat.TAG, k.toString());
                return false;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                postOrRun(new Runnable() {
                    public void run() {
                        boolean z = MediaBrowserCompat.DEBUG;
                        if (z) {
                            StringBuilder h = C0072d.m201h("MediaServiceConnection.onServiceConnected name=");
                            h.append(componentName);
                            h.append(" binder=");
                            h.append(iBinder);
                            Log.d(MediaBrowserCompat.TAG, h.toString());
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.mRootHints);
                            MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserImplBase.this.mHandler);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserImplBase2.mCallbacksMessenger);
                            MediaBrowserImplBase.this.mState = 2;
                            if (z) {
                                try {
                                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                    MediaBrowserImplBase.this.dump();
                                } catch (RemoteException unused) {
                                    StringBuilder h2 = C0072d.m201h("RemoteException during connect for ");
                                    h2.append(MediaBrowserImplBase.this.mServiceComponent);
                                    Log.w(MediaBrowserCompat.TAG, h2.toString());
                                    if (MediaBrowserCompat.DEBUG) {
                                        Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                        MediaBrowserImplBase.this.dump();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase3.mServiceBinderWrapper.connect(mediaBrowserImplBase3.mContext, mediaBrowserImplBase3.mCallbacksMessenger);
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                postOrRun(new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            StringBuilder h = C0072d.m201h("MediaServiceConnection.onServiceDisconnected name=");
                            h.append(componentName);
                            h.append(" this=");
                            h.append(this);
                            h.append(" mServiceConnection=");
                            h.append(MediaBrowserImplBase.this.mServiceConnection);
                            Log.d(MediaBrowserCompat.TAG, h.toString());
                            MediaBrowserImplBase.this.dump();
                        }
                        if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.mServiceBinderWrapper = null;
                            mediaBrowserImplBase.mCallbacksMessenger = null;
                            mediaBrowserImplBase.mHandler.setCallbacksMessenger((Messenger) null);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.mState = 4;
                            mediaBrowserImplBase2.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (connectionCallback != null) {
                this.mContext = context;
                this.mServiceComponent = componentName;
                this.mCallback = connectionCallback;
                this.mRootHints = bundle == null ? null : new Bundle(bundle);
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        private static String getStateLabel(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? C0015b.m88g("UNKNOWN/", i) : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        private boolean isCurrent(Messenger messenger, String str) {
            int i;
            if (this.mCallbacksMessenger == messenger && (i = this.mState) != 0 && i != 1) {
                return true;
            }
            int i2 = this.mState;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            StringBuilder k = C0073e.m211k(str, " for ");
            k.append(this.mServiceComponent);
            k.append(" with mCallbacksMessenger=");
            k.append(this.mCallbacksMessenger);
            k.append(" this=");
            k.append(this);
            Log.i(MediaBrowserCompat.TAG, k.toString());
            return false;
        }

        public void connect() {
            int i = this.mState;
            if (i == 0 || i == 1) {
                this.mState = 2;
                this.mHandler.post(new Runnable() {
                    public void run() {
                        MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                        if (mediaBrowserImplBase.mState != 0) {
                            mediaBrowserImplBase.mState = 2;
                            if (MediaBrowserCompat.DEBUG && mediaBrowserImplBase.mServiceConnection != null) {
                                StringBuilder h = C0072d.m201h("mServiceConnection should be null. Instead it is ");
                                h.append(MediaBrowserImplBase.this.mServiceConnection);
                                throw new RuntimeException(h.toString());
                            } else if (mediaBrowserImplBase.mServiceBinderWrapper != null) {
                                StringBuilder h2 = C0072d.m201h("mServiceBinderWrapper should be null. Instead it is ");
                                h2.append(MediaBrowserImplBase.this.mServiceBinderWrapper);
                                throw new RuntimeException(h2.toString());
                            } else if (mediaBrowserImplBase.mCallbacksMessenger == null) {
                                Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
                                intent.setComponent(MediaBrowserImplBase.this.mServiceComponent);
                                MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                                mediaBrowserImplBase2.mServiceConnection = new MediaServiceConnection();
                                boolean z = false;
                                try {
                                    MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                                    z = mediaBrowserImplBase3.mContext.bindService(intent, mediaBrowserImplBase3.mServiceConnection, 1);
                                } catch (Exception unused) {
                                    StringBuilder h3 = C0072d.m201h("Failed binding to service ");
                                    h3.append(MediaBrowserImplBase.this.mServiceComponent);
                                    Log.e(MediaBrowserCompat.TAG, h3.toString());
                                }
                                if (!z) {
                                    MediaBrowserImplBase.this.forceCloseConnection();
                                    MediaBrowserImplBase.this.mCallback.onConnectionFailed();
                                }
                                if (MediaBrowserCompat.DEBUG) {
                                    Log.d(MediaBrowserCompat.TAG, "connect...");
                                    MediaBrowserImplBase.this.dump();
                                }
                            } else {
                                StringBuilder h4 = C0072d.m201h("mCallbacksMessenger should be null. Instead it is ");
                                h4.append(MediaBrowserImplBase.this.mCallbacksMessenger);
                                throw new RuntimeException(h4.toString());
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException(C0023f.m110k(C0072d.m201h("connect() called while neigther disconnecting nor disconnected (state="), getStateLabel(this.mState), ")"));
        }

        public void disconnect() {
            this.mState = 0;
            this.mHandler.post(new Runnable() {
                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                    Messenger messenger = mediaBrowserImplBase.mCallbacksMessenger;
                    if (messenger != null) {
                        try {
                            mediaBrowserImplBase.mServiceBinderWrapper.disconnect(messenger);
                        } catch (RemoteException unused) {
                            StringBuilder h = C0072d.m201h("RemoteException during connect for ");
                            h.append(MediaBrowserImplBase.this.mServiceComponent);
                            Log.w(MediaBrowserCompat.TAG, h.toString());
                        }
                    }
                    MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                    int i = mediaBrowserImplBase2.mState;
                    mediaBrowserImplBase2.forceCloseConnection();
                    if (i != 0) {
                        MediaBrowserImplBase.this.mState = i;
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "disconnect...");
                        MediaBrowserImplBase.this.dump();
                    }
                }
            });
        }

        public void dump() {
            Log.d(MediaBrowserCompat.TAG, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.TAG, "  mServiceComponent=" + this.mServiceComponent);
            Log.d(MediaBrowserCompat.TAG, "  mCallback=" + this.mCallback);
            Log.d(MediaBrowserCompat.TAG, "  mRootHints=" + this.mRootHints);
            Log.d(MediaBrowserCompat.TAG, "  mState=" + getStateLabel(this.mState));
            Log.d(MediaBrowserCompat.TAG, "  mServiceConnection=" + this.mServiceConnection);
            Log.d(MediaBrowserCompat.TAG, "  mServiceBinderWrapper=" + this.mServiceBinderWrapper);
            Log.d(MediaBrowserCompat.TAG, "  mCallbacksMessenger=" + this.mCallbacksMessenger);
            Log.d(MediaBrowserCompat.TAG, "  mRootId=" + this.mRootId);
            Log.d(MediaBrowserCompat.TAG, "  mMediaSessionToken=" + this.mMediaSessionToken);
        }

        public void forceCloseConnection() {
            MediaServiceConnection mediaServiceConnection = this.mServiceConnection;
            if (mediaServiceConnection != null) {
                this.mContext.unbindService(mediaServiceConnection);
            }
            this.mState = 1;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mHandler.setCallbacksMessenger((Messenger) null);
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        public Bundle getExtras() {
            if (isConnected()) {
                return this.mExtras;
            }
            throw new IllegalStateException(C0023f.m110k(C0072d.m201h("getExtras() called while not connected (state="), getStateLabel(this.mState), ")"));
        }

        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!isConnected()) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        public String getRoot() {
            if (isConnected()) {
                return this.mRootId;
            }
            throw new IllegalStateException(C0023f.m110k(C0072d.m201h("getRoot() called while not connected(state="), getStateLabel(this.mState), ")"));
        }

        public ComponentName getServiceComponent() {
            if (isConnected()) {
                return this.mServiceComponent;
            }
            throw new IllegalStateException(C0071c.m191c(C0072d.m201h("getServiceComponent() called while not connected (state="), this.mState, ")"));
        }

        public MediaSessionCompat.Token getSessionToken() {
            if (isConnected()) {
                return this.mMediaSessionToken;
            }
            throw new IllegalStateException(C0071c.m191c(C0072d.m201h("getSessionToken() called while not connected(state="), this.mState, ")"));
        }

        public boolean isConnected() {
            return this.mState == 3;
        }

        public void onConnectionFailed(Messenger messenger) {
            StringBuilder h = C0072d.m201h("onConnectFailed for ");
            h.append(this.mServiceComponent);
            Log.e(MediaBrowserCompat.TAG, h.toString());
            if (isCurrent(messenger, "onConnectFailed")) {
                if (this.mState != 2) {
                    StringBuilder h2 = C0072d.m201h("onConnect from service while mState=");
                    h2.append(getStateLabel(this.mState));
                    h2.append("... ignoring");
                    Log.w(MediaBrowserCompat.TAG, h2.toString());
                    return;
                }
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }

        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (isCurrent(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.DEBUG;
                if (z) {
                    StringBuilder h = C0072d.m201h("onLoadChildren for ");
                    h.append(this.mServiceComponent);
                    h.append(" id=");
                    h.append(str);
                    Log.d(MediaBrowserCompat.TAG, h.toString());
                }
                Subscription orDefault = this.mSubscriptions.getOrDefault(str, null);
                if (orDefault != null) {
                    SubscriptionCallback callback = orDefault.getCallback(bundle);
                    if (callback == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.mNotifyChildrenChangedOptions = null;
                    } else if (list == null) {
                        callback.onError(str, bundle);
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list, bundle);
                        this.mNotifyChildrenChangedOptions = null;
                    }
                } else if (z) {
                    C0070b.m187j("onLoadChildren for id that isn't subscribed id=", str, MediaBrowserCompat.TAG);
                }
            }
        }

        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (isCurrent(messenger, "onConnect")) {
                if (this.mState != 2) {
                    StringBuilder h = C0072d.m201h("onConnect from service while mState=");
                    h.append(getStateLabel(this.mState));
                    h.append("... ignoring");
                    Log.w(MediaBrowserCompat.TAG, h.toString());
                    return;
                }
                this.mRootId = str;
                this.mMediaSessionToken = token;
                this.mExtras = bundle;
                this.mState = 3;
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                    dump();
                }
                this.mCallback.onConnected();
                try {
                    Iterator it = ((C7500h.C7502b) this.mSubscriptions.entrySet()).iterator();
                    while (true) {
                        C7500h.C7504d dVar = (C7500h.C7504d) it;
                        if (dVar.hasNext()) {
                            dVar.next();
                            Map.Entry entry = dVar;
                            String str2 = (String) entry.getKey();
                            Subscription subscription = (Subscription) entry.getValue();
                            List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                            List<Bundle> optionsList = subscription.getOptionsList();
                            for (int i = 0; i < callbacks.size(); i++) {
                                this.mServiceBinderWrapper.addSubscription(str2, callbacks.get(i).mToken, optionsList.get(i), this.mCallbacksMessenger);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.TAG, "addSubscription failed with RemoteException.");
                }
            }
        }

        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e);
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            } else {
                throw new IllegalStateException(C0023f.m110k(C0072d.m201h("search() called while not connected (state="), getStateLabel(this.mState), ")"));
            }
        }

        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
                } catch (RemoteException e) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
                    if (customActionCallback != null) {
                        this.mHandler.post(new Runnable() {
                            public void run() {
                                customActionCallback.onError(str, bundle, (Bundle) null);
                            }
                        });
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Bundle bundle2 = null;
            Subscription orDefault = this.mSubscriptions.getOrDefault(str, null);
            if (orDefault == null) {
                orDefault = new Subscription();
                this.mSubscriptions.put(str, orDefault);
            }
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            }
            orDefault.putCallback(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    C0070b.m187j("addSubscription failed with RemoteException parentId=", str, MediaBrowserCompat.TAG);
                }
            }
        }

        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription orDefault = this.mSubscriptions.getOrDefault(str, null);
            if (orDefault != null) {
                if (subscriptionCallback != null) {
                    List<SubscriptionCallback> callbacks = orDefault.getCallbacks();
                    List<Bundle> optionsList = orDefault.getOptionsList();
                    int size = callbacks.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else if (callbacks.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            }
                            callbacks.remove(size);
                            optionsList.remove(size);
                        }
                    }
                } else {
                    try {
                        if (isConnected()) {
                            this.mServiceBinderWrapper.removeSubscription(str, (IBinder) null, this.mCallbacksMessenger);
                        }
                    } catch (RemoteException unused) {
                        C0070b.m187j("removeSubscription failed with RemoteException parentId=", str, MediaBrowserCompat.TAG);
                    }
                }
                if (orDefault.isEmpty() || subscriptionCallback == null) {
                    this.mSubscriptions.remove(str);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl */
    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchCallback */
    public static abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.mQuery = str;
            this.mExtras = bundle;
            this.mCallback = searchCallback;
        }

        public void onReceiveResult(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                this.mCallback.onError(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);
                return;
            }
            this.mCallback.onError(this.mQuery, this.mExtras);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper */
    public static class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.mRootHints = bundle;
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }

        public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBinder("data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            sendRequest(3, bundle2, messenger);
        }

        public void connect(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(1, bundle, messenger);
        }

        public void disconnect(Messenger messenger) throws RemoteException {
            sendRequest(2, (Bundle) null, messenger);
        }

        public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(5, bundle, messenger);
        }

        public void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(6, bundle, messenger);
        }

        public void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putBinder("data_callback_token", iBinder);
            sendRequest(4, bundle, messenger);
        }

        public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(8, bundle2, messenger);
        }

        public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(9, bundle2, messenger);
        }

        public void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {
            sendRequest(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$Subscription */
    public static class Subscription {
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();
        private final List<Bundle> mOptionsList = new ArrayList();

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (C19421p.m32960y(this.mOptionsList.get(i), bundle)) {
                    return this.mCallbacks.get(i);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (C19421p.m32960y(this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback */
    public static abstract class SubscriptionCallback {
        public final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk = new SubscriptionCallbackApi26();
        public WeakReference<Subscription> mSubscriptionRef;
        public final IBinder mToken = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21 */
        public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            public SubscriptionCallbackApi21() {
            }

            public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<Subscription> weakReference = SubscriptionCallback.this.mSubscriptionRef;
                Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i = 0; i < callbacks.size(); i++) {
                    Bundle bundle = optionsList.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26 */
        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            public SubscriptionCallbackApi26() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                SubscriptionCallback.this.onError(str, bundle);
            }
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str) {
        }

        public void onError(String str, Bundle bundle) {
        }

        public void setSubscription(Subscription subscription) {
            this.mSubscriptionRef = new WeakReference<>(subscription);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        this.mImpl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
    }

    public void connect() {
        Log.d(TAG, "Connecting to a MediaBrowserService.");
        this.mImpl.connect();
    }

    public void disconnect() {
        this.mImpl.disconnect();
    }

    public Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public void getItem(String str, ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.mImpl.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.mImpl.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (searchCallback != null) {
            this.mImpl.search(str, bundle, searchCallback);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.sendCustomAction(str, bundle, customActionCallback);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback != null) {
            this.mImpl.subscribe(str, (Bundle) null, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void unsubscribe(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mImpl.unsubscribe(str, (SubscriptionCallback) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback != null) {
            this.mImpl.unsubscribe(str, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.mImpl.subscribe(str, bundle, subscriptionCallback);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                this.mFlags = i;
                this.mDescription = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object fromMediaItem : list) {
                arrayList.add(fromMediaItem(fromMediaItem));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public String getMediaId() {
            return this.mDescription.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
