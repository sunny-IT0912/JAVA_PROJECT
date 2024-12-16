package Services;

import java.util.Collection;
import java.util.LinkedHashMap;

import MODELS.Developer;
import Repositories.DeveloperRepositories;

public  class DeveleporServices  implements DeveloperRepositories {

	private LinkedHashMap<Integer, Developer> develepors = new LinkedHashMap<>();

	public Developer addDevlper(Developer developer) {
		develepors.put(developer.getId(), developer);
		return develepors.get(developer.getId());
	}

	public Collection<Developer> getAllDevelopers() {
		return this.develepors.values();

	}
	public Developer getDeveloperById(int id) throws Exception {
		Developer d = develepors.get(id);
		if(d !=null)
			return d;
		else 
			throw new Exception("invaild id");
	}

	public void deleteDeveloperById(int id) throws Exception {
		Developer d = getDeveloperById(id);
		develepors.remove(id);

	}
	public Developer updateDeveloperById(Developer developer) {
		develepors.put(developer.getId(), developer);
		return develepors.get(developer.getId());

	}


}









