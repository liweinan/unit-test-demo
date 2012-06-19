package javaProj;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWithNG {

	@BeforeMethod
	public void setup() {
		// 相当于JUnit的Before
		System.out.println("unit test start");
	}

	@AfterMethod
	public void cleanup() {
		// 相当于JUnit的After
		System.out.println("unit test complete");
	}

	@BeforeClass
	public void init() {
		// @BeforeClass标记的方法会在测试初始化时执行一次
		System.out.println("Test class initialized.");

	}

	@AfterClass
	public void destroy() {
		// @AfterClass标记的方法会在测试全部结束后时执行
		System.out.println("Test class destroyed.");
	}

	@Test
	public void test1() {
		Assert.assertEquals(1 + 1, 2);
	}

	// dependsOnMethods用于指定测试间的依赖关系。
	// 在这里，test2依赖于test1，只有test1测试
	// 通过了，才会进行test2的测试。
	@Test(dependsOnMethods = { "test1" })
	public void test2() {
		Assert.assertEquals(2 + 2, 4);
	}

}
