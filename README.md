Android Simplified Drawer
=======================

An Android library which provides a simple activity class to extend from to enable both left and right navigation drawers.

It is currently ~~**NOT**~~ ready for basic use.

A sample app is made available in the "app2" folder. Simply import it into your Android Studio and build. (Play Store listing coming soon).

Features
=======================
The current version of ASD supports extremely basic drawer functionality. It removes a lot of boilerplate code needed to make navigation drawers work.

A DrawerActivity class is provided to be extended by any activity that uses a drawer.

A DrawerManager class is also provided to be used to initialize drawers.

As of this version, ASD provides basic, one-layout type of drawer items, containing a single icon and it's label. In the future, I hope to provide functionality to have custom drawer item types, for both drawers (left and right).

<a href="Left Drawer"><img src="http://kokhouser.github.io/Readme/Images/earlysample.png" height="500"></a>

Include In Project
=======================
To include ASD in your Android Studio project, simply download the .zip file from this page, and add the "drawer_library" folder as a module in your project.

Make sure you include `compile project (':drawer_library')` in your app's build.gradle file.

Usage
=======================
A complete guide on using ASD can be found on the [project page](http://kokhouser.github.io/AndroidSimplifiedDrawer/).


TO-DO
=======================
- ~~Clean up DrawerManager.~~
- Provide interface to define own drawer items.
- Provide mechanism to define placement of subitems etc.
- Provide means to implement right drawer.
- Write up comprehensive README.
