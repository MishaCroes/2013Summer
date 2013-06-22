package me.xiangchen.app.tiltsense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class TiltSenseExtensionService extends ExtensionService {

	public static final String EXTENSION_KEY = "me.xiangchen.app.tiltsense.key";
	public TiltSenseExtensionService() {
        super(EXTENSION_KEY);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
        return new TiltSenseRegistrationInformation(this);
    }

    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }
    

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new TiltSenseExtension(this, hostAppPackageName);
	}

}
