package Repositories;

import java.util.Collection;

import MODELS.Developer;

public interface DeveloperRepositories {
	
	public Developer addDevlper(Developer developer);
	public Collection<Developer> getAllDevelopers();
	public Developer getDeveloperById (int id) throws Exception;
	public void deleteDeveloperById(int id) throws Exception;
	public Developer updateDeveloperById(Developer developer) throws Exception;

}
