
	package com.runner;

	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.junit.AfterClass;
	import org.junit.runner.RunWith;

	import com.base.BaseClass;
	import com.report.Reporting;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.junit.CucumberOptions.SnippetType;

	@RunWith(Cucumber.class)
	@CucumberOptions(tags = (""), features = "src\\test\\resources", snippets = SnippetType.CAMELCASE, glue = "com.stepDefinition", dryRun = false, monochrome = true, plugin = {
			"pretty", "html:target\\Output.html","json:target\\Output.json" })

	public class TestRunnerClass extends BaseClass {
		@AfterClass
		public static void afterClass() throws FileNotFoundException, IOException {
			Reporting.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonpath"));

		}

	



}
