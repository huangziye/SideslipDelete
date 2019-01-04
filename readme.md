
[![](https://jitpack.io/v/huangziye/SideslipDelete.svg)](https://jitpack.io/#huangziye/SideslipDelete)


# Add ` SideslipDelete ` to project

- Step 1：Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```android
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

- Step 2：Add the dependency

The latest version shall prevail.

```android
dependencies {
        implementation 'com.github.huangziye:SideslipDelete:${latest_version}'
}
```




# Effect picture


![图片效果图](https://github.com/huangziye/SideslipDelete/blob/master/screenshot/SideslipDelete.gif)


# Usage

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <com.hzy.sideslipdeletelayout.SideslipDeleteLayout
            android:clickable="true"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

        <TextView
                android:layout_width="match_parent"
                android:layout_height="60dp"
                android:gravity="center_vertical"
                android:background="@android:color/darker_gray"
                android:text="立刻就登上了飞机上的浪费精力"/>

        <Button
                android:id="@+id/btnTop"
                android:layout_width="60dp"
                android:layout_height="match_parent"
                android:background="#d9dee4"
                android:text="置顶"
                android:textColor="@android:color/white"/>

        <Button
                android:id="@+id/btnUnRead"
                android:layout_width="120dp"
                android:layout_height="match_parent"
                android:background="#ecd50a"
                android:clickable="true"
                android:text="标记未读"
                android:textColor="@android:color/white"/>

        <Button
                android:id="@+id/btnDelete"
                android:layout_width="60dp"
                android:layout_height="match_parent"
                android:background="#ff4a57"
                android:text="删除"
                android:textColor="@android:color/white"/>
    </com.hzy.sideslipdeletelayout.SideslipDeleteLayout>

</LinearLayout>
```








# About me


- [简书](https://user-gold-cdn.xitu.io/2018/7/26/164d5709442f7342)

- [掘金](https://juejin.im/user/5ad93382518825671547306b)

- [Github](https://github.com/huangziye)


<br />
<br />

[reference](https://github.com/mcxtzhang/SwipeDelMenuLayout)

# License

```
Copyright 2018, huangziye

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```



