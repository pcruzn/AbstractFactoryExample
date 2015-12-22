package cl.utfsm.inf.adsw.factories;

import cl.utfsm.inf.adsw.bpmnprocesselements.BPMNProcessRole;
import cl.utfsm.inf.adsw.bpmnprocesselements.BPMNProcessTask;
import cl.utfsm.inf.adsw.bpmnprocesselements.BPMNProcessWorkProduct;
import cl.utfsm.inf.adsw.interfaces.Role;
import cl.utfsm.inf.adsw.interfaces.Task;
import cl.utfsm.inf.adsw.interfaces.WorkProduct;

public class BPMNProcessFactory extends AbstractProcessFactory {

	@Override
	public Task createTask() {
		return new BPMNProcessTask ();
	}

	@Override
	public WorkProduct createWorkProduct() {
		return new BPMNProcessWorkProduct ();
	}

	@Override
	public Role createRole() {
		return new BPMNProcessRole ();
	}

}
