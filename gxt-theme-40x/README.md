# Basic GXT Project with a Theme
This is a very basic GXT project with a theme module. 

## Requirements

* [Java JDK](https://docs.sencha.com/gxt/4.x/guides/getting_started/Versions.html) - ([GXT Versions Matrix Reference](https://docs.sencha.com/gxt/4.x/guides/getting_started/Versions.html))
* [Apache Maven](https://maven.apache.org/install.html)
* [Access to Sencha Maven Artifactory](http://docs.sencha.com/gxt/4.x/guides/getting_started/maven/Maven.html) - This will give you access to GXT 4.0.3.

## IDE
Importing the project into the IDE. 

1. Run `mvn install` from the project root to build the theme. 
  - The reason this is done to start with is to generate the theme source files which will be in the generated source directory.
2. Import this project into your IDE as Maven project.
3. Create a launcher in the IDE for the application.
  - Eclipse - Right click and debug as GWT Development Mode with Embedded Jetty Server.
  - IntellJ IDEA - Create a GWT launcher.

## Building the theme

### Full Build
Running `mvn install` from the root of the project will do a full project build which includes the theme. 

### Theme Only Build
Running `mvn install` from the theme module, or theme folder, will allow you to only build the theme. 
