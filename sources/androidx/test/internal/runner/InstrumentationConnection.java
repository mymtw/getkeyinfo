package androidx.test.internal.runner;

import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.test.annotation.Beta;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;
import androidx.test.internal.util.LogUtil;
import androidx.test.internal.util.ParcelableIBinder;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.MonitoringInstrumentation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p003a2.C0023f;

@Beta
public class InstrumentationConnection {

    /* renamed from: d */
    public static final InstrumentationConnection f7669d;

    /* renamed from: e */
    public static Instrumentation f7670e;

    /* renamed from: f */
    public static MonitoringInstrumentation.ActivityFinisher f7671f;

    /* renamed from: a */
    public Context f7672a;

    /* renamed from: b */
    public IncomingHandler f7673b;

    /* renamed from: c */
    public final BroadcastReceiver f7674c = new MessengerReceiver();

    public static class IncomingHandler extends Handler {

        /* renamed from: e */
        public static final /* synthetic */ int f7676e = 0;

        /* renamed from: a */
        public Messenger f7677a = new Messenger(this);

        /* renamed from: b */
        public HashSet f7678b = new HashSet();

        /* renamed from: c */
        public HashMap f7679c = new HashMap();

        /* renamed from: d */
        public final HashMap f7680d = new HashMap();

        public IncomingHandler(Looper looper) {
            super(looper);
            if (Looper.getMainLooper() == looper || Looper.myLooper() == looper) {
                throw new IllegalStateException("This handler should not be using the main thread looper nor the instrumentation thread looper.");
            }
        }

