package ru.nntu.tester;

import ru.nntu.yajb.benchmark.Benchmark;
import ru.nntu.yajb.timer.Timer;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Application app = new Application();
        app.test();
    }

    @Benchmark
    public void test() throws InterruptedException {
        Thread.sleep(500);
    }
}
