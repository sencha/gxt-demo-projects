# Simple GXT application with Theme module
This is a very basic GXT project with a theme module.   

## Requirements

* [Java JDK](https://docs.sencha.com/gxt/4.x/guides/getting_started/Versions.html) - ([GXT Versions Matrix Reference](https://docs.sencha.com/gxt/4.x/guides/getting_started/Versions.html))
* [Apache Maven](https://maven.apache.org/install.html)
* [Access to Sencha Maven Artifactory](http://docs.sencha.com/gxt/4.x/guides/getting_started/maven/Maven.html) - This will give you access to GXT 4.0.3.

## IDE
Importing the project into the IDE. 

1. Run `mvn install` from the project root to build the theme. 
    * The reason this is done to start with is to generate the theme source files which will be in the generated source directory.
2. Import this project into your IDE as Maven project.
3. Create a launcher in the IDE for the application.
    * Eclipse - Right click and debug as GWT Development Mode with Embedded Jetty Server.
    * IntellJ IDEA - Create a GWT launcher.

## Building the theme
The theme was copied from Triton and renamed as Tritium for example. 

[![GXT 101 - Building Themes with the Theme Builder](https://img.youtube.com/vi/7-fE_96cOGg/0.jpg)](https://www.youtube.com/watch?v=7-fE_96cOGg)

### Full Build
Running `mvn install` from the root of the project will do a full project build which includes the theme. 

### Theme Only Build
Running `mvn install` from the theme module, or theme folder, will allow you to only build the theme. 

## Theme Reference

* [Generating Theme Guide](https://docs.sencha.com/gxt/4.x/guides/ui/theme/GeneratingThemes.html)
* [Theme Utilities](https://docs.sencha.com/gxt/4.x/guides/ui/theme/Utilities.html)
* [About GSS](https://docs.sencha.com/gxt/4.x/guides/ui/style/gss/GSS.html)
* [GSS Syntax](https://docs.sencha.com/gxt/4.x/guides/ui/style/gss/GSSSyntax.html)
* [GSS to CSS](https://docs.sencha.com/gxt/4.x/guides/ui/style/gss/CssToGss.html)

### Using Client Bundles
Client bundles are ideal for encapsulating reuseable code. Like we do with Appearances. 
I like to suggest using gss variables in a global gss file that cascades into all of your client bundles so you only have one place for global values. Check out the [Theme Utilities](https://docs.sencha.com/gxt/4.x/guides/ui/theme/Utilities.html) for using the Themebuilder theme values. 

* [Client Bundling and Styles](https://docs.sencha.com/gxt/4.x/guides/ui/style/ClientBundleStyleAndImages.html)

### Theme File Locations
This images covers where the theme module stores the themes appearances and associated ClientBundle resources. 

[![Theme File Locations](https://github.com/sencha/gxt-demo-projects/blob/master/Theme_Files.png)](https://github.com/sencha/gxt-demo-projects/blob/master/Theme_Files.png)

