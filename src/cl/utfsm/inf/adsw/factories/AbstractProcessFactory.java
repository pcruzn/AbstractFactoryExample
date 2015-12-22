package cl.utfsm.inf.adsw.factories;

import cl.utfsm.inf.adsw.interfaces.Role;
import cl.utfsm.inf.adsw.interfaces.Task;
import cl.utfsm.inf.adsw.interfaces.WorkProduct;

public abstract class AbstractProcessFactory {
	public abstract Task createTask ();
	public abstract WorkProduct createWorkProduct ();
	public abstract Role createRole ();
}
