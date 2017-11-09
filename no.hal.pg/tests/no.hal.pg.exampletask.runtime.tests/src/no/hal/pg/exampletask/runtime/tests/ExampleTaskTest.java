/**
 */
package no.hal.pg.exampletask.runtime.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import no.hal.pg.exampletask.runtime.ExampleTask;
import no.hal.pg.exampletask.runtime.ExampleTaskView;
import no.hal.pg.exampletask.runtime.RuntimeFactory;

public class ExampleTaskTest {

	protected ExampleTask task = null;
	protected ExampleTaskView view = null;

	@Before
	public void setUp() {
		task = RuntimeFactory.eINSTANCE.createExampleTask();
		view = RuntimeFactory.eINSTANCE.createExampleTaskView();
		task.setQuestion("?");
		task.setCorrectAnswer(true);
		view.setModel(task);
		task.start();
	}

	@Test
	public void testAnswerIncorrectly() {
		Assert.assertFalse(task.isAnsweredCorrectly());
		task.answer(false);
		Assert.assertFalse(task.isAnsweredCorrectly());
		Assert.assertFalse(task.getResult());
		Assert.assertTrue(task.isFinished());
	}
	@Test
	public void testAnswerCorrectly() {
		Assert.assertFalse(task.isAnsweredCorrectly());
		task.answer(true);
		Assert.assertTrue(task.isAnsweredCorrectly());
		Assert.assertTrue(task.getResult());
		Assert.assertTrue(task.isFinished());
	}
	
	@Test
	public void testProposeAnswerWrong() {
		Assert.assertFalse(task.isAnsweredCorrectly());
		Assert.assertFalse(view.proposeAnswer(false));
		Assert.assertFalse(task.isAnsweredCorrectly());
		Assert.assertFalse(task.getResult());
		Assert.assertTrue(task.isFinished());
	}
	
	@Test
	public void testProposeAnswerCorrect() {
		Assert.assertFalse(task.isAnsweredCorrectly());
		Assert.assertTrue(view.proposeAnswer(true));
		Assert.assertTrue(task.isAnsweredCorrectly());
		Assert.assertTrue(task.getResult());
		Assert.assertTrue(task.isFinished());
	}
	
	@Test
	public void testGetQuestion() {	
		Assert.assertEquals(task.getQuestion(), view.getQuestion());
	}

} //ExampleTaskServiceTest
