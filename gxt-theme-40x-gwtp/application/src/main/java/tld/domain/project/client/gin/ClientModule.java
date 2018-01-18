package tld.domain.project.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import tld.domain.project.client.application.ApplicationModule;
import tld.domain.project.client.application.grid.GridModule;
import tld.domain.project.client.application.home.HomeModule;
import tld.domain.project.client.application.widgets.WidgetsModule;
import tld.domain.project.client.application.window.WindowModule;
import tld.domain.project.client.place.NameTokens;
import tld.domain.project.client.resources.ResourceLoader;

public class ClientModule extends AbstractPresenterModule {
  @Override
  protected void configure() {
    install(new DefaultModule.Builder().defaultPlace(NameTokens.Home).errorPlace(NameTokens.Home)
        .unauthorizedPlace(NameTokens.Home).build());

    install(new ApplicationModule());
    install(new HomeModule());
    install(new WindowModule());
    install(new GridModule());
    install(new WidgetsModule());

    bind(ResourceLoader.class).asEagerSingleton();
  }
}
