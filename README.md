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
- ~~Write up comprehensive README.~~

License
=======================
The MIT License (MIT)

Copyright (c) 2014 Hao Zhe Kok

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
