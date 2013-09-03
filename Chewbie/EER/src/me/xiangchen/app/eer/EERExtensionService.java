package me.xiangchen.app.eer;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class EERExtensionService extends ExtensionService {
	public static final String EXTENSION_KEY = "me.xiangchen.app.eer.key";
	public EERExtensionService() {
        super(EXTENSION_KEY);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
        return new EERRegistrationInformation(this);
    }

    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }
    

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new EERExtension(this, hostAppPackageName);
	}
}
