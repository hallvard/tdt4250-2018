/**
 */
package no.hal.pg.exampletask.config.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import no.hal.pg.config.TaskProxy;
import no.hal.pg.exampletask.config.ConfigFactory;
import no.hal.pg.exampletask.config.ExampleTaskConfig;
import no.hal.pg.exampletask.runtime.ExampleTask;

public class ExampleTaskConfigTest {

	protected TaskProxy proxy = null;
	protected ExampleTaskConfig config = null;

	@Before
	public void setUp() {
		proxy = no.hal.pg.config.ConfigFactory.eINSTANCE.createTaskProxy();
		config = ConfigFactory.eINSTANCE.createExampleTaskConfig();
		config.setQuestion("?");
		config.setCorrectAnswer(true);
	}

	@Test
	public void testCreateTask() {
		ExampleTask task = config.createTask(proxy);
		Assert.assertEquals(config.getQuestion(), task.getQuestion());
		Assert.assertEquals(config.isCorrectAnswer(), task.isCorrectAnswer());
	}

} //ExampleTaskServiceTest
