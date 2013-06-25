package me.xiangchen.app.authenticsense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class AuthenticSenseExtensionService extends ExtensionService {

	public static final String EXTENSION_KEY = "me.xiangchen.app.authenticsense.key";
	
	public AuthenticSenseExtensionService() {
		super(EXTENSION_KEY);
	}
	
	@Override
    public void onCreate() {
        super.onCreate();
    }
	
	@Override
	protected RegistrationInformation getRegistrationInformation() {
		// TODO Auto-generated method stub
		return new AuthenticSenseRegistrationInformation(this);
	}

	@Override
	protected boolean keepRunningWhenConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new AuthenticSenseExtension(this, hostAppPackageName);
	}
}