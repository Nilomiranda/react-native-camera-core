package com.reactnativecameracore

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CameraCoreModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    private val DURATION_SHORT_KEY = "SHORT"
    private val DURATION_LONG_KEY = "LONG"
    private var reactContext: ReactApplicationContext? = null

    fun ToastModule(context: ReactApplicationContext) {
      reactContext = context
    }

    override fun getName(): String {
        return "CameraCore"
    }

    // Example method
    // See https://facebook.github.io/react-native/docs/native-modules-android
    @ReactMethod
    fun multiply(a: Int, b: Int, promise: Promise) {

      promise.resolve(a * b)
    }

  @ReactMethod
  fun sayHi(message: String, promise: Promise) {
    promise.resolve("This is your message: " + message)
  }


}
