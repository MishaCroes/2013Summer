
/*
Copyright (c) 2011, Sony Ericsson Mobile Communications AB

All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, this
  list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice,
  this list of conditions and the following disclaimer in the documentation
  and/or other materials provided with the distribution.

* Neither the name of the Sony Ericsson Mobile Communications AB nor the names
  of its contributors may be used to endorse or promote products derived from
  this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package me.xiangchen.app.realsmartwatch;

import android.util.Log;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

/**
 * The sample extension service handles extension registration and inserts
 * data into the notification database.
 */
public class SampleExtensionService extends ExtensionService {

    public static final String EXTENSION_SPECIFIC_ID = "EXTENSION_SPECIFIC_ID_SAMPLE_NOTIFICATION";
    public static final String EXTENSION_KEY = "me.xiangchen.app.realsmartwatch.key";
    public static final String LOG_TAG = "RealSmartWatch";

    
    public SampleExtensionService() {
        super(EXTENSION_KEY);
        Log.d(LOG_TAG, "constructor");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOG_TAG, "onCreate");
        
    }
   
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        Log.d(LOG_TAG, "onDestroy");
//    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
    	Log.d(LOG_TAG, "register info");
        return new SampleRegistrationInformation(this);
    }

    /* (non-Javadoc)
     * @see com.sonyericsson.extras.liveware.aef.util.ExtensionService#keepRunningWhenConnected()
     */
    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }
    

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		Log.d(LOG_TAG, "create control");
		return new SampleExtension(this, hostAppPackageName);
	}
}
