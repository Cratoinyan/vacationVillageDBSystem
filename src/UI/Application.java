package UI;

import UI.AnimatorPage.*;
import UI.CustomerPage.PageCustomerAppointment;
import UI.CustomerPage.PageCustomerLogin;
import UI.ManagerPage.PageAddAnimator;
import UI.ManagerPage.PageAddCustomer;
import UI.ManagerPage.PageAddEquipPerson;
import UI.ManagerPage.PageManager;

public class Application {
	Frame mainFrame = null;
	
	PageEntry entryPage = null;
	PageManager managerPage = null;
	PageAddCustomer addCustomerPage = null;
	PageAddAnimator addAnimatorPage = null;
	PageAddEquipPerson addEquipPersonPage = null;
	PageCustomerLogin customerLoginPage = null;
	PageCustomerAppointment customerAppointmentPage = null;
	PageActivityList activityListPage = null;
	PageAnimatorLogin animatorLoginPage = null;
	PageAnimator animatorPage = null;
	PageDeleteActivity deleteActivityPage = null;
	PageCreateActivity createActivityPage = null;
	PageAddEmergencyInfo addEmergencyInfoPage = null;
	PageAddEquipment addEquipmentPage = null;
	
	public void startup()
	{
		
		mainFrame = new Frame();
		mainFrame.startup();
		
		addEquipmentPage = new PageAddEquipment();
		addEquipmentPage.frame = mainFrame;
		addEquipmentPage.startup();
		
		addEmergencyInfoPage = new PageAddEmergencyInfo();
		addEmergencyInfoPage.frame = mainFrame;
		addEmergencyInfoPage.startup();
		
		createActivityPage = new PageCreateActivity();
		createActivityPage.frame = mainFrame;
		createActivityPage.startup();
		
		deleteActivityPage = new PageDeleteActivity();
		deleteActivityPage.frame = mainFrame;
		deleteActivityPage.startup();
		
		animatorPage = new PageAnimator();
		animatorPage.frame = mainFrame;
		animatorPage.deleteActivityPage = deleteActivityPage;
		animatorPage.createActivityPage = createActivityPage;
		animatorPage.addEmergencyInfoPage = addEmergencyInfoPage;
		animatorPage.addEquipmentPage = addEquipmentPage;
		animatorPage.startup();
		
		animatorLoginPage = new PageAnimatorLogin();
		animatorLoginPage.frame = mainFrame;
		animatorLoginPage.animatorPage = animatorPage;
		animatorLoginPage.startup();
		
		activityListPage = new PageActivityList();
		activityListPage.frame = mainFrame;
		activityListPage.startup();

		deleteActivityPage.activityListPage = activityListPage;
		
		customerAppointmentPage = new PageCustomerAppointment();
		customerAppointmentPage.frame = mainFrame;
		customerAppointmentPage.activityListPage = activityListPage;
		customerAppointmentPage.startup();

		activityListPage.customerAppointmentPage = customerAppointmentPage;
		activityListPage.deleteActivityPage = deleteActivityPage;
		
		customerLoginPage = new PageCustomerLogin();
		customerLoginPage.frame = mainFrame;
		customerLoginPage.customerAppointmentPage = customerAppointmentPage;
		customerLoginPage.startup();
		
		addEquipPersonPage = new PageAddEquipPerson();
		addEquipPersonPage.frame = mainFrame;
		addEquipPersonPage.startup();
		
		addAnimatorPage = new PageAddAnimator();
		addAnimatorPage.frame = mainFrame;
		addAnimatorPage.startup();
		
		addCustomerPage = new PageAddCustomer();
		addCustomerPage.frame = mainFrame;
		addCustomerPage.startup();
		
		managerPage = new PageManager();
		managerPage.frame = mainFrame;
		managerPage.addEquipPersonPage = addEquipPersonPage;
		managerPage.addAnimatorPage = addAnimatorPage;
		managerPage.addCustomerPage = addCustomerPage;
		managerPage.startup();
		
		entryPage = new PageEntry();
		entryPage.frame = mainFrame;
		entryPage.animatorLoginPage = animatorLoginPage;
		entryPage.customerLoginPage = customerLoginPage;
		entryPage.managerPage = managerPage;
		entryPage.startup();

		addEquipmentPage.entryPage = entryPage;
		addEmergencyInfoPage.entryPage = entryPage;
		createActivityPage.entryPage = entryPage;
		deleteActivityPage.entryPage = entryPage;
		animatorPage.entryPage = entryPage;
		animatorLoginPage.entryPage = entryPage;
		customerAppointmentPage.entryPage = entryPage;
		customerLoginPage.entryPage = entryPage;
		addEquipPersonPage.entryPage = entryPage;
		addAnimatorPage.entryPage = entryPage;
		addCustomerPage.entryPage = entryPage;
		managerPage.entryPage = entryPage;
		
		mainFrame.display(entryPage);
	}
	
	public void shutdown()
	{
		
	}
}
