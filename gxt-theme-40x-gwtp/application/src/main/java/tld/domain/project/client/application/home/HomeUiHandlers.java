package tld.domain.project.client.application.home;

import com.gwtplatform.mvp.client.UiHandlers;

interface HomeUiHandlers extends UiHandlers {

  void onOpenWindowPresenter(String name);
  
  void onOpenWindowWidget(String name);

  void onOpenGrid();

}
