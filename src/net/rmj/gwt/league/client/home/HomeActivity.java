package net.rmj.gwt.league.client.home;

import net.rmj.gwt.league.client.ClientFactory;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class HomeActivity extends AbstractActivity implements HomePresenter {

	ClientFactory clientFactory;
	HomeView view;
	public HomeActivity(Place place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
		this.view = clientFactory.getHomeContent();
		this.view.setPresenter(this);
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		panel.setWidget(view);
	}

}
