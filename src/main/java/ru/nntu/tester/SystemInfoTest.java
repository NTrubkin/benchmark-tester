/**
 * OSHI (https://github.com/oshi/oshi)
 * <p>
 * Copyright (c) 2010 - 2019 The OSHI Project Team:
 * https://github.com/oshi/oshi/graphs/contributors
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package ru.nntu.tester;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.util.FormatUtil;

import java.lang.management.ManagementFactory;

/**
 * The Class SystemInfoTest.
 *
 * @author dblock[at]dblock[dot]org
 */
public class SystemInfoTest {
	/*
		/**
		 * The main method, demonstrating use of classes.
		 *
		 * @param args the arguments
		 */
	public static void main(String[] args) {
		Logger LOG = LoggerFactory.getLogger(SystemInfoTest.class);

		LOG.info("Initializing System...");
		SystemInfo si = new SystemInfo();
		HardwareAbstractionLayer hal = si.getHardware();

		LOG.info("Checking Processor...");
		printProcessor(hal.getProcessor());

		LOG.info("Checking Memory...");
		printMemory(hal.getMemory());
	}

	private static void printProcessor(CentralProcessor processor) {
		System.out.println(processor);
		System.out.println(processor.getLogicalProcessorCount() + " total cores");
		System.out.println(ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors() + " available cores");
	}

	private static void printMemory(GlobalMemory memory) {
		System.out.println("Memory: " + FormatUtil.formatBytes(memory.getTotal()));
		System.out.println("Swap: " + FormatUtil.formatBytes(memory.getSwapTotal()));


		long maxMemory = Runtime.getRuntime().maxMemory();

		System.out.println("Maximum memory (bytes): " + FormatUtil.formatBytes(maxMemory));
	}
}