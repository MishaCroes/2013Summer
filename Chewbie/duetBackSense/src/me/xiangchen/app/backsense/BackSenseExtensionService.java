package me.xiangchen.app.backsense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class BackSenseExtensionService extends ExtensionService {

	public static final String EXTENSION_KEY = "me.xiangchen.app.backsense.key";
	public BackSenseExtensionService() {
        super(EXTENSION_KEY);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
        return new BackSenseRegistrationInformation(this);
    }

    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new BackSenseExtension(this, hostAppPackageName);
	}

}
