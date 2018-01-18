package tld.domain.project.client.resources;

import javax.inject.Inject;

public class ResourceLoader {

  @Inject
  public ResourceLoader(AppResources appResources) {
    appResources.style().ensureInjected();
  }
  
}
