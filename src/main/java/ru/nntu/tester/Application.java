package ru.nntu.tester;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.nntu.yajb.aspect.benchmark.Benchmark;

import static ru.nntu.yajb.aspect.benchmark.CollectingMode.META;

public class Application {
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws InterruptedException {
		Application app = new Application();
		app.test1();
		app.test2(2, new ChildClass(), "str");
		try {
			app.test3();
		} catch (Exception e) {
			LOG.error("Catch an expected exception", e);
		}
		LOG.info("-----------");
		app.test4();
		LOG.info("-----------");
		app.test5();
		LOG.info("-----------");
		app.test6();
	}

	@Benchmark(collect = META)
	private void test1() throws InterruptedException {
		Thread.sleep(200);
	}

	@Benchmark(collect = META)
	private Object test2(int a, ParentClass b, String c) throws InterruptedException {
		Thread.sleep(100);
		return null;
	}

	@Benchmark(collect = META)
	private void test3() throws InterruptedException {
		Thread.sleep(100);
		throw new ArithmeticException();
	}

	@Benchmark(collect = META)
	private void test4() throws InterruptedException {
		Thread.sleep(100);
		test1();
		Thread.sleep(100);
	}

	@Benchmark(collect = META)
	private void test5() throws InterruptedException {
		Thread.sleep(100);
		test4();
		Thread.sleep(100);
	}


	@Benchmark(collect = META)
	private void test6() throws InterruptedException {
		Thread.sleep(100);
		test4();
		test4();
		Thread.sleep(100);
	}
}
