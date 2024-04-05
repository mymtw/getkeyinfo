package p604kj;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.regex.Matcher;
import p193o.C7506i;
import p605kk.C18124h;

/* renamed from: kj.b */
public final class C18097b extends zzf {

    /* renamed from: a */
    public final /* synthetic */ C18096a f39517a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18097b(C18096a aVar, Looper looper) {
        super(looper);
        this.f39517a = aVar;
    }

    public final void handleMessage(Message message) {
        C18096a aVar = this.f39517a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C18099d());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        aVar.f39516g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.f39515f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(MessageDraft.IMAGE_DELIMITER)) {
                                str2 = str2.substring(1);
                            }
                            aVar.mo69628b(intent2.putExtra("error", str2).getExtras(), str);
                            return;
                        }
                        synchronized (aVar.f39510a) {
                            int i = 0;
                            while (true) {
                                C7506i<String, C18124h<Bundle>> iVar = aVar.f39510a;
                                if (i < iVar.f16745d) {
                                    aVar.mo69628b(intent2.getExtras(), iVar.mo19978h(i));
                                    i++;
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = C18096a.f39509j.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            aVar.mo69628b(extras, group);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