        /* renamed from: a */
        public final void mo12349a(Bundle bundle, boolean z) {
            LogUtil.m7977a("clientsRegistrationFromBundle called", new Object[0]);
            if (bundle == null) {
                Log.w("InstrConnection", "The client bundle is null, ignoring...");
                return;
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("instr_clients");
            if (stringArrayList == null) {
                Log.w("InstrConnection", "No clients found in the given bundle");
                return;
            }
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Parcelable[] parcelableArray = bundle.getParcelableArray(String.valueOf(next));
                if (parcelableArray != null) {
                    for (Parcelable parcelable : parcelableArray) {
                        if (z) {
                            mo12351c((Messenger) parcelable, next);
                        } else {
                            mo12354f((Messenger) parcelable, next);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo12350b() {
            Log.i("InstrConnection", "terminating process");
            mo12352d(5, (Bundle) null);
            this.f7678b.clear();
            this.f7679c.clear();
            LogUtil.m7977a("quitting looper...", new Object[0]);
            getLooper().quit();
            LogUtil.m7977a("finishing instrumentation...", new Object[0]);
            InstrumentationConnection.f7670e.finish(0, (Bundle) null);
            InstrumentationConnection.f7670e = null;
            InstrumentationConnection.f7671f = null;
        }

        /* renamed from: c */
        public final void mo12351c(Messenger messenger, String str) {
            LogUtil.m7977a("registerClient called with type = [%s] client = [%s]", str, messenger);
            ThreadChecker threadChecker = Checks.f7689a;
            if (str == null) {
                throw new NullPointerException("type cannot be null!");
            } else if (messenger != null) {
                Set set = (Set) this.f7679c.get(str);
                if (set == null) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(messenger);
                    this.f7679c.put(str, hashSet);
                    return;
                }
                set.add(messenger);
            } else {
                throw new NullPointerException("client cannot be null!");
            }
        }

        /* renamed from: d */
        public final void mo12352d(int i, Bundle bundle) {
            LogUtil.m7977a("sendMessageToOtherInstr() called with: what = [%s], data = [%s]", Integer.valueOf(i), bundle);
            Iterator it = this.f7678b.iterator();
            while (it.hasNext()) {
                mo12353e(i, bundle, (Messenger) it.next());
            }
        }

        /* renamed from: e */
        public final void mo12353e(int i, Bundle bundle, Messenger messenger) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("sendMessageWithReply type: ");
            sb.append(i);
            sb.append(" called");
            LogUtil.m7977a(sb.toString(), new Object[0]);
            Message obtainMessage = obtainMessage(i);
            obtainMessage.replyTo = this.f7677a;
            if (bundle != null) {
                obtainMessage.setData(bundle);
            }
            if (!this.f7679c.isEmpty()) {
                Bundle data = obtainMessage.getData();
                data.putStringArrayList("instr_clients", new ArrayList(this.f7679c.keySet()));
                for (Map.Entry entry : this.f7679c.entrySet()) {
                    data.putParcelableArray(String.valueOf(entry.getKey()), (Messenger[]) ((Set) entry.getValue()).toArray(new Messenger[((Set) entry.getValue()).size()]));
                }
                obtainMessage.setData(data);
            }
            try {
                messenger.send(obtainMessage);
            } catch (RemoteException e) {
                Log.w("InstrConnection", "The remote process is terminated unexpectedly", e);
                Message obtainMessage2 = obtainMessage(5);
                obtainMessage2.replyTo = messenger;
                sendMessage(obtainMessage2);
            }
        }

        /* renamed from: f */
        public final void mo12354f(Messenger messenger, String str) {
            LogUtil.m7977a("unregisterClient called with type = [%s] client = [%s]", str, messenger);
            ThreadChecker threadChecker = Checks.f7689a;
            if (str == null) {
                throw new NullPointerException("type cannot be null!");
            } else if (messenger == null) {
                throw new NullPointerException("client cannot be null!");
            } else if (!this.f7679c.containsKey(str)) {
                Log.w("InstrConnection", str.length() != 0 ? "There are no registered clients for type: ".concat(str) : new String("There are no registered clients for type: "));
            } else {
                Set set = (Set) this.f7679c.get(str);
                if (!set.contains(messenger)) {
                    StringBuilder sb = new StringBuilder(str.length() + 78);
                    sb.append("Could not unregister client for type ");
                    sb.append(str);
                    sb.append(" because it doesn't seem to be registered");
                    Log.w("InstrConnection", sb.toString());
                    return;
                }
                set.remove(messenger);
                if (set.isEmpty()) {
                    this.f7679c.remove(str);
                }
            }
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            switch (i) {
                case 0:
                    LogUtil.m7977a("handleMessage(MSG_REMOTE_ADD_CLIENT)", new Object[0]);
                    mo12351c((Messenger) message.getData().getParcelable("instr_client_msgr"), message.getData().getString("instr_client_type"));
                    return;
                case 1:
                    LogUtil.m7977a("handleMessage(MSG_REMOTE_REMOVE_CLIENT)", new Object[0]);
                    mo12354f(message.replyTo, message.getData().getString("instr_client_type"));
                    return;
                case 2:
                    LogUtil.m7977a("handleMessage(MSG_TERMINATE)", new Object[0]);
                    mo12350b();
                    return;
                case 3:
                    LogUtil.m7977a("handleMessage(MSG_HANDLE_INSTRUMENTATION_FROM_BROADCAST)", new Object[0]);
                    if (this.f7678b.add(message.replyTo)) {
                        mo12353e(4, (Bundle) null, message.replyTo);
                        return;
                    } else {
                        Log.w("InstrConnection", "Broadcast with existing binder was received, ignoring it..");
                        return;
                    }
                case 4:
                    LogUtil.m7977a("handleMessage(MSG_ADD_INSTRUMENTATION)", new Object[0]);
                    if (this.f7678b.add(message.replyTo)) {
                        if (!this.f7679c.isEmpty()) {
                            mo12353e(6, (Bundle) null, message.replyTo);
                        }
                        mo12349a(message.getData(), true);
                        return;
                    }
                    Log.w("InstrConnection", "Message with existing binder was received, ignoring it..");
                    return;
                case 5:
                    LogUtil.m7977a("handleMessage(MSG_REMOVE_INSTRUMENTATION)", new Object[0]);
                    if (!this.f7678b.remove(message.replyTo)) {
                        Log.w("InstrConnection", "Attempting to remove a non-existent binder!");
                        return;
                    }
                    return;
                case 6:
                    LogUtil.m7977a("handleMessage(MSG_ADD_CLIENTS_IN_BUNDLE)", new Object[0]);
                    mo12349a(message.getData(), true);
                    return;
                case 7:
                    LogUtil.m7977a("handleMessage(MSG_REMOVE_CLIENTS_IN_BUNDLE)", new Object[0]);
                    mo12349a(message.getData(), false);
                    return;
                case 8:
                    LogUtil.m7977a("handleMessage(MSG_REG_CLIENT)", new Object[0]);
                    mo12351c((Messenger) message.getData().getParcelable("instr_client_msgr"), message.getData().getString("instr_client_type"));
                    mo12352d(0, message.getData());
                    return;
                case 9:
                    LogUtil.m7977a("handleMessage(MSG_UN_REG_CLIENT)", new Object[0]);
                    mo12354f((Messenger) message.getData().getParcelable("instr_client_msgr"), message.getData().getString("instr_client_type"));
                    mo12352d(1, message.getData());
                    return;
                case 10:
                    LogUtil.m7977a("handleMessage(MSG_REMOTE_CLEANUP_REQUEST)", new Object[0]);
                    if (this.f7678b.isEmpty()) {
                        Message obtainMessage = obtainMessage(12);
                        obtainMessage.setData(message.getData());
                        sendMessage(obtainMessage);
                        return;
                    }
                    mo12352d(11, message.getData());
                    return;
                case 11:
                    LogUtil.m7977a("handleMessage(MSG_PERFORM_CLEANUP)", new Object[0]);
                    InstrumentationConnection.f7670e.runOnMainSync(InstrumentationConnection.f7671f);
                    mo12353e(12, message.getData(), message.replyTo);
                    return;
                case 12:
                    LogUtil.m7977a("handleMessage(MSG_PERFORM_CLEANUP_FINISHED)", new Object[0]);
                    UUID uuid = (UUID) message.getData().getSerializable("instr_uuid");
                    if (uuid == null || !this.f7680d.containsKey(uuid)) {
                        String valueOf = String.valueOf(uuid);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
                        sb.append("Latch not found ");
                        sb.append(valueOf);
                        Log.w("InstrConnection", sb.toString());
                        return;
                    }
                    ((CountDownLatch) this.f7680d.get(uuid)).countDown();
                    return;
                default:
                    C0023f.m112m(42, "Unknown message code received: ", i, "InstrConnection");
                    super.handleMessage(message);
                    return;
            }
        }
    }

    public class MessengerReceiver extends BroadcastReceiver {
        public MessengerReceiver() {
        }

        public final void onReceive(Context context, Intent intent) {
            LogUtil.m7977a("Broadcast received", new Object[0]);
            Bundle bundleExtra = intent.getBundleExtra("new_instrumentation_binder");
            if (bundleExtra == null) {
                Log.w("InstrConnection", "Broadcast intent doesn't contain any extras, ignoring it..");
                return;
            }
            ParcelableIBinder parcelableIBinder = (ParcelableIBinder) bundleExtra.getParcelable("new_instrumentation_binder");
            if (parcelableIBinder != null) {
                Messenger messenger = new Messenger(parcelableIBinder.getIBinder());
                Message obtainMessage = InstrumentationConnection.this.f7673b.obtainMessage(3);
                obtainMessage.replyTo = messenger;
                InstrumentationConnection.this.f7673b.sendMessage(obtainMessage);
            }
        }
    }

    static {
        Instrumentation instrumentation = InstrumentationRegistry.f7702a.get();
        if (instrumentation != null) {
            f7669d = new InstrumentationConnection(instrumentation.getTargetContext());
            return;
        }
        throw new IllegalStateException("No instrumentation registered! Must run under a registering instrumentation.");
    }

    public InstrumentationConnection(Context context) {
        if (context != null) {
            this.f7672a = context;
            return;
        }
        throw new NullPointerException("Context can't be null");
    }

    /* renamed from: a */
    public final synchronized void mo12346a(Instrumentation instrumentation, MonitoringInstrumentation.ActivityFinisher activityFinisher) {
        LogUtil.m7977a("init", new Object[0]);
        if (this.f7673b == null) {
            f7670e = instrumentation;
            f7671f = activityFinisher;
            HandlerThread handlerThread = new HandlerThread("InstrumentationConnectionThread");
            handlerThread.start();
            this.f7673b = new IncomingHandler(handlerThread.getLooper());
            Intent intent = new Intent("androidx.test.runner.InstrumentationConnection.event");
            Bundle bundle = new Bundle();
            bundle.putParcelable("new_instrumentation_binder", new ParcelableIBinder(this.f7673b.f7677a.getBinder()));
            intent.putExtra("new_instrumentation_binder", bundle);
            try {
                this.f7672a.sendBroadcast(intent);
                this.f7672a.registerReceiver(this.f7674c, new IntentFilter("androidx.test.runner.InstrumentationConnection.event"));
            } catch (SecurityException unused) {
                Log.i("InstrConnection", "Could not send broadcast or register receiver (isolatedProcess?)");
            }
        }
        return;
    }

    /* renamed from: b */
    public final synchronized void mo12347b() {
        LogUtil.m7977a("Terminate is called", new Object[0]);
        IncomingHandler incomingHandler = this.f7673b;
        if (incomingHandler != null) {
            C32981 r1 = new Callable<Void>() {
                public final Object call() throws Exception {
                    IncomingHandler incomingHandler = InstrumentationConnection.this.f7673b;
                    int i = IncomingHandler.f7676e;
                    incomingHandler.mo12350b();
                    return null;
                }
            };
            int i = IncomingHandler.f7676e;
            FutureTask futureTask = new FutureTask(r1);
            incomingHandler.post(futureTask);
            try {
                futureTask.get();
                this.f7672a.unregisterReceiver(this.f7674c);
                this.f7673b = null;
            } catch (InterruptedException e) {
                throw new IllegalStateException(e.getCause());
            } catch (ExecutionException e2) {
                throw new IllegalStateException(e2.getCause());
            }
        }
    }
}
