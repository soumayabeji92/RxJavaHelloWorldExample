# RxJavaHelloWorldExample
A basic Hello World Example for RxJava Libary newbies.

### [For this tutorial you need](https://github.com/markdown-it/markdown-it-sub) 

- Basic Java Knowledge and how to work with android studio
- Basic understanding of Rxjava

That's it!

## Code

Implementation `code`

Add this to your app build.gradle 

    implementation 'io.reactivex.rxjava2:rxjava:x.y.z'
    implementation 'io.reactivex.rxjava2:rxandroid:x.y.z'
    //don't forget to change the version number
    
Inside MainActivity

    //The main methods are:
    @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG,"onSubscribe invoked");
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG,"onNext invoked");
               
            }


            @Override
            public void onError(Throwable e) {
                Log.i(TAG,"onError invoked");
            }

            @Override
            public void onComplete() {
                Log.i(TAG,"onComplete invoked");
            }
    
    
[You can find the latest Reactive Extensions for Android here ](https://github.com/ReactiveX/RxAndroid)    

Thanks for reading!

