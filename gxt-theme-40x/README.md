# Simple GXT Application with Theme module
This is a very basic GXT project with a theme module.   

[![Sencha](http://cdn.sencha.com/img/gwt-eclipse-plugin-banner.png)](https://www.sencha.com/products/gxt/)

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
* [Theme Utilities Guide](https://docs.sencha.com/gxt/4.x/guides/ui/theme/Utilities.html)
* [About GSS Guide](https://docs.sencha.com/gxt/4.x/guides/ui/style/gss/GSS.html)
* [GSS Syntax Guide](https://docs.sencha.com/gxt/4.x/guides/ui/style/gss/GSSSyntax.html)
* [GSS to CSS Guide](https://docs.sencha.com/gxt/4.x/guides/ui/style/gss/CssToGss.html)

### Using Client Bundles
Client bundles are ideal for encapsulating reuseable code. Like we do with Appearances. 
I like to suggest using gss variables in a global gss file that cascades into all of your client bundles so you only have one place for global values. Check out the [Theme Utilities](https://docs.sencha.com/gxt/4.x/guides/ui/theme/Utilities.html) for using the Themebuilder theme values. 

* [Client Bundling and Styles](https://docs.sencha.com/gxt/4.x/guides/ui/style/ClientBundleStyleAndImages.html)

### Extending the theme
Extending the theme allows you full control of the GSS, styles, and widget look and styling. 

#### Extending GXT Appearance
This video covers extending the GXT appearance, and providing your own css styling.

[![GXT 101 - Extending Appearances](https://img.youtube.com/vi/MQEmQ1McCZk/0.jpg)](https://www.youtube.com/watch?v=MQEmQ1McCZk)

#### Theme File Locations
This images covers where the theme module stores the themes appearances and associated ClientBundle resources. 

[![Theme File Locations](https://github.com/sencha/gxt-demo-projects/blob/master/Theme_Files.png)](https://github.com/sencha/gxt-demo-projects/blob/master/Theme_Files.png)


## Tips & Tricks
There is more than one to style widgets. Check out some of the tips and tricks for ideas. 
(Check out the example images at the bottom of the gists.)

### Misc

- Another way to style a **tip**. [See the gist.](https://gist.github.com/branflake2267/c7bc3c475060a45e5bea56954c2fe738)
- Another way to style a *ProgressBar**. [See the gist.](https://gist.github.com/branflake2267/52a972d87056aa486ba9)
- Another way to color headers in a **BorderLayoutContainer**. [See the gist.](https://gist.github.com/branflake2267/1d2ec468062c5966a7f2f2ae6050594a)
- Custom slider example. [See the gist.](https://gist.github.com/branflake2267/bec9089f63fa40574e6604151468beaf)

### Buttons

- Another way to change the **button color** for modern browsers only. [See the gist.](https://gist.github.com/branflake2267/cb0d0046f26e8c4776a170b4818fa3be)
- Custom tool button using icon. [See the gist.](https://gist.github.com/branflake2267/d3df69c1e4867f9aade28c2ff641835a)
- Another way to style toggle buttons. [See the gist.](https://gist.github.com/branflake2267/89e1e1552371879539e30b1254bd65d8)

### Grids

- Another way to **style the grid** using the ViewConfig. [See the gist.](https://gist.github.com/branflake2267/c1bf2512a8fd579978861b7c703260b5)
- Another way to style the **grid selection** (1). [See the gist.](https://gist.github.com/branflake2267/e57c2a96bb854d8a3fe42bcfe5b80b5f)
- Another way to style the **grid selection** (2). [See the gist.](https://gist.github.com/branflake2267/c16f6b9029347b3e70d89912aed8cc9d)
- Another way to style the **grid selection** (3). [See the gist.](https://gist.github.com/branflake2267/c1bf2512a8fd579978861b7c703260b5)

### Trees

- Another way to layout cells in a grid. [See the gist.](https://gist.github.com/branflake2267/774570b920d13e4b112b1cb49a6ce68c)
- Another way to layout the **tree**. [See the gist.](https://gist.github.com/branflake2267/df29948ae4e5de7b4cc0e289f0c96b88)

### Error Handling

- Another way to style your error handler. [See the gist.](https://gist.github.com/branflake2267/a51295fe09f6f8696476c3c383ac0731)

### Icons

- **Font Awesome** example with flexible layout. [See the gist](https://gist.github.com/branflake2267/34eff42cd92d71fe02bc6a27d7856a81)
- **Material icons**. [See the Explorer Example.](http://examples.sencha.com/gxt/4.0.3/#ExamplePlace:html_materialicons)

### Fonts

- **Web Fonts**. [See the Explorer Example.](http://examples.sencha.com/gxt/4.0.3/#ExamplePlace:html_webfont)

### Extending Appearances

- Extending the appearance. [See the gist.](https://gist.github.com/branflake2267/201e80954f1ea3158559dc099ec9a0c8)

