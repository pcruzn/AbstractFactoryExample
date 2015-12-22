package cl.utfsm.inf.adsw.factories;

import cl.utfsm.inf.adsw.interfaces.Role;
import cl.utfsm.inf.adsw.interfaces.Task;
import cl.utfsm.inf.adsw.interfaces.WorkProduct;
import cl.utfsm.inf.adsw.spemprocesselements.SPEMProcessRole;
import cl.utfsm.inf.adsw.spemprocesselements.SPEMProcessTask;
import cl.utfsm.inf.adsw.spemprocesselements.SPEMProcessWorkProduct;

public class SPEMProcessFactory extends AbstractProcessFactory {

	@Override
	public Task createTask() {
		return new SPEMProcessTask ();
	}

	@Override
	public WorkProduct createWorkProduct() {
		return new SPEMProcessWorkProduct ();
	}

	@Override
	public Role createRole() {
		return new SPEMProcessRole ();
	}

}
