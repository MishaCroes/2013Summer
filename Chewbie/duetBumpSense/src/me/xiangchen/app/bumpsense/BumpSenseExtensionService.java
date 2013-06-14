package me.xiangchen.app.bumpsense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;


public class BumpSenseExtensionService extends ExtensionService {
	public static final String EXTENSION_KEY = "me.xiangchen.app.duetBumpsense.key";
	public BumpSenseExtensionService() {
        super(EXTENSION_KEY);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
        return new BumpSenseRegistrationInformation(this);
    }

    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }
    

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new BumpSenseExtension(this, hostAppPackageName);
	}
}
