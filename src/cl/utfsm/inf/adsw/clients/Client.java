/**
 * author: Pablo Cruz Navea
 */
package cl.utfsm.inf.adsw.clients;

import cl.utfsm.inf.adsw.factories.AbstractProcessFactory;
import cl.utfsm.inf.adsw.factories.BPMNProcessFactory;
import cl.utfsm.inf.adsw.factories.SPEMProcessFactory;
import cl.utfsm.inf.adsw.interfaces.Role;

public class Client {

	public static void main(String[] args) {
		// we cannot instantiate AbstractProcessFactory (it is abstract!)
		// but we can create a null factory object
		AbstractProcessFactory factory = null;
		
		// somewhere, sometime, we take the decision to create a SPEM factory because we
		// are working with SPEM process elements
		// this is a matter of the software we are developing
		String whatToMake = "SPEM";
		
		if (whatToMake.compareTo("SPEM") == 0) {
			factory = new SPEMProcessFactory ();
		}
		if (whatToMake.compareTo("BPMN") == 0) {
			factory = new BPMNProcessFactory ();
		}
		
		// we use our factory (at this time, a SPEMProcessFactory) to create a SPEM Role
		Role mySPEMRole = factory.createRole();
		// then we finally get a skill
		System.out.println (mySPEMRole.getSkill(10));
	}
}