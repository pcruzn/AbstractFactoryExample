package cl.utfsm.inf.adsw.spemprocesselements;

import cl.utfsm.inf.adsw.interfaces.Role;

public class SPEMProcessRole implements Role {

	@Override
	public String getSkill(int skillId) {
		// retrieve a skill description by ¿exploring xmi?
		// (SPEM uses xmi to store process elements)
		return "Skill " + skillId;
	}

}
