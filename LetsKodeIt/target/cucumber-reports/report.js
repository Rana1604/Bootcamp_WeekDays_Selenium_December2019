$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/TestHomePage.feature");
formatter.feature({
  "name": "LetsKodeIt",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "LetsKodeIt Home Page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am in LetsKodeIt Practice Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.Hook.i_am_in_LetsKodeIt_Practice_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "GetTable Handling",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Get text from Table",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.HomePageStepDefination.get_text_from_Table()"
});
formatter.result({
  "error_message": "java.lang.ExceptionInInitializerError\n\tat reporting.TestLogger.log(TestLogger.java:12)\n\tat homepage.pageobject.HomePagePageObject.useGetTable(HomePagePageObject.java:281)\n\tat test.TestHomePage.testGetTable(TestHomePage.java:139)\n\tat stepDefination.HomePageStepDefination.get_text_from_Table(HomePageStepDefination.java:72)\n\tat ✽.Get text from Table(file:///Users/tofayelrana/IdeaProjects/Bootcamp_WeekDays_Selenium_December2019/LetsKodeIt/src/test/java/feature/TestHomePage.feature:46)\nCaused by: java.lang.NullPointerException\n\tat reporting.ExtentManager.getInstance(ExtentManager.java:15)\n\tat reporting.ExtentTestManager.\u003cclinit\u003e(ExtentTestManager.java:11)\n\tat reporting.TestLogger.log(TestLogger.java:12)\n\tat homepage.pageobject.HomePagePageObject.useGetTable(HomePagePageObject.java:281)\n\tat test.TestHomePage.testGetTable(TestHomePage.java:139)\n\tat stepDefination.HomePageStepDefination.get_text_from_Table(HomePageStepDefination.java:72)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:59)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:120)\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:29)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:134)\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:597)\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:816)\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\n\tat java.util.ArrayList.forEach(ArrayList.java:1257)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:766)\n\tat org.testng.TestRunner.run(TestRunner.java:587)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1109)\n\tat org.testng.TestNG.runSuites(TestNG.java:1039)\n\tat org.testng.TestNG.run(TestNG.java:1007)\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:110)\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.Hook.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});