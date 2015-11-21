/**
 * 
 */
package net.rmj.gwt.league.client.home;



import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.extras.notify.client.constants.NotifyIconType;
import org.gwtbootstrap3.extras.notify.client.constants.NotifyPlacement;
import org.gwtbootstrap3.extras.notify.client.ui.Notify;
import org.gwtbootstrap3.extras.notify.client.ui.NotifySettings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author ronaldo
 *
 */
public class HomeView extends Composite {

	private static HomeContentUiBinder uiBinder = GWT
			.create(HomeContentUiBinder.class);

	interface HomeContentUiBinder extends UiBinder<Widget, HomeView> {
	}
	
	HomePresenter presenter;
	

	/**
	 * Because this class has a default constructor, it can
	 * be used as a binder template. In other words, it can be used in other
	 * *.ui.xml files as follows:
	 * <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
	 *   xmlns:g="urn:import:**user's package**">
	 *  <g:**UserClassName**>Hello!</g:**UserClassName>
	 * </ui:UiBinder>
	 * Note that depending on the widget that is used, it may be necessary to
	 * implement HasHTML instead of HasText.
	 */
	public HomeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button notifyBtn;

	public HomeView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));

		// Can access @UiField after calling createAndBindUi

	}

	@UiHandler("notifyBtn")
	void onClick(ClickEvent e) {
		//Window.alert("Hello!");
		NotifySettings ns = NotifySettings.newSettings();

		String template ="<div data-notify=\"container\" class=\"info\" role=\"info\">"+
				   "<span data-notify=\"icon\">" +
				  "<i class=\"fa fa-spinner fa-pulse \"></i>"+
				   "</span>"+
				  "<b><span data-notify=\"title\"></span></b>"+
				  "<span data-notify=\"message\"></span>"+
				  "<a href=\"#\" data-notify=\"url\"></a>"+
				  "</div>";
		
		String template2 = "<div data-notify=\"container\" class=\"col-xs-11 col-sm-3 alert alert-{0}\" role=\"alert\">"+
		" <button type=\"button\" aria-hidden=\"true\" class=\"close\" data-notify=\"dismiss\">x</button>"+
		" <span data-notify=\"icon\"><i class=\"fa fa-spinner fa-pulse \"></i></span>"+
		" <span data-notify=\"title\">{1}</span>" +
		" <span data-notify=\"message\">{2}</span>" +
		" <div class=\"progress\" data-notify=\"progressbar\"> " +
		" <div class=\"progress-bar progress-bar-{0}\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 0%;\"></div>"+
		" </div> "+
		" <a href=\"{3}\" target=\"{4}\" data-notify=\"url\"></a>"+
		"</div>"; 

		ns.setDelay(0);
		ns.setPlacement(NotifyPlacement.TOP_CENTER);
		
		ns.setTemplate(template2);
		//ns.makeDefault();

		Notify.notify("Wait...", "Please wait...", ns);
		
		//Notify.hideAll();
		
		/* 
		 * NotifySettings settings = NotifySettings.newSettings();
		 
		  settings.setType(NotifyType.SUCCESS);
		  settings.setAllowDismiss(false);
		 */ 
		
	}

	public void setPresenter(HomePresenter presenter) {
		this.presenter = presenter;
	}
}
